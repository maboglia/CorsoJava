# Esercizi Java sui file

---

## Esercizio 1

Scrivere un programma Java per la gestione di un
archivio di persone e animali. Definire, in
particolare, la seguente gerarchia:

* Essere vivente (con attributo eta')
  * Animale (con nome)
  * Persona (con cognome, nome)
    * Studente (con matricola)
    * Lavoratore (con lavoro e stipendio)
  
---

## Esercizio 2

Scrivere un programma che visualizzi il contenuto di un file.

---

## Esercizio 3

Scrivere un programma che copi, byte dopo byte, un
file in un altro file.

---

## Esercizio 4

Scrivere un programma che crei un file di tipi
primitivi.

---

## Esercizio 5

Scrivere un programma che crei un file `temp.txt`, vi
scriva i caratteri "abcdef" e poi acceda a `temp.txt`
utilizzando un'istanza di RandomAccessFile, il
metodo seek() e il metodo readByte() per leggere
un byte alla volta.

---

## Esercizio 6 Archivio studenti

Alla fine dell’anno scolastico, il Preside desidera archiviare in una file gli esiti di fine anno degli
studenti della sua scuola. I dati da archiviare, per ogni studente sono:

```text
cognome studente
nome studente
classe
esito di fine anno: “P” per indicare che lo studente è stato promosso e “B” per indicare che lo studente è stato bocciato.
```

Scrivere i seguenti programmi:

1. Registrazione dei dati in un file sequenziale.

2. Leggendo tutti i record del file, visualizzare i dati immessi per gli studenti promossi, il numero di studenti promossi e non promossi e le rispettive percentuali sul numero totale di studenti.

---

## Esercizio no.1

Scrivi un programma che che legga dei numeri inseriti in un file di testo.
Se nel file di testo non vi è niente, il programma deve avvisare che il file è vuoto, se vi è un solo numero, questo numero deve essere stampato, se vi sono due numeri (disposti su due righe differenti) deve essere stampato il loro prodotto, se vi sono più di due numeri (disposti righe differenti) deve essere stampata la loro somma.

---

## Esercizio no.1:soluzione

Ecco un programma Java che legge i numeri da un file di testo e implementa le regole richieste:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeggiNumeriDaFile {
    public static void main(String[] args) {
        // Percorso del file di testo
        String nomeFile = "numeri.txt";

        try {
            // Apriamo il file per la lettura
            FileReader fileReader = new FileReader(nomeFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Variabili per tenere traccia del conteggio e della somma dei numeri
            int conteggio = 0;
            int somma = 0;
            int prodotto = 1;

            // Leggiamo il file riga per riga
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                // Incrementiamo il conteggio
                conteggio++;

                // Parsiamo la riga in un numero intero
                int numero = Integer.parseInt(linea);

                // Aggiungiamo il numero alla somma o al prodotto
                somma += numero;
                prodotto *= numero;
            }

            // Chiudiamo il bufferedReader
            bufferedReader.close();

            // Verifichiamo il conteggio e stampiamo il risultato appropriato
            if (conteggio == 0) {
                System.out.println("Il file è vuoto.");
            } else if (conteggio == 1) {
                System.out.println("Il numero nel file è: " + somma);
            } else if (conteggio == 2) {
                System.out.println("Il prodotto dei due numeri nel file è: " + prodotto);
            } else {
                System.out.println("La somma dei numeri nel file è: " + somma);
            }

        } catch (IOException e) {
            // Gestione dell'eccezione in caso di errore di lettura del file
            System.out.println("Si è verificato un errore durante la lettura del file.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            // Gestione dell'eccezione in caso di errore di parsing del numero
            System.out.println("Il file contiene un valore non numerico.");
            e.printStackTrace();
        }
    }
}
```

Assicurati di avere un file di testo chiamato "numeri.txt" nella stessa directory del programma Java, e inserisci i numeri desiderati in questo file seguendo le regole specificate.

---

## Esercizio no.2

Scrivi un programma che accetti in input due vettori di interi (A e B) di 5 posti ciascuno e scriva su disco la loro somma;
in seguito caricare il file salvato in un vettore T (avente la stessa dimensione dei due precedenti) e stamparlo a video.

---

## Esercizio no.2:soluzione

Ecco un programma Java che accetta in input due vettori di interi, calcola la loro somma, scrive la somma su disco in un file, quindi carica il file salvato in un vettore e lo stampa a video:

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SommaVettori {
    public static void main(String[] args) {
        // Definizione delle dimensioni dei vettori
        final int DIMENSIONE = 5;

        // Creazione dei vettori A e B
        int[] A = new int[DIMENSIONE];
        int[] B = new int[DIMENSIONE];

        // Lettura dei vettori A e B da input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci i valori del vettore A:");
        for (int i = 0; i < DIMENSIONE; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }
        System.out.println("Inserisci i valori del vettore B:");
        for (int i = 0; i < DIMENSIONE; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        // Calcolo della somma dei vettori A e B
        int[] T = new int[DIMENSIONE];
        for (int i = 0; i < DIMENSIONE; i++) {
            T[i] = A[i] + B[i];
        }

        // Scrittura della somma su disco
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("somma.txt"));
            for (int i = 0; i < DIMENSIONE; i++) {
                writer.write(Integer.toString(T[i]));
                writer.newLine();
            }
            writer.close();
            System.out.println("La somma è stata scritta sul file somma.txt.");
        } catch (IOException e) {
            System.out.println("Si è verificato un errore durante la scrittura su file.");
            e.printStackTrace();
        }

        // Caricamento della somma dal file
        try {
            Scanner fileScanner = new Scanner("somma.txt");
            System.out.println("Il contenuto del file somma.txt è:");
            for (int i = 0; i < DIMENSIONE; i++) {
                if (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("Si è verificato un errore durante la lettura dal file.");
            e.printStackTrace();
        }
    }
}
```

Assicurati di inserire i valori dei vettori A e B quando richiesto e controlla il file "somma.txt" per vedere i risultati della somma.

---

## Esercizio no.3

Scrivi un programma che sia in grado di leggere un file di testo nel quale siano contenute una serie di stringhe su più righe consecutive, ad es.

```text
alpha
bravo
charlie
delta
echo
foxtrot
```

lo stesso programma deve permettere di modificare una delle stringhe salvando successivamente sullo stesso file, il cambiamento.

---

## Esercizio no.3:soluzione


Ecco un programma Java che legge un file di testo contenente una serie di stringhe su righe consecutive, permette all'utente di modificare una delle stringhe e salva le modifiche nello stesso file:

```java
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ModificaFileTesto {

    public static void main(String[] args) {
        // Percorso del file di testo
        String percorsoFile = "test.txt";

        // Leggi le stringhe dal file
        ArrayList<String> stringhe = leggiFile(percorsoFile);

        // Stampa le stringhe lette
        System.out.println("Contenuto del file:");
        for (String s : stringhe) {
            System.out.println(s);
        }

        // Richiedi all'utente di scegliere quale stringa modificare
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nQuale stringa vuoi modificare? (Inserisci il numero di riga): ");
        int numeroRiga = scanner.nextInt();
        scanner.nextLine(); // Consuma il carattere di fine riga

        // Richiedi all'utente la nuova stringa
        System.out.print("Inserisci la nuova stringa: ");
        String nuovaStringa = scanner.nextLine();

        // Modifica la stringa nella lista
        if (numeroRiga >= 1 && numeroRiga <= stringhe.size()) {
            stringhe.set(numeroRiga - 1, nuovaStringa);

            // Scrivi le stringhe modificate sul file
            scriviFile(percorsoFile, stringhe);

            System.out.println("Stringa modificata con successo!");
        } else {
            System.out.println("Numero di riga non valido.");
        }
    }

    // Metodo per leggere le stringhe da un file di testo
    private static ArrayList<String> leggiFile(String percorso) {
        ArrayList<String> stringhe = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(percorso));
            String linea;
            while ((linea = reader.readLine()) != null) {
                stringhe.add(linea);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        }
        return stringhe;
    }

    // Metodo per scrivere le stringhe su un file di testo
    private static void scriviFile(String percorso, ArrayList<String> stringhe) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(percorso));
            for (String s : stringhe) {
                writer.write(s);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura sul file: " + e.getMessage());
        }
    }
}
```

Assicurati di inserire il percorso corretto del file di testo che desideri leggere e modificare. Una volta eseguito il programma, segui le istruzioni visualizzate per modificare una delle stringhe nel file di testo.

---


In un file viene memorizzato il magazzino di una azienda, secondo la notazione

```text
biella#7@5
ruota#3@8
stelo#2@9
```

prima del simbolo `#` vi è il nome del prodotto; fra il simbolo `#` e il simbolo `@` vi è il costo del prodotto; dopo il simbolo `@` vi è il quantitativo in pezzi di quel prodotto.
Il programma deve restituire il controvalore del magazzino .

---

## Esercizio no.5:soluzione

Ecco un programma Java che legge un file contenente informazioni sul magazzino di un'azienda e calcola il controvalore totale del magazzino:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalcolaControvaloreMagazzino {

    public static void main(String[] args) {
        // Percorso del file contenente le informazioni sul magazzino
        String percorsoFile = "magazzino.txt";

        // Calcola il controvalore del magazzino
        double controvalore = calcolaControvaloreMagazzino(percorsoFile);

        // Stampa il controvalore del magazzino
        System.out.println("Il controvalore del magazzino è: " + controvalore + " euro.");
    }

    // Metodo per calcolare il controvalore del magazzino
    private static double calcolaControvaloreMagazzino(String percorsoFile) {
        double controvaloreTotale = 0.0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(percorsoFile));
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Split della linea usando '#' e '@' come delimitatori
                String[] parti = linea.split("#|@");
                if (parti.length == 3) {
                    // Estrai il costo e il quantitativo dal file
                    double costo = Double.parseDouble(parti[1]);
                    int quantitativo = Integer.parseInt(parti[2]);
                    // Calcola il controvalore del prodotto e aggiungilo al controvalore totale
                    controvaloreTotale += costo * quantitativo;
                } else {
                    System.out.println("Formato non valido per la riga: " + linea);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Errore di conversione: " + e.getMessage());
        }
        return controvaloreTotale;
    }
}
```

Assicurati di sostituire `"magazzino.txt"` con il percorso effettivo del file contenente le informazioni sul magazzino. Una volta eseguito il programma, restituirà il controvalore totale del magazzino.

