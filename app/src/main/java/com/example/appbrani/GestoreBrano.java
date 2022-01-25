package com.example.appbrani;

import java.util.ArrayList;

public class GestoreBrano {
    ArrayList<Brano> listaBrani;
    public GestoreBrano(){
        listaBrani = new ArrayList<Brano>();
    }

    public ArrayList<Brano> getListaBrani() {
        return listaBrani;
    }

    public void addBrano(Brano nb){
        listaBrani.add(nb);
    }
    public String toString(Brano b){
        return "Titolo: " + b.getTitolo() + "\n Durata: " + b.getDurata() +
                "\n Autore: " + b.getAutore() + "\n Genere: " + b.getGenere();
    }


    public String listaBrani(){
        StringBuilder sb = new StringBuilder();

        for (Brano b: listaBrani){
            sb.append(b.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

}
