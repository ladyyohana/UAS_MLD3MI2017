package com.vika.ggf;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BukuuAdapter extends RecyclerView.Adapter<BukuuAdapter.ViewHolder> {

    private Context context;
    private List<Bukuu> list;

    public BukuuAdapter(Context context, List<Bukuu> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_buku, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Bukuu obj = list.get(position);
        holder.judul.setText(obj.getJudul());
        holder.tahun.setText(obj.getTahun());

        holder.box_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ListBukuActivity.class);
                intent.putExtra("infobukuu", obj.getInfoBukuu());
                intent.putExtra("judul", obj.getJudul());
                intent.putExtra("id_buku", obj.getId_buku());
                intent.putExtra("ddc", obj.getDdc());
                intent.putExtra("issn", obj.getIssn());
                intent.putExtra("no_panggil", obj.getNo_panggil());
                intent.putExtra("penerbit", obj.getPenerbit());
                intent.putExtra("tahun", obj.getTahun());
                intent.putExtra("cetakan_ke", obj.getCetakan_ke());
                intent.putExtra("bahasa", obj.getBahasa());
                intent.putExtra("jumlah_buku", obj.getJumlah_buku());
                intent.putExtra("klasifikasi", obj.getKlasifikasi());
                intent.putExtra("keterangan", obj.getKeterangan());
                intent.putExtra("own", obj.getOwn());
                intent.putExtra("jumlah", obj.getJumlah());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView judul;
        private TextView tahun;
        private LinearLayout box_linear;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            judul = itemView.findViewById(R.id.judul);
            tahun = itemView.findViewById(R.id.tahun);
            box_linear = itemView.findViewById(R.id.box_linear);
        }
    }
}
