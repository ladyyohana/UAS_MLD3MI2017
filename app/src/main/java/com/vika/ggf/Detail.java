package com.vika.ggf;

import android.os.Parcel;
import android.os.Parcelable;

public class Detail implements Parcelable {
    private String id_buku;
    private String judul;
    private String ddc;
    private String issn;
    private String no_panggil;
    private String penerbit;
    private String tahun;
    private String cetakan_ke;
    private String bahasa;
    private String jumlah_buku;
    private String klasifikasi;
    private String keterangan;
    private String cover;
    private String own;
    private String jumlah;

    public String getInfoBukuu() {
        return infoBukuu;
    }

    public void setInfoBukuu(String infoBukuu) {
        this.infoBukuu = infoBukuu;
    }

    private String infoBukuu;

    public Detail() {
    }

    public String getId_buku() {
        return id_buku;
    }

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDdc() {
        return ddc;
    }

    public void setDdc(String ddc) {
        this.ddc = ddc;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getNo_panggil() {
        return no_panggil;
    }

    public void setNo_panggil(String no_panggil) {
        this.no_panggil = no_panggil;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getCetakan_ke() {
        return cetakan_ke;
    }

    public void setCetakan_ke(String cetakan_ke) {
        this.cetakan_ke = cetakan_ke;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public String getJumlah_buku() {
        return jumlah_buku;
    }

    public void setJumlah_buku(String jumlah_buku) {
        this.jumlah_buku = jumlah_buku;
    }

    public String getKlasifikasi() {
        return klasifikasi;
    }

    public void setKlasifikasi(String klasifikasi) {
        this.klasifikasi = klasifikasi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getOwn() {
        return own;
    }

    public void setOwn(String own) {
        this.own = own;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public Detail(String id_buku, String judul, String ddc, String issn, String no_panggil, String penerbit, String tahun,
                  String cetakan_ke, String bahasa, String jumlah_buku, String klasifikasi, String keterangan, String cover,
                  String own, String jumlah, String infoBukuu) {

        this.id_buku = id_buku;
        this.judul = judul;
        this.ddc = ddc;
        this.issn = issn;
        this.no_panggil = no_panggil;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.cetakan_ke = cetakan_ke;
        this.bahasa = bahasa;
        this.jumlah_buku = jumlah_buku;
        this.klasifikasi = klasifikasi;
        this.keterangan = keterangan;
        this.cover = cover;
        this.own = own;
        this.jumlah = jumlah;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id_buku);
        dest.writeString(this.judul);
        dest.writeString(this.ddc);
        dest.writeString(this.issn);
        dest.writeString(this.no_panggil);
        dest.writeString(this.penerbit);
        dest.writeString(this.tahun);
        dest.writeString(this.cetakan_ke);
        dest.writeString(this.bahasa);
        dest.writeString(this.jumlah_buku);
        dest.writeString(this.klasifikasi);
        dest.writeString(this.keterangan);
        dest.writeString(this.cover);
        dest.writeString(this.own);
        dest.writeString(this.jumlah);
        dest.writeString(this.infoBukuu);
    }

    protected Detail(Parcel in) {
        this.id_buku = in.readString();
        this.judul = in.readString();
        this.ddc = in.readString();
        this.issn = in.readString();
        this.no_panggil = in.readString();
        this.penerbit = in.readString();
        this.tahun = in.readString();
        this.cetakan_ke = in.readString();
        this.bahasa = in.readString();
        this.jumlah_buku = in.readString();
        this.klasifikasi = in.readString();
        this.keterangan = in.readString();
        this.cover = in.readString();
        this.own = in.readString();
        this.jumlah = in.readString();
        this.infoBukuu = in.readString();
    }

    public static final Creator<Detail> CREATOR = new Creator<Detail>() {
        @Override
        public Detail createFromParcel(Parcel source) {
            return new Detail(source);
        }

        @Override
        public Detail[] newArray(int size) {
            return new Detail[size];
        }
    };
}