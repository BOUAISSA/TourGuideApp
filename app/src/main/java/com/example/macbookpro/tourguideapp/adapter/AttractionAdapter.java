package com.example.macbookpro.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class AttractionAdapter extends ArrayAdapter<TourisAttraction> {

    public AttractionAdapter(Context context, ArrayList<TourisAttraction> attractions) {
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item1, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        TourisAttraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView nameAttraction = (TextView) listItemView.findViewById(R.id.attraction_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        nameAttraction.setText(currentAttraction.getmNameAttraction());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView addressAttraction = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        addressAttraction.setText(currentAttraction.getmAddressAttraction());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.attraction_image);
        // Set the ImageView to the image resource specified in the current Word
        imageView.setImageResource(currentAttraction.getmImageResourceId());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
