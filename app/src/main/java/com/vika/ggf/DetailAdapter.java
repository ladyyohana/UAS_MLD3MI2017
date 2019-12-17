package com.vika.ggf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewHolder> {
    private Context context;
    private List<Detail> list;

    public DetailAdapter(Context context, List<Detail> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.pinjambuku, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Detail obj = list.get(position);

        holder.judul.setText(obj.getJudul());
        holder.id_buku.setText(obj.getId_buku());
        holder.ddc.setText(obj.getDdc());
        holder.issn.setText(obj.getIssn());
        holder.no_panggil.setText(obj.getNo_panggil());
        holder.penerbit.setText(obj.getPenerbit());
        holder.cetakan_ke.setText(obj.getCetakan_ke());
        holder.bahasa.setText(obj.getBahasa());
        holder.jumlah_buku.setText(obj.getJumlah_buku());
        holder.klasifikasi.setText(obj.getKlasifikasi());
        holder.keterangan.setText(obj.getKeterangan());
        holder.own.setText(obj.getOwn());
        holder.jumlah.setText(obj.getJumlah());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout relative;
        private TextView judul, id_buku, ddc, issn, no_panggil, penerbit, tahun, cetakan_ke, bahasa,
                jumlah_buku, klasifikasi, keterangan, own,
                jumlah;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            judul = itemView.findViewById(R.id.judul);
            tahun = itemView.findViewById(R.id.tahun);
//            box_linear = itemView.findViewById(R.id.box_linear);
            id_buku = itemView.findViewById(R.id.id_buku);
            ddc = itemView.findViewById(R.id.ddc);
            issn = itemView.findViewById(R.id.issn);
            no_panggil = itemView.findViewById(R.id.no_panggil);
            penerbit = itemView.findViewById(R.id.penerbit);
            cetakan_ke = itemView.findViewById(R.id.cetakan_ke);
            bahasa = itemView.findViewById(R.id.bahasa);
            jumlah_buku = itemView.findViewById(R.id.jumlah_buku);
            klasifikasi = itemView.findViewById(R.id.klasifikasi);
            keterangan = itemView.findViewById(R.id.keterangan);
            own = itemView.findViewById(R.id.own);
            jumlah = itemView.findViewById(R.id.jumlah);
        }
    }
}