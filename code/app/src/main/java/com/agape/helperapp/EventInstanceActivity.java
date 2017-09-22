package com.agape.helperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * The EventInstanceActivity class displays all the 
 * information necessary for an event e.g. time, description etc.
 * 
 */

public class EventInstanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_instance);
    }
}
