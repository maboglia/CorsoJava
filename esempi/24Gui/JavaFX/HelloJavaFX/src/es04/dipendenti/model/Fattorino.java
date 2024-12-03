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
public class Fattorino extends Dipendente {

    
    
    public Fattorino(String nome, String cognome) {
        super(nome, cognome);
    }

    
    
    @Override
    public double calcolaStipendio() {
        return 600;

    }
    
}
