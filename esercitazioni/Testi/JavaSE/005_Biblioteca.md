# Ecco il testo dell'esercitazione sull'Esercizio Biblioteca

---

# Esercizio Biblioteca

Realizzare un sistema software per la gestione di una biblioteca, composto dalle seguenti classi: `Libro`, `LibroPerBambini`, `Biblioteca`, e una classe di test.

## Classe Libro

La classe `Libro` rappresenta un libro generico e ha le seguenti variabili di istanza:

- `titolo`: il titolo del libro;
- `autore`: l'autore del libro;
- `inPrestito`: un booleano che indica se il libro è attualmente in prestito.

La classe `Libro` ha i seguenti metodi:

- `String getDescrizione()`: restituisce una stringa contenente il titolo e l'autore del libro;
- `boolean isInPrestito()`: restituisce true se il libro è in prestito, false altrimenti;
- `void setInPrestito(boolean stato)`: imposta lo stato del libro (in prestito o disponibile).

## Classe LibroPerBambini

La classe `LibroPerBambini` è una sottoclasse di `Libro` e aggiunge la variabile di istanza `etaConsigliata`, che rappresenta l'età consigliata per il libro.

Questa classe ridefinisce il metodo `getDescrizione()` per includere anche l'età consigliata.

## Classe Biblioteca

La classe `Biblioteca` gestisce la collezione di libri e ha una struttura dati di tipo `ArrayList<Libro>`. La classe `Biblioteca` ha i seguenti metodi:

- `void addLibro(Libro l)`: aggiunge un nuovo libro alla biblioteca;
- `boolean inBiblioteca(Libro l)`: verifica se un libro è presente nella biblioteca;
- `void prestato(Libro l)`: registra un prestito di un libro;
- `void restituito(Libro l)`: registra il ritorno di un libro;
- `int totInPrestito()`: conta il numero di libri in prestito;
- `boolean nessunPrestito()`: restituisce true se non ci sono libri in prestito;
- `int perBambini(int etaMax)`: conta quanti libri per bambini con un'età consigliata minore o uguale a `etaMax` sono presenti nella biblioteca.

## Gestione dell'eccezione

Il metodo `prestato(Libro l)` solleverà un'eccezione `EccezioneLibro` se il prestito non è possibile (il libro non è presente in biblioteca o è già in prestito).

## Classe di test

Implementare una classe di test `TestBiblioteca` che crei alcuni libri, una biblioteca e chiami tutti i metodi per verificare il corretto funzionamento del sistema.

---

Questo testo fornisce una descrizione dettagliata dei requisiti e delle classi da implementare per l'esercitazione sull'Esercizio Biblioteca.

## Esempio di soluzione

Ecco un'esercitazione sulla gestione di una biblioteca implementata in Java:

```java
import java.util.ArrayList;

class Libro {
    private String titolo;
    private String autore;
    private boolean inPrestito;

    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
        this.inPrestito = false;
    }

    public String getDescrizione() {
        return "Titolo: " + titolo + ", Autore: " + autore;
    }

    public boolean isInPrestito() {
        return inPrestito;
    }

    public void setInPrestito(boolean stato) {
        this.inPrestito = stato;
    }
}

class LibroPerBambini extends Libro {
    private int etaConsigliata;

    public LibroPerBambini(String titolo, String autore, int etaConsigliata) {
        super(titolo, autore);
        this.etaConsigliata = etaConsigliata;
    }

    @Override
    public String getDescrizione() {
        return super.getDescrizione() + ", Età consigliata: " + etaConsigliata;
    }
}

class Biblioteca {
    private ArrayList<Libro> collezione;

    public Biblioteca() {
        collezione = new ArrayList<>();
    }

    public void addLibro(Libro l) {
        collezione.add(l);
    }

    public boolean inBiblioteca(Libro l) {
        return collezione.contains(l);
    }

    public void prestato(Libro l) throws EccezioneLibro {
        if (!inBiblioteca(l)) {
            throw new EccezioneLibro("Il libro non è presente in biblioteca.");
        } else if (l.isInPrestito()) {
            throw new EccezioneLibro("Il libro è già in prestito.");
        } else {
            l.setInPrestito(true);
        }
    }

    public void restituito(Libro l) {
        l.setInPrestito(false);
    }

    public int totInPrestito() {
        int count = 0;
        for (Libro l : collezione) {
            if (l.isInPrestito()) {
                count++;
            }
        }
        return count;
    }

    public boolean nessunPrestito() {
        return totInPrestito() == 0;
    }

    public int perBambini(int etaMax) {
        int count = 0;
        for (Libro l : collezione) {
            if (l instanceof LibroPerBambini) {
                LibroPerBambini libroPerBambini = (LibroPerBambini) l;
                if (libroPerBambini.etaConsigliata <= etaMax) {
                    count++;
                }
            }
        }
        return count;
    }
}

class EccezioneLibro extends Exception {
    public EccezioneLibro(String message) {
        super(message);
    }
}

public class TestBiblioteca {
    public static void main(String[] args) {
        Libro libro = new Libro("Il signore degli anelli", "J.R.R. Tolkien");
        LibroPerBambini libroPerBambini = new LibroPerBambini("Le avventure di Pinocchio", "Carlo Collodi", 8);
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addLibro(libro);
        biblioteca.addLibro(libroPerBambini);

        try {
            biblioteca.prestato(libro);
            biblioteca.prestato(libroPerBambini);
            biblioteca.prestato(libroPerBambini); // Solleverà un'eccezione
        } catch (EccezioneLibro e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
```

In questo esempio, abbiamo definito le classi `Libro`, `LibroPerBambini` e `Biblioteca` per gestire una biblioteca. Abbiamo anche implementato una classe di test `TestBiblioteca` per verificare il funzionamento delle classi implementate.
