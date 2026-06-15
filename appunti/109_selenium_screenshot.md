# Selenimu Screenshot

Ecco la traduzione dell'articolo:

---

**Esempio di Screenshot con Selenium**

Esploriamo questa funzione con un processo in tre fasi:

Il codice dettagliato di seguito catturerà uno screenshot di <https://www.browserstack.com> e lo salverà come C:/Test.png

**Passo 1 - Converti l'oggetto del web driver in TakeScreenshot**

```java
TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
```

**Passo 2 - Chiama il metodo getScreenshotAs per creare un file immagine**

```java
File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
```

**Passo 3 - Copia il file nella posizione desiderata**

```java
package BrowserstackScreenShot;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BStackTakeScreenshot {
    @Test
    public void testBStackTakeScreenShot() throws Exception {
        WebDriver driver;
        System.setProperty("webdriver.firefox.marionette", "c:\\geckodriver.exe");
        driver = new FirefoxDriver();
        // vai all'URL
        driver.get("https://www.browserstack.com");
        // chiama la funzione di acquisizione screenshot
        this.takeSnapShot(driver, "c://test.png");
    }

    /**
    * Questa funzione catturerà uno screenshot
    * @param webdriver
    * @param fileWithPath
    * @throws Exception
    */
    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
        // converte l'oggetto del web driver in TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
        // chiama il metodo getScreenshotAs per creare un file immagine
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        // sposta il file immagine nella nuova destinazione
        File DestFile = new File(fileWithPath);
        // copia il file nella destinazione
        FileUtils.copyFile(SrcFile, DestFile);
    }
}
```

---

Questo codice utilizza Selenium per catturare uno screenshot di una pagina web e salvarlo in una posizione specifica sul tuo sistema. Assicurati di avere i driver del browser correttamente configurati e le dipendenze di Selenium nel tuo progetto.
