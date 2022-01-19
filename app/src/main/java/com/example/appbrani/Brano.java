package com.example.appbrani;

public class Brano {

    private String titolo;
    private String genere;
    private String durata;

    public Brano(String titolo, String durata){

        this.titolo = titolo;
        this.durata = durata;
    }

    public String getDurata() {
        return durata;
    }

    public String getTitolo() {

        return titolo;
    }

}
