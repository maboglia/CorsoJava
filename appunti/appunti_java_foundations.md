# Appunti Java

## Fondamenti di programmazione

* Dal problema al programma
* La nozione di algoritmo
* Linguaggi per la descrizione di algoritmi.
* I diagrammi di flusso
* Paradigmi di programmazione
* Tipi di dato semplici
* Strutture di controllo sequenziali, condizionali ed iterative 
* Tipi di dato complessi e oggetti
* Funzioni e metodi
* Il ciclo di vita del software e le qualità dei programmi
* Astrazione e decomposizione
* La programmazione modulare
* Strutture dati fondamentali: liste, hash table 



## snippets

```java
Math.PI
Math.random()
Math.pow(a, b)

System.currentTimeMillis()
System.out.println(anyValue)

JoptionPane.showMessageDialog(null, message)
JOptionPane.showInputDialog(prompt-message)

Integer.parseInt(string)
Double.parseDouble(string)

Arrays.sort(type[] list)
Arrays.binarySearch(type[] list, type key)

```

```java

String s = "Welcome";
String s = new String(char[]);
int length = s.length();
char ch = s.charAt(index);
int d = s.compareTo(s1);
boolean b = s.equals(s1);
boolean b = s.startsWith(s1);
boolean b = s.endsWith(s1);
String s1 = s.trim();
String s1 = s.toUpperCase();
String s1 = s.toLowerCase();
int index = s.indexOf(ch);
int index = s.lastIndexOf(ch);
String s1 = s.substring(ch);
String s1 = s.substring(i,j);
char[] chs = s.toCharArray();
String s1 = s.replaceAll(regex,repl);
String[] tokens = s.split(regex);

```

```java
ArrayList<E> list = new ArrayList<E>();
list.add(object);
list.add(index, object);
list.clear();
Object o = list.get(index);
boolean b = list.isEmpty();
boolean b = list.contains(object);
int i = list.size();
list.remove(index);
list.set(index, object);
int i = list.indexOf(object);
int i = list.lastIndexOf(object);

```

```java

Array Monodimensionali
int[] list = new int[10];
list.length;
int[] list = {1, 2, 3, 4};
```

```java

Array Multidimensionali 
int[][] list = new int[10][10];
list.length;
list[0].length;
int[][] list = {{1, 2}, {3, 4}};
```

```java

Array irregolari
int[][] m = {{1, 2, 3, 4},
{1, 2, 3},
{1, 2},
{1}};

```


```java
        String[] mesi = {
                "Gennaio",
                "Febbraio",
                "Marzo",
                "Aprile",
                "Maggio",
                "Giugno",
                "Luglio",
                "Agosto",
                "Settembre",
                "Ottobre",
                "Novembre",
                "Dicembre",
        };

        //se conosco a priori il numero di iterazioni
/*        for (int i = 0; i < mesi.length; i++) {
            System.out.println("mese: " + mesi[i]);
            String risposta= getInput("Ti piace il mese di " + mesi[i]);
            System.out.println(risposta);
        }
        */
        //anche per scorrere l'array al contrario
/*
        for (int i = mesi.length -1; i>=0; i-- ){

            if(i % 2 != 0)
            System.out.println("mese:  "+ mesi[i]+"[" +  i +"]");

        }

*/

/*        for (String m : mesi ) {
            System.out.println(m);
        }*/

        int counter = 0;
        while(counter < mesi.length){
            System.out.println("il valore di contatore è" + counter);
            System.out.println("il valore di mese è" + mesi[counter]);
            counter++;
        }

        boolean sentinella = false;

/*
        while(sentinella == false){

            String s =getInput("Inserisci un numero");
            System.out.println(s);
            if (s.equals("esci"))
                sentinella = true;

        }
*/
;
        do{

            String s =getInput("Inserisci un numero");
            System.out.println(s);
        }
        while(sentinella == true);




        int mese = 3;
        //dichiaro oggetto stringa
        String meseStringa;

        //dichiaro un'oggetto di tipo scanner
        Scanner sc = new Scanner(System.in);

        //messaggio
        System.out.println("Inserisci inserisci una stringa di 3 lettere abbreviazione mese in cui siamo");
/**/        String input = sc.nextLine();
        try {
            mese = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Hai inserito un numero, dovevi inserire");
            //e.printStackTrace();
        }


        //valorizzo stringa con input dell'utente
         meseStringa = sc.nextLine();

        if(meseStringa.equals("esci"))
            System.out.println("programma terminato");



        //if... else if... else
//        if (mese >=1 && mese <=3){
//            System.out.println("Sei nel 1° trimestre");
//        }
//
//        else if (mese >=4 && mese <=6){
//            System.out.println("Sei nel 2° trimestre");
//        }
//        else if (mese >=7 && mese <=9){
//            System.out.println("Sei nel 3° trimestre");
//        }
//        else if (mese >=10 && mese <=12){
//            System.out.println("Sei nel 4° trimestre");
//        }
//        else {
//            System.out.println("Questo valore è sconosciuto");
//        }

//        switch (mese){
//
//            case 1:
//            case 2:
//            case 3:
//                //System.out.println("gennaio");
//                System.out.println("siamo nel 1 trimestre");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("siamo nel 2 trimestre");
//                break;
//            default:
//                System.out.println("inserisci un numero tra 1 e 2");
//                break;
//
//
//        }

            //dalla versione 7 possso utilizzare le stringhe
        switch (input){

            case "Gen":
                System.out.println("gennaio");
                break;
            case "Feb":
                System.out.println("febbraio");
                break;
            case "Mar":
                System.out.println("marzo");
                break;
            case "Apr":
                System.out.println("aprile");
                break;

            //.....

            default:
                System.out.println("inserisci una stringa di 3 lettere");
                break;


        }
```


