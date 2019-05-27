package com.sammie.deveportfoliosammie;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sammie.deveportfoliosammie.controller.DevPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new DevPagerAdapter(getSupportFragmentManager()));

        TabLayout tabs =  findViewById(R.id.tabLayoutId);
        tabs.setupWithViewPager(viewPager);

    }
}
