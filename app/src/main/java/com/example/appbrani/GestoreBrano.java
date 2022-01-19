package com.example.appbrani;

import java.util.ArrayList;

public class GestoreBrano {
    ArrayList<Brano> listaBrani;
    public GestoreBrano(){
        listaBrani = new ArrayList<Brano>();
    }
    public void addBrano(String titolo, String durata){
        Brano nb = new Brano(titolo, durata);
        listaBrani.add(nb);
    }
}
