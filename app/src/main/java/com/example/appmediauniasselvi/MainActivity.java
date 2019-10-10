package com.example.appmediauniasselvi;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements
        MediaFragment.OnFragmentInteractionListener,
        PaperFragment.OnFragmentInteractionListener {

    private Button media;
    private Button paper;
    private FragmentManager manager;
    private FragmentTransaction fragmentTransaction;
    private MediaFragment mediaFragment;
    private PaperFragment paperFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        media = findViewById(R.id.btnMedia);
        media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager = getSupportFragmentManager();
                fragmentTransaction = manager.beginTransaction();
                mediaFragment = new MediaFragment();
                fragmentTransaction.add(R.id.fragment, mediaFragment);
                fragmentTransaction.commit();
            }
        });

        paper = findViewById(R.id.btnPaper);
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager = getSupportFragmentManager();
                fragmentTransaction = manager.beginTransaction();
                paperFragment = new PaperFragment();
                fragmentTransaction.add(R.id.fragment, paperFragment);
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
