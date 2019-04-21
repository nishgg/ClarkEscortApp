package com.example.escortapp2;

import android.support.design.widget.AppBarLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id); // get the reference of TabLayout
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());

        //  Add fragments
        adapter.AddFragment(new FragWaitTimes(), "Wait Times");
        adapter.AddFragment(new FragMap(), "Map View");
        adapter.AddFragment(new FragRequestRide(), "Request Ride");

        //  Adapter setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
