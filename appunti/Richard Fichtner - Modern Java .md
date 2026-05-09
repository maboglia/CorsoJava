# Riassunto del talk di Richard Fichtner How to (Re)start Your Java Journey in 2026

Presented by Richard Fichtner (XDEV Software GmbH) at JavaOne 2026 (CA, March 2026).

[Video del talk (1h)](https://www.youtube.com/watch?v=38LLdQtxdhI)

### Di cosa si tratta

Riassunto di un talk tecnico tenuto da **Richard Fichtner**, un consulente Java tedesco con oltre 20 anni di esperienza, a una conferenza . Il titolo implicito è qualcosa come **"Java nel mondo moderno: come tornare a Java o aggiornarsi"**.

---

### Temi principali (con traduzione dei concetti chiave)

**1. Il problema della scelta in Java**
Java offre troppa abbondanza: Maven, Gradle, Ant per i build; Spring Boot, Quarkus, Micronaut, Helidon per i framework; decine di distribuzioni OpenJDK. Questo spaventa chi inizia, ma secondo Richard Fichtner è anche fonte di innovazione e competizione sana.

**2. GraalVM e Native Image**
Permette di compilare Java in un eseguibile nativo (come un programma C), con avvio rapidissimo e basso consumo di RAM — ideale per funzioni serverless o tool da riga di comando, senza cambiare il codice sorgente.

**3. Evoluzione di Java: rilasci ogni 6 mesi**
Dopo anni di rilasci lenti, ora Java pubblica una versione ogni 6 mesi e un LTS ogni 2 anni. Java 26 è stato annunciato il giorno stesso del talk. Richard Fichtner incoraggia a testare le versioni preview e dare feedback.

**4. Hello World senza compilazione esplicita**
Da Java 25, è possibile eseguire un programma Java direttamente (`java MioFile.java`) senza compilarlo prima — avvicinando Java agli script bash e rendendolo più accessibile per chi insegna o automatizza.

**5. Virtual Threads (Java 21+) — il punto più enfatizzato**
I Virtual Thread permettono di scrivere codice ad alte prestazioni senza programmazione reattiva (Mono, Flux, ecc.), che Richard Fichtner definisce difficile da debuggare e da capire. Il JVM gestisce automaticamente la sospensione dei thread in attesa di I/O. La migrazione richiede cambiare pochissime righe di codice e può portare **20-30% di miglioramento delle prestazioni**.

**6. OpenRewrite — migrazione automatica del codice**
Tool che permette di aggiornare automaticamente il codice sorgente in modo deterministico (non tramite AI): migrazione da JUnit 4 a 5, da Java 8 a 17/25, da Spring Boot 2 a 3/4, addirittura da un framework all'altro (es. da Spring Boot a Helidon). Usa una rappresentazione del codice più ricca di un AST tradizionale, preservando anche la formattazione.

**7. Java e AI**
Due framework principali per chiamare modelli AI da Java: **Spring AI** e **LangChain4j**. Per applicazioni RAG (retrieval-augmented generation) esiste **Eclipse Store** con ricerca vettoriale in memoria. Per il training di modelli LLM in Java esiste **Deep Netts** — senza Python.

**8. Developer Joy — il flusso di lavoro**
Richard Fichtner vuole che Java sia piacevole come PHP anni '90: salvi il file e vedi il risultato subito. Strumenti come **Vaadin** (UI web in Java puro), **Quarkus/Spring Boot dev mode** e **JetBrains Runtime** (hot swap avanzato) vanno in questa direzione.

**9. Il fattore umano — il punto finale e più importante**

- I senior developer sono più resistenti al cambiamento dei junior, perché hanno "visto le cose andare storte".
- I sistemi legacy sono sistemi **sopravvissuti**, da rispettare, non da buttare via.
- Non serve "bruciare la casa per rifarsi la cucina": si può modernizzare gradualmente.
- Bisogna dare agli sviluppatori un **safe space** per sperimentare, build veloci, ambienti locali funzionanti.
- Consiglia di frequentare **Java User Groups (JUG)** — presenti in tutto il mondo, aperti a studenti, insegnanti, professionisti.

---

### Citazione chiave

> *"Nessun sistema nasce legacy. Lo diventa sopravvivendo."*

---

### In sintesi

Il messaggio centrale del talk è: **Java moderno è molto diverso da Java 8**, e la maggior parte delle lamentele dei "Java haters" sono obsolete. Con Virtual Threads, OpenRewrite, GraalVM, rilasci frequenti e un ecosistema AI maturo, Java è oggi una scelta solida, produttiva e longeva — ma bisogna fare il salto a Java 21+ e aggiornarsi continuamente, anche attraverso la comunità.

---

## GraalVM e Native Image — Spiegazione approfondita

### Cos'è GraalVM

GraalVM è una distribuzione del JDK sviluppata da Oracle, gratuita, che include tutto ciò che ha un normale JDK **più alcune funzionalità extra**. La più importante è **Native Image**.

---

### Il problema che risolve

Normalmente, quando esegui un programma Java, succede questo:

```
Codice sorgente (.java)
        ↓  [compilazione]
    Bytecode (.class)
        ↓  [a runtime]
       JVM
        ↓  [JIT compiler, al volo]
   Codice nativo (eseguito dalla CPU)
```

La JVM è una macchina potentissima ma **pesante**:

- impiega tempo ad avviarsi (warm-up)
- consuma RAM anche prima di fare qualcosa di utile
- include il JIT compiler, il garbage collector, agenti di monitoring, reflection, ecc.

Per applicazioni enterprise che girano 24/7, questo è irrilevante. Ma per certi casi d'uso, è un problema serio.

---

### Cosa fa Native Image

GraalVM aggiunge un passaggio di compilazione **anticipata (Ahead-of-Time, AOT)**:

```
Codice sorgente (.java)
        ↓  [compilazione normale]
    Bytecode (.class)
        ↓  [Native Image — build time, può durare minuti]
  Eseguibile nativo (binario per Linux/Mac/Windows)
```

Il risultato è un **file binario autonomo**, come un programma scritto in C o Go, che:

- **non richiede una JVM installata** sulla macchina di destinazione
- si avvia in **millisecondi** invece che in secondi
- consuma **molto meno RAM** a freddo
- ha una dimensione contenuta

---

### Esempio concreto

Immagina una funzione AWS Lambda che risponde a una richiesta HTTP. Con Java tradizionale:

| | Java classico | Native Image |
|---|---|---|
| Avvio | 2–5 secondi | 50–100 ms |
| RAM minima | ~200 MB | ~30–50 MB |
| JVM richiesta | Sì | No |

Per una Lambda che viene invocata raramente, il "cold start" di 5 secondi è inaccettabile. Con Native Image, il problema sparisce.

---

### Il trucco: la closed-world assumption

Native Image funziona analizzando **tutto il codice a compile time** — il tuo codice, le librerie, il JDK stesso — e include nell'eseguibile solo ciò che viene effettivamente usato. Questo processo si chiama **analisi di raggiungibilità**.

Il problema è che Java ha funzionalità **dinamiche** che GraalVM non riesce ad analizzare staticamente:

- **Reflection** (`Class.forName("com.esempio.Foo")` — quale classe viene caricata? Dipende da una stringa a runtime)
- **Dynamic proxies**
- **Serializzazione**
- **Risorse caricate da classpath a runtime**

Per questi casi bisogna fornire dei **file di configurazione** che dicono a GraalVM cosa includere comunque. I framework moderni come Quarkus, Micronaut e Spring Boot (dalla versione 3) hanno già tutto questo preconfigurato — quindi nella pratica spesso funziona senza intervento manuale.

---

### Quando usarlo (e quando no)

**Ottimo per:**

- Funzioni serverless (Lambda, Cloud Functions)
- Tool a riga di comando (CLI)
- Microservizi con avvio frequente
- Ambienti con RAM limitata (container piccoli)

**Meno adatto per:**

- Applicazioni enterprise long-running (la JVM con JIT alla lunga è più veloce, perché ottimizza il codice caldo a runtime)
- Codice che fa uso massiccio di reflection dinamica non configurabile
- Situazioni dove il tempo di build lungo è un problema (Native Image può impiegare diversi minuti)

---

### Il punto chiave del talk

Richard Fichtner lo sottolinea bene: **non devi cambiare il tuo codice Java**. Scrivi Java normale, poi scegli *come* compilarlo. Stessa sorgente, due modalità di distribuzione. Questa è la flessibilità che GraalVM aggiunge all'ecosistema Java.
