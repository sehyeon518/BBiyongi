package com.example.bbiyongi;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
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

        btn_back_notifications = (ImageView) findViewById(R.id.btn_back_notifications);
        btn_back_notifications.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }
}
