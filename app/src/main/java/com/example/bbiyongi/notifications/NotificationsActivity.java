package com.example.bbiyongi.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bbiyongi.MainActivity;
import com.example.bbiyongi.R;
import com.example.bbiyongi.SaveActivity;

import java.util.ArrayList;
import java.util.Date;

public class NotificationsActivity extends AppCompatActivity {

    ImageView btn_back_main;
    TextView btn_go_save;
    ArrayList<Notification> notificationArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        btn_back_main = (ImageView) findViewById(R.id.btn_back_main);
        btn_back_main.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        this.InitializeData();

        ListView list_view = (ListView) findViewById(R.id.list_view);
        final Adapter myAdapter = new Adapter(this,notificationArrayList);

        list_view.setAdapter(myAdapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        myAdapter.getItem(position).getDate().toString(), Toast.LENGTH_LONG).show();
                btn_go_save = (TextView) findViewById(R.id.btn_go_save);
                btn_go_save.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), SaveActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }

    public void InitializeData()
    {
        notificationArrayList = new ArrayList<Notification>();

        notificationArrayList.add(new Notification(R.drawable.siren, new Date()));
        notificationArrayList.add(new Notification(R.drawable.siren, new Date()));
        notificationArrayList.add(new Notification(R.drawable.siren, new Date()));
    }
}