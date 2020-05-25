package com.example.uaamap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        LatLng ed54 = new LatLng(21.913617, -102.316332);
        mMap.addMarker(new MarkerOptions().position(ed54).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed54)));

        LatLng ed55 = new LatLng(21.913090, -102.316059);
        mMap.addMarker(new MarkerOptions().position(ed55).title("Edificio de redes, tienda y salones de computo").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed55)));

        LatLng ed53 = new LatLng(21.913211, -102.316522);
        mMap.addMarker(new MarkerOptions().position(ed53).title("Salón de clases").icon(BitmapDescriptorFactory.fromResource(R.drawable.ed53)));

        LatLng ed47 = new LatLng(21.913331, -102.317733);
        mMap.addMarker(new MarkerOptions().position(ed47).icon(BitmapDescriptorFactory.fromResource(R.drawable.ed47)));

        //ESPACIOS RECREATIVOS
        LatLng espJardinGeneraciones = new LatLng(21.913873, -102.315609);
        mMap.addMarker(new MarkerOptions().position(espJardinGeneraciones).title("Jardin de las generaciones").icon(BitmapDescriptorFactory.fromResource(R.drawable.greenzone)));

        //Baños
        LatLng wc58 = new LatLng(21.912693, -102.316508);
        mMap.addMarker(new MarkerOptions().position(wc58).title("Baños").icon(BitmapDescriptorFactory.fromResource(R.drawable.toilet)));

        LatLng wcBiblioCentral = new LatLng(21.912893, -102.315310);
        mMap.addMarker(new MarkerOptions().position(wcBiblioCentral).title("Baños").icon(BitmapDescriptorFactory.fromResource(R.drawable.toilet)));

        //Edificios escolares
        LatLng rectoria = new LatLng(21.910896, -102.313111);
        mMap.addMarker(new MarkerOptions().position(rectoria).title("Rectoría").icon(BitmapDescriptorFactory.fromResource(R.drawable.academic)));

        LatLng BiblioCentral = new LatLng(21.912877, -102.315014);
        mMap.addMarker(new MarkerOptions().position(BiblioCentral).title("Biblioteca Central").icon(BitmapDescriptorFactory.fromResource(R.drawable.library)));

        LatLng auditorioPedroDeAlba = new LatLng(21.912796, -102.315431);
        mMap.addMarker(new MarkerOptions().position(auditorioPedroDeAlba).title("Auditorio Universitario Dr. Pedro de Alba").icon(BitmapDescriptorFactory.fromResource(R.drawable.audience)));

        //Maquinas expendedoras
        LatLng vendingM58 = new LatLng(21.912735, -102.316536);
        mMap.addMarker(new MarkerOptions().position(vendingM58).title("Máquina expendedora").icon(BitmapDescriptorFactory.fromResource(R.drawable.vending_machine)));

        //Cafeterias
        LatLng cafeteria47 = new LatLng(21.913218, -102.317690);
        mMap.addMarker(new MarkerOptions().position(cafeteria47).title("Cafetería").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant)));

    }
}
