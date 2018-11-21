
/* ESEMPIO ****************************************************/

package it.maboglia.tipi;

import java.util.Scanner;

public class Principale {

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

/* ESEMPIO ****************************************************/

package it.maboglia.tipi;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * Created by mauro on 09/12/15.
 */
public class ResocontoTipi {

public static void main(String[] args){

    //tipi di dati primitivi, complessi
    //modificatori di accesso: public, private, protected
    //tipo di ritorno void oppure un tipo di dato primitivo, p.es int, char, boolean, ... oppure un tipo di dato complesso

    //4 per rappresentare numeri interi
    byte b = 1;
    short sh = 1;
    int i = 1;
    long l = 1L;
    //2 per rappresentare numeri con virgola
    float f = 1f;
    double d = 1d;
    //questi sono i tipi primitivi numerici
    System.out.println("Byte: " + b);
    System.out.println("Short: " + sh);
    System.out.println("Integer: " + i);
    System.out.println("long: " + l);
    System.out.println("float: " + f);
    System.out.println("double: " + d);

    //ultimi due tipi primitivi
    char c = 'a'; //uso gli apici singoli
    boolean bo = true; //true o false

    System.out.println(c);
    System.out.println(bo);

        /*
        if(b < 127){
            b++;
        }
        */
    //uso una wrapper / helper class che mi da info e metodi sul tipo di dato, in questo caso byte
    if(b < Byte.MAX_VALUE){
        b++;
    }

    System.out.println("b vale " + b);

    System.out.println("il tipo byte varia da: ");
    System.out.println(Byte.MIN_VALUE);

    System.out.println(Byte.MAX_VALUE);

    //metodo uno
    double valore = .012;
    double vSomma = valore + valore + valore;
    System.out.println(vSomma);

    //metodo 2
    String strValue = Double.toString(valore);
    //System.out.println(strValue);
    BigDecimal bigValore = new BigDecimal(strValue);

    BigDecimal vSommaBig = bigValore.add(bigValore).add(bigValore);

    System.out.println("la somma dei decimali è: " + vSommaBig.toString());



    short sommetta = (short) ((short) b + sh);

    System.out.println("*******************************");

    int interoVal1 = 56;
    int interoVal2 = interoVal1;
    System.out.println("il secondo valore è: " + interoVal2);


    long longValue1 = interoVal1;
    System.out.println("il valore long è: " + longValue1);

    short shortValore1 = (short) interoVal1;
    System.out.println("il valore short1 è " +  shortValore1);

    int intero3 = 1024;
    byte byte2 = (byte) intero3;
    System.out.println("il valore di byte2 è: " + byte2);

    double doubleValue = 3.999999d;
    int intero4 = (int) doubleValue;
    System.out.println("Double to int: " + intero4);


    int intero1 = 56;
    int intero2 = 42;

    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);

    System.out.println("come ti chiami?");
    String testo = null;
    try {
        testo = br.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    }

    System.out.println("ti chiami " + testo);





    int result1 = intero1 + intero2;
    System.out.println(result1);

    int result2 = intero1 - intero2;
    System.out.println(result2);

    int result3 = intero1 * intero2;
    System.out.println(result3);

    double result4 = (double) intero1 / intero2;
    System.out.println("il risultato è: " + result4);
    System.out.println("arrotonda diventa: "+ Math.round(result4));


    double doubleValue2 = -3.99999;
    long arrotondato = Math.round(doubleValue2);
    System.out.println(arrotondato);

    double absValue = Math.abs(doubleValue);
    System.out.println(absValue);


//string e stringbuilder


        String saluto = "Ciao";
        String saluto2 = "Mondo";
        String saluto3 = saluto + ", " + saluto2 + "!";

        System.out.println(saluto3);


        StringBuilder sb = new StringBuilder("Ciao")
                .append(", ")
                .append("Mondo")
                .append("!");
        System.out.println(sb);

        //creo un elemento scanner di tipo scanner per catturare input utente
        Scanner scanner = new Scanner(System.in);
        System.out.println("cosa dice denis");
        String input = scanner.nextLine();
        System.out.println("denis ha detto " + input);


        //ricetta della pizza
        System.out.println("devi comprare ingredienti per la pizza");
        sb.delete(0, sb.length());
        for (int i = 0; i < 5; i++) {
            System.out.println("scrivi ingrediente" + i);
            input = scanner.nextLine();
            sb.append(input + "\n");
        }
        System.out.println(sb);

//boolean

        //variabile boolean esterna al metodo
        static boolean  bext;

           //variabili locali
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("il valore di b1 è: " + b1);
        System.out.println("il valore di b2 è: " + b2);
        System.out.println("il valore di bext è: " + bext);

        boolean b3 = !b1;
        System.out.println("il valore di b3 è: " + b3);

        int i1 = 1;
        boolean b4 = (i1 != 0);

        if (b4 == true) System.out.println("Benvenuto utente");
        else if (b4 == false) System.out.println("non puoi accedere, riprova!");

        System.out.println("il valore di b4 è: " + b4);

        String strBool = "true";
        boolean stringa = Boolean.parseBoolean(strBool);
        System.out.println(stringa);

//char


        char c1 = '1';
        char c2 = '2';
        char c3 = '3';

        System.out.println("Char 1: " + c1);
        System.out.println("Char 2: " + c2);
        System.out.println("Char 3: " + c3);


        char dollarSign = '\u0024';
        System.out.println(dollarSign);
        char yenSign = '\u00A5';
        System.out.println(yenSign);


        //classe wrapper

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';

        System.out.println(Character.toUpperCase(a1));
        System.out.println(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));



}
}

/* ESEMPIO ****************************************************/

package giorno2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        String saluta = "Ciao belli!";
        String mezzoSaluto = "Ciao ";
        String altroMezzo ="belli!";
        String salutaUguale = "Ciao ";
        String meLiSommoPrima = mezzoSaluto + altroMezzo;


        System.out.println(saluta);
        System.out.println(mezzoSaluto + altroMezzo);

        boolean b = (saluta == meLiSommoPrima);
        System.out.println(b);

        boolean c = (mezzoSaluto == salutaUguale);
        System.out.println(c);

        boolean d = saluta.equals(meLiSommoPrima);
        System.out.println(d);

        char[] chars = {'c','i','a','o'};

        String e = new String(chars);
        System.out.println(e);

        char[] chars2 = e.toCharArray();
            for (char f : chars2 ) {
                System.out.println(f);
            }
        //migliorare questo codice
        String s= getInput("scrivi una bella frase");
        char[] chars3 = s.toCharArray();
        for (int i=0; i <= 44; i++ ) {
            System.out.print(chars3[i]);
            if((i % 6) == 0)
            System.out.println();
        }




    }

    public static String getInput(String domanda){

               System.out.println(domanda);
               Scanner stringa = new Scanner(System.in);
               String miaStringa = stringa.next();
               return miaStringa;
    }

}

/* ESEMPIO ****************************************************/

package it.maboglia.tipi;

public class usaMatematica {

    private double numeroUno, numeroDue;


    public usaMatematica(double uno, double due) {
        numeroUno = uno;
        numeroDue = due;

    }

    public double somma(){

       return numeroUno + numeroDue;

    }
    public void separatore(){

        String separatore = "******[][][]******";
        System.out.println(separatore);

    }



}
