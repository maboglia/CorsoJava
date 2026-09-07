# Esercitazione – Quiz di inglese Web

## Obiettivo

Trasformare l'applicazione Java del **Quiz di inglese** in una applicazione web accessibile tramite browser.

L'applicazione dovrà permettere all'utente di consultare un archivio di vocaboli inglesi attraverso una semplice interfaccia web e di visualizzare casualmente le relative informazioni.

Il progetto dovrà essere realizzato utilizzando:

* Java;
* Servlet;
* JSP;
* JavaBean / classi Java per la gestione dei dati;
* `ArrayList`;
* lettura di file;
* richieste HTTP;
* HTML;
* CSS;
* Bootstrap.

L'obiettivo è separare la **logica dell'applicazione** dalla **presentazione delle pagine web**.

---

# 1. Archivio dei vocaboli

L'applicazione deve utilizzare un file di testo contenente un archivio di vocaboli inglesi.

Ogni riga del file contiene, separati dal carattere TAB:

1. identificativo;
2. parola inglese;
3. traduzione italiana;
4. frase di esempio in inglese;
5. traduzione italiana della frase.

Il file contiene una prima riga di intestazione.

Esempio:

```text
1    mountain    montagna    I live near the mountain.    Vivo vicino alla montagna.
2    house       casa        This is my house.            Questa è la mia casa.
```

Il file deve essere inserito tra le risorse dell'applicazione web.

---

# 2. Classe `Definizione`

Creare una classe Java che rappresenti una voce dell'archivio.

La classe deve contenere almeno:

* `id`;
* `parola`;
* `traduzione`;
* `fraseEng`;
* `fraseIta`.

Prevedere:

* costruttore;
* getter;
* setter, se necessari;
* `toString()`.

La classe deve rappresentare esclusivamente i dati e non deve contenere codice HTML o JSP.

---

# 3. Gestione del file

Realizzare una componente Java incaricata di leggere il file dei vocaboli.

La componente deve:

1. aprire il file;
2. leggere le righe;
3. ignorare l'intestazione;
4. suddividere i campi;
5. creare gli oggetti `Definizione`;
6. memorizzarli in una `ArrayList`.

Gestire correttamente eventuali errori di lettura.

Prestare particolare attenzione al fatto che un'applicazione web viene eseguita all'interno di un **application server** e che il file deve essere recuperato correttamente dalle risorse dell'applicazione.

---

# 4. Controller dell'applicazione

Realizzare una classe responsabile della gestione dell'archivio.

Il controller deve permettere almeno di:

* caricare il dizionario;
* conoscere il numero di vocaboli disponibili;
* estrarre una definizione casuale;
* restituire una definizione specifica.

La logica di estrazione casuale deve rimanere nel livello Java e non nella pagina JSP.

---

# 5. Servlet

Creare una Servlet che rappresenti il punto di ingresso dell'applicazione.

La Servlet deve:

* ricevere le richieste provenienti dal browser;
* utilizzare il controller;
* recuperare una definizione casuale;
* inserire la definizione nella richiesta;
* inoltrare la richiesta a una pagina JSP.

Utilizzare opportunamente:

* `HttpServlet`;
* `HttpServletRequest`;
* `HttpServletResponse`;
* `RequestDispatcher`.

---

# 6. Pagina principale

Realizzare una pagina iniziale che presenti l'applicazione.

La pagina deve contenere almeno:

* titolo dell'applicazione;
* breve descrizione;
* pulsante o link per iniziare;
* eventuali informazioni sulle modalità disponibili.

Esempio:

```text
---------------------------------------
             ENGLISH QUIZ
---------------------------------------

Studia e migliora il tuo inglese
attraverso vocaboli e frasi di esempio.

              [ INIZIA ]
```

Il pulsante deve effettuare una richiesta alla Servlet.

---

# 7. Visualizzazione delle flashcard

Creare una pagina JSP dedicata alla visualizzazione di una definizione.

La pagina deve mostrare:

* parola inglese;
* traduzione italiana;
* frase in inglese;
* traduzione italiana della frase.

La definizione deve essere ricevuta dalla Servlet tramite gli attributi della `HttpServletRequest`.

La JSP deve occuparsi principalmente della **presentazione** dei dati.

Evitare di inserire nella JSP la logica necessaria per leggere il file o estrarre casualmente i vocaboli.

---

# 8. Layout grafico

Utilizzare **Bootstrap** per realizzare un'interfaccia gradevole e responsive.

Le flashcard dovranno essere organizzate utilizzando opportunamente:

* container;
* righe e colonne;
* card;
* pulsanti;
* tipografia;
* margini e spaziature.

L'applicazione deve essere utilizzabile sia da computer sia da dispositivi mobili.

---

# 9. Navigazione

L'applicazione deve permettere all'utente di spostarsi tra le diverse funzionalità.

Prevedere almeno:

* **Home**
* **Studia**
* **Nuova parola**

La navigazione deve essere realizzata attraverso normali richieste HTTP verso le risorse dell'applicazione.

---

# 10. Più flashcard

Modificare l'applicazione in modo che una richiesta possa visualizzare più vocaboli.

Ad esempio, la pagina di studio può mostrare contemporaneamente **tre flashcard casuali**.

Ogni card deve contenere:

* parola;
* traduzione;
* frase inglese;
* frase italiana.

Le card devono essere generate dinamicamente utilizzando i dati caricati dall'archivio.

---

# 11. Modalità quiz

Trasformare successivamente l'applicazione in un vero e proprio quiz.

La pagina web deve mostrare una parola inglese e un campo nel quale l'utente può inserire la traduzione.

Esempio:

```text
              QUIZ

             mountain

Qual è la traduzione?

[________________________]

             [VERIFICA]
```

