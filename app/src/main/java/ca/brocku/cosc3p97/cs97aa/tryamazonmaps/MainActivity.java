package ca.brocku.cosc3p97.cs97aa.tryamazonmaps;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.amazon.geo.maps.MapActivity;
import com.amazon.geo.maps.MapController;
import com.amazon.geo.maps.MapView;
import com.amazon.geo.maps.MyLocationOverlay;

public class MainActivity extends MapActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView mapView = (MapView) findViewById(R.id.mapview);

        MyLocationOverlay myLocationOverlay = new MyLocationOverlay(this, mapView);

        mapView.getOverlays().add(myLocationOverlay);

        myLocationOverlay.enableMyLocation();

        MapController mapController = mapView.getController();

        mapController.setZoom(17);

    }

    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
