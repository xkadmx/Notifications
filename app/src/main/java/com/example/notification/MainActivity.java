package com.example.notification;



import android.app.Activity;
import android.app.NotificationManager;
import android.support.v7.app.NotificationCompat;
import android.os.Bundle;


public class MainActivity extends Activity {

    public String channelId;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotificationCompat.Builder = new NotificationCompat.Builder(this, String( channelId))
                .setContentTitle("Notyfikacje na kolaaaacje")
                .setContentText("Ten tekst pochodzi z Radomia.")
                .setSmallIcon(R.mipmap.ic_launcher);
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.notify(1,builder.build())
    }
}
