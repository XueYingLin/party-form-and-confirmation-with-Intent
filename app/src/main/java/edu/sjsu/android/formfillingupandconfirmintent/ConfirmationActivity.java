package edu.sjsu.android.formfillingupandconfirmintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String date = intent.getStringExtra(MainActivity.EXTRA_DATE);
        String guessNumber = intent.getStringExtra(MainActivity.EXTRA_GUESSNUMBER);
        String packageNumber = intent.getStringExtra(MainActivity.EXTRA_PACKAGE);

        TextView nameTextView = (TextView) findViewById(R.id.nameTextView);
        TextView dateTextView = (TextView) findViewById(R.id.dateTextView);
        TextView guessNumberTextView = (TextView) findViewById(R.id.guessNumberTextView);
        TextView packNumberTextView = (TextView) findViewById(R.id.guessNumberTextView);

        nameTextView.setText(name);
        dateTextView.setText(date);
        guessNumberTextView.setText(guessNumber);
        packNumberTextView.setText(packageNumber);
    }

}