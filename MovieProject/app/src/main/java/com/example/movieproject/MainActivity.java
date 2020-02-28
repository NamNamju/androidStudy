package com.example.movieproject;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    CheckBox checkBox1;
    TextView textView;
    TextView textView1;
    int num = 0;
    int num1 = 0;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.check_heart);
        textView = findViewById(R.id.like_number);
        String text = textView.getText().toString();
        num  = Integer.parseInt(text);
        ////////////////////////////////

        textView1 = findViewById(R.id.unlike_number);
        String text1 = textView1.getText().toString();
        num1  = Integer.parseInt(text1);

        ///////////////////////////////



        checkBox.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {


                //LayoutInflater inflater = getLayoutInflater();
                //View layout = inflater.inflate(R.layout.toastlayout,(ViewGroup)findViewById(R.id.toastLayout));
                //TextView ttext = layout.findViewById(R.id.textview);

                if (checkBox.isChecked()) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("확인");
                    builder.setMessage("이 영화를 좋아요 하시겠습니까?");
                    builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            num++;
                            textView.setText(""+num);
                            Toast.makeText(getApplicationContext(),"이 영화를 좋아요 합니다.",Toast.LENGTH_SHORT).show();


                            if (checkBox1.isChecked()) {
                                num1--;
                                textView1.setText(""+num1);
                                checkBox1.setChecked(false);

                            }
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
                    builder.setMessage("이 영화를 좋아요 해제 하시겠습니까?");
                    builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            if (num > 0) num--;
                            else num = 0;

                            textView.setText(""+num);
                            //ttext.setText("이 영화를 관심 해제합니다.");
                            Toast.makeText(getApplicationContext(),"이 영화를 좋아요 해제합니다.",Toast.LENGTH_SHORT).show();



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

        checkBox1 = findViewById(R.id.uncheck_heart);
        checkBox1.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {


//                textView1 = findViewById(R.id.unlike_number);
//                String text = textView1.getText().toString();
//                num1  = Integer.parseInt(text);
                //LayoutInflater inflater = getLayoutInflater();
                //View layout = inflater.inflate(R.layout.toastlayout,(ViewGroup)findViewById(R.id.toastLayout));
                //TextView ttext = layout.findViewById(R.id.textview);

                if (checkBox1.isChecked()) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("확인");
                    builder.setMessage("이 영화를 싫어요 하시겠습니까?");
                    builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            num1++;

                            textView1.setText(""+num1);
                            Toast.makeText(getApplicationContext(),"이 영화를 싫어요 합니다.",Toast.LENGTH_SHORT).show();

                            if (checkBox.isChecked()) {
                                num--;
                                textView.setText(""+num);
                                checkBox.setChecked(false);


                            }
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
                    builder.setMessage("이 영화를 싫어요 해제 하시겠습니까?");
                    builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            if (num1 > 0) num1--;
                            else num1 = 0;

                            textView1.setText(""+num1);
                            //ttext.setText("이 영화를 관심 해제합니다.");
                            Toast.makeText(getApplicationContext(),"이 영화를 싫어요 해제합니다.",Toast.LENGTH_SHORT).show();



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

        //////////////////////////////////////////////

        listView = (ListView) findViewById(R.id.listView);
        ReviewAdapter adapter = new ReviewAdapter();
        adapter.addItem(new ReviewItem("kkk123","좋아요",R.drawable.user1));
        adapter.addItem(new ReviewItem("adw123","진짜 별로에요",R.drawable.user1));
        adapter.addItem(new ReviewItem("wke132","이 영화를 본 시간이 아깝다.",R.drawable.user1));
        adapter.addItem(new ReviewItem("kd2kal3","쓰레기 같은 영화",R.drawable.user1));
        adapter.addItem(new ReviewItem("whatthe1","저는 감독을 좋아해서 잘 봤어요.",R.drawable.user1));

        listView.setAdapter(adapter);

    }

    class ReviewAdapter extends BaseAdapter {

        ArrayList<ReviewItem> items = new ArrayList<ReviewItem>();

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        public void addItem (ReviewItem item) {
            items.add(item);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ReviewItemAdapter view = new ReviewItemAdapter(getApplicationContext());
            ReviewItem item = items.get(position);
            view.setTextView1(item.getId());
            view.setTextView2(item.getMoviereview());
            view.setImageView(item.getResimg());
            return view;
        }
    }



}
