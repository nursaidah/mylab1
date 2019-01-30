package edu.singaporetech.travelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Lab 02: Travel App
 * Main Screen
 */
public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // take layout come from this xml
        // TODO findviewbyid for the UI elements
            Button emailbtn = findViewById(R.id.EmailActivityBtn);
            Button currencybtn = findViewById(R.id.CurrencyConverterBtn);
            Button temperaturebtn = findViewById(R.id.TempConverterBtn);
        // TODO set onClickListeners to all the buttons here
            Log.d(LOG_TAG,"Hello, green robot");
        // or declare the onclick method within the layout XML?

    }

    public void TemperatureConverter(View view) {
        //declare intent to open the next screen
        //Log.d(LOG_TAG,"Button Clicked!");
        Intent TempIntent = new Intent(this,TempConverterActivity.class);
        startActivity(TempIntent);
    }

    public void CurrentConverter(View view) {
        //Log.d(LOG_TAG,"Button Clicked!");
        Intent CurrencyConverterIntent = new Intent(this,CurrencyConverterActivity.class);
        startActivity(CurrencyConverterIntent);
    }

    public void EmailActivity(View view) {
        //Log.d(LOG_TAG,"Button Clicked!");
        Intent EmailActivityIntent = new Intent(this,EmailActivity.class);
        startActivity(EmailActivityIntent);
    }
}
