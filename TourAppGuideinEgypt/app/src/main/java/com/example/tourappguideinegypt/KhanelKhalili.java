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
public class KhanelKhalili extends Fragment {


    public KhanelKhalili() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview =inflater.inflate(R.layout.places , container , false) ;
        ArrayList<Place> khanelkhalili = new ArrayList<>();
        khanelkhalili.add(new Place("Khan El Khalili" , "Address:El-Gamaleya, El Gamaliya, Cairo Governorate" , "Khan el-Khalili is a famous Egyptian bazaar and souq in the historic center of Cairo, Egypt. The bazaar district is one of Cairo's main attractions for tourists and Egyptians alike. It is also home to many Egyptian artisans and workshops involved in the production of traditional crafts and souvenirs" , (R.drawable.khanalkhalili)));
        placesadapter adapterelkhalili = new placesadapter(getActivity() , khanelkhalili  ) ;
        ListView elkhalili = (ListView) rootview.findViewById(R.id.list) ;
        elkhalili.setAdapter(adapterelkhalili);
        return rootview;
    }

}
