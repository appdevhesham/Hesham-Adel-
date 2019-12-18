package com.example.tourappguideinegypt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class placesadapter extends ArrayAdapter<Place> {
    public placesadapter(@NonNull Context context, int resource, @NonNull ArrayList<Place> Place) {
        super(context, 0, Place);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.presentation, parent, false);
        }
        Place currentPlace = getItem(position);
        TextView header = (TextView) listItem.findViewById(R.id.header);
        header.setText(currentPlace.getNameOfPlace());
        ImageView picture = (ImageView) listItem.findViewById(R.id.picture);
        picture.setImageResource(currentPlace.getPictureOfPlace());
        TextView information = (TextView) listItem.findViewById(R.id.paragraph);
        information.setText(currentPlace.getInformation());
        TextView address = (TextView) listItem.findViewById(R.id.paragraph);
        address.setText(currentPlace.getAddress());
        return listItem;

    }
}
