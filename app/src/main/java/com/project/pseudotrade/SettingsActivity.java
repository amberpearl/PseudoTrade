package com.project.pseudotrade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Spinner currency = findViewById(R.id.settings_currency_spinner);
        Spinner country = findViewById(R.id.settings_country_spinner);

//        currency.setAdapter(AppCompatActivity);
    }
}