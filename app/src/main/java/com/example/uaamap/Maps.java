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
    public Marker ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8, ed9, ed10;
    public Marker ed11, ed12, ed13, ed14, ed15, ed16, ed17, ed18, ed19, ed20;
    public Marker ed21, ed22, ed23, ed24, ed25, ed26, ed27, ed28, ed29, ed30;
    public Marker ed31, ed32, ed33, ed34, ed35, ed36, ed37, ed38, ed39, ed40;
    public Marker ed42, ed43, ed44, ed45, ed46, ed47, ed48, ed49, ed50;
    public Marker ed51, ed52, ed53, ed54, ed55, ed56, ed57, ed58, ed59, ed60;
    public Marker ed61;
    public Marker exp58, cafe47, cafe9, cafe210;
    public Marker wc58, wc50, wc37, wc26, wc19, wc5, wc3, wc1, wcBiblio;
    public Marker jardinGen, event;
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
                         ed1.setVisible(true); ed2.setVisible(true); ed3.setVisible(true); ed4.setVisible(true); ed5.setVisible(true);
                         ed6.setVisible(true); ed7.setVisible(true); ed8.setVisible(true); ed9.setVisible(true); ed10.setVisible(true);

                         ed11.setVisible(true); ed12.setVisible(true); ed13.setVisible(true); ed14.setVisible(true); ed15.setVisible(true);
                         ed16.setVisible(true); ed17.setVisible(true); ed18.setVisible(true); ed19.setVisible(true); ed20.setVisible(true);

                         ed21.setVisible(true); ed22.setVisible(true); ed23.setVisible(true); ed24.setVisible(true); ed25.setVisible(true);
                         ed26.setVisible(true); ed27.setVisible(true); ed28.setVisible(true); ed29.setVisible(true); ed30.setVisible(true);

                         ed31.setVisible(true); ed32.setVisible(true); ed33.setVisible(true); ed34.setVisible(true); ed35.setVisible(true);
                         ed36.setVisible(true); ed37.setVisible(true); ed38.setVisible(true); ed39.setVisible(true); ed40.setVisible(true);

                         ed42.setVisible(true); ed43.setVisible(true); ed44.setVisible(true); ed45.setVisible(true);
                         ed46.setVisible(true); ed47.setVisible(true); ed48.setVisible(true); ed49.setVisible(true); ed50.setVisible(true);

                         ed51.setVisible(true); ed52.setVisible(true); ed53.setVisible(true); ed54.setVisible(true); ed55.setVisible(true);
                         ed56.setVisible(true); ed57.setVisible(true); ed58.setVisible(true); ed59.setVisible(true); ed60.setVisible(true);

                         ed61.setVisible(true);

                         markerRectoria.setVisible(true);
                         markerAuditorioPedroDeAlba.setVisible(true);
                         markerBiblio.setVisible(true);
                         exp58.setVisible(true);

                         cafe47.setVisible(true); cafe9.setVisible(true); cafe210.setVisible(true);

                         jardinGen.setVisible(true);

                         wc58.setVisible(true); wcBiblio.setVisible(true); wc50.setVisible(true); wc1.setVisible(true); wc3.setVisible(true); wc5.setVisible(true);
                         wc19.setVisible(true); wc26.setVisible(true); wc37.setVisible(true);

                         event.setVisible(true);

                         break;

                     case R.id.classroom:
                         ed1.setVisible(true); ed2.setVisible(true); ed3.setVisible(true); ed4.setVisible(true); ed5.setVisible(true);
                         ed6.setVisible(true); ed7.setVisible(true); ed8.setVisible(true); ed9.setVisible(true); ed10.setVisible(true);

                         ed11.setVisible(true); ed12.setVisible(true); ed13.setVisible(true); ed14.setVisible(true); ed15.setVisible(true);
                         ed16.setVisible(true); ed17.setVisible(true); ed18.setVisible(true); ed19.setVisible(true); ed20.setVisible(true);

                         ed21.setVisible(true); ed22.setVisible(true); ed23.setVisible(true); ed24.setVisible(true); ed25.setVisible(true);
                         ed26.setVisible(true); ed27.setVisible(true); ed28.setVisible(true); ed29.setVisible(true); ed30.setVisible(true);

                         ed31.setVisible(true); ed32.setVisible(true); ed33.setVisible(true); ed34.setVisible(true); ed35.setVisible(true);
                         ed36.setVisible(true); ed37.setVisible(true); ed38.setVisible(true); ed39.setVisible(true); ed40.setVisible(true);

                         ed42.setVisible(true); ed43.setVisible(true); ed44.setVisible(true); ed45.setVisible(true);
                         ed46.setVisible(true); ed47.setVisible(true); ed48.setVisible(true); ed49.setVisible(true); ed50.setVisible(true);

                         ed51.setVisible(true); ed52.setVisible(true); ed53.setVisible(true); ed54.setVisible(true); ed55.setVisible(true);
                         ed56.setVisible(true); ed57.setVisible(true); ed58.setVisible(true); ed59.setVisible(true); ed60.setVisible(true);

                         ed61.setVisible(true);

                         markerRectoria.setVisible(false);
                         markerAuditorioPedroDeAlba.setVisible(false);
                         markerBiblio.setVisible(false);
                         exp58.setVisible(false);
                         cafe47.setVisible(false); cafe9.setVisible(false); cafe210.setVisible(false);

                         jardinGen.setVisible(false);

                         wc58.setVisible(false); wcBiblio.setVisible(false); wc50.setVisible(false); wc1.setVisible(false); wc3.setVisible(false); wc5.setVisible(false);
                         wc19.setVisible(false); wc26.setVisible(false); wc37.setVisible(false);

                         event.setVisible(false);
                         break;

                     case R.id.admin:
                         markerRectoria.setVisible(true);
                         markerAuditorioPedroDeAlba.setVisible(true);
                         markerBiblio.setVisible(true);
                         exp58.setVisible(false);

                         cafe47.setVisible(false); cafe9.setVisible(false); cafe210.setVisible(false);

                         ed1.setVisible(false); ed2.setVisible(false); ed3.setVisible(false); ed4.setVisible(false); ed5.setVisible(false);
                         ed6.setVisible(false); ed7.setVisible(false); ed8.setVisible(false); ed9.setVisible(false); ed10.setVisible(false);

                         ed11.setVisible(false); ed12.setVisible(false); ed13.setVisible(false); ed14.setVisible(false); ed15.setVisible(false);
                         ed16.setVisible(false); ed17.setVisible(false); ed18.setVisible(false); ed19.setVisible(false); ed20.setVisible(false);

                         ed21.setVisible(false); ed22.setVisible(false); ed23.setVisible(false); ed24.setVisible(false); ed25.setVisible(false);
                         ed26.setVisible(false); ed27.setVisible(false); ed28.setVisible(false); ed29.setVisible(false); ed30.setVisible(false);

                         ed31.setVisible(false); ed32.setVisible(false); ed33.setVisible(false); ed34.setVisible(false); ed35.setVisible(false);
                         ed36.setVisible(false); ed37.setVisible(false); ed38.setVisible(false); ed39.setVisible(false); ed40.setVisible(false);

                         ed42.setVisible(false); ed43.setVisible(false); ed44.setVisible(false); ed45.setVisible(false);
                         ed46.setVisible(false); ed47.setVisible(false); ed48.setVisible(false); ed49.setVisible(false); ed50.setVisible(false);

                         ed51.setVisible(false); ed52.setVisible(false); ed53.setVisible(false); ed54.setVisible(false); ed55.setVisible(false);
                         ed56.setVisible(false); ed57.setVisible(false); ed58.setVisible(false); ed59.setVisible(false); ed60.setVisible(false);

                         ed61.setVisible(false);


                         jardinGen.setVisible(false);

                         wc58.setVisible(false); wcBiblio.setVisible(false); wc50.setVisible(false); wc1.setVisible(false); wc3.setVisible(false); wc5.setVisible(false);
                         wc19.setVisible(false); wc26.setVisible(false); wc37.setVisible(false);

                         event.setVisible(false);
                         break;

                     case R.id.alimentos:
                         exp58.setVisible(true);
                         cafe47.setVisible(true); cafe9.setVisible(true); cafe210.setVisible(true);
                         markerRectoria.setVisible(false);
                         markerAuditorioPedroDeAlba.setVisible(false);
                         markerBiblio.setVisible(false);

                         ed1.setVisible(false); ed2.setVisible(false); ed3.setVisible(false); ed4.setVisible(false); ed5.setVisible(false);
                         ed6.setVisible(false); ed7.setVisible(false); ed8.setVisible(false); ed9.setVisible(false); ed10.setVisible(false);

                         ed11.setVisible(false); ed12.setVisible(false); ed13.setVisible(false); ed14.setVisible(false); ed15.setVisible(false);
                         ed16.setVisible(false); ed17.setVisible(false); ed18.setVisible(false); ed19.setVisible(false); ed20.setVisible(false);

                         ed21.setVisible(false); ed22.setVisible(false); ed23.setVisible(false); ed24.setVisible(false); ed25.setVisible(false);
                         ed26.setVisible(false); ed27.setVisible(false); ed28.setVisible(false); ed29.setVisible(false); ed30.setVisible(false);

                         ed31.setVisible(false); ed32.setVisible(false); ed33.setVisible(false); ed34.setVisible(false); ed35.setVisible(false);
                         ed36.setVisible(false); ed37.setVisible(false); ed38.setVisible(false); ed39.setVisible(false); ed40.setVisible(false);

                         ed42.setVisible(false); ed43.setVisible(false); ed44.setVisible(false); ed45.setVisible(false);
                         ed46.setVisible(false); ed47.setVisible(false); ed48.setVisible(false); ed49.setVisible(false); ed50.setVisible(false);

                         ed51.setVisible(false); ed52.setVisible(false); ed53.setVisible(false); ed54.setVisible(false); ed55.setVisible(false);
                         ed56.setVisible(false); ed57.setVisible(false); ed58.setVisible(false); ed59.setVisible(false); ed60.setVisible(false);

                         ed61.setVisible(false);

                         jardinGen.setVisible(false);

                         wc58.setVisible(false); wcBiblio.setVisible(false); wc50.setVisible(false); wc1.setVisible(false); wc3.setVisible(false); wc5.setVisible(false);
                         wc19.setVisible(false); wc26.setVisible(false); wc37.setVisible(false);

                         event.setVisible(false);
                         break;

                     case R.id.wc:
                         exp58.setVisible(false);
                         cafe47.setVisible(false); cafe9.setVisible(false); cafe210.setVisible(false);
                         markerRectoria.setVisible(false);
                         markerAuditorioPedroDeAlba.setVisible(false);
                         markerBiblio.setVisible(false);

                         ed1.setVisible(false); ed2.setVisible(false); ed3.setVisible(false); ed4.setVisible(false); ed5.setVisible(false);
                         ed6.setVisible(false); ed7.setVisible(false); ed8.setVisible(false); ed9.setVisible(false); ed10.setVisible(false);

                         ed11.setVisible(false); ed12.setVisible(false); ed13.setVisible(false); ed14.setVisible(false); ed15.setVisible(false);
                         ed16.setVisible(false); ed17.setVisible(false); ed18.setVisible(false); ed19.setVisible(false); ed20.setVisible(false);

                         ed21.setVisible(false); ed22.setVisible(false); ed23.setVisible(false); ed24.setVisible(false); ed25.setVisible(false);
                         ed26.setVisible(false); ed27.setVisible(false); ed28.setVisible(false); ed29.setVisible(false); ed30.setVisible(false);

                         ed31.setVisible(false); ed32.setVisible(false); ed33.setVisible(false); ed34.setVisible(false); ed35.setVisible(false);
                         ed36.setVisible(false); ed37.setVisible(false); ed38.setVisible(false); ed39.setVisible(false); ed40.setVisible(false);

                         ed42.setVisible(false); ed43.setVisible(false); ed44.setVisible(false); ed45.setVisible(false);
                         ed46.setVisible(false); ed47.setVisible(false); ed48.setVisible(false); ed49.setVisible(false); ed50.setVisible(false);

                         ed51.setVisible(false); ed52.setVisible(false); ed53.setVisible(false); ed54.setVisible(false); ed55.setVisible(false);
                         ed56.setVisible(false); ed57.setVisible(false); ed58.setVisible(false); ed59.setVisible(false); ed60.setVisible(false);

                         ed61.setVisible(false);

                         jardinGen.setVisible(false);

                         wc58.setVisible(true); wcBiblio.setVisible(true); wc50.setVisible(true); wc1.setVisible(true); wc3.setVisible(true); wc5.setVisible(true);
                         wc19.setVisible(true); wc26.setVisible(true); wc37.setVisible(true);

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
        ed1 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913478, -102.313917)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed1)).anchor(.5f,.5f));

        ed2 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913949, -102.314253)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed2)).anchor(.5f,.5f));

        ed3 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914311, -102.314202)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed3)).anchor(.5f,.5f));

        ed4 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914634, -102.314389)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed4)).anchor(.5f,.5f));

        ed5 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915065, -102.314525)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed5)).anchor(.5f,.5f));

        ed6 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915559, -102.314322)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed6)).anchor(.5f,.5f));

        ed7 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915495, -102.314726)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed7)).anchor(.5f,.5f));

        ed8 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915833, -102.314405)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed8)).anchor(.5f,.5f));

        ed9 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914137, -102.314817)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed9)).anchor(.5f,.5f));

        ed10 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914401, -102.314870)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed10)).anchor(.5f,.5f));

        ed11 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914720, -102.314857)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed11)).anchor(.5f,.5f));

        ed12 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915191, -102.314892)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed12)).anchor(.5f,.5f));

        ed13 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915615, -102.315047)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed13)).anchor(.5f,.5f));

        ed14 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915744, -102.315395)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed14)).anchor(.5f,.5f));

        ed15 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914977, -102.315555)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed15)).anchor(.5f,.5f));

        ed16 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915401, -102.315708)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed16)).anchor(.5f,.5f));

        ed17 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915851, -102.315865)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed17)).anchor(.5f,.5f));

        ed18 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914693, -102.315708)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed18)).anchor(.5f,.5f));

        ed19 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915096, -102.315880)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed19)).anchor(.5f,.5f));

        ed20 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915469, -102.316330)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed20)).anchor(.5f,.5f));

        ed21 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915608, -102.315848)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed21)).anchor(.5f,.5f));

        ed22 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915741, -102.316576)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed22)).anchor(.5f,.5f));

        ed23 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914730, -102.316376)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed23)).anchor(.5f,.5f));

        ed24 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915402, -102.316890)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed24)).anchor(.5f,.5f));

        ed25 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915142, -102.316725)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed25)).anchor(.5f,.5f));

        ed26 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914755, -102.316863)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed26)).anchor(.5f,.5f));

        ed27 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915134, -102.317176)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed27)).anchor(.5f,.5f));

        ed28 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914916, -102.317120)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed28)).anchor(.5f,.5f));

        ed29 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914452, -102.317021)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed29)).anchor(.5f,.5f));

        ed30 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914224, -102.316773)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed30)).anchor(.5f,.5f));


        ed31 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913906, -102.316648)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed31)).anchor(.5f,.5f));

        ed32 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915595, -102.317262)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed32)).anchor(.5f,.5f));

        ed33 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915375, -102.317677)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed33)).anchor(.5f,.5f));

        ed34 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915084, -102.317576)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed34)).anchor(.5f,.5f));

        ed35 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914936, -102.317533)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed35)).anchor(.5f,.5f));

        ed36 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914716, -102.317447)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed36)).anchor(.5f,.5f));

        ed37 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913906, -102.317172)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed37)).anchor(.5f,.5f));

        ed38 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913630, -102.317172)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed38)).anchor(.5f,.5f));

        ed39 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913540, -102.316766)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed39)).anchor(.5f,.5f));

        ed40 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915164, -102.318101)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed40)).anchor(.5f,.5f));



        ed42 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914883, -102.317976)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed42)).anchor(.5f,.5f));

        ed43 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914567, -102.318033)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed43)).anchor(.5f,.5f));

        ed44 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914403, -102.317791)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed44)).anchor(.5f,.5f));

        ed45 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914047, -102.317748)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed45)).anchor(.5f,.5f));

        ed46 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913793, -102.317732)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed46)).anchor(.5f,.5f));

        ed47 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913331, -102.317733)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ed47)));

        ed48 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913288, -102.317234)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed48)).anchor(.5f,.5f));

        ed49 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912992, -102.317274)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed49)).anchor(.5f,.5f));

        ed50 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912812, -102.317266)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed50)).anchor(.5f,.5f));


        ed51 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912633, -102.317244)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed51)).anchor(.5f,.5f));

        ed52 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912980, -102.316803)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed52)).anchor(.5f,.5f));

        ed53 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913211, -102.316522)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed53)));

        ed54 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913617, -102.316332)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed54)));

        ed55 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913090, -102.316059)).title("Edificio de redes, tienda y salones de computo").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed55)));

        ed56 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912582, -102.315870)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed56)).anchor(.5f,.5f));

        ed57 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912443, -102.316318)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed57)).anchor(.5f,.5f));

        ed58 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912785, -102.316245)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed58)).anchor(.5f,.5f));

        ed59 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912515, -102.316815)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed59)).anchor(.5f,.5f));

        ed60 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912267, -102.316775)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed60)).anchor(.5f,.5f));

        ed61 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912241, -102.15843)).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed61)).anchor(.5f,.5f));




        //ESPACIOS RECREATIVOS
        jardinGen = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913873, -102.315609)).title("Jardin de las generaciones").icon(BitmapDescriptorFactory.fromResource(R.drawable.greenzone)));

        //Baños
        wc58 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912693, -102.316508)).title("Baños").icon(BitmapDescriptorFactory.fromResource(R.drawable.toilet)).anchor(.5f,.5f));
        wc50 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912797, -102.317468)).title("Baños").icon(BitmapDescriptorFactory.fromResource(R.drawable.toilet)).anchor(.5f,.5f));
        wc37 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913904, -102.317329)).title("Baños").icon(BitmapDescriptorFactory.fromResource(R.drawable.toilet)).anchor(.5f,.5f));
        wc26 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914721, -102.317013)).title("Baños").icon(BitmapDescriptorFactory.fromResource(R.drawable.toilet)).anchor(.5f,.5f));
        wc19 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.915152, -102.315694)).title("Baños").icon(BitmapDescriptorFactory.fromResource(R.drawable.toilet)).anchor(.5f,.5f));
        wc3 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914296, -102.314415)).title("Baños").icon(BitmapDescriptorFactory.fromResource(R.drawable.toilet)).anchor(.5f,.5f));
        wc5 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914996, -102.314730)).title("Baños").icon(BitmapDescriptorFactory.fromResource(R.drawable.toilet)).anchor(.5f,.5f));
        wc1 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913651, -102.314002)).title("Baños").icon(BitmapDescriptorFactory.fromResource(R.drawable.toilet)).anchor(.5f,.5f));

        wcBiblio = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912893, -102.315310)).title("Baños").icon(BitmapDescriptorFactory.fromResource(R.drawable.toilet)));

        //Edificios escolares

        markerRectoria = googleMap.addMarker(new MarkerOptions().position(new LatLng(21.910896, -102.313111)).title("Rectoría").icon(BitmapDescriptorFactory.fromResource(R.drawable.academic)));

        markerBiblio = googleMap.addMarker(new MarkerOptions().position(new LatLng(21.912877, -102.315014)).title("Biblioteca Central").icon(BitmapDescriptorFactory.fromResource(R.drawable.library)));

        markerAuditorioPedroDeAlba = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912796, -102.315431)).title("Auditorio Universitario Dr. Pedro de Alba").icon(BitmapDescriptorFactory.fromResource(R.drawable.audience)));

        //Maquinas expendedoras
        exp58 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.912735, -102.316536)).title("Máquina expendedora").icon(BitmapDescriptorFactory.fromResource(R.drawable.vending_machine)));


        //Cafeterias
        cafe47 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.913218, -102.317690)).title("Cafetería").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant)).anchor(.5f,.5f));
        cafe9 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.914220, -102.314847)).title("Cafetería").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant)).anchor(.5f,.5f));
        cafe210 = mMap.addMarker(new MarkerOptions().position(new LatLng(21.909944, -102.315042)).title("Cafetería").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant)).anchor(.5f,.5f));

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
