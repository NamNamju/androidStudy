package com.example.listview.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listview.R;

public class PostViewHolder extends RecyclerView.ViewHolder {

    public ImageView ivImg, ivLike, ivShare;
    public TextView tvLikeCount, tvUserName, tvPostText;
    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        ivImg = (ImageView) itemView.findViewById(R.id.iv_img);
        ivLike= (ImageView) itemView.findViewById(R.id.iv_like);
        ivShare = (ImageView) itemView.findViewById(R.id.iv_share);

        tvLikeCount = (TextView) itemView.findViewById(R.id.tv_likecount);
        tvUserName = (TextView) itemView.findViewById(R.id.tv_UserName);
        tvPostText = (TextView) itemView.findViewById(R.id.tv_PostText);
    }

    // 위의 것들을 adapter에 활용.
}
