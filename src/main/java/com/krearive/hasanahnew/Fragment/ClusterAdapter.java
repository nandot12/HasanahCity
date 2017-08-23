package com.krearive.hasanahnew.Fragment;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.krearive.hasanahnew.DetailClusterActivity;
import com.krearive.hasanahnew.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ClusterAdapter extends RecyclerView.Adapter<ClusterAdapter.ViewHolder>{

    List<ClusterModel> clusterLists;
    Context context; // supaya bisa dipakai di kelas lain

    //buat constructor
    public ClusterAdapter(List<ClusterModel> clusterLists, Context context) {
        this.clusterLists = clusterLists;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaCluster;
        ImageView gambarCluster;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            namaCluster = (TextView) itemView.findViewById(R.id.namaCluster);
            gambarCluster = (ImageView) itemView.findViewById(R.id.gambarCluster);
            cardView = (CardView) itemView.findViewById(R.id.cardview);
        }
    }

    @Override
    public ClusterAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //menyambungkan ke layout item
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cluster_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ClusterAdapter.ViewHolder holder, final int position) {

        holder.namaCluster.setText(clusterLists.get(position).getNamaCluster());
        Picasso.with(context)
                .load(clusterLists.get(position).getGambarCluster())
                .into(holder.gambarCluster);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context, DetailClusterActivity.class);
                //kirim data
                pindah.putExtra("position",position);
                pindah.putExtra("extraNama",clusterLists.get(position).getNamaCluster());
                pindah.putExtra("extraGambar",clusterLists.get(position).getGambarCluster());
                pindah.putExtra("extraDetail",clusterLists.get(position).getDetailCluster());
                pindah.putExtra("extraJumlahLantai",clusterLists.get(position).getJumlahLantai());
                pindah.putExtra("extraJumlahKamar",clusterLists.get(position).getJumlahKamar());
                pindah.putExtra("extraLuasTanah",clusterLists.get(position).getLuasTanah());
                pindah.putExtra("extraLuasBangunan",clusterLists.get(position).getLuasBangunan());
                pindah.putExtra("extraHarga",clusterLists.get(position).getHargaCluster());
                pindah.putExtra("extraSiteplan",clusterLists.get(position).getGambarSiteplan());
                pindah.putExtra("extraTipe",clusterLists.get(position).getGambarTipe());
                context.startActivity(pindah);
            }
        });
    }

    @Override
    public int getItemCount() {
        //banyaknya list
        return clusterLists.size();
    }


}
