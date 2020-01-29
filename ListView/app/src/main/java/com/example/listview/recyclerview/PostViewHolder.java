package com.example.listview.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listview.R;

public class PostViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public CheckBox cbLike;
    public ImageView ivImg, ivShare;
    public TextView tvLikeCount, tvUserName, tvPostText;
    private PostAdapter mAdapter;
    public PostViewHolder(View itemView, PostAdapter postAdapter) {
        super(itemView);
        ivImg = (ImageView) itemView.findViewById(R.id.iv_img);
        cbLike= (CheckBox) itemView.findViewById(R.id.cb_like);
        ivShare = (ImageView) itemView.findViewById(R.id.iv_share);

        tvLikeCount = (TextView) itemView.findViewById(R.id.tv_likecount);
        tvUserName = (TextView) itemView.findViewById(R.id.tv_UserName);
        tvPostText = (TextView) itemView.findViewById(R.id.tv_PostText);

        //cbLike.setOnClickListener(this);
        ivShare.setOnClickListener(this);
        mAdapter = postAdapter;
    }

    @Override
    public void onClick(View view) {

        // 몇 번째인지 확인
       int position = getAdapterPosition();

        switch (view.getId()) {
            /*case R.id.cb_like :
                mAdapter.onLikeClicked(position);
                break;*/
            case R.id.iv_share :
                break;
        }

    }

    // 위의 것들을 adapter에 활용.
}
