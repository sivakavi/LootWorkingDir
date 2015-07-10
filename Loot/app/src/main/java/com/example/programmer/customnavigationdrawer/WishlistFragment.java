package com.example.programmer.customnavigationdrawer;

/**
 * Created by BinaryArrows on 4/27/2015.
 */
import java.util.ArrayList;
import java.util.List;
import android.support.v4.app.ListFragment;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class WishlistFragment extends ListFragment {

    String[] menutitles;
    String[] menusubtitles;
    String[] menuredeems;
    String[] menudays;
    String[] menucount;

    TypedArray menuImage;
    TypedArray menuIcons;

    WishlistCustomAdapter adapter;
    private List<WishlistRowItem> rowItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.wishlist_fragment, null, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        menutitles = getResources().getStringArray(R.array.wishlisttitle);
        menusubtitles = getResources().getStringArray(R.array.wishlistsubtitle);
        menuredeems = getResources().getStringArray(R.array.wishlistredeemed);
        menudays = getResources().getStringArray(R.array.wishlistday);
        menucount = getResources().getStringArray(R.array.wishlistcount);
        menuImage = getResources().obtainTypedArray(R.array.wishlistimage);
        menuIcons = getResources().obtainTypedArray(R.array.wishlisticon);

        rowItems = new ArrayList<WishlistRowItem>();

        for (int i = 0; i < menutitles.length; i++) {
            WishlistRowItem items = new WishlistRowItem(menutitles[i], menuImage.getResourceId(
                    i, -1), menuIcons.getResourceId(0, -1), menuIcons.getResourceId(1, -1), menusubtitles[i], menudays[i], menucount[i], menuredeems[i], "redeemed");

            rowItems.add(items);
        }

        adapter = new WishlistCustomAdapter(getActivity(), rowItems);
        setListAdapter(adapter);
       // getListView().setOnItemClickListener(this);

    }

     @Override
    public void onResume() {
        super.onResume();
        // Set title
       // getActivity().setTitle("Wishlist");

         ((MainActivity) getActivity()).setDrawerTitle("Wishlist");
    }

   /* @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        Toast.makeText(getActivity(), menutitles[position], Toast.LENGTH_SHORT)
                .show();

    }*/

}