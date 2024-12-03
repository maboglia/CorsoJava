/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es04.dipendenti.model;

/**
 *
 * @author teacher
 */
public abstract class Dipendente {

    static int nMatricola = 0;
    private String nome, cognome;
    private int matricola;

    public Dipendente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        immatricola();
        this.matricola = nMatricola;
    }

    @Override
    public String toString() {
        return  matricola + ") " + nome + ", " + cognome ;
    }

    private void immatricola(){
    
        nMatricola++;
                
    
    }
    
    public abstract double calcolaStipendio();


}
