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
}
