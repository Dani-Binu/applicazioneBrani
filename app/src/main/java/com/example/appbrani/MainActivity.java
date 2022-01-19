package com.example.appbrani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button btnInserisci;
    EditText titoloCanzone;
    EditText durataCanzone;
    EditText autoreCanzone;
    Spinner genereCanzone;
    GestoreBrano gb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInserisci = (Button)findViewById(R.id.inserisci);
        titoloCanzone = (EditText)findViewById(R.id.titolo);
        durataCanzone = (EditText)findViewById(R.id.durata);
        autoreCanzone = (EditText)findViewById(R.id.autore);
        genereCanzone = (Spinner)findViewById(R.id.genere);
        gb = new GestoreBrano();
        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Brano b = new Brano(titoloCanzone.getText().toString(), durataCanzone.getText().toString(),
                        autoreCanzone.getText().toString(), genereCanzone.getSelectedItem().toString());
                gb.addBrano(b);
                Log.d("brano creato", b.toString());
            }
        });
    }
}