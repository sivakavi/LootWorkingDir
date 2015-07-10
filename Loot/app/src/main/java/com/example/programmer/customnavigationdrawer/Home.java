package com.example.programmer.customnavigationdrawer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by programmer on 17/4/15.
 */
public class Home  extends Fragment{

    public Home(){}

    public View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){


        rootView = inflater.inflate(R.layout.fragment_home_frag,container, false);





        ImageView mainimg=(ImageView) rootView.findViewById(R.id.homeimg_img);

        ImageView wishlistimage=(ImageView) rootView.findViewById(R.id.imageView3);




        mainimg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainContent, new Detail())
                        .commit();

            }
        });


        wishlistimage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //String resName = getResources().getResourceName(R.drawable.wishlist_active);

                ImageView wishlistimage1=(ImageView) rootView.findViewById(R.id.imageView3);

                Drawable x=wishlistimage1.getDrawable();

                Drawable xx=getResources().getDrawable( R.drawable.wishlist_active);


                if (wishlistimage1.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.wishlist_active).getConstantState())
                {
                    Toast.makeText(getActivity(),"Image is ivPic", Toast.LENGTH_LONG).show();
                    // new RegisterAsyntaskNew().execute();
                }
                else
                {
                    Toast.makeText(getActivity(), "Image isn't ivPic", Toast.LENGTH_LONG).show();
                    // new RegisterAsyntask().execute();
                }

            }
        });




        return rootView;

    }

    @Override
    public void onResume() {
        super.onResume();
        // Set title
        //getActivity().setTitle("Home");

        ((MainActivity) getActivity()).setDrawerTitle("Home");
    }


}
