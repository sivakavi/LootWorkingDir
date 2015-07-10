package com.example.programmer.customnavigationdrawer;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by programmer on 9/6/15.
 */
public class Play extends Fragment {

    public Play(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_play,container, false);
        return rootView;

    }


    @Override
    public void onResume() {
        super.onResume();
        // Set title
        //getActivity().setTitle("Play");
        ((MainActivity) getActivity()).setDrawerTitle("Play");
    }

}
