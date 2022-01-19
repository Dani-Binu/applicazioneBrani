package com.example.appbrani;

public class Brano {

    private String titolo;
    private String genere;
    private String autore;
    private String durata;


    public Brano(String titolo, String durata, String autore, String genere){

        this.titolo = titolo;
        this.durata = durata;
        this.autore = autore;
        this.genere = genere;
    }

    public String getDurata() {
        return durata;
    }
    public String getTitolo() {
        return titolo;
    }
    public String getGenere() {
        return genere;
    }
    public String getAutore() {
        return autore;
    }
    @Override
    public String toString(){
        return titolo + durata + genere + autore;
    }

}
