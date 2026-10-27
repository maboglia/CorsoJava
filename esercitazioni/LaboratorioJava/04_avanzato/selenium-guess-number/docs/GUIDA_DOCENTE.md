# Guida docente — Laboratorio Selenium (4 ore)

## Preparazione prima della lezione

Su almeno una macchina verificare:
```bash
java -version
mvn -version
google-chrome --version
```

Aprire il progetto, eseguire `mvn test` e avviare la demo. Il primo avvio può scaricare dipendenze Maven e driver. Per evitare attese in aula, preparare la cache prima della lezione oppure verificare la rete del laboratorio.

## Scaletta suggerita

### 0:00–0:15 — Motivazione
Chiedere: come verifichereste manualmente un form web? Quali passaggi si ripetono? Introdurre test di regressione e automazione.

### 0:15–0:45 — Prima apertura
Mostrare `WebDriver`, `ChromeDriver`, `get`, `getTitle`, `getCurrentUrl` e `quit`. Eseguire prima il codice minimo, poi la demo.

### 0:45–1:45 — Selettori e interazioni
Aprire `guess-number.html` accanto a `GuessNumberDemo.java`. Collegare gli ID HTML ai selettori `By.id`. Evidenziare `sendKeys`, `click`, `getText` e il fatto che Selenium controlla il browser, non implementa le regole del gioco.

### 1:45–2:00 — Pausa

### 2:00–2:45 — JUnit
Eseguire `mvn test`. Leggere un test alla volta e spiegare setup, asserzione e teardown. Ogni test usa `target=42` per evitare esiti casuali.

### 2:45–3:00 — Debug collettivo
Cambiare temporaneamente il risultato atteso in un'asserzione per provocare un test fallito; leggere il messaggio e ripristinare il valore corretto.

### 3:00–4:00 — Esercitazione
Assegnare gli esercizi della scheda studente. Chi termina può aggiungere un test di presenza degli elementi o un test del riavvio.

## Concetti da sottolineare

- Selenium WebDriver automatizza il browser tramite API.
- Gli elementi vengono individuati con selettori; ID stabili sono spesso una buona scelta.
- Le asserzioni sono ciò che trasforma una sequenza di azioni in un test verificabile.
- I test devono essere ripetibili: il target noto è una facilitazione per il laboratorio.
- La chiusura del browser va gestita anche in caso di errore.
- I test UI possono essere lenti e fragili se i selettori o la pagina cambiano.

## Soluzioni attese / punti di controllo

- Titolo: `Guess the Number | Laboratorio Selenium`.
- Target deterministico: 42.
- Tentativo 20: messaggio contiene `Troppo basso`.
- Tentativo 60: messaggio contiene `Troppo alto`.
- Tentativo 42: messaggio contiene `Hai indovinato`.
- Dopo Ricomincia: contatore `0` e messaggio `Nuova partita`.

## Troubleshooting in aula

1. Eseguire `mvn test` da terminale per separare problemi Maven da problemi IDE.
2. Controllare che l'IDE usi un JDK 17+.
3. Controllare che Chrome sia installato e avviabile.
4. Al primo avvio verificare la connessione per il download delle dipendenze e del driver.
5. Se la demo sembra bloccata, ricordare che attende Invio nel terminale prima di chiudere il browser.
