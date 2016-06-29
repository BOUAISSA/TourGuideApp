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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_parks, container, false);

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        ArrayList<TourisAttraction> parks = new ArrayList<TourisAttraction>();
        parks.add(new TourisAttraction("Hama","Club des Pains",R.drawable.sheraton));
        parks.add(new TourisAttraction("5 Juilliet","BBZ",R.drawable.sheraton));
        parks.add(new TourisAttraction("Bouchaoui","BBZ",R.drawable.sheraton));
        parks.add(new TourisAttraction("andalous","maritimes",R.drawable.sheraton));
        parks.add(new TourisAttraction("Hama","Club des Pains",R.drawable.sheraton));
        parks.add(new TourisAttraction("Hama","Club des Pains",R.drawable.sheraton));
        parks.add(new TourisAttraction("Hama","Club des Pains",R.drawable.sheraton));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(),parks);

        ListView listView = (ListView)rootView.findViewById(R.id.list3_parks);
        listView.setAdapter(adapter);
        return rootView;
    }

}
