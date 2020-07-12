package com.example.chicagotour;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class NightLifeFragment extends Fragment {


    ArrayList<Place> nightPlaces = null;

    public NightLifeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //create the list
        nightPlaces = new ArrayList<>();
        nightPlaces.add(new Place("Debonair Social Club", "1575 N Milwaukee Ave, Chicago, IL 60622", "(773) 227-7990"));
        nightPlaces.add(new Place("ROOF at theWit", "201 N State st 27th floor", "3122399502"));
        nightPlaces.add(new Place("Rec Room", "18 W Hubbard St", "3129558018"));
        nightPlaces.add(new Place("Howl at the moon", "26 W Hubbard St", "3128637427"));
        nightPlaces.add(new Place("Blue Chicago", "536 N Clarck St", "3126610100"));
        nightPlaces.add(new Place("Underground", "56 W Illinois St", "3126447600"));

        //set up the adapter
        final PlacesAdapter adapter = new PlacesAdapter(getActivity(), nightPlaces, R.color.NightLife);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}