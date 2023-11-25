# Selenium

Selenium è uno strumento ampiamente utilizzato per l'automazione dei test su applicazioni web. Fornisce un'interfaccia per interagire con il browser in modo programmato, consentendo agli sviluppatori di scrivere script in vari linguaggi di programmazione, inclusi Java. Ecco alcune informazioni chiave su Selenium in ambiente Java:

---

1. **Configurazione di Selenium in un progetto Java:**
   - Per iniziare, è necessario configurare il tuo progetto Java per utilizzare Selenium. Puoi farlo aggiungendo le dipendenze corrispondenti al tuo sistema di gestione delle dipendenze (come Maven o Gradle). Ad esempio, se stai usando Maven, aggiungi la seguente dipendenza nel tuo file `pom.xml`:

     ```xml
     <dependencies>
         <dependency>
             <groupId>org.seleniumhq.selenium</groupId>
             <artifactId>selenium-java</artifactId>
             <version>3.141.59</version> <!-- Versione più recente disponibile -->
         </dependency>
     </dependencies>
     ```

---

2. **Inizializzazione del WebDriver:**
   - Selenium utilizza un'interfaccia chiamata WebDriver per interagire con i browser. Puoi inizializzare il WebDriver nel tuo codice Java. Ad esempio, per utilizzare il ChromeDriver, dovresti scaricare il driver corrispondente da [ChromeDriver Download](https://sites.google.com/chromium.org/driver/) e poi usarlo nel tuo codice:

     ```java
     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.chrome.ChromeDriver;

     public class SeleniumExample {

         public static void main(String[] args) {
             // Imposta la proprietà del sistema per il percorso del driver
             System.setProperty("webdriver.chrome.driver", "percorso/del/chromedriver");

             // Inizializza il WebDriver
             WebDriver driver = new ChromeDriver();

             // Esegui altre operazioni con il WebDriver...

             // Chiudi il browser alla fine
             driver.quit();
         }
     }
     ```

---

3. **Esempio di Automazione del Test:**
   - Dopo l'inizializzazione, puoi utilizzare il WebDriver per automatizzare azioni come il clic su pulsanti, l'inserimento di dati nei campi di input, la navigazione tra pagine e altro ancora. Ecco un esempio semplice:

     ```java
     import org.openqa.selenium.By;
     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
     import org.openqa.selenium.chrome.ChromeDriver;

     public class SeleniumTest {

         public static void main(String[] args) {
             System.setProperty("webdriver.chrome.driver", "percorso/del/chromedriver");
             WebDriver driver = new ChromeDriver();

             // Apri una pagina web
             driver.get("https://www.example.com");

             // Trova un elemento tramite il selettore CSS e cliccaci sopra
             WebElement linkElement = driver.findElement(By.cssSelector("a#linkId"));
             linkElement.click();

             // Chiudi il browser alla fine
             driver.quit();
         }
     }
     ```

---

4. **Test con Selenium e JUnit:**
   - Puoi integrare Selenium con JUnit per organizzare e eseguire i tuoi test in modo più strutturato. Ad esempio:

     ```java
     import org.junit.After;
     import org.junit.Before;
     import org.junit.Test;
     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.chrome.ChromeDriver;

     public class SeleniumJUnitTest {

         private WebDriver driver;

         @Before
         public void setUp() {
             System.setProperty("webdriver.chrome.driver", "percorso/del/chromedriver");
             driver = new ChromeDriver();
         }

         @Test
         public void testExample() {
             // Tuo codice di test con Selenium
             driver.get("https://www.example.com");
             // Altre azioni...

             // Esempio di asserzione con JUnit
             assertEquals("Titolo della pagina", driver.getTitle());
         }

         @After
         public void tearDown() {
             // Chiudi il browser alla fine di ogni test
             driver.quit();
         }
     }
     ```

Ricorda di sostituire "percorso/del/chromedriver" con il percorso effettivo del tuo driver Chrome. Selenium supporta anche altri browser come Firefox, Edge, ecc. Puoi trovare i driver corrispondenti sul sito ufficiale di Selenium.
