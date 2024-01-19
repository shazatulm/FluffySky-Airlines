package com.example.safetyscheckin;

import static com.example.safetyscheckin.SafetyCheckInActivation.PERMISSION_REQUEST_CODE;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.widget.Toast;
import android.telephony.SmsManager;
import android.util.Log;
import android.os.Build;
import android.Manifest;

import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.havenustestingsafetycheckin.R;

public class NotificationReceiver extends BroadcastReceiver {

    private static final String CHANNEL_ID = "SafetyCheckInChannel";
    public static int NOTIFICATION_ID = 1;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (hasPermission(context, Manifest.permission.SEND_SMS)) {
            createNotificationChannel(context);

            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                    .setSmallIcon(R.drawable.ic_notification)
                    .setContentTitle("Safety Check-In")
                    .setContentText("Please respond to the safety check.")
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                    .setAutoCancel(true);

            // Add a respond button to the notification
            Intent respondIntent = new Intent(context, RespondActivity.class);
            PendingIntent respondPendingIntent = PendingIntent.getActivity(context, 0, respondIntent, PendingIntent.FLAG_UPDATE_CURRENT);
            builder.addAction(android.R.drawable.ic_menu_send, "Respond", respondPendingIntent);

            NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.POST_NOTIFICATIONS}, PERMISSION_REQUEST_CODE);
            }
            notificationManager.notify(NOTIFICATION_ID, builder.build());

            NOTIFICATION_ID++;

            // Set up a pending intent for the alert if no response within 5 minutes
            Intent alertIntent = new Intent(context, RespondActivity.class);
            PendingIntent alertPendingIntent = PendingIntent.getBroadcast(context, 0, alertIntent, PendingIntent.FLAG_UPDATE_CURRENT);

            // Schedule the alert after 5 minutes
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
            if (alarmManager != null) {
                alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + 5 * 60 * 1000, alertPendingIntent);
            }
        }
    }

    private void createNotificationChannel(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "SafetyCheckInChannel";
            String description = "Channel for Safety Check-In notifications";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(channel);
            }
        }
    }
    private boolean hasPermission(Context context, String permission) {
        return ActivityCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED;
    }
}
