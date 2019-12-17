package com.k10.quran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;


public class ListJuzActivity extends AppCompatActivity {
    //private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_juz);

        /*
        Intent intent = getIntent();
        String ujuz = intent.getStringExtra("ujuz");
        String rsurah = intent.getStringExtra("rsurah");
        toolbar = getSupportActionBar();
        toolbar.setTitle(ujuz);
        toolbar.setSubtitle(rsurah);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        */
    }
}
