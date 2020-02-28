package com.example.movieproject;

import android.widget.ImageView;

public class ReviewItem {

    String id;
    String moviereview;
    int resimg;

    public ReviewItem(String id, String moviereview, int resimg) {
        this.id = id;
        this.moviereview = moviereview;
        this.resimg = resimg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMoviereview() {
        return moviereview;
    }

    public void setMoviereview(String moviereview) {
        this.moviereview = moviereview;
    }

    public int getResimg() {
        return resimg;
    }

    public void setResimg(int resimg) {
        this.resimg = resimg;
    }

    @Override
    public String toString() {
        return "ReviewItem{" +
                "id='" + id + '\'' +
                ", moviereview='" + moviereview + '\'' +
                ", resimg=" + resimg +
                '}';
    }
}
