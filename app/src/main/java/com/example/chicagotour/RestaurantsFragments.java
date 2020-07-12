package com.example.chicagotour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RestaurantsFragments#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaurantsFragments extends Fragment {


    ArrayList<Place> restaurantList = null;
    public RestaurantsFragments() {
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

        //creating the list
        restaurantList = new ArrayList<>();
        restaurantList.add(new Place("Joe's Seafood, Prime Steak & Stone Crab", "60 E Grand ave","3123795637"));
        restaurantList.add(new Place("The Purple Pig","444 Michigan Ave","3124641744"));
        restaurantList.add(new Place("Gibsons BAr & Steakhouse","1028 N Rush St","3122668999"));
        restaurantList.add(new Place("Lou Mitchell's","565 w JAckson Blvrd","3129393111"));
        restaurantList.add(new Place("Frontera Grill","445 N Clark St","3126611434"));
        restaurantList.add(new Place("Oriole","661 W Walnut St","3128775339"));

        //setting up the adapter
        final PlacesAdapter adapter = new PlacesAdapter(getActivity(),restaurantList, R.color.Restaurants);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}