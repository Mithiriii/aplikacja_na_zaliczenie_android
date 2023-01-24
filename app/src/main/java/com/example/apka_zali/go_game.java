package com.example.apka_zali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class go_game extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String toastaaa = getString(R.string.toastaaa);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_game);
        Toast.makeText(go_game.this, toastaaa, Toast.LENGTH_LONG).show();
    }
}