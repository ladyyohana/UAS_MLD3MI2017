package com.vika.ggf;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailResult extends AppCompatActivity {
    TextView id_buku, judul, ddc, issn, no_panggil, penerbit, tahun, cetakan_ke, bahasa, jumlah_buku, klasifikasi,
            keterangan, cover, own, jumlah, infoBukuu;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_buku);


        final String id_buku = getIntent().getExtras().getString("id_buku");
        final String judul = getIntent().getExtras().getString("judul");
        final String ddc = getIntent().getExtras().getString("ddc");
        final String issn = getIntent().getExtras().getString("issn");
        final String no_panggil = getIntent().getExtras().getString("no_panggil");
        final String penerbit = getIntent().getExtras().getString("penerbit");
        final String tahun = getIntent().getExtras().getString("tahun");
        final String cetakan_ke = getIntent().getExtras().getString("cetakan_ke");
        final String bahasa = getIntent().getExtras().getString("bahasa");
        final String jumlah_buku = getIntent().getExtras().getString("jumlah_buku");
        final String klasifikasi = getIntent().getExtras().getString("klasifikasi");
        final String keterangan = getIntent().getExtras().getString("keterangan");
//        final String cover = getIntent().getExtras().getString("cover");
        final String own = getIntent().getExtras().getString("own");
        final String jumlah = getIntent().getExtras().getString("jumlah");
        final String infoBukuu = getIntent().getExtras().getString("infoBukuu");

        //id
//        img_photo = findViewById(R.id.img_item_photo);
        TextView IdBuku = findViewById(R.id.id_buku);
        TextView Judul = findViewById(R.id.judul);
        TextView Ddc = findViewById(R.id.ddc);
        TextView Issn = findViewById(R.id.issn);
        TextView NoPanggilan = findViewById(R.id.no_panggil);
        TextView Penerbit = findViewById(R.id.penerbit);
        TextView Tahun = findViewById(R.id.tahun);
        TextView CetakanKe = findViewById(R.id.cetakan_ke);
        TextView Bahasa = findViewById(R.id.bahasa);
        TextView JumlahBuku = findViewById(R.id.jumlah_buku);
        TextView Klasifikasi = findViewById(R.id.klasifikasi);
        TextView Keterangan = findViewById(R.id.keterangan);
//        ImageView Cover = findViewById(R.id.cover);
        TextView Own = findViewById(R.id.own);
        TextView Jumlah = findViewById(R.id.jumlah);
//        TextView InfoBukuu = findViewById(R.id.in);

//
//        strAwayTeam = itemView.findViewById(R.id.tv_strAwayTeam);
//        strDate = itemView.findViewById(R.id.tv_strDate);
//        strTime = itemView.findViewById(R.id.tv_strTime);
//        strHomeGoalDetails = itemView.findViewById(R.id.tv_strHomeGoalDetails);
//        strHomeRedCards = itemView.findViewById(R.id.tv_strHomeRedCards);
//        strHomeYellowCards = itemView.findViewById(R.id.tv_strHomeYellowCards);
//        strAwayGoalsDetail = itemView.findViewById(R.id.tv_strAwayGoalDetails);
//        strAwayRedCards = itemView.findViewById(R.id.tv_strAwayRedCards);
//        strAwayYellowCards = itemView.findViewById(R.id.tv_strAwayYellowCards);
//
//        intAwayScore = itemView.findViewById(R.id.tv_intAwayScore);
//        intHomeScore = itemView.findViewById(R.id.tv_intHomeScore);

        //setText
        IdBuku.setText(id_buku);
        Judul.setText(judul);
        Ddc.setText(ddc);
        Issn.setText(issn);
        NoPanggilan.setText(no_panggil);
        Penerbit.setText(penerbit);
        Tahun.setText(tahun);
        CetakanKe.setText(cetakan_ke);
        Bahasa.setText(bahasa);
        JumlahBuku.setText(jumlah_buku);
        Klasifikasi.setText(klasifikasi);
        Keterangan.setText(keterangan);
//        Cover.setImageResource(Integer.parseInt(cover));
        Own.setText(own);
        Jumlah.setText(jumlah);

        //ini load gambar

//        Glide.with(this)
//                .load(dtFoto)
////                .apply(new RequestOptions().override(100, 100))
//                .into(img_photo);

    }
}