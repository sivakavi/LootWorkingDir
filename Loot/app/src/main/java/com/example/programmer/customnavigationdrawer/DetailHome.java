package com.example.programmer.customnavigationdrawer;

/**
 * Created by programmer on 13/5/15.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by programmer on 22/4/15.
 */


public class DetailHome extends Fragment {

    public DetailHome(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

            View rootView = inflater.inflate(R.layout.fragment_detail_home,container, false);


        //Detail.count=1;


        /*Button imgmap=(Button) rootView.findViewById(R.id.map);
        Button imgvideo=(Button) rootView.findViewById(R.id.star);
        Button imghome=(Button) rootView.findViewById(R.id.info);

        imgmap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainContent, new DetailMap())
                        .commit();

            }
        });


        imgvideo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainContent, new DetailVideo())
                        .commit();

            }
        });

        imghome.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainContent, new DetailHome())
                        .commit();

            }
        });*/


        return rootView;

    }


    @Override
    public void onResume() {
        super.onResume();
        // Set title
        //getActivity().setTitle("Details");
        ((MainActivity) getActivity()).setDrawerTitle("Details");

    }


}