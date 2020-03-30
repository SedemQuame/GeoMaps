package com.visionarytech.maps;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapsButtonGroup extends Fragment implements View.OnClickListener {


    public MapsButtonGroup() {
        // Required empty public constructor
    }

//        getting reference to the view elements to implement an onclick listener
    private Button googleMapsButton, wmsButton, ogcButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_maps_button_group, container, false);

        googleMapsButton = v.findViewById(R.id.googleMapsBtn);
        wmsButton = v.findViewById(R.id.wmsBtn);
        ogcButton = v.findViewById(R.id.ogcBtn);

        googleMapsButton.setOnClickListener(this);
        wmsButton.setOnClickListener(this);
        ogcButton.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view) {
        Intent changeActivityIntent = null;
        switch (view.getId()) {
            case R.id.googleMapsBtn:
                Log.d(TAG, "Google maps button clicked");
                Toast.makeText(getContext(), "Clicked google maps", Toast.LENGTH_SHORT).show();
                changeActivityIntent = new Intent(getActivity(), Gmaps.class);
                break;
            case R.id.wmsBtn:
                Toast.makeText(getContext(), "Clicked wms maps", Toast.LENGTH_SHORT).show();
                changeActivityIntent = new Intent(getActivity(), WMS.class);
                break;
            case R.id.ogcBtn:
                Toast.makeText(getContext(), "Clicked ogc maps", Toast.LENGTH_SHORT).show();
                changeActivityIntent = new Intent(getActivity(), OGC.class);
                break;
            default:
                Toast.makeText(getContext(), "Clicked ogc maps", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Ids ");

                break;

        }

        startActivity(changeActivityIntent);
    }
}
