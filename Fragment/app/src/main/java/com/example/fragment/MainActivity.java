package com.example.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RedFragment redFragment = new RedFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.fl_fragment,redFragment).commit();
    }
}
