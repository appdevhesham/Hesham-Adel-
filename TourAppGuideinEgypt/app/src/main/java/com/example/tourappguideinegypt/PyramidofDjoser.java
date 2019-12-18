package com.example.tourappguideinegypt;


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
 */
public class PyramidofDjoser extends Fragment {


    public PyramidofDjoser() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview =inflater.inflate(R.layout.places , container , false) ;
        ArrayList<Place> pyramidofjoser = new ArrayList<>();
        pyramidofjoser.add(new Place("Pyramid Of Djoser" , "Address:Al Giza Desert, Giza Governorate" , "The Pyramid of Djoser, or Step Pyramid is an archeological remain in the Saqqara necropolis, Egypt, northwest of the city of Memphis. The 6-tier, 4-sided structure is the earliest colossal stone building in Egypt" , (R.drawable.step_pyramid_of_djoser)));
        placesadapter adapterpyramid = new placesadapter(getActivity() , pyramidofjoser  ) ;
        ListView pyramid = (ListView) rootview.findViewById(R.id.list) ;
        pyramid.setAdapter(adapterpyramid);
        return rootview;
    }

}
