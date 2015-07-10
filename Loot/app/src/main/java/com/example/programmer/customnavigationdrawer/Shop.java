package com.example.programmer.customnavigationdrawer;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by programmer on 9/6/15.
 */
public class Shop extends Fragment {

    public Shop(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_shop,container, false);

        return rootView;

    }


    @Override
    public void onResume() {
        super.onResume();
        // Set title
        //getActivity().setTitle("Shop");

        ((MainActivity) getActivity()).setDrawerTitle("Shop");

    }

}
