package com.agape.helperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * The ProfileActivityClass shows the user's information
 * (if they have filled it in) and allows the user to change information.
 */

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}
