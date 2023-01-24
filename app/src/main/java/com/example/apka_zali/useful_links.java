package com.example.apka_zali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class useful_links extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String toastaaa = getString(R.string.toastaaa);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useful_links);
        Toast.makeText(useful_links.this, toastaaa, Toast.LENGTH_LONG).show();
    }
}