Tipi primitivi
tipi complessi

## static
```java
//uso una classe con metodi statici, accedo ad esse senza istanziare nuovi oggetti:
Math.sqrt(4);

//tipo di utilizzo classe, creo oggetto, attraverso l'oggetto mediante l'operatore dot (.) accedo ai suoi metodi e variabili
Persona p1 = new Persona();
Persona p2 = new Persona();

p1.setEta(23);
```

## Flusso di lavoro del programma

* GESTIONE DEL FLUSSO DI ESECUZIONE
* COSTRUTTI DI PROGRAMMAZIONE
* Il costrutto if
* Il costrutto while
* Il costrutto for
* Il costrutto do
* Cicli for migliorato
* Il costrutto switch


### costrutti condizionali

* if()
* if... else if... else
* switch() // un if elegante

### costrutti iterativi
* for
* for: per scorrere p.es un array in entrambe le direzioni
* for(each): scorre solo in una direzione
* while
* do...while

### esercizio:
* costruire un programma che chieda in input l'altezza degli studenti di una classe (altezza espressa in cm )
* il programma accetta un numero indeterminato di valori in input e restituisce la media aritmetica incrementale ogni volta
* inserire una condizione per uscire dal ciclo e informare l'utente della stringa da inserire

### soluzione esercizio MB

```java
boolean esci = false;
int studentiTot=0;
int altezzaTot = 0;
double media = 0.0D;
while(esci == false){
    String s =getInput("Inserisci un numero");
    int valoreInserito = Integer.parseInt(s);
    //è la condizione che mi fa uscire
    if (valoreInserito == 0) esci = true;
    studentiTot++;
    altezzaTot += valoreInserito;
    media = altezzaTot/studentiTot;
    System.out.println("il numero degli studenti è " + studentiTot);
    System.out.println("l'altezza totale degli studenti è " + altezzaTot);
    System.out.println("quindi la media aritmetica dell'altezza dell'aula " + media);
}
```

## esercizio 2
* la direttrice del centro di formazione di via xx settembre vi chiede un programma per formare le classi per il nuovo anno scolastico.
* Stampare o visualizzare il numero di classi che si possono ottenere con un gruppo di studenti di cui si conosce l'anno di nascita. 
* Le classi devono essere omogenee per età e possono contenere max 16 studenti.

### Esercizio 3
* utilizzando la classe LanciaDadi creata a lezione, implementare un gioco di dadi
* problema
* costruire un gioco statistico
* lanciadadi

### requirements

* deve permettere al player di scegliere il numero di facce del dado (default 6)
* deve poter scegliere il numero di dadi con cui giocare (default 2)
* devo verificare e riportare le statistiche di successo su 1000 lanci: successo = tutte le facce con lo stesso valore
*  evoluzione: classificare i risultati per faccia del dado

