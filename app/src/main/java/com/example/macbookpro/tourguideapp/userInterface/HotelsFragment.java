package com.example.macbookpro.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_hotels, container, false);

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        ArrayList<TourisAttraction> hotels = new ArrayList<TourisAttraction>();
        hotels.add(new TourisAttraction("Sheraton","Club des Pains",R.drawable.sheraton));
        hotels.add(new TourisAttraction("Ibis","BBZ",R.drawable.sheraton));
        hotels.add(new TourisAttraction("Jardi","BBZ",R.drawable.sheraton));
        hotels.add(new TourisAttraction("Hilton","maritimes",R.drawable.sheraton));
        hotels.add(new TourisAttraction("Sheraton","Club des Pains",R.drawable.sheraton));
        hotels.add(new TourisAttraction("Sheraton","Club des Pains",R.drawable.sheraton));
        hotels.add(new TourisAttraction("Sheraton","Club des Pains",R.drawable.sheraton));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(),hotels);

        ListView listView = (ListView)rootView.findViewById(R.id.list2_hotels);
        listView.setAdapter(adapter);
        return rootView;
    }

}
