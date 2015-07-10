package com.example.programmer.customnavigationdrawer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by programmer on 27/6/15.
 */
public class ListingCustomAdapter extends BaseAdapter {


    Context context;
    List<ListingRowItem> rowItem;

    ListingCustomAdapter(Context context, List<ListingRowItem> rowItem) {
        this.context = context;
        this.rowItem = rowItem;

    }

    @Override
    public int getCount() {

        return rowItem.size();
    }

    @Override
    public Object getItem(int position) {

        return rowItem.get(position);
    }

    @Override
    public long getItemId(int position) {

        return rowItem.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listing_list_item, null);
        }

        ImageView imgImage = (ImageView) convertView.findViewById(R.id.listing1);
        ImageView imgGold = (ImageView) convertView.findViewById(R.id.listing_goldimg);
        ImageView imgWish = (ImageView) convertView.findViewById(R.id.listing_wish);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.listing_item);
        TextView txtSubtitle = (TextView) convertView.findViewById(R.id.listing_discount);
        TextView txtCount= (TextView) convertView.findViewById(R.id.listing_goldtxt);
        TextView txtRedeem = (TextView) convertView.findViewById(R.id.listing_redeem);
        TextView txtRedeemed= (TextView) convertView.findViewById(R.id.listing_redeemed);

        ListingRowItem row_pos = rowItem.get(position);

        // setting the image resource and title
        imgImage.setImageResource(row_pos.getListing_image());
        imgGold.setImageResource(row_pos.getListing_gold());
        imgWish.setImageResource(row_pos.getListing_wishlist());
        txtTitle.setText(row_pos.getListing_title());
        txtSubtitle.setText(row_pos.getListing_subtitle());
        txtCount.setText(row_pos.getListing_count());
        txtRedeem.setText(row_pos.getListing_redeem());
        txtRedeemed.setText(row_pos.getListing_redeemed());


        return convertView;

    }
}

