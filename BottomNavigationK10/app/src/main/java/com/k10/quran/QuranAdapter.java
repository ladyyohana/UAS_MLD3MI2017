package com.k10.quran;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class QuranAdapter extends RecyclerView.Adapter<QuranAdapter.ViewHolder> {

    private Context context;
    private List<Quran> list;

    public QuranAdapter(Context context, List<Quran> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_surah, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Quran obj = list.get(position);
        holder.nama.setText(obj.getNama());
        holder.arti.setText(obj.getArti());

        holder.box_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ListSurahActivity.class);
                intent.putExtra("infoquran", obj.getInfoQuran());
                intent.putExtra("nama", obj.getNama());
                intent.putExtra("arti", obj.getArti());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nama;
        private TextView arti;
        private LinearLayout box_linear;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.nama);
            arti = itemView.findViewById(R.id.arti);
            box_linear = itemView.findViewById(R.id.box_linear);
        }
    }
}
