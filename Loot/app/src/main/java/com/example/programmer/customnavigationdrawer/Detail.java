package com.example.programmer.customnavigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by programmer on 1/7/15.
 */

public class Detail extends Fragment {

    public static int count=1;


    public Detail(){}

    /** Called when the activity is first created. */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_detail,container, false);




        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.maincontent, new DetailHome());
        ft.commit();



        final GestureDetector gesture = new GestureDetector(getActivity(),
                new GestureDetector.SimpleOnGestureListener() {

                    @Override
                    public boolean onDown(MotionEvent e) {
                        return true;
                    }


                    @Override
                    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                                           float velocityY) {

                        // String swipe = "";

                        float sensitvity = 50;

			/*// TODO Auto-generated method stub
			if((e1.getX() - e2.getX()) > sensitvity){
				swipe += "Swipe Left\n";
			}else if((e2.getX() - e1.getX()) > sensitvity){
				swipe += "Swipe Right\n";
			}else{
				swipe += "\n";
			}*/

                        if((e1.getY() - e2.getY()) > sensitvity){
                            //swipe += "Swipe Up\n";

                            if(count<5) {
                                count++;
                            }

                            if(count<5){

                                if(count==2){

                                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                                    ft.replace(R.id.maincontent, new DetailMap());
                                    ft.commit();

                                }

                                if(count==3){

                                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                                    ft.replace(R.id.maincontent, new DetailVideo());
                                    ft.commit();

                                }

                                if(count==4){

                                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                                    ft.replace(R.id.maincontent, new DetailInfo());
                                    ft.commit();

                                }


                   /* ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
                    pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(),count));*/
                            }


                        }
                        else if((e2.getY() - e1.getY()) > sensitvity) {

                            //swipe += "Swipe Down\n";


                            if (count > 1) {
                                count--;
                            }

                            if (count > 0) {

                                if (count == 1) {

                                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                                    ft.replace(R.id.maincontent, new DetailHome());
                                    ft.commit();

                                }

                                if (count == 2) {

                                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                                    ft.replace(R.id.maincontent, new DetailMap());
                                    ft.commit();

                                }

                                if (count == 3) {

                                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                                    ft.replace(R.id.maincontent, new DetailVideo());
                                    ft.commit();

                                }

                                if (count == 4) {

                                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                                    ft.replace(R.id.maincontent, new DetailInfo());
                                    ft.commit();

                                }
                            }
                        }

                        else{
                            //swipe += "\n";
                        }

                        return super.onFling(e1, e2, velocityX, velocityY);
                    }

                });



        rootView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return gesture.onTouchEvent(event);
            }
        });


        return rootView;

    }


}
