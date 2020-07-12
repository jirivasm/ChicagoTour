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
 * Use the {@link TouristPlacesFragments#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TouristPlacesFragments extends Fragment {


    ArrayList<Place> touristList = null;

    public TouristPlacesFragments() {
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
        touristList = new ArrayList<>();
        touristList.add(new Place("360 Chicago", "875 N Michigan Ave", R.drawable.chicago360));
        touristList.add(new Place("Navi Pier", "600 E Grand Ave", R.drawable.navi_pier));
        touristList.add(new Place("Limcoln Park Zoo", "2001 N Clarck St", R.drawable.zoo));
        touristList.add(new Place("The Art Institute of Chicago", "111 S Michigan Ave", R.drawable.art_institute));
        touristList.add(new Place("Cloud Gate", "201 E Randolph St", R.drawable.cloud_gate));
        touristList.add(new Place("Museum Campus", "337 E. Randolph St", R.drawable.museum));

        //setting up the adapter
        final PlacesAdapter adapter = new PlacesAdapter(getActivity(), touristList, R.color.Tourism);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}