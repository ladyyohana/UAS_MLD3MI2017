package com.vika.ggf;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ListBukuActivity extends AppCompatActivity {
    TextView tv_judul, tv_id_buku, tv_ddc, tv_issn, tv_no_panggil, tv_penerbit, tv_tahun,
            tv_cetakan_ke, tv_bahasa, tv_jumlah_buku, tv_klasifikasi, tv_keterangan, tv_own,
            tv_jumlah;
    //private ActionBar toolbar;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pinjambuku);

        Intent intent = getIntent();
        String judul = intent.getStringExtra("judul");
        String id_buku = intent.getStringExtra("id_buku");
        String ddc = intent.getStringExtra("ddc");
        String issn = intent.getStringExtra("issn");
        String no_panggil = intent.getStringExtra("no_panggil");
        String penerbit = intent.getStringExtra("penerbit");
        String tahun = intent.getStringExtra("tahun");
        String cetakan_ke = intent.getStringExtra("cetakan_ke");
        String bahasa = intent.getStringExtra("bahasa");
        String jumlah_buku = intent.getStringExtra("jumlah_buku");
        String klasifikasi = intent.getStringExtra("klasifikasi");
        String keterangan = intent.getStringExtra("keterangan");
        String own = intent.getStringExtra("own");
        String jumlah = intent.getStringExtra("jumlah");

        tv_judul = findViewById(R.id.judul);
        tv_id_buku = findViewById(R.id.id_buku);
        tv_ddc = findViewById(R.id.ddc);
        tv_issn = findViewById(R.id.issn);
        tv_no_panggil = findViewById(R.id.no_panggil);
        tv_penerbit = findViewById(R.id.penerbit);
        tv_tahun = findViewById(R.id.tahun);
        tv_cetakan_ke = findViewById(R.id.cetakan_ke);
        tv_bahasa = findViewById(R.id.bahasa);
        tv_jumlah = findViewById(R.id.jumlah);
        tv_jumlah_buku = findViewById(R.id.jumlah_buku);
        tv_klasifikasi = findViewById(R.id.klasifikasi);
        tv_keterangan = findViewById(R.id.keterangan);
        tv_own = findViewById(R.id.own);

        tv_judul.setText(judul);
        tv_id_buku.setText(id_buku);
        tv_ddc.setText(ddc);
        tv_issn.setText(issn);
        tv_no_panggil.setText(no_panggil);
        tv_penerbit.setText(penerbit);
        tv_tahun.setText(tahun);
        tv_cetakan_ke.setText(cetakan_ke);
        tv_bahasa.setText(bahasa);
        tv_jumlah.setText(jumlah);
        tv_jumlah_buku.setText(jumlah_buku);
        tv_klasifikasi.setText(klasifikasi);
        tv_keterangan.setText(keterangan);
        tv_own.setText(own);


    }
}