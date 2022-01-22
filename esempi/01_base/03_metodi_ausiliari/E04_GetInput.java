package it.maboglia.tipi;

import java.util.Scanner;

public class E04_GetInput {

    public static void main(String[] args){

        String numeroUno = getInput("Inserisci primo numero");
        String numeroDue = getInput("Inserisci secondo numero");

        double d1 = Double.parseDouble(numeroUno);
        double d2 = Double.parseDouble(numeroDue);

        usaMatematica nuovaOperazione = new usaMatematica(d1, d2);


        System.out.println(nuovaOperazione.somma());

    }

    public static String getInput(String domanda){

        System.out.println(domanda);
        Scanner stringa = new Scanner(System.in);
        String miaStringa = stringa.next();
        
        return miaStringa;

    }


}
