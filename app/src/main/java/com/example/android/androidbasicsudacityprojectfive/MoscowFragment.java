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
public class MoscowFragment extends Fragment {


    public MoscowFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.moscow_stbasil, R.string.details_moscow_stbasil,
                R.drawable.moscow_stbasil));
        places.add(new Place(R.string.moscow_red_square, R.string.details_moscow_red_square,
                R.drawable.moscow_red_square));
        places.add(new Place(R.string.moscow_tretyakov_gallery, R.string.details_moscow_tretyakov_gallery,
                R.drawable.moscow_tretyakov_gallery));
        places.add(new Place(R.string.moscow_victory_museum, R.string.details_moscow_victory_museum,
                R.drawable.moscow_victory_museum));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_family);

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
