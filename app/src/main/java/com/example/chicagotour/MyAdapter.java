package com.example.chicagotour;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentPagerAdapter {


    public MyAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            getPageTitle(position);
            return new NightLifeFragment();
        } else if (position == 1)
            return new RestaurantsFragments();
        else if (position == 2)
            return new TouristPlacesFragments();
        else
            return new ParksFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "NightLife";
            case 1:
                return "Restaurants";
            case 2:
                return "Tourist";
            case 3:
                return "Parks";
        }
        return null;
    }

}
