package com.vika.ggf;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * create Vika Rahayu Aryati
 */
public class perpanjangbuku extends Fragment {
    public perpanjangbuku(){
        //nanti di isi
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.perpanjangbuku, container, false);
        getActivity().setTitle("Perpanjang Buku");
        return view;
    }
}