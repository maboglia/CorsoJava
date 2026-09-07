# Esercitazione – Quiz di inglese con interfaccia grafica Swing

## Obiettivo

Realizzare un'applicazione Java che permetta di esercitarsi con la traduzione di vocaboli inglesi attraverso una **interfaccia grafica realizzata con Java Swing**.

L'applicazione deve utilizzare un archivio di vocaboli contenuto in un file di testo e presentare all'utente, in modo casuale, una serie di parole inglesi da tradurre.

Il progetto deve essere organizzato secondo una struttura a più livelli, separando:

* **modello dei dati**;
* **gestione dei dati e della logica dell'applicazione**;
* **interfaccia grafica**.

---

# 1. Archivio dei vocaboli

Utilizzare un file di testo contenente un elenco di vocaboli inglesi.

Ogni riga contiene, separati dal carattere **TAB**:

1. identificativo numerico;
2. parola inglese;
3. traduzione italiana;
4. frase di esempio in inglese;
5. traduzione italiana della frase.

Il file contiene una prima riga di intestazione che non deve essere interpretata come un vocabolo.

Esempio:

```text
1    mountain    montagna    I live near the mountain.    Vivo vicino alla montagna.
2    house       casa        This is my house.            Questa è la mia casa.
```

Il file deve essere inserito nel progetto in una cartella dedicata alle risorse.

---

# 2. Classe `Definizione`

Creare una classe che rappresenti un vocabolo dell'archivio.

Ogni oggetto deve contenere:

* identificativo;
* parola inglese;
* traduzione italiana;
* frase inglese;
* traduzione italiana della frase.

Prevedere:

* costruttore;
* metodi getter;
* eventuali setter;
* metodo `toString()`.

La classe deve occuparsi esclusivamente della rappresentazione dei dati e non deve contenere codice relativo all'interfaccia grafica.

---

# 3. Lettura del file

Realizzare una classe o un componente dedicato alla lettura del file.

Il programma deve:

1. aprire il file;
2. leggere tutte le righe;
3. ignorare l'intestazione;
4. separare i campi utilizzando il carattere TAB;
5. creare un oggetto `Definizione` per ogni vocabolo;
6. memorizzare gli oggetti in una `ArrayList`.

Gestire correttamente il caso in cui il file non sia disponibile.

---

# 4. Controller

Realizzare una classe controller che gestisca l'archivio dei vocaboli.

Il controller deve almeno permettere di:

* caricare il dizionario;
* ottenere il numero di vocaboli disponibili;
* estrarre casualmente una definizione;
* restituire la definizione estratta.

La scelta del vocabolo deve essere casuale.

Il controller **non deve occuparsi direttamente della grafica**.

---

# 5. Creazione dell'interfaccia grafica

Realizzare una finestra principale utilizzando **Java Swing**.

La finestra deve contenere almeno:

* un titolo;
* un'area per visualizzare la parola inglese;
* un pulsante per estrarre una nuova parola;
* un'area per visualizzare la traduzione;
* un'area per visualizzare la frase di esempio;
* un pulsante o un comando per terminare l'applicazione.

Organizzare i componenti utilizzando opportunamente i layout manager di Swing.

Non utilizzare coordinate assolute per posizionare i componenti.

---

# 6. Modalità flashcard

All'avvio dell'applicazione deve essere estratto un vocabolo casuale.

L'interfaccia deve inizialmente mostrare la **parola inglese**, mentre la traduzione e le altre informazioni possono essere nascoste o non ancora visualizzate.

L'utente deve poter premere un pulsante, ad esempio:

**"Mostra soluzione"**

per visualizzare:

* traduzione italiana;
* frase inglese;
* traduzione italiana della frase.

Un secondo pulsante:

**"Nuova parola"**

deve estrarre un nuovo vocabolo casuale.

---

# 7. Modalità quiz

Estendere l'applicazione trasformandola in un vero e proprio quiz.

Per ogni domanda:

1. viene estratta casualmente una parola inglese;
2. la parola viene visualizzata nella finestra;
3. l'utente inserisce la traduzione in un campo di testo;
4. l'utente preme il pulsante **"Verifica"**;
5. il programma controlla la risposta;
6. viene comunicato all'utente se la risposta è corretta.

Esempio:

```text
-----------------------------------------
              ENGLISH QUIZ
-----------------------------------------

          MOUNTAIN

Inserisci la traduzione:

[________________________]

             [VERIFICA]
```

Dopo la verifica, visualizzare un messaggio appropriato.

---

# 8. Gestione delle risposte

Il confronto tra la risposta dell'utente e la soluzione deve essere effettuato in modo da non considerare significative:

* maiuscole e minuscole;
* eventuali spazi iniziali o finali.

Ad esempio, le risposte:

```text
mountain
Mountain
 MOUNTAIN
```

devono essere considerate equivalenti.

Nel caso in cui una parola abbia più traduzioni valide, prevedere la possibilità di accettare una delle traduzioni presenti nell'archivio.

---

# 9. Punteggio

L'applicazione deve tenere traccia dell'andamento della partita.

Visualizzare almeno:

* numero di domande;
* risposte corrette;
* risposte errate;
* percentuale di risposte corrette.

Il punteggio deve essere aggiornato dopo ogni risposta.

Esempio:

