package com.example.appbrani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnInserisci;
    EditText titoloCanzone;
    EditText durataCanzone;
    GestoreBrano gb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInserisci = (Button)findViewById(R.id.inserisci);
        titoloCanzone = (EditText) findViewById(R.id.titolo);
        durataCanzone = (EditText) findViewById(R.id.durata);
        gb = new GestoreBrano();
        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gb.addBrano(titoloCanzone.toString(), durataCanzone.toString());
            }
        });
    }
}