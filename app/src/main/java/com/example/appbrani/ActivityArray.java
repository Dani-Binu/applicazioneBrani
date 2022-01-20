package com.example.appbrani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityArray extends AppCompatActivity {

    TextView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        Intent i = getIntent();
        String messaggioRicevuto = i.getStringExtra("messaggio");

        v = findViewById(R.id.textView);
        v.setText(messaggioRicevuto);
    }
    public void back(View v){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}