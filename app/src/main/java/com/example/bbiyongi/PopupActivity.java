package com.example.bbiyongi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class PopupActivity extends Activity {

    EditText edit_msg;
    TextView btn_set_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_setting);

        edit_msg = findViewById(R.id.edit_msg);
        btn_set_return = findViewById(R.id.btn_set_return);
        btn_set_return.setOnClickListener(v -> finish());
        //데이터 가져오기
//        String data = intent.getStringExtra("data");
//        edit_msg.setText(data);
    }
}

