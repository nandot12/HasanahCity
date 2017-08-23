package com.krearive.hasanahnew;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.krearive.hasanahnew.Fragment.ClusterFragment;
import com.krearive.hasanahnew.Fragment.ContactFragment;
import com.krearive.hasanahnew.Fragment.FasilitasFragment;
import com.krearive.hasanahnew.Fragment.HomeFragment;
import com.krearive.hasanahnew.Fragment.PortofolioFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NoTelepon = "085740482440";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + NoTelepon));
                startActivity(intent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ClusterFragment fragment = new ClusterFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.frame_for_Fragment, fragment, fragment.getTag())
                .commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            startActivity(new Intent(MainActivity.this, AboutActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            HomeFragment fragment = new HomeFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.frame_for_Fragment, fragment, fragment.getTag())
                    .commit();
            getSupportActionBar().setTitle("Profil");

        } else if (id == R.id.nav_cluster) {
            ClusterFragment fragment = new ClusterFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.frame_for_Fragment, fragment, fragment.getTag())
                    .commit();
            getSupportActionBar().setTitle("Produk");

        } else if (id == R.id.nav_fasilitas) {
            FasilitasFragment fragment = new FasilitasFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_for_Fragment, fragment)
                    .commit();
            getSupportActionBar().setTitle("Fasilitas");

        } else if (id == R.id.nav_portofolio) {
            PortofolioFragment fragment = new PortofolioFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.frame_for_Fragment, fragment, fragment.getTag())
                    .commit();

            getSupportActionBar().setTitle("Portofolio");

        } else if (id == R.id.nav_web) {
            Intent pindah = new Intent(MainActivity.this, WebActivity.class);
            startActivity(pindah);

        } else if (id == R.id.nav_share) {
            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            share.putExtra(Intent.EXTRA_SUBJECT, "Hasanah City");
            share.putExtra(Intent.EXTRA_TEXT, "Mau punya rumah idaman tanpa riba? \nDownload aplikasi ini https://play.google.com/store/apps/developer?id=Pesantren+Programmer");
            startActivity(Intent.createChooser(share, "Share ke Sahabatmu"));

        } else if (id == R.id.nav_contact) {
            ContactFragment fragment = new ContactFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.frame_for_Fragment, fragment, fragment.getTag())
                    .commit();
            getSupportActionBar().setTitle("Contact");

        } else if (id == R.id.nav_download) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://s.id/markerhasanahcity"));
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            new AlertDialog.Builder(this)
                    .setMessage("Apakah Anda yakin ingin keluar?")
                    .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            MainActivity.this.finish();
                        }
                    })
                    .setNegativeButton("Tidak", null)
                    .show();
            return true;
        } else {
            return super.onKeyDown(keyCode, event);
        }

    }
}
