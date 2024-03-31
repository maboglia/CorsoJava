# ESERCIZIO: GESTIONE AZIENDALE

## **Esercitazione: Gestione degli Impiegati in un'azienda con calcolo dello stipendio totale**

**Introduzione:**
In questa esercitazione, svilupperemo un'applicazione Java per gestire gli impiegati di un'azienda. Gli impiegati saranno identificati da un nome, un cognome, un ID univoco e uno stipendio. Utilizzeremo anche una Segreteria per il calcolo degli ID degli impiegati. Inoltre, implementeremo una funzionalità per calcolare lo stipendio totale di tutti gli impiegati dell'azienda.

**Requisiti:**

1. Conoscenza di base della programmazione Java.
2. Comprensione dei concetti di classi, oggetti e metodi in Java.

**Descrizione:**
L'applicazione Java che creeremo consentirà di:

1. Creare e gestire gli impiegati dell'azienda, includendo la generazione degli ID tramite la Segreteria.
2. Calcolare lo stipendio totale di tutti gli impiegati dell'azienda.

**Passaggi:**

1. **Definire la classe Impiegato:**
   - La classe Impiegato avrà gli attributi `nome`, `cognome`, `id` e `stipendio`.
   - Implementeremo i metodi getter e setter per accedere e modificare gli attributi dell'impiegato.

2. **Definire la classe Segreteria:**
   - La classe Segreteria avrà un metodo per generare un ID univoco per gli impiegati.
   - L'ID potrebbe essere generato utilizzando una sequenza numerica incrementale o un algoritmo più complesso.

3. **Creare la classe Azienda:**
   - La classe Azienda conterrà una lista di impiegati e avrà un metodo per aggiungere nuovi impiegati alla lista.
   - Implementeremo un metodo per calcolare lo stipendio totale di tutti gli impiegati presenti nell'azienda.

4. **Testare l'applicazione:**
   - Creeremo un programma principale per testare tutte le funzionalità implementate.
   - Aggiungeremo alcuni impiegati all'azienda e testeremo il calcolo dello stipendio totale.

**Esempio di Implementazione:**

```java
public class Impiegato {
    private String nome;
    private String cognome;
    private int id;
    private double stipendio;

    // Costruttore
    public Impiegato(String nome, String cognome, int id, double stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
        this.stipendio = stipendio;
    }

    // Metodi getter e setter
    // ...

    // Altri metodi se necessario
}

public class Segreteria {
    private static int prossimoId = 1;

    public static int generaId() {
        return prossimoId++;
    }
}

import java.util.ArrayList;

public class Azienda {
    private ArrayList<Impiegato> impiegati;

    public Azienda() {
        this.impiegati = new ArrayList<>();
    }

    public void aggiungiImpiegato(Impiegato impiegato) {
        impiegati.add(impiegato);
    }

    public double calcolaStipendioTotale() {
        double stipendioTotale = 0;
        for (Impiegato impiegato : impiegati) {
            stipendioTotale += impiegato.getStipendio();
        }
        return stipendioTotale;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creazione di un'azienda
        Azienda azienda = new Azienda();

        // Aggiunta di impiegati all'azienda
        azienda.aggiungiImpiegato(new Impiegato("Mario", "Rossi", Segreteria.generaId(), 2500));
        azienda.aggiungiImpiegato(new Impiegato("Luca", "Verdi", Segreteria.generaId(), 2800));
        azienda.aggiungiImpiegato(new Impiegato("Anna", "Bianchi", Segreteria.generaId(), 3000));

        // Calcolo dello stipendio totale
        double stipendioTotale = azienda.calcolaStipendioTotale();
        System.out.println("Lo stipendio totale degli impiegati dell'azienda è: " + stipendioTotale);
    }
}
```

**Conclusioni:**
Con questa esercitazione, gli studenti avranno imparato a creare un'applicazione Java per gestire gli impiegati di un'azienda e calcolare lo stipendio totale. Potranno esplorare ulteriori funzionalità e miglioramenti per l'applicazione, come la gestione avanzata degli impiegati o l'integrazione con un'interfaccia utente grafica.
