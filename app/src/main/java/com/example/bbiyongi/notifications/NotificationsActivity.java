package com.example.bbiyongi.notifications;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bbiyongi.R;

import java.util.ArrayList;
import java.util.Date;

public class NotificationsActivity extends AppCompatActivity {

    ImageView btn_back_main;
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

//        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView parent, View v, int position, long id){
//                Toast.makeText(getApplicationContext(),
//                        myAdapter.getItem(position).getMovieName(),
//                        Toast.LENGTH_LONG).show();
//            }
//        });
    }

    public void InitializeData()
    {
        notificationArrayList = new ArrayList<Notification>();

        notificationArrayList.add(new Notification(R.drawable.siren, new Date()));
        notificationArrayList.add(new Notification(R.drawable.siren, new Date()));
        notificationArrayList.add(new Notification(R.drawable.siren, new Date()));
    }
}