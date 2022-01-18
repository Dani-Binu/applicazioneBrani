package com.example.appbrani;

public class Brano {

    private String titolo;
    private String genere;
    private String autore;
    private String dataPubblicazione;

    public Brano(String titolo){

        this.titolo = titolo;
    }

    public String getTitolo() {

        return titolo;
    }
}