```text
Domande: 8
Corrette: 6
Errate: 2
Percentuale: 75%
```

---

# 10. Nuova domanda

Dopo aver verificato una risposta, l'utente deve poter passare alla domanda successiva attraverso un pulsante.

Quando viene caricata una nuova domanda:

* deve essere estratto un nuovo vocabolo;
* il campo della risposta deve essere svuotato;
* il messaggio relativo alla risposta precedente deve essere eliminato;
* la soluzione non deve essere immediatamente visibile;
* il contatore delle domande deve essere aggiornato.

---

# 11. Fine della partita

Prevedere un pulsante **"Fine partita"**.

Alla pressione del pulsante, l'applicazione deve mostrare un riepilogo contenente:

* numero totale di domande;
* risposte corrette;
* risposte errate;
* percentuale di successo.

L'utente deve poter scegliere se:

* iniziare una nuova partita;
* chiudere l'applicazione.

---

# 12. Numero di domande

Aggiungere la possibilità di scegliere il numero di domande della partita.

Ad esempio:

```text
Numero di domande:

( ) 5
( ) 10
( ) 20
( ) 30
```

In alternativa è possibile utilizzare una `JComboBox`.

Quando vengono raggiunte le domande previste, la partita deve terminare automaticamente e deve essere mostrato il risultato finale.

---

# 13. Organizzazione del progetto

Il progetto deve essere organizzato in package coerenti.

Una possibile organizzazione è:

```text
src/
├── model/
│   └── Definizione.java
│
├── controller/
│   └── CardController.java
│
├── util/
│   └── LeggiScriviFile.java
│
└── view/
    └── FinestraQuiz.java

files/
└── dict-ita-eng.tsv
```

La struttura può essere modificata purché siano mantenute separate le responsabilità delle diverse componenti.

In particolare:

* il **model** rappresenta i dati;
* il **controller** gestisce dati e logica;
* la **view** gestisce esclusivamente l'interfaccia grafica.

---

# 14. Eventi e listener

Gestire le interazioni dell'utente attraverso gli eventi di Swing.

Prevedere opportuni listener per almeno:

* pulsante "Nuova parola";
* pulsante "Verifica";
* pulsante "Fine partita";
* eventuali controlli relativi alla scelta del numero di domande.

La logica associata agli eventi deve essere mantenuta il più possibile separata dalla costruzione dell'interfaccia.

---

# 15. Gestione degli errori

L'applicazione deve gestire correttamente situazioni anomale, ad esempio:

* file del dizionario non trovato;
* file vuoto;
* archivio senza vocaboli validi;
* campo della risposta lasciato vuoto;
* numero di domande non valido.

In presenza di un errore, utilizzare messaggi grafici appropriati, ad esempio tramite `JOptionPane`.

Il programma non deve terminare inaspettatamente a causa di un input non valido.

---

# 16. Requisiti tecnici

Utilizzare:

* Java;
* programmazione a oggetti;
* `ArrayList`;
* gestione dei file;
* `Random`;
* `String`;
* eccezioni;
* Java Swing;
* listener ed eventi;
* layout manager.

L'applicazione deve essere composta da più classi.

Evitare di concentrare tutta la logica nel metodo `main()`.

---

# 17. Funzionalità opzionali

Per rendere il progetto più completo è possibile aggiungere ulteriori funzionalità.

### Modalità italiano → inglese

Permettere di scegliere se:

* tradurre dall'inglese all'italiano;
* tradurre dall'italiano all'inglese.

### Parole già utilizzate

Evitare di proporre due volte la stessa parola durante una partita.

### Livelli di difficoltà

Prevedere diversi livelli, ad esempio:

* **Facile** – visualizzazione di alcuni suggerimenti;
* **Medio** – nessun suggerimento;
* **Difficile** – tempo limitato per rispondere.

### Timer

Aggiungere un conto alla rovescia per ogni domanda.

### Statistiche

Visualizzare, al termine della partita:

* percentuale di successo;
* numero massimo di risposte consecutive corrette;
* tempo medio per risposta;
* numero di domande risposte entro il tempo limite.

### Miglioramento dell'interfaccia

Personalizzare l'interfaccia utilizzando:

* colori;
* font;
* icone;
* pannelli;
* immagini;
* barra di avanzamento della partita.

---

# Consegna

Consegnare il progetto Java completo, comprensivo di:

1. codice sorgente;
2. file del dizionario;
3. interfaccia grafica funzionante;
4. organizzazione in package;
5. eventuali risorse grafiche utilizzate;
6. breve relazione descrittiva.

La relazione deve illustrare:

* struttura del progetto;
* responsabilità delle principali classi;
* funzionamento dell'interfaccia;
* gestione degli eventi;
* modalità di caricamento del dizionario;
* gestione del punteggio;
* eventuali funzionalità aggiuntive.

## Obiettivo finale

Il risultato deve essere un'applicazione desktop Java completa nella quale l'utente possa avviare una partita, rispondere alle domande attraverso una **GUI Swing**, ricevere immediatamente il risultato delle proprie risposte e visualizzare il proprio punteggio finale.

Questa la terrei come **esercitazione separata e successiva** rispetto alla versione console: in questo modo puoi far sviluppare prima la logica del quiz e poi chiedere agli studenti di trasformarla in un'applicazione Swing, lavorando sulla separazione **Model → Controller → View**.