### pseudo codice


## ciclo for innestato
```java
String mieRighe = getInput("Quante righe ha la tua tabella");
String mieColonne = getInput("Quante righe ha la tua tabella");
int righe = Integer.parseInt(mieRighe);
int colonne = Integer.parseInt(mieColonne);
//voglio stampare a video una matrice 3x3
for (int i = 1; i <= righe; i++) {
    //ciclo innestato
    for (int j = 1; j <= colonne ; j++) {
        int result = i * j;
        if(result % 2 == 0)
        System.out.print(result);
        //inserisco un tabulate
        System.out.print("\t");
    }
    System.out.println();
}

//metodo statico richiamato dal metodo main
public static String getInput(String domanda){
    System.out.println(domanda);
    Scanner stringa = new Scanner(System.in);
    String miaStringa = stringa.next();
    return miaStringa;
}
```

### date in java


### Array Monodimensionali

```java
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Array di tipi primitivi");
        //semplificato
        int[] interi = {6,4,2};
        Arrays.sort(interi);
        for (int i = 0; i < interi.length ; i++) {
            System.out.println(interi[i]);
        }
        System.out.println("Array di stringhe");
        //semplificato
        String[] colori = {"Rosso","verde", "blu"};
        Arrays.sort(colori);
        for (int i = 0; i < colori.length ; i++) {
            System.out.println(colori[i]);
        }
        System.out.println("Array di stringhe con for(each)");
        //semplificato
        String[] moto = {"MT-09","VSTROM", "CBR"};
        //Arrays.sort(moto);
        for (String m : moto) {
            System.out.println(m);
        }
        System.out.println("Array di interi sintassi alternativa");
        //semplificato
        int dimensione= 10;
        int[] dimensionato = new int[dimensione] ;
            //con il prossimo ciclo riempio l'array
        for (int i = 0; i < dimensionato.length; i++) {
            dimensionato[i] = i*50;
        }
        //con il prossimo ciclo stampo gli elementi dell'array
        for (int valore : dimensionato ) {
            System.out.println(valore);
        }
        System.out.println("copiare un array");
        int[] nuovo = new int[10];
        System.arraycopy(dimensionato,0,nuovo,2,9);
        for (int n : nuovo) {
            System.out.println(n);
        }
//        int[] interi = new int[3];
//        interi[0] = 2;
//        interi[1] = 4;
//        interi[2] = 6;
    }
}
```

## Array multidimensionali
```java
public class ArrayMulti {
    public static void main(String[] args) {
        String[][] moto = new String[3][2];
        moto[0][0] = "MT-09";
        moto[0][1] = "Yamaha";
        moto[1][0] = "VSTROM";
        moto[1][1] = "Suzuki";
        moto[2][0] = "CBR600";
        moto[2][1] = "Honda";
        for(int i = 0; i < moto.length; i++ ){
            StringBuilder sb = new StringBuilder();
            sb.append("La marca della ")
                    .append(moto[i][0])
                    .append(" è ")
                    .append(moto[i][1])
                    .append(".");
            System.out.println(sb);
        }
    }
}
```

## matrici

```java
int righe = 10;
int colonne = 10;
//primo ciclo for
for (int i = 1; i < righe; i++) {
    //2 ciclo for innestato
    for (int j = 1; j <= i; j++) {
        //if(i*j < 10) System.out.print("0");
        System.out.print("A");
        //System.out.print(i * j);
        //System.out.print("\t");
    }
    System.out.println();
}
```

## Esercizio:
* con i cicli innestati stampare a video la figura di un triangolo isoscele composto di lettere A maiuscola

## ArrayList

```java
import java.util.ArrayList;
import java.util.List;
public class ListaArray {
    public static void main(String[] args) {
    List<String> elenco = new ArrayList<>();
        elenco.add("MT_09");
        elenco.add("CBR600");
        elenco.add("VSTROM");
        System.out.println(elenco);
        elenco.add("Africa Twin");
        System.out.println(elenco);
        elenco.remove(1);
        System.out.println(elenco);
        System.out.println(elenco.get(0));
        int posizione = elenco.indexOf("Africa Twin");
        System.out.println("Africa è in posizione " + posizione);
    }
}
```
