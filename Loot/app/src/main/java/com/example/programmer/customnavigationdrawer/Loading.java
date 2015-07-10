package com.example.programmer.customnavigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by programmer on 22/5/15.
 */
public class Loading  extends Activity implements AnimationListener {



    ImageView imgLogo;


    // Animation
    Animation animRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        imgLogo = (ImageView) findViewById(R.id.imgLogo);


        // load the animation
        animRotate = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);

        // set animation listener
        animRotate.setAnimationListener(this);

        imgLogo.setVisibility(View.VISIBLE);

        // start the animation
        imgLogo.startAnimation(animRotate);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Loading.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 5000);

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        // Take any action after completing the animation

        // check for fade in animation
        if (animation == animRotate) {
        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onAnimationStart(Animation animation) {
        // TODO Auto-generated method stub

    }


    }
