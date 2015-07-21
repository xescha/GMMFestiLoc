package layout.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import de.anwendung.xenia.mapboxexample.R;
import de.anwendung.xenia.mapboxexample.googlemaps.GoogleMapsActivity;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button btnActTwo;
    Button btnActThree;
    Button btnActSpiel;
    Button btnActMap;

    Button btnActLocation;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);

        btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);

        btnActSpiel = (Button) findViewById(R.id.btnActSpiel);
        btnActSpiel.setOnClickListener(this);

        btnActMap = (Button) findViewById(R.id.btnActMap);
        btnActMap.setOnClickListener(this);


        btnActLocation = (Button) findViewById(R.id.btnActLocation);
        btnActLocation.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnActTwo:
                Intent intent = new Intent(this, GelaendeplanActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (v.getId()) {
            case R.id.btnActThree:
                Intent intent = new Intent(this, SpielplanActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch (v.getId()) {
            case R.id.btnActSpiel:
                Intent intent = new Intent(this, WetterActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch (v.getId()) {
            case R.id.btnActMap:
                Intent intent = new Intent(this, GoogleMapsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }



        switch (v.getId()) {
            case R.id.btnActLocation:
                Intent intent = new Intent(this, LocationActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();



        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

