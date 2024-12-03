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
public class Impiegato extends Dipendente {
    

    private double pagaBase;
    private int postazione;

    public Impiegato(String nome, String cognome) {
        super(nome, cognome);
        this.pagaBase = 10.35;
    }

    public void setPostazione(int postazione) {
        this.postazione = postazione;
    }

    @Override
    public double calcolaStipendio() {
        return pagaBase * 30;
    }
    
    
  
    
}
