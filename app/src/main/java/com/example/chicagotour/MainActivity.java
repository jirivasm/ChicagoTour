package com.example.chicagotour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.Adapter;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //save the viewPager and tab Layout
        ViewPager viewPager = findViewById(R.id.viewpager);
        TabLayout tabs = findViewById(R.id.tabs);

        // Create an adapter that knows which fragment should be shown on each page
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        //set up the tabs with the viewPager
        tabs.setupWithViewPager(viewPager);
    }
}