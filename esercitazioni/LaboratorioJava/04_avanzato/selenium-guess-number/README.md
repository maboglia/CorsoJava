# Selenium Guess the Number — laboratorio Java

Progetto didattico per una lezione di 4 ore su Selenium WebDriver con Java e Maven.
Include una pagina HTML locale, una demo Java interattiva e test automatici JUnit 5.

## Requisiti

- JDK 17 o superiore (verificare con `java -version` e `javac -version`)
- Maven 3.8+ (verificare con `mvn -version`)
- Google Chrome installato
- Connessione Internet al primo avvio per scaricare le dipendenze Maven e, se necessario,
  il driver gestito da Selenium Manager

## Struttura

- `src/main/resources/guess-number.html`: gioco web locale.
- `src/main/java/it/corso/selenium/GuessNumberDemo.java`: automazione dimostrativa.
- `src/test/java/it/corso/selenium/GuessNumberTest.java`: test JUnit 5.
- `pom.xml`: dipendenze e configurazione Maven.

## Avvio da terminale

Dalla cartella che contiene `pom.xml`:

```bash
mvn clean test
```

Questo comando compila il progetto ed esegue i cinque test JUnit. Chrome si aprirà e si chiuderà
per ogni test; è il comportamento previsto.

Per avviare la demo interattiva:

```bash
mvn -q -DskipTests package
mvn exec:java -Dexec.mainClass=it.corso.selenium.GuessNumberDemo
```

Il plugin Maven Exec è dichiarato nel POM. In alternativa, aprire la classe `GuessNumberDemo.java`
nell'IDE ed eseguire il metodo `main`.

La demo usa `target=42`, quindi i risultati sono ripetibili:
- 20 → troppo basso
- 60 → troppo alto
- 42 → vittoria

Alla fine la demo attende Invio nel terminale prima di chiudere Chrome.

## Importare il progetto negli IDE

### IntelliJ IDEA
1. Estrarre lo ZIP.
2. Selezionare **Open** e scegliere la cartella del progetto o il file `pom.xml`.
3. Attendere la sincronizzazione Maven.
4. Impostare un JDK 17+ in Project Structure.
5. Eseguire `GuessNumberDemo.main()` oppure il test dalla classe `GuessNumberTest`.

### Eclipse
1. Estrarre lo ZIP.
2. Selezionare **File → Import → Maven → Existing Maven Projects**.
3. Scegliere la cartella estratta e completare l'importazione.
4. Verificare che il progetto usi un JDK 17+.
5. Eseguire la classe come **Java Application** o la classe di test come **JUnit Test**.

### Visual Studio Code
1. Installare un JDK 17+ e Maven.
2. Installare **Extension Pack for Java**.
3. Aprire in VS Code la cartella che contiene `pom.xml`.
4. Attendere l'importazione del progetto Maven.
5. Usare **Run** sopra il metodo `main` oppure eseguire `mvn test` nel terminale integrato.

## Come funziona il test deterministico

La pagina sceglie un numero casuale in una partita normale. Per i test, il parametro URL
`?target=42` imposta il numero segreto a 42. Questo rende prevedibili le verifiche senza dover
indovinare un numero casuale. È una facilitazione didattica, non una tecnica da usare in un gioco
pubblico o in produzione.

## Concetti Selenium da evidenziare

- `WebDriver`: interfaccia principale per controllare il browser.
- `ChromeDriver`: implementazione per Google Chrome.
- `driver.get(url)`: navigazione.
- `findElement(By.id("guess"))`: ricerca di un elemento HTML tramite `id`.
- `sendKeys("20")`: inserimento di testo.
- `click()`: click su un elemento.
- `getText()`: lettura del testo visibile.
- `quit()`: chiusura della sessione del browser.
- JUnit `@BeforeEach` e `@AfterEach`: preparazione e pulizia per ogni test.
- `assertEquals` e `assertTrue`: verifiche automatiche.

## Attività per gli studenti

1. Modificare la demo per provare prima 10, poi 50 e infine 42.
2. Stampare anche il contatore dei tentativi.
3. Aggiungere un test che controlli il messaggio di vittoria.
4. Aggiungere un test che prema **Ricomincia** e verifichi che i tentativi tornino a zero.
5. Individuare il campo usando un selettore CSS, ad esempio `By.cssSelector("#guess")`.
6. Spiegare perché il parametro `target=42` è utile nei test automatizzati.

## Problemi frequenti

- **`mvn: command not found`**: installare Maven o usare il terminale integrato dell'IDE con Maven configurato.
- **Java version incompatibile**: controllare che `java -version`, `mvn -version` e l'IDE puntino a un JDK 17+.
- **Chrome non si avvia**: verificare che Chrome sia installato e aggiornato; leggere l'errore Selenium completo.
- **Primo avvio senza Internet**: Maven potrebbe non avere ancora le dipendenze nella cache e Selenium Manager potrebbe non poter scaricare il driver.
- **Il browser si chiude subito**: la demo attende Invio nel terminale. I test invece chiudono il browser alla fine di ogni test.
- **Test che non partono dall'IDE**: eseguire `mvn test` per distinguere un problema di importazione IDE da un problema del progetto.

## Nota per il docente

Selenium è fissato alla versione 4.51.0, release stabile indicata dalla pagina ufficiale Selenium al 27 ottobre 2026. Le altre dipendenze sono fissate per rendere il laboratorio riproducibile. Prima della lezione, eseguire `mvn clean test` su una macchina rappresentativa del laboratorio.
