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
 * Use the {@link ParksFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ParksFragment extends Fragment {

    ArrayList<Place> parksList;
    public ParksFragment() {
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
        parksList = new ArrayList<>();
        parksList.add(new Place("Merrimac Park","6343 w Irving Park Rd","7736853382"));
        parksList.add(new Place("Lincoln PArk", "2045 N Lincoln Park W","3127427726"));
        parksList.add(new Place("Garfield PArk Conservatory", "300 N Central PArk Ave","3127465100"));
        parksList.add(new Place("The Chicago Park District Central","100 N Central PArk Ave","3127465092"));
        parksList.add(new Place("Oz Park","2021 N Burling St","3127427898"));
        parksList.add(new Place("Grand Park","337 E Randolph St","3127423918"));

        //set up the tabs
        final PlacesAdapter adapter = new PlacesAdapter(getActivity(),parksList,R.color.Parks);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}