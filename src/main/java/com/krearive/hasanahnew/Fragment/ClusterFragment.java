package com.krearive.hasanahnew.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.krearive.hasanahnew.R;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.adapters.SlideInRightAnimationAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClusterFragment extends Fragment {

    public ClusterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_cluster, container, false);

        List<ClusterModel> listCluster = new ArrayList<>();

        ClusterModel clusterLists = new ClusterModel("Cluster Umayyah 1", R.drawable.rumah1,
                "Konsep bangunan layaknya di Turki, Maroko, Pakistan (Ala Timur Tengah). Anda bisa merasakan benar benar seperti berada di luar Indonesia",
                2, 2, 60, 27, 525200000, R.drawable.siteplanumayyah, R.drawable.tipe_27_60);
        listCluster.add(clusterLists);

        clusterLists = new ClusterModel("Cluster Umayyah 2", R.drawable.rumah2,
                "Konsep bangunan layaknya di Turki, Maroko, Pakistan (Ala Timur Tengah). Anda bisa merasakan benar seperti benar berada di luar Indonesia",
                2, 2, 72, 36, 666600000, R.drawable.siteplanumayyah, R.drawable.tipe_36_72);
        listCluster.add(clusterLists);

        clusterLists = new ClusterModel("Cluster Umayyah 3", R.drawable.rumah3,
                "Konsep bangunan layaknya di Turki, Maroko, Pakistan (Ala Timur Tengah). Anda bisa merasakan benar benar seperti berada di luar Indonesia",
                2, 2, 90, 45, 848400000, R.drawable.siteplanumayyah, R.drawable.tipe_45_90);
        listCluster.add(clusterLists);

        clusterLists = new ClusterModel("Cluster Abbasiyah 1", R.drawable.rumah4,
                "Perumahan syariah pertama di kawasan strategis Bogor. Dekat dengan KRL dan BSD City",
                2, 2, 60, 27, 414700000, R.drawable.siteplanabbasiyah, R.drawable.tipe_27_60);
        listCluster.add(clusterLists);

        clusterLists = new ClusterModel("Cluster Abbasiyah 2", R.drawable.rumah5,
                "Perumahan syariah pertama di kawasan strategis Bogor. Dekat dengan KRL dan BSD City",
                2, 2, 72, 36, 526350000, R.drawable.siteplanabbasiyah, R.drawable.tipe_36_72);
        listCluster.add(clusterLists);

        clusterLists = new ClusterModel("Cluster Abbasiyah 3", R.drawable.rumah6,
                "Perumahan syariah pertama di kawasan strategis Bogor. Dekat dengan KRL dan BSD City",
                2, 2, 90, 45, 669900000, R.drawable.siteplanabbasiyah, R.drawable.tipe_45_90);
        listCluster.add(clusterLists);

        clusterLists = new ClusterModel("Cluster Ustmaniyyah 1", R.drawable.rumah7,
                "Cluster Ustmaniyah posisi lebih strategis dekat danau. Pemandangannya sangat indah",
                2, 2, 60, 27, 260000000, R.drawable.siteplanustmaniyah, R.drawable.tipe_27_60);
        listCluster.add(clusterLists);

        clusterLists = new ClusterModel("Cluster Ustmaniyyah 2", R.drawable.rumah8,
                "Cluster Ustmaniyah posisi lebih strategis dekat danau. Pemandangannya sangat indah",
                2, 2, 72, 36, 330000000, R.drawable.siteplanustmaniyah, R.drawable.tipe_36_72);
        listCluster.add(clusterLists);

        clusterLists = new ClusterModel("Cluster Ustmaniyyah 3", R.drawable.rumah9,
                "Cluster Ustmaniyah posisi lebih strategis dekat danau. Pemandangannya sangat indah",
                2, 2, 90, 45, 420000000, R.drawable.siteplanustmaniyah, R.drawable.tipe_45_90);
        listCluster.add(clusterLists);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        RecyclerView.Adapter adapter = new ClusterAdapter(listCluster, getActivity());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        SlideInRightAnimationAdapter animatorAdapter = new SlideInRightAnimationAdapter(adapter);
        animatorAdapter.setFirstOnly(false);
        recyclerView.setAdapter(animatorAdapter);

        return rootView;
    }
}
