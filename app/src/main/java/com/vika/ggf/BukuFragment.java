package com.vika.ggf;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class BukuFragment extends Fragment {

    private RecyclerView recyclerView;

    private LinearLayoutManager linearLayoutManager;
    private DividerItemDecoration dividerItemDecoration;
    private List<Bukuu> list;
    private RecyclerView.Adapter adapter;

    private String url = "http://99maulina.000webhostapp.com/ml/buku.php";


    public BukuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_buku, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        list = new ArrayList<Bukuu>();
        adapter = new BukuuAdapter(getContext(), list);

        linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), linearLayoutManager.getOrientation());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(adapter);

        getData();

        return view;
    }

    private void getData() {
        final ProgressDialog progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);

                        Bukuu obj = new Bukuu();
                        obj.setInfoBukuu("Buku");
                        obj.setJudul(jsonObject.getString("judul"));
                        obj.setId_buku(jsonObject.getString("id_buku"));
                        obj.setDdc(jsonObject.getString("ddc"));
                        obj.setIssn(jsonObject.getString("issn"));
                        obj.setNo_panggil(jsonObject.getString("no_panggil"));
                        obj.setPenerbit(jsonObject.getString("penerbit"));
                        obj.setTahun(jsonObject.getString("tahun"));
                        obj.setCetakan_ke(jsonObject.getString("cetakan_ke"));
                        obj.setBahasa(jsonObject.getString("bahasa"));
                        obj.setJumlah_buku(jsonObject.getString("jumlah_buku"));
                        obj.setKlasifikasi(jsonObject.getString("klasifikasi"));
                        obj.setKeterangan(jsonObject.getString("keterangan"));
                        obj.setOwn(jsonObject.getString("own"));
                        obj.setJumlah(jsonObject.getString("jumlah"));

                        list.add(obj);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        progressDialog.dismiss();
                    }
                }
                adapter.notifyDataSetChanged();
                progressDialog.dismiss();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley", error.toString());
                progressDialog.dismiss();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        requestQueue.add(jsonArrayRequest);
    }

}