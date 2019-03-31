package com.example.notification;

import android.app.Activity;
import android.support.v4.app.NotificationCompat;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotificationCompat.Builder = new NotificationCompat.Builder(this)
                .setContentTitle("Notyfikacje na kolaaaacje")
                .setContentText("Ten tekst pochodzi z Radomia.")
                .setSmallIcon(R.mipmap.ic_launcher)

    }
}
