package com.example.bbiyongi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bbiyongi.notifications.NotificationsActivity;

public class MainActivity extends AppCompatActivity {

    TextView btn_noticifations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_noticifations = (TextView) findViewById(R.id.btn_notifications);
        btn_noticifations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NotificationsActivity.class);
                startActivity(intent);
            }
        });
    }
}