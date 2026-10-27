package it.corso.selenium;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Demo guidata: avvia Chrome, apre il gioco locale e interagisce con la pagina.
 *
 * Avvio da terminale, dalla cartella del progetto:
 *   mvn -q -DskipTests package
 *   mvn exec:java -Dexec.mainClass=it.corso.selenium.GuessNumberDemo
 *
 * In alternativa, eseguire il metodo main direttamente dall'IDE.
 */
public class GuessNumberDemo {

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        // Individua la pagina HTML inclusa nelle risorse del progetto.
        Path htmlPath = Path.of(
                GuessNumberDemo.class.getResource("/guess-number.html").toURI());

        // URL con target=42: utile per una dimostrazione sempre uguale.
        String pageUrl = htmlPath.toUri().toURL().toString() + "?target=42";

        // Selenium Manager si occupa del driver nelle versioni moderne di Selenium.
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Navigazione alla pagina.
            driver.get(pageUrl);
            System.out.println("Titolo pagina: " + driver.getTitle());

            // 2. Trova il campo usando l'attributo id dell'HTML.
            WebElement guessInput = driver.findElement(By.id("guess"));

            // 2bis 

            // Lascia agli studenti il tempo di osservare la pagina
            Thread.sleep(1500);

            // 3. Inserisce 20 e preme il pulsante Prova.
            guessInput.sendKeys("20");
            driver.findElement(By.id("guess-button")).click();
            // 2bis 

            // Lascia agli studenti il tempo di osservare la pagina
            Thread.sleep(1500);


            // 4. Legge il messaggio prodotto dalla pagina.
            String feedback = driver.findElement(By.id("feedback")).getText();
            System.out.println("Risposta al numero 20: " + feedback);
            // 2bis 

            // Lascia agli studenti il tempo di osservare la pagina
            Thread.sleep(1500);


            // 5. Secondo tentativo: 60 è maggiore del target 42.
            guessInput = driver.findElement(By.id("guess"));
            guessInput.sendKeys("60");
            driver.findElement(By.id("guess-button")).click();
            System.out.println("Risposta al numero 60: "
                    + driver.findElement(By.id("feedback")).getText());
            // 2bis 

            // Lascia agli studenti il tempo di osservare la pagina
            Thread.sleep(1500);


            // 6. Terzo tentativo: indovina il numero segreto.
            guessInput = driver.findElement(By.id("guess"));
            guessInput.sendKeys("42");
            driver.findElement(By.id("guess-button")).click();
            System.out.println("Risultato finale: "
                    + driver.findElement(By.id("feedback")).getText());
            // 2bis 

            // Lascia agli studenti il tempo di osservare la pagina
            Thread.sleep(1500);


            // Pausa didattica: lascia il browser visibile fino a quando
            // si preme Invio nel terminale. Se si preferisce, rimuovere questo blocco.
            System.out.println("\nDemo terminata. Premi Invio nel terminale per chiudere Chrome.");
            System.in.read();

        } finally {
            // quit() chiude tutte le finestre e termina la sessione WebDriver.
            driver.quit();
        }
    }
}
