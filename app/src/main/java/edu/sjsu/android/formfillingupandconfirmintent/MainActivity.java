package edu.sjsu.android.formfillingupandconfirmintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // it is the package name
    public final static String EXTRA_NAME = "edu.sjsu.android.formfillingupandconfirmintent.EXTRA_NAME";
    public final static String EXTRA_DATE = "edu.sjsu.android.formfillingupandconfirmintent.EXTRA_DATE";
    public final static String EXTRA_GUESSNUMBER = "edu.sjsu.android.formfillingupandconfirmintent.EXTRA_GUESSNUMBER";
    public final static String EXTRA_PACKAGE = "edu.sjsu.android.formfillingupandconfirmintent.EXTRA.PACKAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitBtn = (Button) findViewById(R.id.submitbtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openConfirmationActivity();
            }
        });
    }

    public void openConfirmationActivity() {
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        EditText dateEditText = (EditText) findViewById(R.id.dateEditText);
        EditText guessNumberEditText = (EditText) findViewById(R.id.guessNumberEditText);
        EditText packageEditText = (EditText) findViewById(R.id.packageEditText);

        String name = nameEditText.getText().toString();
        String date = dateEditText.getText().toString();
        String guessNumber = guessNumberEditText.getText().toString();
        String packageNumber = packageEditText.getText().toString();

        Intent intent = new Intent(this, ConfirmationActivity.class);
        intent.putExtra(EXTRA_NAME, name);
        intent.putExtra(EXTRA_DATE, date);
        intent.putExtra(EXTRA_GUESSNUMBER, guessNumber);
        intent.putExtra(Intent.EXTRA_PACKAGE_NAME, packageNumber);

        startActivity(intent);
    }
}