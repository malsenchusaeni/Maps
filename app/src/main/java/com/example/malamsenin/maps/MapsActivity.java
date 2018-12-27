package com.example.malamsenin.maps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

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

        // Add a marker in Sydney and move the camera
        LatLng majt = new LatLng(-6.9834626, 110.4429353);
        mMap.addMarker(new MarkerOptions().position(majt).title("Masjid Agung Jawa Tengah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(majt));

        LatLng sampo = new LatLng(-6.9959811, 110.3961827);
        mMap.addMarker(new MarkerOptions().position(sampo).title("Sampookong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sampo));

        LatLng blenduk = new LatLng(-6.9682076,110.4252688);
        mMap.addMarker(new MarkerOptions().position(blenduk).title("Gereja Blenduk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(blenduk));

        LatLng pram = new LatLng(-7.7520153,110.4892787);
        mMap.addMarker(new MarkerOptions().position(pram).title("Candi Prambanan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pram));

        LatLng bonang = new LatLng(-6.8947374,112.063327);
        mMap.addMarker(new MarkerOptions().position(bonang).title("Makam Sunan Bonang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bonang));

        LatLng boro = new LatLng(-7.6078685,110.2015626);
        mMap.addMarker(new MarkerOptions().position(boro).title("Candi Borobudur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(boro));

        LatLng drajat = new LatLng(-6.8842449,112.3870642);
        mMap.addMarker(new MarkerOptions().position(drajat).title("Makam Sunan Drajat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(drajat));

        LatLng kljaga = new LatLng(-6.8964914,110.6455458);
        mMap.addMarker(new MarkerOptions().position(kljaga).title("Makam Sunan Kalijaga"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kljaga));

        LatLng gresik = new LatLng(-7.0341508,111.0916379);
        mMap.addMarker(new MarkerOptions().position(gresik).title("Makam Sunan Gresik"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gresik));

        LatLng muria = new LatLng(-6.6660452,110.8966676);
        mMap.addMarker(new MarkerOptions().position(muria).title("Makam Sunan Muria"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(muria));

        LatLng giri = new LatLng(-7.1696201,112.6285577);
        mMap.addMarker(new MarkerOptions().position(giri).title("Makam Sunan Giri"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(giri));

        LatLng seribu = new LatLng(-6.1495443,106.6059969);
        mMap.addMarker(new MarkerOptions().position(seribu).title("Masjid Seribu Pintu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(seribu));

        LatLng ampel = new LatLng(-7.2303333,112.7406469);
        mMap.addMarker(new MarkerOptions().position(ampel).title("Makam Sunan Ampel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ampel));

        LatLng solo = new LatLng(-7.5762873,110.8260405);
        mMap.addMarker(new MarkerOptions().position(solo).title("Keraton Surakarta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(solo));

        LatLng kong = new LatLng(-6.3038719,106.8898446);
        mMap.addMarker(new MarkerOptions().position(kong).title("Kelenteng Kong Miao"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kong));

        LatLng kwan = new LatLng(-6.8856973,112.0484464);
        mMap.addMarker(new MarkerOptions().position(kwan).title("Kelenteng Kwan Sing Bio"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kwan));

        LatLng kudus = new LatLng(-6.8041863,110.8306441);
        mMap.addMarker(new MarkerOptions().position(kudus).title("Masjid Agung Kudus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kudus));
    }
}
