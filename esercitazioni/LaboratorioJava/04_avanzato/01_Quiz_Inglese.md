# Esercitazione – Quiz di inglese

## Obiettivo

Realizzare un'applicazione Java che permetta di esercitarsi con la traduzione di vocaboli inglesi attraverso un semplice sistema di **flashcard**.

Il programma dovrà leggere le informazioni relative ai vocaboli da un file di testo e presentare casualmente le parole all'utente.

L'esercitazione ha lo scopo di mettere in pratica:

* programmazione a oggetti;
* gestione di `ArrayList`;
* lettura di file di testo;
* gestione delle stringhe;
* generazione di valori casuali;
* organizzazione del progetto in più classi;
* realizzazione di una semplice interfaccia grafica con **Java Swing**.

---

## 1. Archivio dei vocaboli

L'applicazione deve utilizzare un file di testo contenente un elenco di vocaboli inglesi.

Ogni riga del file contiene le informazioni relative a un vocabolo, separate dal carattere **TAB**:

```text
numero    vocabolo inglese    traduzione italiana    frase inglese    traduzione della frase
```

Il file contiene anche una prima riga di intestazione.

Ad esempio:

```text
1    the    il, lo, la, i, gli, le    The cat is on the table    Il gatto è sul tavolo
```

Il programma deve leggere il file all'avvio e trasformare ogni riga in un oggetto che rappresenti una definizione.

---

## 2. Classe per la definizione

Creare una classe che rappresenti un vocabolo inglese.

Ogni oggetto deve contenere almeno:

* un identificativo numerico;
* il vocabolo inglese;
* la traduzione italiana;
* una frase di esempio in inglese;
* la traduzione italiana della frase.

Prevedere:

* un costruttore completo;
* metodi getter e setter;
* un metodo `toString()` che restituisca una rappresentazione leggibile della definizione.

La rappresentazione dovrà permettere di visualizzare chiaramente tutte le informazioni disponibili.

---

## 3. Lettura del file

Creare una componente dell'applicazione incaricata di leggere il file.

La lettura deve:

1. aprire il file;
2. leggere tutte le righe;
3. ignorare la riga di intestazione;
4. separare i diversi campi di ogni riga;
5. creare un oggetto per ogni vocabolo;
6. memorizzare tutti gli oggetti in una collezione.

Gestire anche il caso in cui il file non venga trovato.

---

## 4. Gestione dell'archivio

Creare una classe responsabile della gestione dell'insieme dei vocaboli.

La classe deve permettere almeno di:

* caricare i vocaboli dal file;
* mantenere l'elenco delle definizioni;
* ottenere una definizione casuale.

La scelta casuale deve essere effettuata utilizzando le classi Java per la generazione di numeri casuali.

Ogni volta che viene richiesta una nuova flashcard, il programma deve poter selezionare un vocabolo diverso in modo casuale.

---

## 5. Versione da console

Realizzare una prima versione dell'applicazione utilizzando la console.

All'avvio il programma deve caricare l'archivio dei vocaboli e successivamente mostrare una flashcard casuale.

Dopo ogni visualizzazione l'utente deve poter scegliere se:

* visualizzare una nuova flashcard;
* terminare il programma.

Esempio di interazione:

```text
--------------------------------
        QUIZ DI INGLESE
--------------------------------

Parola: mountain
Traduzione: montagna

Frase:
I live near the mountain.

Traduzione:
Vivo vicino alla montagna.

Premi INVIO per una nuova parola
Digita 0 per terminare:
```

Quando l'utente sceglie di terminare, visualizzare un messaggio di fine gioco.

---

# 6. Versione grafica

Realizzare successivamente una versione grafica dell'applicazione utilizzando **Java Swing**.

La finestra dovrà contenere almeno:

* un titolo;
* un pulsante per estrarre una nuova flashcard;
* un'area nella quale visualizzare le informazioni relative al vocabolo.

Ad ogni pressione del pulsante dovrà essere estratto casualmente un nuovo vocabolo.

La scheda visualizzata deve contenere:

* vocabolo inglese;
* traduzione italiana;
* frase inglese;
* traduzione italiana.

L'interfaccia dovrà essere sufficientemente leggibile e organizzata.

---

# 7. Modalità quiz

Estendere l'applicazione trasformando la semplice flashcard in un vero e proprio quiz.

Quando viene estratto un vocabolo, mostrare soltanto la parola inglese e chiedere all'utente di inserire la traduzione.

Il programma dovrà verificare la risposta e comunicare se è corretta.

Esempio:

```text
Parola: mountain

Qual è la traduzione?
> montagna

CORRETTO!
```

In caso di risposta errata, mostrare la soluzione corretta.

---

# 8. Punteggio

Aggiungere un sistema di punteggio.

Il programma deve tenere traccia almeno di:

* numero di domande proposte;
* numero di risposte corrette;
* numero di risposte errate;
* percentuale di risposte corrette.

Al termine della partita visualizzare un riepilogo.

Esempio:

```text
--------------------------------
         RISULTATO FINALE
--------------------------------

Domande:       10
Corrette:       8
Errate:         2
Percentuale:   80%

Bravo!
```

---

# 9. Modalità di gioco

Prevedere la possibilità di scegliere tra almeno due modalità:

### Modalità 1 – Inglese → Italiano

Viene mostrata una parola inglese e l'utente deve inserire la traduzione italiana.

### Modalità 2 – Italiano → Inglese

Viene mostrata la traduzione italiana e l'utente deve inserire il vocabolo inglese.

La modalità deve essere scelta all'inizio della partita.

---

# 10. Miglioramenti opzionali

Per rendere il progetto più completo è possibile aggiungere ulteriori funzionalità, ad esempio:

* numero di domande configurabile;
* livelli di difficoltà;
* esclusione delle parole già utilizzate nella stessa partita;
* cronometro per ogni domanda;
* classifica dei risultati;
* possibilità di ricominciare una partita;
* scelta casuale tra diversi tipi di domanda;
* utilizzo della frase di esempio come aiuto;
* interfaccia grafica completa;
* visualizzazione grafica del punteggio;
* salvataggio dei risultati su file.

---

## Requisiti tecnici

Il progetto deve essere organizzato in più classi, assegnando a ciascuna classe una responsabilità precisa.

Evitare di inserire tutta la logica all'interno del metodo `main()`.

Utilizzare, dove opportuno:

* classi e oggetti;
* costruttori;
* incapsulamento;
* `ArrayList`;
* `String` e relativi metodi;
* `Random`;
* `Scanner`;
* gestione dei file;
* gestione delle eccezioni;
* Java Swing per la versione grafica.

---

## Consegna

Consegnare il progetto Java completo, comprensivo di:

1. codice sorgente;
2. file contenente l'archivio dei vocaboli;
3. eventuali risorse aggiuntive;
4. una breve relazione che descriva:

   * struttura del progetto;
   * classi realizzate;
   * funzionamento dell'applicazione;
   * principali scelte progettuali;
   * eventuali funzionalità aggiuntive implementate.

