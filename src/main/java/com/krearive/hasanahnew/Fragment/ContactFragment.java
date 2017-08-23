package com.krearive.hasanahnew.Fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.krearive.hasanahnew.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment implements OnMapReadyCallback {


    private GoogleMap map;
    private MapView mMapView;
    private MarkerOptions markerOption = new MarkerOptions();
    private TextView nomortelepon, emailperusahaan;


    public ContactFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_contact, container, false);

        mMapView = (MapView) rootview.findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);
        mMapView.getMapAsync(this);

        nomortelepon = (TextView) rootview.findViewById(R.id.nomerTelepon);
        nomortelepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NoTelepon = "085740482440";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + NoTelepon));
                startActivity(intent);
            }
        });

        emailperusahaan = (TextView) rootview.findViewById(R.id.emailPerusahaan);
        emailperusahaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = "faizin.arief@gmail.com";
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", email, null));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Tertarik dengan Hasanah City");
                startActivity(Intent.createChooser(intent, "Kirim Email"));
            }
        });

        return rootview;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        map.getUiSettings().setZoomControlsEnabled(true);
        map.getUiSettings().setMyLocationButtonEnabled(true);

        LatLng operationalOfficer = new LatLng(-6.5893268, 106.7821629);
        LatLng serviceOfficer = new LatLng(-6.594619, 106.7930447);
        LatLng hasanahCity = new LatLng(-6.37407, 106.58735);

        map.addMarker(markerOption.position(operationalOfficer).title("Operational Office")).showInfoWindow();
        map.addMarker(markerOption.position(serviceOfficer).title("Service Office")).showInfoWindow();
        map.addMarker(markerOption.position(hasanahCity).title("Hasanah City")).showInfoWindow();
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(serviceOfficer, 14));//posisi pertama kali Map

        //https://developers.google.com/maps/documentation/android-api/start
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mMapView.onSaveInstanceState(outState);
    }

}


