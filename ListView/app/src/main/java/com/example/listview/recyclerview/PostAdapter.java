package com.example.listview.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.listview.R;
import com.example.listview.model.PostItem;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {

    private Context mContext;
    private ArrayList<PostItem> postItems;

    // 생성자
    public PostAdapter(Context context, ArrayList<PostItem> listItem) {
        mContext = context;
        postItems = listItem;
    }
    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View baseView = View.inflate(mContext, R.layout.post_item,null);
        PostViewHolder postViewHolder = new PostViewHolder(baseView);

        return postViewHolder;
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        PostItem item = postItems.get(position);

        holder.tvUserName.setText(item.getUserName());
        holder.tvPostText.setText(item.getPostText());
        holder.tvLikeCount.setText(String.valueOf(item.getPostLikeCount()));
        // string으로 변환


    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }
}
