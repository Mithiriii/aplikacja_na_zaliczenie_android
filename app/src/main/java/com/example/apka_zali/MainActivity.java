package com.example.apka_zali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonAuthor;
    private Button buttonGo;
    private Button buttonLinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAuthor = findViewById(R.id.btn_author);
        buttonGo = findViewById(R.id.btn_go);
        buttonLinks = findViewById(R.id.btn_useful_links);

        buttonAuthor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, author.class);
                startActivity(intent);

            }
        });

        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, go_game.class);
                startActivity(intent);
            }
        });

        buttonLinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, useful_links.class);
                startActivity(intent);
            }
        });
    }
}
