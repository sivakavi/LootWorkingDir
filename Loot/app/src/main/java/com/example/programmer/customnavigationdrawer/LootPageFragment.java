package com.example.programmer.customnavigationdrawer;

/**
 * Created by BinaryArrows on 4/27/2015.
 */
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.support.v4.app.ListFragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;




public class LootPageFragment extends ListFragment implements OnItemClickListener {

    public Context context;

    public View rootview;


    String[] menutitles;
    String[] menuoffers;
    String[] menuredeems;
    String[] menuexpires;
    TypedArray menuIcons;

    LootPageCustomAdapter adapter;
    private List<LootPageRowItem> rowItems;


    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        context = getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootview=inflater.inflate(R.layout.lootpage_fragment, container, false);

       // Log.d("Summa----", "testing  ook");

        //RelativeLayout xxxx=(RelativeLayout)rootview.findViewById(R.id.xxx);

        ImageView imageback=(ImageView) rootview.findViewById(R.id.loot_back);

       // TextView suma=(TextView) rootview.findViewById(R.id.loot_redeemed_item);

        imageback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               // Log.d("Summa----", "testing ok");

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainContent, new Home())
                        .commit();

           }
        });


        return rootview;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        menutitles = getResources().getStringArray(R.array.titles);
        menuoffers = getResources().getStringArray(R.array.offers);
        menuredeems = getResources().getStringArray(R.array.redeems);
        menuexpires = getResources().getStringArray(R.array.expires);
        menuIcons = getResources().obtainTypedArray(R.array.icons);

        rowItems = new ArrayList<LootPageRowItem>();

        for (int i = 0; i < menutitles.length; i++) {
            LootPageRowItem items = new LootPageRowItem(menutitles[i], menuIcons.getResourceId(
                    i, -1), menuoffers[i], menuredeems[i], menuexpires[i]);

            rowItems.add(items);
        }

        adapter = new LootPageCustomAdapter(getActivity(), rowItems);
        setListAdapter(adapter);

        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        // Toast.makeText(getActivity(), menutitles[position], Toast.LENGTH_SHORT)
        //        .show();


       // loottoast(view);


        Show_Dialog();



    }


    @Override
    public void onResume() {
        super.onResume();
        // Set title
        //getActivity().setTitle("Loots");
        ((MainActivity) getActivity()).setDrawerTitle("Loots");
    }



   /* public void loottoast(View view) {

        Context context=getActivity().getApplicationContext();
        LayoutInflater inflater=getActivity().getLayoutInflater();

        View customToastroot =inflater.inflate(R.layout.loot_toast, null);

        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
        customtoast.setDuration(Toast.LENGTH_SHORT);
        customtoast.show();
    }*/


    public void Show_Dialog() {
        LootCustomDialog cdd = new LootCustomDialog(getActivity());
        cdd.show();
    }





}