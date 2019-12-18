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
public class GizaNecropolis extends Fragment {


    public GizaNecropolis() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview =inflater.inflate(R.layout.places , container , false) ;
        ArrayList<Place>gizanicropolis = new ArrayList<>();
        gizanicropolis.add(new Place("Giza Nicropolis" ,"Al Haram, Giza Governorate" , "The Giza pyramid complex, also called the Giza Necropolis, is the site on the Giza Plateau in Greater Cairo, Egypt that includes the Great Pyramid of Giza, the Pyramid of Khafre, and the Pyramid of Menkaure, along with their associated pyramid complexes and the Great Sphinx of Giza" , R.drawable.gizanicropolis ) );
        placesadapter adapternecropolis = new placesadapter(getActivity() , gizanicropolis) ;
        ListView necropolis = (ListView) rootview.findViewById(R.id.list) ;
        necropolis.setAdapter(adapternecropolis);
        return rootview;
    } ,

}
