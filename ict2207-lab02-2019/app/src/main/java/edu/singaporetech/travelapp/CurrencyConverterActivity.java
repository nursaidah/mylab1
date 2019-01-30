package edu.singaporetech.travelapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Activity that displays UI to convert currency
 */
public class CurrencyConverterActivity extends AppCompatActivity {

    private static final String TAG = "CurrencyConverter";
    // TODO variables to hold the UI elements

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        // TODO findviewbyid for the UI elements

        // TODO set onClickListeners to all the buttons here
        // or declare the onclick method within the layout XML?

    }

    /**
     * Formula to calculate the destination currency
     * @param value
     * @param exchangeRate
     * @return
     */
    public float calculateRate(float value, float exchangeRate) {
        // TODO What's the formula you need?
        float rate = value * exchangeRate;
        return rate;
    }

    public void convertButton(View view) {
        EditText currencyRaw = findViewById(R.id.editTextCurrency);
        EditText rateRaw  = findViewById(R.id.editTextRate);
        EditText sgDollarRaw = findViewById(R.id.editTextSingDollar);
        TextView result = findViewById(R.id.convertResult);

        //currency
        String currencyValue = currencyRaw.getText().toString();
        //rate
        String rateValue = rateRaw.getText().toString();
        Float rate = Float.valueOf(rateValue);
        //singapore dollar
        String sgDollarValue = sgDollarRaw.getText().toString();
        Float sgDollar = Float.valueOf(sgDollarValue);
        //calculate rate
        double rateResult = calculateRate(sgDollar, rate);
        //display
        result.setText(Double.toString(sgDollar) + " sgd is " + rateResult + " " + currencyValue);



    }
}


