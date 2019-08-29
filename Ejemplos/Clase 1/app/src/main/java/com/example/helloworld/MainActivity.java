package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonHelloWorld = findViewById(R.id.buttonHelloWorld);
        buttonHelloWorld.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Snackbar.make(findViewById(R.id.MainLayout), "Hola :)", Snackbar.LENGTH_SHORT);
            }
        });
    }

}
