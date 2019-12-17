package com.k10.quran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;


public class ListSurahActivity extends AppCompatActivity {
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_surah);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        String arti = intent.getStringExtra("arti");
        toolbar = getSupportActionBar();
        toolbar.setTitle(nama);
        toolbar.setSubtitle(arti);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
