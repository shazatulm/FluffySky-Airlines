package com.example.safetyscheckin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.havenustestingsafetycheckin.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        Button btnGetStarted = findViewById(R.id.get_started_button);

        // Set click listener for the "Get Started" button
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToConfiguration();
            }
        });
    }
    private void navigateToConfiguration() {
        // Start the Safety Check-In Activation Activity
        Intent intent = new Intent(this, SafetyCheckInActivation.class);
        startActivity(intent);
    }
}