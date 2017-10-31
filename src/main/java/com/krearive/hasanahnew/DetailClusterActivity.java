package com.krearive.hasanahnew;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.krearive.hasanahnew.UnityPlayer.UnityPlayerNativeActivity;

import java.text.NumberFormat;
import java.util.Locale;
//hhh

public class DetailClusterActivity extends AppCompatActivity {

    private CollapsingToolbarLayout detailGambar;
    private TextView detail;
    private TextView detailJumlahLantai, detailJumlahKamar, detailLuasTanah, detailLuasBangunan, detailHarga ;
    private ImageView detailSiteplan, detailTipe;
    private Button btnAugmented;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cluster);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "085740482440"));
                startActivity(intent);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //ambil data Intent
        String intentNama = getIntent().getStringExtra("extraNama");
        String intentDetail = getIntent().getStringExtra("extraDetail");
        int intentgambar = getIntent().getExtras().getInt("extraGambar");
        int position = getIntent().getExtras().getInt("position");
        int jumlahlantai = getIntent().getExtras().getInt("extraJumlahLantai");
        int jumlahkamar = getIntent().getExtras().getInt("extraJumlahKamar");
        int luastanah = getIntent().getExtras().getInt("extraLuasTanah");
        int luasbangunan = getIntent().getExtras().getInt("extraLuasBangunan");
        int hargarumah = getIntent().getExtras().getInt("extraHarga");
        int gambarSiteplan = getIntent().getExtras().getInt("extraSiteplan");
        int gambarTipe = getIntent().getExtras().getInt("extraTipe");

        getSupportActionBar().setTitle(intentNama);
        Log.i("Posisi ", "" + position);
        Log.i("Deytail ", "" + intentgambar);

        detail = (TextView) findViewById(R.id.detail_perusahaan);
        detail.setText(intentDetail);

        detailGambar = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        detailGambar.setBackgroundResource(intentgambar);

        detailJumlahLantai = (TextView) findViewById(R.id.tvJumlahLantai);
        detailJumlahLantai.setText(Integer.toString(jumlahlantai));

        detailJumlahKamar = (TextView) findViewById(R.id.tvJumlahKamar);
        detailJumlahKamar.setText(Integer.toString(jumlahkamar));

        detailLuasTanah = (TextView) findViewById(R.id.tvLuasTanah);
        detailLuasTanah.setText(Integer.toString(luastanah)+" m2");

        detailLuasBangunan = (TextView) findViewById(R.id.tvLuasBangunan);
        detailLuasBangunan.setText(Integer.toString(luasbangunan)+" m2");

        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        detailHarga = (TextView) findViewById(R.id.tvHargaRumah);
        detailHarga.setText(formatRupiah.format((double)hargarumah));

        detailSiteplan = (ImageView) findViewById(R.id.ivSiteplan);
        detailSiteplan.setImageResource(gambarSiteplan);

        detailTipe = (ImageView) findViewById(R.id.ivTipe);
        detailTipe.setImageResource(gambarTipe);

        btnAugmented = (Button) findViewById(R.id.btnAugment);
        btnAugmented.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailClusterActivity.this, UnityPlayerNativeActivity.class));
            }
        });

    }
}
