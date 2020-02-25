package com.example.movieproject;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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
    int num = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.check_heart);
        checkBox.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {


                textView = findViewById(R.id.like_number);
                String text = textView.getText().toString();
                num  = Integer.parseInt(text);
                //LayoutInflater inflater = getLayoutInflater();
                //View layout = inflater.inflate(R.layout.toastlayout,(ViewGroup)findViewById(R.id.toastLayout));
                //TextView ttext = layout.findViewById(R.id.textview);

                if (checkBox.isChecked()) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("확인");
                    builder.setMessage("관심 등록 하시겠습니까?");
                    builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            num++;
                            textView.setText(""+num);
                            Toast.makeText(getApplicationContext(),"이 영화를 관심 등록합니다.",Toast.LENGTH_SHORT).show();

                            //ttext.setText("이 영화를 관심 등록합니다.");
                        }
                    });

                    builder.setNegativeButton("아니요", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog dialog = builder.create();
                    dialog.show();


                }

                else {

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("확인");
                    builder.setMessage("관심 해제 하시겠습니까?");
                    builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            if (num > 0) num--;
                            else num = 0;

                            textView.setText(""+num);
                            //ttext.setText("이 영화를 관심 해제합니다.");
                            Toast.makeText(getApplicationContext(),"이 영화를 관심 해제합니다.",Toast.LENGTH_SHORT).show();



                        }
                    });

                    builder.setNegativeButton("아니요", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog dialog = builder.create();
                    dialog.show();

                }

            }
        });
    }

    public void onCheck(View v) {



        /*checkBox.setOnClickListener(new CheckBox.OnClickListener() {
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
        });*/

    }
}
