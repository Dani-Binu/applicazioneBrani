package com.example.appbrani;

public class Brano {

    private String titolo;
    private String genere;
    private String autore;
    private String durata;


    public Brano(){
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

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    @Override
    public String toString(){
        return "\ntitolo: "+titolo+"\ndurata: " + durata+"\ngenere: " + genere+"\nautore: " + autore;
    }

}
