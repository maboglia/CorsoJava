# Gli elementi fondamentali di Selenium

In Selenium, gli elementi fondamentali che vengono comunemente utilizzati per interagire con gli elementi di una pagina web sono rappresentati dalle seguenti classi:

---

1. **WebDriver:**
   - `WebDriver` è l'interfaccia principale in Selenium che fornisce metodi per interagire con il browser. Puoi utilizzare implementazioni specifiche come `ChromeDriver`, `FirefoxDriver`, `EdgeDriver`, ecc., per automatizzare l'interazione con i rispettivi browser.

   ```java
   WebDriver driver = new ChromeDriver();
   ```

---

2. **WebElement:**
   - `WebElement` è un'interfaccia che rappresenta un elemento della pagina web. Fornisce metodi per eseguire azioni come cliccare su un elemento, inserire testo in un campo di input, ottenere il testo dell'elemento, ecc.

   ```java
   WebElement element = driver.findElement(By.id("elementId"));
   ```

---

3. **By:**
   - `By` è una classe che fornisce diversi metodi statici per individuare gli elementi della pagina web. Puoi utilizzare `By` con il metodo `findElement` per individuare gli elementi utilizzando criteri come ID, nome, classe, selettore CSS, selettore XPath, ecc.

   ```java
   By byId = By.id("elementId");
   WebElement element = driver.findElement(byId);
   ```

---

4. **Select:**
   - `Select` è una classe che fornisce metodi per interagire con gli elementi del menu a discesa (select). Può essere utilizzata per selezionare elementi in un menu a discesa per testare scenari di selezione.

   ```java
   Select dropdown = new Select(driver.findElement(By.id("dropdown")));
   dropdown.selectByVisibleText("Option 1");
   ```

---

5. **Alert:**
   - `Alert` è un'interfaccia che rappresenta un popup di avviso. Può essere utilizzata per gestire popup come alert, conferme e prompt.

   ```java
   Alert alert = driver.switchTo().alert();
   alert.accept(); // Accetta l'alert
   ```

---

6. **Actions:**
   - `Actions` è una classe che fornisce metodi per eseguire azioni complesse, come l'interazione con elementi tramite movimenti del mouse o tasti da tastiera.

   ```java
   Actions actions = new Actions(driver);
   actions.moveToElement(element).perform(); // Sposta il mouse su un elemento
   ```

---

7. **ExpectedConditions:**
   - `ExpectedConditions` è una classe che fornisce condizioni predefinite che possono essere utilizzate con `WebDriverWait` per aspettarsi che determinate condizioni si verifichino prima di eseguire un'azione.

   ```java
   WebDriverWait wait = new WebDriverWait(driver, 10);
   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
   ```

Questi sono alcuni degli elementi fondamentali in Selenium che vengono comunemente utilizzati per automatizzare il testing di applicazioni web. L'utilizzo combinato di questi elementi consente di costruire script di automazione potenti e flessibili
