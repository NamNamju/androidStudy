package com.example.movieproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = (CheckBox) findViewById(R.id.check_heart);
    }

    public void onCheck(View v) {

        textView = findViewById(R.id.like_number);
        textView.setText(""+0);
        String text = textView.getText().toString();
        int num  = Integer.parseInt(text);
        boolean check = checkBox.isChecked();
        if ( check == true) {
            num++;
            textView.setText(""+num);
            Toast.makeText(getApplicationContext(),"이 영화를 좋아합니다.",Toast.LENGTH_SHORT).show();
        }
        else {
            num = 0;
            textView.setText(""+num);
            Toast.makeText(getApplicationContext(),"이 영화를 좋아하지 않습니다.",Toast.LENGTH_SHORT).show();
        }



    }
}
