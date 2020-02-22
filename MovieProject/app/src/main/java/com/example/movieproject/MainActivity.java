package com.example.movieproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        checkBox = findViewById(R.id.check_heart);
    }

    public void onCheck(View v) {



        checkBox.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = findViewById(R.id.like_number);
                String text = textView.getText().toString();
                int num  = Integer.parseInt(text);
                boolean check = checkBox.isChecked();
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toastlayout,(ViewGroup)findViewById(R.id.toastLayout));
                TextView ttext = layout.findViewById(R.id.textview);
                if (check == true) {
                    num++;
                    textView.setText(""+num);

                    ttext.setText("이 영화를 관심 등록합니다.");

                }
                else {
                    num=0;
                    textView.setText(""+num);
                    ttext.setText("이 영화를 관심 해제합니다.");
                }
                Toast toast = new Toast(getApplicationContext());
                toast.setView(layout);
                toast.show();
            }
        });

    }
}
