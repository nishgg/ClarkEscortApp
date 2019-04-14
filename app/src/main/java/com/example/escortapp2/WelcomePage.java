package com.example.escortapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.firestore.FirebaseFirestore;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
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