package com.example.programmer.customnavigationdrawer;

/**
 * Created by BinaryArrows on 4/27/2015.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ExploreCustomAdapter extends BaseAdapter {

    Context context;
    List<ExploreRowItem> rowItem;

    ExploreCustomAdapter(Context context, List<ExploreRowItem> rowItem) {
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
            convertView = mInflater.inflate(R.layout.explore_list_item, null);
        }

        ImageView mainimage= (ImageView) convertView.findViewById(R.id.explore_main);
       // ImageView imgIcon1 = (ImageView) convertView.findViewById(R.id.explore_wish);
        //ImageView imgIcon2 = (ImageView) convertView.findViewById(R.id.explore_gold);

        TextView txtTitle = (TextView) convertView.findViewById(R.id.explore_title);
        TextView txtSubtitle = (TextView) convertView.findViewById(R.id.explore_buy);
        TextView txtRedeem = (TextView) convertView.findViewById(R.id.explore_redeem);
        TextView txtGold = (TextView) convertView.findViewById(R.id.gold_count);
        TextView txtRedeemed = (TextView) convertView.findViewById(R.id.explore_redeemed);

        ExploreRowItem row_pos = rowItem.get(position);

        // setting the image resource and title
        mainimage.setImageResource(row_pos.getMainimage());
       // imgIcon1.setImageResource(row_pos.getIcon1());
       // imgIcon2.setImageResource(row_pos.getIcon2());
        txtTitle.setText(row_pos.getTitle());
        txtSubtitle.setText(row_pos.getSubtitle());
        txtRedeem.setText(row_pos.getRedeem());
        txtGold.setText(row_pos.getGold());
        txtRedeemed.setText(row_pos.getRedeemed());

        return convertView;

    }

}