package com.example.appmediauniasselvi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button media;
    private Button paper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        media = findViewById(R.id.btnMedia);
        media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MediaActivity.class);
                startActivity(intent);
//                manager = getSupportFragmentManager();
//                fragmentTransaction = manager.beginTransaction();
//                mediaFragment = new MediaFragment();
//                fragmentTransaction.add(R.id.fragment, mediaFragment);
//                fragmentTransaction.commit();
            }
        });

        paper = findViewById(R.id.btnPaper);
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PaperActivity.class);
                startActivity(intent);
//                manager = getSupportFragmentManager();
//                fragmentTransaction = manager.beginTransaction();
//                paperFragment = new PaperFragment();
//                fragmentTransaction.add(R.id.fragment, paperFragment);
//                fragmentTransaction.commit();
            }
        });
    }

//    @Override
//    public void onFragmentInteraction(Uri uri) {
//
//    }
}
