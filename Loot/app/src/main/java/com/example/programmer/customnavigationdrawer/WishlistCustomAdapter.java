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
 * Created by programmer on 13/5/15.
 */
public class WishlistCustomAdapter  extends BaseAdapter {


    Context context;
    List<WishlistRowItem> rowItem;

    WishlistCustomAdapter(Context context, List<WishlistRowItem> rowItem) {
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
            convertView = mInflater.inflate(R.layout.wishlist_list_item, null);
        }

        ImageView imgImage = (ImageView) convertView.findViewById(R.id.imageView9);
        ImageView imgGold = (ImageView) convertView.findViewById(R.id.imageView11);
        ImageView imgClose = (ImageView) convertView.findViewById(R.id.imageView10);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.textView8);
        TextView txtSubtitle = (TextView) convertView.findViewById(R.id.textView9);
        TextView txtDays = (TextView) convertView.findViewById(R.id.textView10);
        TextView txtCount= (TextView) convertView.findViewById(R.id.wishcoins);
        TextView txtRedeem = (TextView) convertView.findViewById(R.id.textView12);
        TextView txtRedeemed= (TextView) convertView.findViewById(R.id.textView13);

        WishlistRowItem row_pos = rowItem.get(position);

        // setting the image resource and title
        imgImage.setImageResource(row_pos.getWishlist_image());
        imgGold.setImageResource(row_pos.getWishlist_gold());
        imgClose.setImageResource(row_pos.getWishlist_close());
        txtTitle.setText(row_pos.getWishlist_title());
        txtSubtitle.setText(row_pos.getWishlist_subtitle());
        txtDays.setText(row_pos.getWishlist_days());
        txtCount.setText(row_pos.getWishlist_count());
        txtRedeem.setText(row_pos.getWishlist_redeem());
        txtRedeemed.setText(row_pos.getWishlist_redeemed());


        return convertView;

    }
}
