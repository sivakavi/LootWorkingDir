package com.example.programmer.customnavigationdrawer;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by programmer on 13/6/15.
 */

public class LootCustomDialog extends Dialog implements android.view.View.OnClickListener {

        public Activity c;
        public Dialog d;
        public ImageView yes, no;

        public LootCustomDialog(Activity a) {
            super(a);
            // TODO Auto-generated constructor stub
            this.c = a;
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            requestWindowFeature(Window.FEATURE_NO_TITLE);

            setContentView(R.layout.okcanceltoast);



            yes = (ImageView) findViewById(R.id.ok);
            no = (ImageView) findViewById(R.id.cancel);

            yes.setOnClickListener(this);
            no.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.ok:
                    //c.finish();
                    dismiss();
                    loottoast();
                    break;
                case R.id.cancel:
                    dismiss();
                    break;
                default:
                    break;
            }

            //dismiss();
        }



    public void loottoast() {

        Context context = c.getApplicationContext();
        LayoutInflater inflater = c.getLayoutInflater();

        View customToastroot =inflater.inflate(R.layout.loot_toast, null);

        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_SHORT);
        customtoast.show();
    }



    }