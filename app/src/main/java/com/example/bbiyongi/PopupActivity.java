package com.example.bbiyongi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PopupActivity extends Activity {

    EditText edit_msg;
    TextView btn_set_return;
    TextView btn_get_pos;
    TextView btn_get_date;
    TextView btn_get_link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_setting);

        edit_msg = findViewById(R.id.edit_msg);

        btn_set_return = findViewById(R.id.btn_set_return);
        btn_set_return.setOnClickListener(v -> {
            // 간편 신고 메시지 저장 기능 추가
            Toast.makeText(getApplicationContext(), "저장되었습니다", Toast.LENGTH_SHORT).show();
            finish();
        });

        btn_get_pos = findViewById(R.id.btn_get_pos);
        btn_get_pos.setOnClickListener(v -> {
            String msg = edit_msg.getText().toString();
            msg = msg + "OO시 OO구 OO로 OO";
            edit_msg.setText(msg);
        });

        btn_get_date = findViewById(R.id.btn_get_date);
        btn_get_date.setOnClickListener(v -> {
            String msg = edit_msg.getText().toString();
            msg = msg + "OOOO년 OO월 OO일 OO시 OO분 OO초";
            edit_msg.setText(msg);
        });

        btn_get_link = findViewById(R.id.btn_get_link);
        btn_get_link.setOnClickListener(v -> {
            edit_msg.setText(msg);
        });
        //데이터 가져오기
//        String data = intent.getStringExtra("data");
//        edit_msg.setText(data);
    }
}

