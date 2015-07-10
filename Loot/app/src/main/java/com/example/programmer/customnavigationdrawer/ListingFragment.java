package com.example.programmer.customnavigationdrawer;

import android.support.v4.app.ListFragment;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by programmer on 27/6/15.
 */
public class ListingFragment extends ListFragment {

    String[] menutitles;
    String[] menusubtitles;
    String[] menuredeems;
    String[] menucount;

    TypedArray menuImage;
    TypedArray menuIcons;

    ListingCustomAdapter adapter;
    private List<ListingRowItem> rowItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.listing_fragment, null, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        menutitles = getResources().getStringArray(R.array.listingtitle);
        menusubtitles = getResources().getStringArray(R.array.listingsubtitle);
        menuredeems = getResources().getStringArray(R.array.listingredeemcount);
        menucount = getResources().getStringArray(R.array.listinggoldcount);
        menuImage = getResources().obtainTypedArray(R.array.listingimage);
        menuIcons = getResources().obtainTypedArray(R.array.listingicon);

        rowItems = new ArrayList<ListingRowItem>();

        for (int i = 0; i < menutitles.length; i++) {
            ListingRowItem items = new ListingRowItem(menutitles[i], menuImage.getResourceId(
                    i, -1), menuIcons.getResourceId(0, -1), menuIcons.getResourceId(1, -1), menusubtitles[i], menucount[i], menuredeems[i], "redeemed");

            rowItems.add(items);
        }

        adapter = new ListingCustomAdapter(getActivity(), rowItems);
        setListAdapter(adapter);
        // getListView().setOnItemClickListener(this);

    }

    @Override
    public void onResume() {
        super.onResume();
        // Set title
        // getActivity().setTitle("Wishlist");

        ((MainActivity) getActivity()).setDrawerTitle("Listing");
    }

   /* @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        Toast.makeText(getActivity(), menutitles[position], Toast.LENGTH_SHORT)
                .show();

    }*/

}
