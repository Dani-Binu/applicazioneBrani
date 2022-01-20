package com.example.appbrani;

import java.util.ArrayList;

public class GestoreBrano {
    ArrayList<Brano> listaBrani;
    public GestoreBrano(){
        listaBrani = new ArrayList<Brano>();
    }
    public void addBrano(Brano nb){
        listaBrani.add(nb);
    }
    public String toString(Brano b){
        return b.getTitolo() + " " + b.getDurata() + " " + b.getAutore() + " " + b.getGenere();
    }
}
