package com.dungcts.broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome to mobile!", Toast.LENGTH_LONG).show();
    }
    public void onNotificationClick(View v) {
        Intent intent = new Intent(this, NotificationActivity.class);
        startActivity(intent);
    }
}