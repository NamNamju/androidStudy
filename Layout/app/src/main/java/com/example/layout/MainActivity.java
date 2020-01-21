package com.example.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.iv_like).setOnClickListener(this);
        findViewById(R.id.iv_share).setOnClickListener(this);
        findViewById(R.id.photo).setOnClickListener(this);
        findViewById(R.id.photo).setOnTouchListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.iv_like :
                Toast.makeText(MainActivity.this,"Ilove", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iv_share :
                Toast.makeText(MainActivity.this,"I share", Toast.LENGTH_SHORT).show();
                break;

            case R.id.photo :
                Toast.makeText(MainActivity.this,"Touch", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {


        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: // 손가락을 대었을 때
                Toast.makeText(MainActivity.this,"Touch now", Toast.LENGTH_SHORT).show();
                break;

            case MotionEvent.ACTION_UP: // 손가락을 땠을 때
                Toast.makeText(MainActivity.this,"Touch finished", Toast.LENGTH_SHORT).show();
                break;
        }
        return false; // ture라고 설정시 onClick에 설정된 photo 클릭이 실행되지 않는다. touch가 click보다 우위에 있다.
    }
}
