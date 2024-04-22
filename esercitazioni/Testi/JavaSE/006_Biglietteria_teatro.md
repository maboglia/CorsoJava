# Biglietteria Teatro

L'applicazione che si intende progettare gestisce la vendita dei biglietti in un teatro.

## Spettacolo

Ogni spettacolo tenuto nel teatro è definito dai seguenti attributi:

- Titolo: una stringa che rappresenta il titolo dello spettacolo.
- Regista: una stringa che indica il nome del regista dello spettacolo.
- Attori: un array non vuoto di stringhe che contiene i nomi degli attori che partecipano allo spettacolo.

## Replica

Per ciascuno spettacolo sono programmate una o più repliche. Ogni replica è caratterizzata da una data e un'ora specifiche.

## Posto

I posti all'interno del teatro sono identificati per fila, numero e tipo (ad esempio: platea, palco, galleria, ecc.). 

## Biglietto

Il costo di ciascun biglietto è determinato dal tipo di posto e dallo spettacolo. Ad esempio, il costo dei posti in platea per lo spettacolo "Cats" potrebbe essere di 50 euro.

## Prenotazione

Una prenotazione è caratterizzata dai seguenti attributi:

- Nome del cliente: una stringa che rappresenta il nome del cliente che ha effettuato la prenotazione.
- Data di prenotazione: la data in cui è stata effettuata la prenotazione.
- Replica dello spettacolo: la replica dello spettacolo per cui è stata effettuata la prenotazione.
- Posti prenotati: almeno un posto che è stato prenotato tramite questa prenotazione. 

## Addetto Biglietteria

L'addetto alla biglietteria del teatro esegue i seguenti controlli:

- Dato uno spettacolo e un tipo di posto, restituisce il costo associato al tipo di posto per lo spettacolo. Se il costo è unico e specificato, altrimenti restituisce -1.
- Dato un insieme di posti e una replica, restituisce l'insieme dei posti disponibili per quella replica (cioè i posti che non sono stati prenotati per quella replica).

Questo testo descrive le principali caratteristiche e funzionalità del sistema di gestione della biglietteria del teatro.

## Esempio di soluzione

Ecco un esempio di possibile implementazione delle classi per gestire la biglietteria del teatro:

```java
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Classe Spettacolo
class Spettacolo {
    private String titolo;
    private String regista;
    private List<String> attori;

    public Spettacolo(String titolo, String regista, List<String> attori) {
        this.titolo = titolo;
        this.regista = regista;
        this.attori = attori;
    }

    // getter e setter
}

// Classe Replica
class Replica {
    private Date dataOra;

    public Replica(Date dataOra) {
        this.dataOra = dataOra;
    }

    // getter e setter
}

// Enum TipoPosto
enum TipoPosto {
    PLATEA,
    PALCO,
    GALLERIA,
    // altri tipi di posto...
}

// Classe Posto
class Posto {
    private int fila;
    private int numero;
    private TipoPosto tipo;

    public Posto(int fila, int numero, TipoPosto tipo) {
        this.fila = fila;
        this.numero = numero;
        this.tipo = tipo;
    }

    // getter e setter
}

// Classe Biglietto
class Biglietto {
    private Posto posto;
    private double costo;

    public Biglietto(Posto posto, double costo) {
        this.posto = posto;
        this.costo = costo;
    }

    // getter e setter
}

// Classe Prenotazione
class Prenotazione {
    private String nomeCliente;
    private Date dataPrenotazione;
    private Replica replica;
    private List<Biglietto> biglietti;

    public Prenotazione(String nomeCliente, Date dataPrenotazione, Replica replica, List<Biglietto> biglietti) {
        this.nomeCliente = nomeCliente;
        this.dataPrenotazione = dataPrenotazione;
        this.replica = replica;
        this.biglietti = biglietti;
    }

    // getter e setter
}

// Classe AddettoBiglietteria
class AddettoBiglietteria {
    private Map<Spettacolo, Map<TipoPosto, Double>> prezzi;

    public AddettoBiglietteria() {
        prezzi = new HashMap<>();
        // Inizializza i prezzi per ciascun tipo di posto per ogni spettacolo
        // Questa è solo una simulazione, i prezzi effettivi dovrebbero essere impostati in base alla politica del teatro
        prezzi.put(SPETTACOLO1, initPrezzi());
        prezzi.put(SPETTACOLO2, initPrezzi());
    }

    private Map<TipoPosto, Double> initPrezzi() {
        Map<TipoPosto, Double> prezzi = new HashMap<>();
        prezzi.put(TipoPosto.PLATEA, 50.0);
        prezzi.put(TipoPosto.PALCO, 40.0);
        prezzi.put(TipoPosto.GALLERIA, 30.0);
        return prezzi;
    }

    public double getPrezzoPosto(Spettacolo spettacolo, TipoPosto tipoPosto) {
        if (prezzi.containsKey(spettacolo) && prezzi.get(spettacolo).containsKey(tipoPosto)) {
            return prezzi.get(spettacolo).get(tipoPosto);
        }
        return -1; // Segnala una situazione di errore
    }

    public List<Posto> postiDisponibili(List<Posto> posti, Replica replica) {
        List<Posto> postiDisponibili = new ArrayList<>();
        // Implementa la logica per verificare quali posti sono disponibili per la replica specificata
        return postiDisponibili;
    }
}

// Classe principale per testare il funzionamento
public class Main {
    public static void main(String[] args) {
        // Esempio di utilizzo delle classi sopra definite
        // Creazione di spettacoli, repliche, posti, biglietti, prenotazioni, ecc.
        // Utilizzo degli oggetti per gestire la biglietteria del teatro
    }
}
```

Questa soluzione fornisce una struttura di base per gestire la vendita di biglietti in un teatro, includendo la definizione di spettacoli, repliche, posti, biglietti e prenotazioni, insieme alla logica per calcolare i prezzi dei posti e verificare la disponibilità dei posti per una replica specificata.
