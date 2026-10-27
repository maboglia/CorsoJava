# Scheda laboratorio — Selenium WebDriver con Java

**Durata:** 4 ore  
**Tecnologie:** Java 17+, Maven, Selenium WebDriver, Chrome, JUnit 5  
**Obiettivo:** automatizzare le interazioni con una pagina web usando codice Java.

## Risultati attesi

Al termine saprai:
- spiegare a cosa serve Selenium WebDriver;
- aprire una pagina con un browser controllato da Java;
- individuare un elemento HTML;
- compilare un campo e premere un pulsante;
- leggere il risultato prodotto dalla pagina;
- scrivere un test automatico con un'asserzione.

## Attività 1 — Aprire una pagina (base)

1. Apri `GuessNumberDemo.java`.
2. Individua la creazione del `ChromeDriver`.
3. Esegui la classe.
4. Osserva il titolo stampato nel terminale.

**Domande**
- Qual è la differenza tra `driver.get(...)` e `driver.getTitle()`?
- Perché è importante chiamare `driver.quit()`?

## Attività 2 — Interagire con il gioco

Osserva questa sequenza:

```java
WebElement campo = driver.findElement(By.id("guess"));
campo.sendKeys("20");
driver.findElement(By.id("guess-button")).click();
String messaggio = driver.findElement(By.id("feedback")).getText();
System.out.println(messaggio);
```

Associa ogni istruzione al suo scopo:
- trovare un elemento;
- inserire un valore;
- premere un pulsante;
- leggere il testo della pagina.

## Attività 3 — Test automatici

Esegui:

```bash
mvn test
```

Apri `GuessNumberTest.java` e individua:
- `@BeforeEach`: prepara il browser e apre la pagina;
- `@Test`: descrive un caso di test;
- `assertTrue` / `assertEquals`: verificano il risultato;
- `@AfterEach`: chiude il browser.

## Esercizi

### Livello 1
1. Cambia il primo tentativo da 20 a 10.
2. Stampa anche il numero di tentativi.
3. Cambia `By.id("guess")` in `By.cssSelector("#guess")`.

### Livello 2
4. Aggiungi un test per il pulsante **Ricomincia**.
5. Dopo un tentativo, controlla che il contatore valga `1`.
6. Indovina 42 e controlla che il messaggio contenga `Hai indovinato`.

### Livello 3
7. Scrivi un test per verificare che il campo e il pulsante siano presenti.
8. Aggiungi una verifica per un input fuori intervallo, come 101. Valuta il comportamento della validazione HTML e della pagina.
9. Spiega perché un test automatizzato dovrebbe evitare di dipendere da un numero segreto casuale.

## Verifica finale

1. Che ruolo ha WebDriver?
2. A cosa serve `By.id(...)`?
3. Qual è la differenza tra `click()` e `sendKeys()`?
4. Perché usiamo JUnit oltre a Selenium?
5. Perché è utile avere un target noto nei test?

## Consegna

Consegna il progetto Maven aggiornato e una breve descrizione di:
- un test eseguito;
- un problema incontrato;
- come hai verificato il risultato.
