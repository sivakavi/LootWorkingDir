package com.example.programmer.customnavigationdrawer;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private static String TAG = MainActivity.class.getSimpleName();

    ListView mDrawerList;
    RelativeLayout mDrawerPane;
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private TextView mTitleTextView;

    ArrayList<NavItem> mNavItems = new ArrayList<NavItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavItems.add(new NavItem("Home"));
        mNavItems.add(new NavItem("Play"));
        mNavItems.add(new NavItem("Explore"));
        mNavItems.add(new NavItem("Wishlist"));
        mNavItems.add(new NavItem("Shop"));
        mNavItems.add(new NavItem("Setting"));
        mNavItems.add(new NavItem("Logout"));

        // DrawerLayout
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        // Populate the Navigtion Drawer with options
        mDrawerPane = (RelativeLayout) findViewById(R.id.drawerPane);
        mDrawerList = (ListView) findViewById(R.id.navList);
        DrawerListAdapter adapter = new DrawerListAdapter(this, mNavItems);
        mDrawerList.setAdapter(adapter);

        // Drawer Item click listeners
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectItemFromDrawer(position);
            }
        });


        ImageView homebtn=(ImageView) findViewById(R.id.footerhomebtn);
        ImageView searchbtn=(ImageView) findViewById(R.id.footersearchbtn);
        ImageView bagbtn=(ImageView) findViewById(R.id.footerbagbtn);
        ImageView shopbtn=(ImageView) findViewById(R.id.footershopbtn);
        ImageView playbtn=(ImageView) findViewById(R.id.play);


        homebtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                        getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainContent, new Home())
                        .commit();

            }
        });


        searchbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainContent, new ExploreFragment())
                        .commit();

            }
        });


        bagbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainContent, new LootPageFragment())
                        .commit();

            }
        });


        shopbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainContent, new Shop())
                        .commit();

            }
        });

        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainContent, new Play())
                        .commit();

            }
        });







        //ActionBar mActionBar = getSupportActionBar();
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        LayoutInflater mInflater = LayoutInflater.from(this);

        View mCustomView = mInflater.inflate(R.layout.header, null);

        //setDrawerTitle("Home");

       mTitleTextView = (TextView) mCustomView.findViewById(R.id.title_text);

      //  mTitleTextView.setText("Home");

        /*ImageButton imageButton = (ImageButton) mCustomView
                .findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Refresh Clicked!",
                        Toast.LENGTH_LONG).show();
            }
        });*/

        getSupportActionBar().setCustomView(mCustomView);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#33B5E5")));



        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);

                invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                //Log.d(TAG, "onDrawerClosed: " + getTitle());

                invalidateOptionsMenu();
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);



        Fragment fragment = new Home();

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.mainContent, fragment)
                .commit();


    }






    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Pass the event to ActionBarDrawerToggle
        // If it returns true, then it has handled
        // the nav drawer indicator touch event
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        // Handle your other action bar items...

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }





    private void selectItemFromDrawer(int position) {

        Fragment fragment = new Home();


        switch(position) {
            default:
            case 0:
                fragment = new Home();
                break;
            case 1:
                fragment = new Play();
                break;
            case 2:

                 fragment = new ExploreFragment();
                break;
            case 3:

                fragment = new WishlistFragment();
                break;
            case 4:

                fragment = new Shop();
                break;
            case 5:

                fragment = new Setting();
                //fragment = new ListingFragment();
                break;
            case 6:

                Intent myIntent = new Intent(MainActivity.this,
                        SignIn.class);
                startActivity(myIntent);

                break;
        }



        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.mainContent, fragment)
                .commit();


        mDrawerList.setItemChecked(position, true);

        //setTitle(mNavItems.get(position).mTitle);

       // setDrawerTitle(mNavItems.get(position).mTitle);

        // Close the drawer
        mDrawerLayout.closeDrawer(mDrawerPane);
    }



    public void setDrawerTitle(String title){

        //getSupportActionBar().setDisplayShowHomeEnabled(false);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);

        //Log.d("xxxxx---",title);

        //TextView mTitleTextView = (TextView) findViewById(R.id.title_text);

        mTitleTextView.setText(title);


    }







}
