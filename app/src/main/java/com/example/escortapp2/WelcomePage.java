package com.example.escortapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.view.View;

import com.google.firebase.firestore.FirebaseFirestore;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        //  transition to main activity
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // TODO: Your application init goes here.
                Intent mInHome = new Intent(WelcomePage.this, MainActivity.class);
                WelcomePage.this.startActivity(mInHome);
                WelcomePage.this.finish();
            }
        }, 3000);
    }
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    // go to user page when user button is clicked
    /*
    public void goToUserPage(View view)  {
        Intent intent = new Intent(WelcomePage.this, UserMainInterface.class);
        startActivity(intent);
    }
    */
}