package com.example.android.androidbasicsudacityprojectfive;


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
public class VolgogradFragment extends Fragment {


    public VolgogradFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.volgograd_the_motherland_calls_sculture,
                R.string.details_volgograd_the_motherland_calls_sculture));
        places.add(new Place(R.string.volgograd_mamaev_hill_monuments,
                R.string.details_volgograd_mamaev_hill_monuments));
        places.add(new Place(R.string.volgograd_hall_of_military_glory,
                R.string.details_volgograd_hall_of_military_glory));
        places.add(new Place(R.string.volgograd_pobedi_park,
                R.string.details_volgograd_pobedi_park));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_volgograd);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }

}
