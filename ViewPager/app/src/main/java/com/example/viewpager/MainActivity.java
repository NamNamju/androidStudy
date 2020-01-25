package com.example.viewpager;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tl_tabs);
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_pager);

        Fragment[] arrFragments = new Fragment[3];
        arrFragments[0] = new RedFragment();
        arrFragments[1] = new YellowFragment();
        arrFragments[2] = new GreenFragment();

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(), arrFragments);
        viewPager.setAdapter(adapter);

        // view에서 viewpager가 setAdapter을 해줌으로써 adapter와 연결됨.

        tabLayout.setupWithViewPager(viewPager);
    }



    private class MyPagerAdapter extends FragmentPagerAdapter {

        private Fragment[] arrFragments;

        public MyPagerAdapter(FragmentManager fm, Fragment[] arrFragments) {
            super(fm);
            this.arrFragments = arrFragments;
        }

        @Override
        public Fragment getItem(int position) { // 몇 번째 아이템은 무엇인가
            return arrFragments[position];
        }

        @Override
        public int getCount() { // 총 개수
            return arrFragments.length;
        }


        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "RED";
                case 1:
                    return "YELLOW";
                case 2:
                    return "BLUE";
                default:
                    return "";
            }


        }
    }
}
