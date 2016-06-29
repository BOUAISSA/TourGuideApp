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
public class RestaurentsFragment extends Fragment {


    public RestaurentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_restaurents, container, false);

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */
        ArrayList<TourisAttraction> restaurents = new ArrayList<TourisAttraction>();
        restaurents.add(new TourisAttraction("wood picker","Club des Pains",R.drawable.sheraton));
        restaurents.add(new TourisAttraction("MC mirna","BBZ",R.drawable.sheraton));
        restaurents.add(new TourisAttraction("3assel","BBZ",R.drawable.sheraton));
        restaurents.add(new TourisAttraction("Ibis Restaurent","maritimes",R.drawable.sheraton));
        restaurents.add(new TourisAttraction("Sheraton restaurent ","Club des Pains",R.drawable.sheraton));
        restaurents.add(new TourisAttraction("Maderag","Club des Pains",R.drawable.sheraton));
        restaurents.add(new TourisAttraction("hamdan","Club des Pains",R.drawable.sheraton));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(),restaurents);
        ListView listView = (ListView) rootView.findViewById(R.id.list1_restaurents);
        listView.setAdapter(adapter);

        return rootView;
    }

}
