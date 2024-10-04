package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        int percorso = 100; //distanza
        int numeroCavalli = 20;
        
        System.out.println("INIZIO");

        ArrayList<Cavallo> gara = new ArrayList<>();
        for(int i=0; i<numeroCavalli; i++){
            gara.add(new Cavallo(percorso, "cavallo" + i));
        }

        for(int i=0; i<numeroCavalli; i++){//faccio partire tutti
            gara.get(i).start();
        }

        for(int i=0; i<numeroCavalli; i++){//faccio fermare tutti
            gara.get(i).join();
        }

        ArrayList<Cavallo> podio = new ArrayList<>();
        podio = gara;//per essere più comodo //copia superficiale
        
        Collections.sort(podio);

        for (int i = 0; i < podio.size(); i++) { //output dati
            System.out.println("Posizione: " + (i+1) + podio.get(i).toString() );
        }

    }
}