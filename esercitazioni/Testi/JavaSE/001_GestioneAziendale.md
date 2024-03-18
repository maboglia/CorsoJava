# ESERCIZIO: GESTIONE AZIENDALE

## DESCRIZIONE GENERICA

Ho un'azienda in cui lavorano Impiegati.
Ogni Impiegato ha un proprio nome, cognome, id e stipendio.
Ho una Segreteria utilizzata per il calcolo degli ID degli impiegati.
Devo poter calcolare lo stipendio totale.

## SEGRETERIA

Definire una classe Segreteria che ci permette (dato un nome, un cognome ed un anno
di nascita) di creare un ID
Questa classe ha un solo metodo statico.
In particolare il metodo:

* creaID (String n, String c, Int a)
che prende 2 stringhe ed un intero (in particolare saranno un nome, un
cognome e l'età) e ritorna una Stringa formata dalla concatenazione di: le prime
2 lettere di n, le prime 2 lettere di c, a (esempio: con l'input “paolo”, “rossi”,
1995 ritorna come risultato: paro1995).

## IMPIEGATO

La classe Impiegato ha

* attributi di tipo string: nome, cognome, id;
* attributi di tipo int: anno di nascita e stipendio;
* i relativi metodi getter e setter di tutti.
Il setter dell'attributo id però non prende in input il valore ma lo ottiene con il metodo
creaID della classe Segreteria.

## AZIENDA (Classe Main)

La classe Azienda conserva il riferimento a tutti gli impiegati e può calcolare lo
stipendio totali di tutti essi.
Quindi ha come attributo:

* un array di Impiegati;
* numero massimo di impiegati;
* numero attuale di impiegati.
Ha come metodi:
* un metodo addImpiegato( ... ):
aggiunge un impiegato all'array (se non è già pieno);
* un metodo stipendioTOT( ):
calcola lo stipendio totale come somma di tutti gli stipendi.

## MAIN

* Crea uno Scanner per prendere input da tastiera;
* Crea un oggetto azienda;
* Crea un tot di Impiegati chiedendo l'input da tastiera (usare un for);
* Aggiunge man mano questi impiegati all'azienda;
* Calcola e stampa lo stipendio totale.


## Esempio soluzione

```java
import java.util.Scanner;

class Segreteria {
    public static String creaID(String n, String c, int a) {
        return n.substring(0, 2) + c.substring(0, 2) + a;
    }
}

class Impiegato {
    private String nome;
    private String cognome;
    private String id;
    private int annoNascita;
    private int stipendio;

    public Impiegato(String nome, String cognome, int annoNascita, int stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
        this.stipendio = stipendio;
        this.id = Segreteria.creaID(nome, cognome, annoNascita);
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = Segreteria.creaID(nome, cognome, annoNascita);
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(int annoNascita) {
        this.annoNascita = annoNascita;
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }
}

class Azienda {
    private Impiegato[] impiegati;
    private int numMaxImpiegati;
    private int numAttualeImpiegati;

    public Azienda(int numMaxImpiegati) {
        this.numMaxImpiegati = numMaxImpiegati;
        this.impiegati = new Impiegato[numMaxImpiegati];
        this.numAttualeImpiegati = 0;
    }

    public void addImpiegato(String nome, String cognome, int annoNascita, int stipendio) {
        if (numAttualeImpiegati < numMaxImpiegati) {
            impiegati[numAttualeImpiegati] = new Impiegato(nome, cognome, annoNascita, stipendio);
            numAttualeImpiegati++;
        } else {
            System.out.println("Errore: Numero massimo di impiegati raggiunto.");
        }
    }

    public int stipendioTOT() {
        int totale = 0;
        for (int i = 0; i < numAttualeImpiegati; i++) {
            totale += impiegati[i].getStipendio();
        }
        return totale;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero massimo di impiegati: ");
        int numMaxImpiegati = scanner.nextInt();
        Azienda azienda = new Azienda(numMaxImpiegati);

        for (int i = 0; i < numMaxImpiegati; i++) {
            System.out.println("\nInserimento dati impiegato " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Cognome: ");
            String cognome = scanner.next();
            System.out.print("Anno di nascita: ");
            int annoNascita = scanner.nextInt();
            System.out.print("Stipendio: ");
            int stipendio = scanner.nextInt();

            azienda.addImpiegato(nome, cognome, annoNascita, stipendio);
        }

        System.out.println("\nStipendio totale dell'azienda: " + azienda.stipendioTOT());
    }
}
```
