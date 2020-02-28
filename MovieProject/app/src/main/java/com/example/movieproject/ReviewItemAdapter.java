package com.example.movieproject;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ReviewItemAdapter extends RelativeLayout {

    TextView textView1;
    TextView textView2;
    ImageView imageView;

    public ReviewItemAdapter(Context context) {
        super(context);
        init(context);
    }

    public ReviewItemAdapter(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.moviereview,this,true);

        textView1 = (TextView) findViewById(R.id.char_id);
        textView2 = (TextView) findViewById(R.id.about_movie);
        imageView = (ImageView) findViewById(R.id.char_image);



    }

    public void setTextView1(String id) {
        textView1.setText(id);
    }

    public void setTextView2(String movie) {
        textView2.setText(movie);
    }

    public void setImageView(int resimg) {
        imageView.setImageResource(resimg);
    }
}
