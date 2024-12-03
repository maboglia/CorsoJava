/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es04.dipendenti.controller;

import java.util.ArrayList;

import es04.dipendenti.model.Dipendente;
import es04.dipendenti.model.Fattorino;
import es04.dipendenti.model.Impiegato;
/**
 *
 * @author teacher
 */
public class LibroMatricola {
    
    public ArrayList<Dipendente> dipendenti = new ArrayList<>();
    
    {
    
        dipendenti.add(new Impiegato("mauro", "bogliaccino"));
        dipendenti.add(new Impiegato("marco", "bogliaccino"));
        dipendenti.add(new Impiegato("mario", "bogliaccino"));
        dipendenti.add(new Impiegato("maurizio", "bogliaccino"));
        dipendenti.add(new Impiegato("maurino", "bogliaccino"));
        dipendenti.add(new Impiegato("mauretto", "bogliaccino"));
        dipendenti.add(new Impiegato("maurone", "bogliaccino"));
        dipendenti.add(new Impiegato("maurato", "bogliaccino"));
        dipendenti.add(new Fattorino("mauro", "bogliaccino"));
        dipendenti.add(new Fattorino("marco", "bogliaccino"));
        dipendenti.add(new Fattorino("mario", "bogliaccino"));
        dipendenti.add(new Fattorino("maurizio", "bogliaccino"));
        dipendenti.add(new Fattorino("maurino", "bogliaccino"));
        dipendenti.add(new Fattorino("mauretto", "bogliaccino"));
        dipendenti.add(new Fattorino("maurone", "bogliaccino"));
        dipendenti.add(new Fattorino("maurato", "bogliaccino"));
    
    }
    
    public String getAll(){
        StringBuilder sb = new StringBuilder();
        double totale = 0;
        for (Dipendente dipendente : dipendenti) {
            sb.append(dipendente+"\n");
            totale += dipendente.calcolaStipendio();
        }
        sb.append("\n\nil totale degli stipendi è: " + totale);
        return sb.toString();
    }
    
    public String getFattorini(){
        StringBuilder sb = new StringBuilder();
        double totale = 0;
        for (Dipendente dipendente : dipendenti) {
            if (dipendente instanceof Fattorino) {
                sb.append(dipendente+"\n");
                totale += dipendente.calcolaStipendio();
            }            
        }
        sb.append("\n\nil totale degli stipendi è: " + totale);
        return sb.toString();
    }
    
    public String getImpiegato(){
        StringBuilder sb = new StringBuilder();
        double totale = 0;
        for (Dipendente dipendente : dipendenti) {
            if (dipendente instanceof Impiegato) {
                sb.append(dipendente+"\n");
                totale += dipendente.calcolaStipendio();
            }                    
        }
        sb.append("\n\nil totale degli stipendi è: " + totale);
        return sb.toString();
    }
    
    
}
