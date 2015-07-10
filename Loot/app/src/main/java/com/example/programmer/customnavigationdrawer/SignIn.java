package com.example.programmer.customnavigationdrawer;

/**
 * Created by programmer on 12/5/15.
 */



    import android.os.Bundle;
    import android.app.Activity;
    import android.content.Intent;
    import android.view.View;
    import android.view.View.OnClickListener;
    import android.widget.Button;
    import android.widget.TextView;

public class SignIn extends Activity {
        Button button;
        TextView signup;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            // Get the view from activity_main.xml
            setContentView(R.layout.activity_sign_in);

            // Locate the button in activity_main.xml
            button = (Button) findViewById(R.id.button5);

            signup=(TextView) findViewById(R.id.textView35);

            // Capture button clicks
            signup.setOnClickListener(new OnClickListener() {
                public void onClick(View arg0) {

                    // Start NewActivity.class
                    Intent myIntent = new Intent(SignIn.this,
                            SignUp.class);
                    startActivity(myIntent);
                }
            });


            button.setOnClickListener(new OnClickListener() {
                public void onClick(View arg0) {

                    // Start NewActivity.class
                    Intent myIntent = new Intent(SignIn.this,
                            Loading.class);
                    startActivity(myIntent);
                }
            });
        }


    }



