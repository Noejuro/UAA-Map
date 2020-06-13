package com.example.uaamap;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Maps extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    public Marker markerRectoria, markerBiblio, markerAuditorioPedroDeAlba;
    public Marker ed54, ed55, ed53, ed47;
    public Marker exp58, cafe47;
    public Marker jardinGen, wc58, wcBiblio, event;
    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        bottomNavigation = findViewById(R.id.bottom_navigation);

        bottomNavigation.setOnNavigationItemSelectedListener(new
         BottomNavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                 switch (item.getItemId()) {
                     case R.id.allMarkers:
                         ed54.setVisible(true);
                         ed55.setVisible(true);
                         ed53.setVisible(true);
                         ed47.setVisible(true);
                         markerRectoria.setVisible(true);
                         markerAuditorioPedroDeAlba.setVisible(true);
                         markerBiblio.setVisible(true);
                         exp58.setVisible(true);
                         cafe47.setVisible(true);
                         jardinGen.setVisible(true);
                         wc58.setVisible(true);
                         wcBiblio.setVisible(true);
                         event.setVisible(true);

                         break;

                     case R.id.classroom:
                         ed54.setVisible(true);
                         ed55.setVisible(true);
                         ed53.setVisible(true);
                         ed47.setVisible(true);
                         markerRectoria.setVisible(false);
                         markerAuditorioPedroDeAlba.setVisible(false);
                         markerBiblio.setVisible(false);
                         exp58.setVisible(false);
                         cafe47.setVisible(false);

                         jardinGen.setVisible(false);
                         wc58.setVisible(false);
                         wcBiblio.setVisible(false);
                         event.setVisible(false);
                         break;

                     case R.id.admin:
                         markerRectoria.setVisible(true);
                         markerAuditorioPedroDeAlba.setVisible(true);
                         markerBiblio.setVisible(true);
                         ed54.setVisible(false);
                         ed55.setVisible(false);
                         ed53.setVisible(false);
                         ed47.setVisible(false);
                         exp58.setVisible(false);
                         cafe47.setVisible(false);


                         jardinGen.setVisible(false);
                         wc58.setVisible(false);
                         wcBiblio.setVisible(false);
                         event.setVisible(false);
                         break;

                     case R.id.alimentos:
                         exp58.setVisible(true);
                         cafe47.setVisible(true);
                         ed54.setVisible(false);
                         ed55.setVisible(false);
                         ed53.setVisible(false);
                         ed47.setVisible(false);
                         markerRectoria.setVisible(false);
                         markerAuditorioPedroDeAlba.setVisible(false);
                         markerBiblio.setVisible(false);

                         jardinGen.setVisible(false);
                         wc58.setVisible(false);
                         wcBiblio.setVisible(false);
                         event.setVisible(false);
                         break;
                 }
                 return true;
             }
         });



    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.getUiSettings().setCompassEnabled(false);

        mMap.getUiSettings().setZoomControlsEnabled(false);

        mMap.getUiSettings().setMapToolbarEnabled(false);

        MapStyleOptions mapStyleOptions=MapStyleOptions.loadRawResourceStyle(this,R.raw.google_style);
        googleMap.setMapStyle(mapStyleOptions);

        LatLng currentPosition = new LatLng(21.913432, -102.315349);
        mMap.addMarker(new MarkerOptions().position(currentPosition).title("Noé Alejandro").icon(BitmapDescriptorFactory.fromResource(R.drawable.user)));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentPosition, 18));

        //EDIFCIOS SALON
        //Marker ed54 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913617, -102.316332)).title("Salon de clases"));
        //mMap.addMarker(ed54);

        ed54 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913617, -102.316332)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed54)));

        ed55 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913090, -102.316059)).title("Edificio de redes, tienda y salones de computo").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed55)));

        ed53 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913211, -102.316522)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed53)));

        ed47 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913331, -102.317733)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ed47)));

        //ESPACIOS RECREATIVOS
        jardinGen = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913873, -102.315609)).title("Jardin de las generaciones").icon(BitmapDescriptorFactory.fromResource(R.drawable.greenzone)));

        //Baños
        wc58 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912693, -102.316508)).title("Baños").icon(BitmapDescriptorFactory.fromResource(R.drawable.toilet)));

        wcBiblio = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912893, -102.315310)).title("Baños").icon(BitmapDescriptorFactory.fromResource(R.drawable.toilet)));

        //Edificios escolares

        markerRectoria = googleMap.addMarker(new MarkerOptions().position(new LatLng(21.910896, -102.313111)).title("Rectoría").icon(BitmapDescriptorFactory.fromResource(R.drawable.academic)));

        markerBiblio = googleMap.addMarker(new MarkerOptions().position(new LatLng(21.912877, -102.315014)).title("Biblioteca Central").icon(BitmapDescriptorFactory.fromResource(R.drawable.library)));

        markerAuditorioPedroDeAlba = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912796, -102.315431)).title("Auditorio Universitario Dr. Pedro de Alba").icon(BitmapDescriptorFactory.fromResource(R.drawable.audience)));

        //Maquinas expendedoras
        exp58 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912735, -102.316536)).title("Máquina expendedora").icon(BitmapDescriptorFactory.fromResource(R.drawable.vending_machine)));

        //Cafeterias
        cafe47 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913218, -102.317690)).title("Cafetería").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant)));

        //Eventos
        event = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914097, -102.314687)).title("Feria Nacional del Libro").icon(BitmapDescriptorFactory.fromResource(R.drawable.eventsuaa)));


        googleMap.setOnMarkerClickListener(this);

    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        final Intent rectoInfo = new Intent(getApplicationContext(), RectoriaInfo.class);
        final Intent biblioInfo = new Intent(getApplicationContext(), infoB.class);
        if(marker.equals(markerRectoria))
        {
            startActivity(rectoInfo);
        }

        if(marker.equals(markerBiblio))
        {
            startActivity(biblioInfo);
        }

        return false;
    }
}
