package it.corso.selenium;

import java.net.URISyntaxException;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test di esempio con JUnit 5.
 *
 * Ogni test usa target=42: il risultato non dipende dal caso.
 * Eseguire con: mvn test
 */
class GuessNumberTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() throws URISyntaxException {
        Path htmlPath = Path.of(
                GuessNumberTest.class.getResource("/guess-number.html").toURI());
        driver = new ChromeDriver();
        driver.get(htmlPath.toUri().toString() + "?target=42");
    }

    @AfterEach
    void tearDown() {
        // Viene eseguito anche se un'asserzione fallisce.
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void laPaginaHaIlTitoloCorretto() {
        assertEquals("Guess the Number | Laboratorio Selenium", driver.getTitle());
    }

    @Test
    void unNumeroTroppoBassoMostraIlMessaggioCorretto() {
        inviaTentativo("20");

        String messaggio = driver.findElement(By.id("feedback")).getText();
        assertTrue(messaggio.contains("Troppo basso"));
        assertEquals("1", driver.findElement(By.id("attempts")).getText());
    }

    @Test
    void unNumeroTroppoAltoMostraIlMessaggioCorretto() {
        inviaTentativo("60");

        String messaggio = driver.findElement(By.id("feedback")).getText();
        assertTrue(messaggio.contains("Troppo alto"));
    }

    @Test
    void ilNumeroEsattoFaVincereLaPartita() {
        inviaTentativo("42");

        String messaggio = driver.findElement(By.id("feedback")).getText();
        assertTrue(messaggio.contains("Hai indovinato"));
        assertEquals("1", driver.findElement(By.id("attempts")).getText());
    }

    @Test
    void ricominciaAzzeraTentativiEStato() {
        inviaTentativo("20");
        driver.findElement(By.id("restart-button")).click();

        assertEquals("0", driver.findElement(By.id("attempts")).getText());
        assertTrue(driver.findElement(By.id("feedback")).getText().contains("Nuova partita"));
    }

    private void inviaTentativo(String numero) {
        driver.findElement(By.id("guess")).sendKeys(numero);
        driver.findElement(By.id("guess-button")).click();
    }
}
