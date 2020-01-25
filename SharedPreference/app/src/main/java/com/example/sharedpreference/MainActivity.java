package com.example.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // default = -1 -> 최초 유저
    // user = 1
    public static final String SHARED_PREF_FIRST_USER_KEY = "1000";
    // 최초 실행 유저
    // 만나서 반갑습니다.

    // 기존 유저
    // 오늘도 감사합니다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.tv_hello);

        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
       int first_user = sharedPref.getInt(SHARED_PREF_FIRST_USER_KEY,-1);

        if (first_user == 1) {
            // 기존

            textView.setText("오늘도 감사합니다.");
        } else if (first_user == -1) {
            // 최초
            textView.setText("만나서 반갑습니다.");

            // 저장
            saveUserIsNotFirst();
        }
    }

    private void saveUserIsNotFirst() {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(SHARED_PREF_FIRST_USER_KEY,1);
        editor.commit();

        saveUserIsNotFirst();

    }
}