Alla pressione del pulsante, il browser deve inviare una richiesta al server.

La Servlet deve:

1. recuperare la risposta dell'utente;
2. recuperare la soluzione;
3. confrontare le due stringhe;
4. determinare se la risposta è corretta;
5. restituire una pagina con il risultato.

---

# 12. Gestione delle sessioni

Utilizzare la **sessione HTTP** per mantenere le informazioni relative alla partita dell'utente.

Memorizzare almeno:

* numero di domande;
* risposte corrette;
* risposte errate;
* punteggio.

In questo modo le informazioni devono essere mantenute anche tra richieste HTTP successive.

---

# 13. Risultato della partita

Prevedere una pagina finale con il riepilogo della partita.

Visualizzare:

```text
---------------------------------------
          RISULTATO DEL QUIZ
---------------------------------------

Domande:        10
Risposte esatte: 8
Risposte errate: 2
Percentuale:    80%

              [NUOVA PARTITA]
```

Il risultato deve essere calcolato lato server.

---

# 14. Gestione delle richieste

L'applicazione deve distinguere le diverse operazioni richieste dall'utente.

È possibile, ad esempio, utilizzare parametri HTTP come:

```text
/studia?action=next
/studia?action=check
/studia?action=restart
```

oppure progettare una struttura equivalente.

La Servlet dovrà interpretare la richiesta e richiamare il metodo appropriato del controller.

---

# 15. Separazione delle responsabilità

Il progetto deve mantenere una chiara separazione tra:

### Model

Rappresenta i dati dell'applicazione.

Esempio:

```text
Definizione
```

### Controller

Gestisce la logica dell'applicazione.

Esempio:

```text
CardController
```

### Servlet

Gestisce le richieste HTTP e coordina controller e pagine JSP.

### View

Le pagine JSP si occupano della presentazione dei dati attraverso HTML e Bootstrap.

La JSP **non deve leggere direttamente il file dei vocaboli** e non deve occuparsi della generazione casuale delle definizioni.

---

# 16. Struttura del progetto

Organizzare il progetto secondo una struttura simile alla seguente:

```text
src/
└── main/
    ├── java/
    │   ├── controller/
    │   │   ├── CardController.java
    │   │   └── Router.java
    │   │
    │   ├── model/
    │   │   └── Definizione.java
    │   │
    │   └── util/
    │       └── LeggiScriviFile.java
    │
    └── webapp/
        ├── index.jsp
        ├── header.jsp
        ├── footer.jsp
        ├── card.jsp
        │
        └── files/
            └── dict-ita-eng.tsv
```

La struttura può essere modificata purché siano mantenute separate le responsabilità dei diversi componenti.

---

# 17. Gestione degli errori

L'applicazione deve gestire almeno:

* file non disponibile;
* archivio vuoto;
* richiesta non valida;
* risposta dell'utente vuota;
* parametro HTTP mancante o non riconosciuto.

In caso di errore, mostrare una pagina o un messaggio comprensibile all'utente.

Evitare di mostrare all'utente lo stack trace dell'eccezione.

---

# 18. Sicurezza e validazione

I dati ricevuti dal browser devono essere considerati **input non attendibile**.

Validare quindi:

* parametri delle richieste;
* risposte inserite dall'utente;
* valori numerici;
* eventuali identificativi delle definizioni.

Evitare di inserire direttamente dati provenienti dall'utente all'interno dell'HTML senza una corretta gestione dell'output.

---

# 19. Funzionalità opzionali

Per rendere il progetto più completo è possibile aggiungere:

### Modalità italiano → inglese

L'utente deve tradurre una parola italiana in inglese.

### Livelli di difficoltà

Prevedere più livelli di difficoltà.

### Numero di domande

Permettere all'utente di scegliere il numero di domande della partita.

### Parole non ripetute

Evitare di proporre due volte lo stesso vocabolo durante una partita.

### Classifica

Salvare i migliori risultati e visualizzare una classifica.

### Login

Permettere agli utenti di identificarsi e associare i risultati al proprio account.

### Database

Sostituire il file `.tsv` con un database relazionale.

In questo caso creare le opportune classi DAO e utilizzare JDBC per l'accesso ai dati.

### CSS personalizzato

Aggiungere uno stile grafico personalizzato oltre a Bootstrap.

---

# 20. Requisiti tecnici

Il progetto deve essere realizzato utilizzando:

* Java;
* Servlet;
* JSP;
* HTML;
* CSS;
* Bootstrap;
* `ArrayList`;
* gestione dei file;
* gestione delle eccezioni;
* richieste HTTP;
* sessioni HTTP.

L'applicazione deve essere eseguita all'interno di un **server web Java / application server** compatibile con le Servlet.

---

# Consegna

Consegnare il progetto completo contenente:

1. codice Java;
2. Servlet;
3. pagine JSP;
4. file del dizionario;
5. eventuali file CSS e immagini;
6. configurazione necessaria all'esecuzione;
7. eventuali risorse aggiuntive.

Allegare inoltre una breve relazione nella quale descrivere:

* architettura dell'applicazione;
* responsabilità delle principali classi;
* funzionamento delle Servlet;
* funzionamento delle JSP;
* gestione delle richieste HTTP;
* gestione della sessione;
* modalità di caricamento del dizionario;
* eventuali funzionalità aggiuntive.

## Obiettivo finale

Realizzare una **web application Java completa** nella quale il browser rappresenti l'interfaccia dell'utente, mentre Servlet e classi Java gestiscano la logica dell'applicazione.

L'utente deve poter accedere al sito, consultare le flashcard, avviare un quiz, rispondere alle domande e visualizzare il risultato della propria partita.
