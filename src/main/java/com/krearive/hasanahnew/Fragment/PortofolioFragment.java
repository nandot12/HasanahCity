package com.krearive.hasanahnew.Fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.krearive.hasanahnew.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class PortofolioFragment extends Fragment implements View.OnClickListener {

    private ImageView portofolioDiandra;
    private ImageView portofolioSakinahVillage;
    private ImageView portofolioAlIkhlas;
    private ImageView portofolioGriyaHanif;
    private ImageView portofolioAndalusia;
    private ImageView portofolioAlhambra;
    private ImageView portofolioArrayyan;
    private ImageView portofolioAmani;
    private ImageView portofolioPermata;
    private ImageView portofolioMontana;

    public PortofolioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_portofolio, container, false);
        initView(view);

        portofolioDiandra.setOnClickListener(this);
        portofolioSakinahVillage.setOnClickListener(this);
        portofolioAlIkhlas.setOnClickListener(this);
        portofolioGriyaHanif.setOnClickListener(this);
        portofolioAndalusia.setOnClickListener(this);
        portofolioAlhambra.setOnClickListener(this);
        portofolioArrayyan.setOnClickListener(this);
        portofolioAmani.setOnClickListener(this);
        portofolioPermata.setOnClickListener(this);
        portofolioMontana.setOnClickListener(this);

        return view;
    }

    private void initView(View view) {
        portofolioDiandra = (ImageView) view.findViewById(R.id.portofolio_diandra);
        portofolioSakinahVillage = (ImageView) view.findViewById(R.id.portofolio_sakinah_village);
        portofolioAlIkhlas = (ImageView) view.findViewById(R.id.portofolio_al_ikhlas);
        portofolioGriyaHanif = (ImageView) view.findViewById(R.id.portofolio_griya_hanif);
        portofolioAndalusia = (ImageView) view.findViewById(R.id.portofolio_andalusia);
        portofolioAlhambra = (ImageView) view.findViewById(R.id.portofolio_alhambra);
        portofolioArrayyan = (ImageView) view.findViewById(R.id.portofolio_arrayyan);
        portofolioAmani = (ImageView) view.findViewById(R.id.portofolio_amani);
        portofolioPermata = (ImageView) view.findViewById(R.id.portofolio_permata);
        portofolioMontana = (ImageView) view.findViewById(R.id.portofolio_montana);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.portofolio_diandra) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://www.diandraserpongvillage.com/"));
            startActivity(i);
        } else if (v.getId() == R.id.portofolio_sakinah_village) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://sakinahvillage.com/"));
            startActivity(i);
        } else if (v.getId() == R.id.portofolio_al_ikhlas) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://al-ikhlasresidence.com/"));
            startActivity(i);
        } else if (v.getId() == R.id.portofolio_griya_hanif) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.facebook.com/GRIYA-HANIF-Regency-Perumahan-Syariah-di-Kota-Solo-Jateng-1019196781530591/"));
            startActivity(i);
        } else if (v.getId() == R.id.portofolio_andalusia) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://www.andalusiaresidence.com/"));
            startActivity(i);
        } else if (v.getId() == R.id.portofolio_alhambra) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.facebook.com/perumahansyariahmaja/"));
            startActivity(i);
        } else if (v.getId() == R.id.portofolio_arrayyan) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://arrayyanregency.com/"));
            startActivity(i);
        } else if (v.getId() == R.id.portofolio_amani) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://www.amanivillage.com/"));
            startActivity(i);
        } else if (v.getId() == R.id.portofolio_permata) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://www.permataalamhijau.com/"));
            startActivity(i);
        } else if (v.getId() == R.id.portofolio_montana) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.facebook.com/rumahsyariahmontanagreen/"));
            startActivity(i);
        }
    }
}
