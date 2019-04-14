package com.example.escortapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
    }

    // go to login page when admin button is clicked
    public void goToLoginPage(View view)  {
        Intent intent = new Intent(WelcomePage.this, AdminLogin.class);
        startActivity(intent);
    }

    // go to user page when user button is clicked
    public void goToUserPage(View view)  {
        Intent intent = new Intent(WelcomePage.this, UserMainInterface.class);
        startActivity(intent);
    }
}