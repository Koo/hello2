package abc.def;

import android.os.Bundle;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

public class HelloAct extends MapActivity {
	private MapView view;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        view = (MapView) findViewById(R.id.mapView);
    }

	@Override
	protected boolean isRouteDisplayed() {
		return true;
	}
}