package com.routaa.androidmapsdkexamples

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mapbox.geojson.Point
import com.mapbox.maps.CameraOptions
import com.mapbox.maps.MapView
import com.mapbox.maps.RoutaaMapStyle
import com.mapbox.maps.loadMapStyle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val mapView: MapView = findViewById(R.id.mapView)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        mapView.getMapboxMap().loadMapStyle(RoutaaMapStyle.Day_Silvan)
        mapView.getMapboxMap().apply {
            setCamera(
                CameraOptions.Builder()
                    .center(Point.fromLngLat(LONGITUDE, LATITUDE))
                    .zoom(7.0)
                    .build()
            )
        }
    }

    companion object {
        private const val LATITUDE = 35.404538
        private const val LONGITUDE = 51.365801
    }

}