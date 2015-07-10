package com.example.programmer.customnavigationdrawer;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by programmer on 1/7/15.
 */
public class DetailInfo extends Fragment {

    public DetailInfo(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_detail_info,container, false);


        //Detail.count=4;

        TextView backtotop=(TextView) rootView.findViewById(R.id.textView30);


        backtotop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

               /* FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.maincontent, new Detail());
                ft.commit();*/


                Detail.count=1;

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainContent, new Detail())
                        .commit();



            }
        });



      /*  Button imgmap=(Button) rootView.findViewById(R.id.map);
        Button imgvideo=(Button) rootView.findViewById(R.id.star);
        Button imghome=(Button) rootView.findViewById(R.id.info);

        imgmap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.mainContent, new DetailMap())
                        .commit();

            }
        });


        imgvideo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.mainContent, new DetailVideo())
                        .commit();

            }
        });

        imghome.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                getActivity().getFragmentManager().beginTransaction()
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
