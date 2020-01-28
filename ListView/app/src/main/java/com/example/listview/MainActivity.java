package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.listview.model.PostItem;
import com.example.listview.recyclerview.PostAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PostItem> listItem = new ArrayList<>();
        RecyclerView rvList = findViewById(R.id.rv_list);
        // 입력
        for (int i = 0; i < 5; i++) {
            PostItem item = new PostItem(true, 125,"ansta",
                    "http://file3.instiz.net/data/cached_img/upload/2018/10/11/1/1318267aa94b91456937872e0a8b95e9.jpg","wow!");
            listItem.add(i, item);
        }

        PostAdapter adapter = new PostAdapter(this, listItem);
        rvList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        rvList.setAdapter(adapter);
        // 데이터 추출
       /*
       for (PostItem item : listItem) {


           // inflate -> 매우 중요한 부분

            View v =  View.inflate(this, R.layout.post_item,null);
           TextView tvUserName = v.findViewById(R.id.tv_UserName);
           TextView tvPostText = v.findViewById(R.id.tv_PostText);

           tvUserName.setText(item.getUserName());
           tvPostText.setText(item.getPostText());

           // 데이터 넣기

           llScrollParent.addView(v);
       }*/





    }
}
