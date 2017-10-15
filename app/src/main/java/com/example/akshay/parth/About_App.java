package com.example.akshay.parth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class About_App extends AppCompatActivity {

    TextView about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__app);
        about = (TextView) findViewById(R.id.about);
        about.setText(R.string.about);
    }
}
