package com.example.safetyscheckin;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.telephony.SmsManager;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.havenustestingsafetycheckin.R;

import java.util.ArrayList;

public class RespondActivity extends AppCompatActivity {
    private static final int SMS_PERMISSION_REQUEST_CODE = 123;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deactivate);

        // Receive the Intent
        Intent intent = getIntent();

        // Get the ArrayList from the Intent
        ArrayList<String> receivedList = intent.getStringArrayListExtra("PHONE_NUMBERS");

        if (receivedList != null) {
            for (String item : receivedList) {
                sendSmsWithPermissionCheck(item);
            }
        }
    }

    private void sendSMS(String phoneNumber) {
        String message = "Alert: User has not responded to safety check-in notification.";

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNumber, null, message, null, null);

            // Log success
            Log.d("SMS", "Test SMS sent successfully");

            // Show a success message
            Toast.makeText(this, "SMS sent", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
            // Log error
            Log.e("SMS", "Error sending SMS: " + e.getMessage());

            // Show an error message
            Toast.makeText(this, "Error sending SMS: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void requestSmsPermission(String phoneNumber) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.SEND_SMS},
                    SMS_PERMISSION_REQUEST_CODE);
        } else {
            // Permission already granted, proceed to send SMS
            sendSMS(phoneNumber);
        }
    }

    private void sendSmsWithPermissionCheck(String phoneNumber) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)
                != PackageManager.PERMISSION_GRANTED) {
            // Permission not granted, request it
            requestSmsPermission(phoneNumber);
        } else {
            // Permission already granted, proceed to send SMS
            sendSMS(phoneNumber);
        }
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
