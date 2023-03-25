package com.example.bbiyongi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class SaveActivity extends AppCompatActivity {

    VideoView video;
    TextView record_date2;
    TextView btn_police;
    ImageView btn_back_notifications;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        Intent intent = getIntent();
        String date = intent.getStringExtra("date");
        record_date2 = (TextView) findViewById(R.id.record_date2);
        record_date2.setText("녹화 일시 " + date);

        btn_back_notifications = (ImageView) findViewById(R.id.btn_back_notifications);
        btn_back_notifications.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        btn_police = (TextView) findViewById(R.id.btn_police);
        btn_police.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "신고하기", Toast.LENGTH_LONG).show();
            }
        });
    }
}
