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
public class HospitalsFragment extends Fragment {


    public HospitalsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_hospitals, container, false);

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        ArrayList<TourisAttraction> hospitals = new ArrayList<TourisAttraction>();
        hospitals.add(new TourisAttraction("CHU","Algiers",R.drawable.sheraton));
        hospitals.add(new TourisAttraction("beni messous","Algiers",R.drawable.sheraton));
        hospitals.add(new TourisAttraction("blida CHU","Algiers",R.drawable.sheraton));
        hospitals.add(new TourisAttraction("Rouiba CHU","Algiers",R.drawable.sheraton));
        hospitals.add(new TourisAttraction("Rouiba ","Club Algiers Pains",R.drawable.sheraton));
        hospitals.add(new TourisAttraction("Rouiba ","Club des Algiers",R.drawable.sheraton));
        hospitals.add(new TourisAttraction("Rouiba ","Algiers des Pains",R.drawable.sheraton));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(),hospitals);
        ListView listView = (ListView)rootView.findViewById(R.id.list4_hospitals);
        listView.setAdapter(adapter);
        return rootView;
    }

}
