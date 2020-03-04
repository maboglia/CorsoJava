package main;

import java.util.ArrayList;
import gente.Persona;
 
public class JavaArrayListToString {
   
    public static void main(String args[]){
       
        ArrayList  listaNumeri = new ArrayList ();
        listaNumeri.add(new Integer(10));
        listaNumeri.add(new Integer(16));
        listaNumeri.add(new Integer(22));
        
        System.out.println(listaNumeri);
        
        ArrayList  listaPersone = new ArrayList ();
        
        Persona p0 = new Persona("Mauro", "Rossi", 20);
        listaPersone.add(p0);
        
        Persona p1 = new Persona("Paolo", "Verdi", 21);
        listaPersone.add(p1);
       
        Persona p2 = new Persona("Pippo", "Pluto", 22);
        listaPersone.add(p2);
        
        System.out.println(listaPersone);
        
        /*Rossi
        listaPersone.add(new Persona ("Mauro", "Rossi", 20));
        listaPersone.add(new Persona ("Paolo", "Verdi", 21));
        listaPersone.add(new Persona ("Pippo", "Pluto", 23));
      
        System.out.println(listaPersone);
        */
        
        Persona p = (Persona) listaPersone.get(0);
        System.out.println(p);
          
    }
}
