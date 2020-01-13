package com.example.helloapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    // 호환성이 있는 기능이 상속되어있음.

    @Override  
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn_call);
        // 뷰를 button으로 형변환한다.
        button.setOnClickListener(this);
        // button을 눌렀을 때 메소드 호출


    }

    @Override
    public void onClick(View v) {
       Intent intent = new Intent(MainActivity.this,CallActivity.class);
       intent.putExtra("intent-message","finish");
       startActivity(intent);

    }
}
