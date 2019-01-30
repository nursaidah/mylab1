package edu.singaporetech.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Activity that emails your friend with a message
 */
public class EmailActivity extends AppCompatActivity {

    private static final String TAG = "EmailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        // TODO findviewbyid for the UI elements

        // TODO set onClickListeners to all the buttons here
        // or declare the onclick method within the layout XML?


    }

    /**
     * Call an intent to start the email app
     */
    public void sendEmail() { // do you need to change the parameters?

        EditText nameRaw = findViewById(R.id.editTextName);
        EditText emailRaw = findViewById(R.id.editTextEmail);
        EditText cityRaw = findViewById(R.id.editTextCity);

        String name = nameRaw.getText().toString();
        String email = emailRaw.getText().toString();
        String city = cityRaw.getText().toString();

        // TODO: Use an intent to launch an email app.
        Intent emailDetail = new Intent(Intent.ACTION_SEND);

        // TODO call createEmailMessage to generate the email message
        //Log.d(TAG,email);
        emailDetail.putExtra(Intent.EXTRA_EMAIL,new String[]{emailRaw.getText().toString()});
        emailDetail.putExtra(Intent.EXTRA_SUBJECT,"Going on Vacation!");
        emailDetail.putExtra(Intent.EXTRA_TEXT,createEmailMessage(name,city));

        // TODO call startActivity(intent);
        emailDetail.setType("text/plain");
        startActivity(emailDetail);

    }

    /**
     * Creates the string to send in the email message
     * @param name
     * @param city
     * @return the email message
     */
    private String createEmailMessage(String name, String city) {
        String emailMessage = getString(R.string.hey) + " " + name + " "
                + getString(R.string.im_going_to) + " " + city + "!";
        return emailMessage;
    }

    public void sendEmailBtn(View view) {

        sendEmail();
    }

    public void previewBtn(View view) {
        EditText nameRaw = findViewById(R.id.editTextName);
        EditText cityRaw = findViewById(R.id.editTextCity);
        String name = nameRaw.getText().toString();
        String city = cityRaw.getText().toString();
        TextView preview = findViewById(R.id.result);
        preview.setText(createEmailMessage(name,city));
    }
}
