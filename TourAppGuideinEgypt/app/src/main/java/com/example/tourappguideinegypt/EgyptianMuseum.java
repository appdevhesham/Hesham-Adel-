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
public class EgyptianMuseum extends Fragment {


    public EgyptianMuseum() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview =inflater.inflate(R.layout.places , container , false) ;
        ArrayList<Place> egyptianmuseum = new ArrayList<>();
        egyptianmuseum.add(new Place("Egyptian Museum" , "Address: Al Mandarah Bahri, Montaza 2, Alexandria Governorate" , "Montaza Palace is a palace, museum and extensive gardens in the Montaza district of Alexandria, Egypt. It was built on a low plateau east of central Alexandria overlooking a beach on the Mediterranean Sea" , (R.drawable.egyptian_museum)));
        placesadapter adaptermuseum = new placesadapter(getActivity() , egyptianmuseum  ) ;
        ListView museum = (ListView) rootview.findViewById(R.id.list) ;
        museum.setAdapter(adaptermuseum);
        return rootview;
    }

}
