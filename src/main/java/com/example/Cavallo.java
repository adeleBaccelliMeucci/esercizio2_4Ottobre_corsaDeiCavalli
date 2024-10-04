package com.example;

public class Cavallo extends Thread implements Comparable<Cavallo>{ 

    private String nome;
    private int distanza;
    private static int t = 0; //tempo impiegato
    private int tempoImpiegato;

    public int getTempoImpiegato() {
        return tempoImpiegato;
    }

    public Cavallo (int distanza, String nome){ //distanza da fare
        this.nome = nome;
        this.distanza = distanza;
        this.tempoImpiegato = 0;
    }

    public void run(){
        for(int i = 0; i<distanza ; i++){
            t++;
        }
        tempoImpiegato = t;
    }

    @Override
    public String toString(){
        return "nome: " + nome + ". Tempo impiegato: " + tempoImpiegato; //tutti i dati
    }

    @Override
    public int compareTo(Cavallo c){
        return this.tempoImpiegato - c.getTempoImpiegato();
    }
}
