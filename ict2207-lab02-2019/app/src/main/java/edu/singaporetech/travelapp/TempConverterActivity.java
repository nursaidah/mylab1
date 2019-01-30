package edu.singaporetech.travelapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Activity that displays UI to convert temperature
 */
public class TempConverterActivity extends AppCompatActivity {

    private static final String TAG = "TempConverter";


    // TODO variables to hold the UI elements

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);

        // TODO findviewbyid for the UI elements


        // TODO set onClickListeners to all the buttons here
        // or declare the onclick method within the layout XML?

    }

    // TODO - Implement the temperature conversion logic and other behavior here
    // What methods do you need?

    // converts to celsius

    /**
     * Converts fahrenheit to celsius
     * @param fahrenheit temperature in f
     * @return
     */
    public float convertFahrenheitToCelsius(float fahrenheit) {
        // TODO What's the formula you need?
        //Log.d(TAG,"Celsius CHOSEN");
        float celsiusResult = (fahrenheit - 32)*5/9;
        return celsiusResult;

    }

    /**
     * Converts celsius to fahrenheit
     * @param celsius temperature in c
     * @return
     */
    public float convertCelsiusToFahrenheit(float celsius) {
        // TODO What's the formula you need?
        //Log.d(TAG,"Fahrenheit CHOSEN");
        float fahrenheitResult = (celsius*9/5)+32;
        return fahrenheitResult ;
    }

    //convert the temperature
    public void convertButton(View view) {

        RadioGroup temp = findViewById(R.id.tempChoice);
        TextView result = findViewById(R.id.result);
        EditText value = findViewById(R.id.editTextTemp);

        String tempValue = value.getText().toString();
        Float temperature = Float.valueOf(tempValue);

        //radio button
        float fahrenheit = R.id.fahrenheitBtn;
        float celsius = R.id.celsiusBtn;
        Log.d(TAG,Float.toString(celsius));
        if (temp.getCheckedRadioButtonId() == fahrenheit)
        {
            //store the result as double and round of to 1 decimal place
            double FahrenheintResult = Math.round(convertCelsiusToFahrenheit(temperature)*10)/10.0;
            //Log.d(TAG,Double.toString(celsius)+"Fahrenheit:" + Double.toString(FahrenheintResult));
            result.setText(tempValue + " celsius is " + Double.toString(FahrenheintResult) + " Fahrenheit");
        }else if(temp.getCheckedRadioButtonId() == celsius)
        {
            //store the result as double and round of to 1 decimal place
            double CelsiusResult = Math.round(convertFahrenheitToCelsius(temperature)*10)/10.0;
            //Log.d(TAG,tempValue +" Fahrenheit:" + Double.toString(CelsiusResult));
            result.setText(tempValue + " fahrenheit is " + Double.toString(CelsiusResult) + " celsius");
        }
    }

    //clear the result
    public void clearButton(View view) {
        TextView result = findViewById(R.id.result);
        result.setText(null);
    }
}
