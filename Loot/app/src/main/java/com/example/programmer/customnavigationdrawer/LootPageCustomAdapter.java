package com.example.programmer.customnavigationdrawer;

/**
 * Created by BinaryArrows on 4/27/2015.
 */
import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LootPageCustomAdapter extends BaseAdapter {

    Context context;
    List<LootPageRowItem> rowItem;

    LootPageCustomAdapter(Context context, List<LootPageRowItem> rowItem) {
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
            convertView = mInflater.inflate(R.layout.lootpage_list_item, null);
        }

        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.list_image);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
        TextView txtOffer = (TextView) convertView.findViewById(R.id.offer);
        TextView txtRedeem = (TextView) convertView.findViewById(R.id.redeem);
        TextView txtExpire= (TextView) convertView.findViewById(R.id.expires);

        LootPageRowItem row_pos = rowItem.get(position);

        // setting the image resource and title
        imgIcon.setImageResource(row_pos.getIcon());
        txtTitle.setText(row_pos.getTitle());
        txtOffer.setText(row_pos.getOffer());
        txtRedeem.setText(row_pos.getRedeem());
        txtExpire.setText(row_pos.getExpire());

        return convertView;

    }

}