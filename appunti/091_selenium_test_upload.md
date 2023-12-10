# Esempio testing: upload

In questo esempio, utilizzeremo una pagina che richiede l'upload di un file. La pagina di esempio [File Upload](http://the-internet.herokuapp.com/upload) consente agli utenti di caricare un file e visualizzarne il nome dopo l'upload. Qui di seguito un esempio di codice Java che utilizza Selenium per automatizzare il processo di upload di un file:

---

```java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

    public static void main(String[] args) {
        // Imposta la proprietà del sistema per il percorso del driver
        System.setProperty("webdriver.chrome.driver", "percorso/del/chromedriver");

        // Inizializza il WebDriver
        WebDriver driver = new ChromeDriver();

        // Apri la pagina di upload
        driver.get("http://the-internet.herokuapp.com/upload");

        // Trova l'elemento di input del file
        WebElement fileInput = driver.findElement(By.id("file-upload"));

        // Specifica il percorso completo del file da caricare
        String filePath = "percorso/completo/del/tuo/file.txt";

        // Inserisci il percorso del file nell'elemento di input del file
        fileInput.sendKeys(filePath);

        // Trova e fai clic sul pulsante di upload
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();

        // Verifica se il nome del file appare dopo l'upload
        WebElement uploadedFileName = driver.findElement(By.id("uploaded-files"));
        String fileName = uploadedFileName.getText();

        if (!fileName.isEmpty()) {
            System.out.println("Upload del file '" + fileName + "' avvenuto con successo!");
        } else {
            System.out.println("Errore durante l'upload del file.");
        }

        // Chiudi il browser alla fine
        driver.quit();
    }
}
```

---

Assicurati di sostituire "percorso/del/chromedriver" con il percorso effettivo del tuo driver Chrome e "percorso/completo/del/tuo/file.txt" con il percorso completo del file che desideri caricare.

Questo esempio dimostra come Selenium possa essere utilizzato per automatizzare l'upload di un file su una pagina web e verificare il risultato. Come sempre, personalizza il codice in base alle tue esigenze specifiche e incorpora pratiche di gestione degli errori e di asserzioni appropriate nei tuoi test.
