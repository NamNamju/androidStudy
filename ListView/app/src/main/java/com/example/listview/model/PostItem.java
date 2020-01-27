package com.example.listview.model;

public class PostItem {

    boolean isUserLike;
    int postLikeCount;

    String postImgUrl;
    String userName;
    String postText;

    public PostItem(boolean isUserLike, int postLikeCount, String userName, String postImgUrl, String postText) {
        this.isUserLike = isUserLike;
        this.postLikeCount = postLikeCount;
        this.postImgUrl = postImgUrl;
        this.userName = userName;
        this.postText = postText;
    }

    public boolean isUserLike() {
        return isUserLike;
    }

    public int getPostLikeCount() {
        return postLikeCount;
    }

    public String getPostImgUrl() {
        return postImgUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getPostText() {
        return postText;
    }
}
