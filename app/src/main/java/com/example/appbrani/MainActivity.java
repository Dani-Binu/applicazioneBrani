package com.example.appbrani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnInserisci;
    EditText titoloCanzone;
    EditText durataCanzone;
    EditText autoreCanzone;
    Spinner genereCanzone;
    GestoreBrano gb;
    Brano b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //metodo NON statico per settare l'array allo spinner
        String arrGen[] = {"rap", "pop", "techno", "edm"};
        ArrayAdapter<String> ag= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrGen);
        genereCanzone = (Spinner)findViewById(R.id.genere);
        genereCanzone.setAdapter(ag);

        btnInserisci = (Button)findViewById(R.id.inserisci);
        titoloCanzone = (EditText)findViewById(R.id.titolo);
        durataCanzone = (EditText)findViewById(R.id.durata);
        autoreCanzone = (EditText)findViewById(R.id.autore);

        gb = new GestoreBrano();
        b = new Brano();

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setTitolo(titoloCanzone.getText().toString());
                b.setDurata(durataCanzone.getText().toString());
                b.setAutore(autoreCanzone.getText().toString());
                b.setGenere(genereCanzone.getSelectedItem().toString());
                gb.addBrano(b);
                Log.d("brano creato", b.toString());
                Toast.makeText(getApplicationContext(), "testBrano", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void lanciaDue(View v){
        //String lista = gb.listaBrani();
        Intent i = new Intent(getApplicationContext(), ActivityArray.class);
        i.putExtra("messaggio", gb.toString(b)); //richiamo la variabile lista
        startActivity(i);
    }
}