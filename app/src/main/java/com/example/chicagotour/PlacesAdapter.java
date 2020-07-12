package com.example.chicagotour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Place> {


    private int mColorResourceId;

    //constructor setting up the background color
    public PlacesAdapter(Activity context, ArrayList<Place> placesList, int colorResource) {
        super(context, 0, placesList);
        mColorResourceId = colorResource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.places_item, parent, false);
        }

        Place currentPlace = getItem(position);

        // getting the right item on the for the list
        TextView nameText = listItemView.findViewById(R.id.place_name);
        nameText.setText(currentPlace.getName());

        TextView addressText = listItemView.findViewById(R.id.place_address);
        addressText.setText(currentPlace.getAddress());

        TextView phoneText = listItemView.findViewById(R.id.place_phone);
        phoneText.setText(currentPlace.getPhone());

        ImageView imageView = listItemView.findViewById(R.id.place_image);

        //making sure the image is there only when we need it
        if(currentPlace.hasImage) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentPlace.getImage());
            //setting up the background color for the image
            int backgroundcolor = ContextCompat.getColor(getContext(),mColorResourceId);
            imageView.setBackgroundColor(backgroundcolor);

        }
        else
            imageView.setVisibility(View.GONE);


        //setting up the color
        View textContainer = listItemView.findViewById(R.id.places_info);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
