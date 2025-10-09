# 1) Web app Spring Boot — “Combination Lock” (4 cifre)

## Struttura minima (Maven)

```
combination-lock/
 ├─ src/main/java/com/example/lock/
 │   ├─ LockApplication.java
 │   ├─ controller/LockController.java
 │   └─ model/LockSession.java
 ├─ src/main/resources/templates/index.html
 ├─ src/main/resources/application.properties
 └─ pom.xml
```

### pom.xml

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" ...>
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.example</groupId>
  <artifactId>combination-lock</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>jar</packaging>

  <properties>
    <java.version>17</java.version>
    <spring.boot.version>3.1.4</spring.boot.version>
  </properties>

  <dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
    <!-- devtools opzionale -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-devtools</artifactId>
      <scope>runtime</scope>
      <optional>true</optional>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
      </plugin>
    </plugins>
  </build>
</project>
```

### LockApplication.java

```java
package com.example.lock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LockApplication {
    public static void main(String[] args) {
        SpringApplication.run(LockApplication.class, args);
    }
}
```

### model/LockSession.java

```java
package com.example.lock.model;

public class LockSession {
    private String secret; // 4-digit string e.g. "0427"
    private int attemptsLeft;
    private boolean unlocked;

    public LockSession(String secret, int attempts) {
        this.secret = secret;
        this.attemptsLeft = attempts;
        this.unlocked = false;
    }

    public String getSecret() { return secret; }
    public int getAttemptsLeft() { return attemptsLeft; }
    public void decrementAttempt() { this.attemptsLeft = Math.max(0, this.attemptsLeft - 1); }
    public boolean isUnlocked() { return unlocked; }
    public void setUnlocked(boolean unlocked) { this.unlocked = unlocked; }
}
```

### controller/LockController.java

```java
package com.example.lock.controller;

import com.example.lock.model.LockSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

@Controller
public class LockController {

    private final int MAX_ATTEMPTS = 10;

    private String generateSecret() {
        Random r = new Random();
        int code = r.nextInt(10000); // 0..9999
        return String.format("%04d", code);
    }

    private LockSession createSessionIfAbsent(HttpSession session, boolean testMode) {
        LockSession ls = (LockSession) session.getAttribute("lockSession");
        if (ls == null) {
            ls = new LockSession(generateSecret(), MAX_ATTEMPTS);
            session.setAttribute("lockSession", ls);
            // expose secret in session attribute for testing mode - controller will put it in model only if requested
            session.setAttribute("secretForTest", ls.getSecret());
        } else {
            // ensure secretForTest stays in sync
            session.setAttribute("secretForTest", ls.getSecret());
        }
        return ls;
    }

    @GetMapping("/")
    public String index(@RequestParam(value="test", required=false) String test,
                        HttpSession session, Model model) {
        boolean testMode = "true".equalsIgnoreCase(test);
        LockSession ls = createSessionIfAbsent(session, testMode);
        model.addAttribute("attemptsLeft", ls.getAttemptsLeft());
        model.addAttribute("unlocked", ls.isUnlocked());
        // if test mode, include the secret in the page for Selenium to read
        if (testMode) {
            model.addAttribute("secret", ls.getSecret());
            model.addAttribute("testMode", true);
        } else {
            model.addAttribute("testMode", false);
        }
        return "index";
    }

    @PostMapping("/guess")
    @ResponseBody
    public Map<String,Object> guess(@RequestParam("code") String code, HttpSession session) {
        Map<String,Object> resp = new HashMap<>();
        LockSession ls = (LockSession) session.getAttribute("lockSession");
        if (ls == null) {
            ls = new LockSession(generateSecret(), MAX_ATTEMPTS);
            session.setAttribute("lockSession", ls);
        }
        if (ls.isUnlocked()) {
            resp.put("result", "already_unlocked");
            resp.put("message", "Il lucchetto è già aperto.");
            resp.put("attemptsLeft", ls.getAttemptsLeft());
            return resp;
        }
        if (ls.getAttemptsLeft() <= 0) {
            resp.put("result", "locked_out");
            resp.put("message", "Hai esaurito i tentativi.");
            resp.put("attemptsLeft", 0);
            return resp;
        }

        // sanitize
        code = code == null ? "" : code.trim();
        if (!code.matches("\\d{4}")) {
            resp.put("result", "invalid");
            resp.put("message", "Inserisci un codice di 4 cifre.");
            resp.put("attemptsLeft", ls.getAttemptsLeft());
            return resp;
        }

        if (code.equals(ls.getSecret())) {
            ls.setUnlocked(true);
            resp.put("result", "ok");
            resp.put("message", "Codice corretto! Lucchetto aperto.");
            resp.put("attemptsLeft", ls.getAttemptsLeft());
        } else {
            ls.decrementAttempt();
            resp.put("result", "wrong");
            resp.put("message", "Codice sbagliato.");
            resp.put("attemptsLeft", ls.getAttemptsLeft());
        }
        return resp;
    }

    @PostMapping("/reset")
    @ResponseBody
    public Map<String,Object> reset(HttpSession session) {
        Map<String,Object> resp = new HashMap<>();
        LockSession newLs = new LockSession(generateSecret(), MAX_ATTEMPTS);
        session.setAttribute("lockSession", newLs);
        session.setAttribute("secretForTest", newLs.getSecret());
        resp.put("result", "reset");
        resp.put("message", "Sessione resettata.");
        resp.put("secret", newLs.getSecret());
        resp.put("attemptsLeft", newLs.getAttemptsLeft());
        return resp;
    }
}
```

### src/main/resources/templates/index.html (Thymeleaf)

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
  <meta charset="UTF-8">
  <title>Combination Lock</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <style>
    body { font-family: Arial, sans-serif; padding: 2rem; }
    .box { max-width: 420px; margin: auto; }
    input { font-size: 1.5rem; padding: .5rem; width: 100%; box-sizing: border-box; text-align:center; }
    button { margin-top: .5rem; padding: .6rem; width:100%; font-size:1rem; }
    .msg { margin-top: .8rem; min-height: 1.6rem; }
    .secret { font-size: .9rem; color: #777; margin-top: .6rem; }
  </style>
</head>
<body>
  <div class="box">
    <h2>Indovina il codice a 4 cifre</h2>
    <div>
      <input id="code" maxlength="4" placeholder="0000" />
      <button id="submit">Invia</button>
      <button id="reset" style="margin-top: .5rem; background:#eee">Reset</button>
      <div class="msg" id="msg"></div>
      <div> Tentativi rimasti: <span id="attempts" th:text="${attemptsLeft}">0</span></div>

      <div th:if="${testMode}">
        <div class="secret">[TEST MODE] secret: <span id="secret" th:text="${secret}">0000</span></div>
      </div>
    </div>
  </div>

<script>
document.getElementById('submit').addEventListener('click', send);
document.getElementById('reset').addEventListener('click', resetSession);
document.getElementById('code').addEventListener('keyup', function(e){
  if(e.key === 'Enter') send();
});

function send(){
  const code = document.getElementById('code').value.trim();
  fetch('/guess', {
    method: 'POST',
    headers: {'Content-Type': 'application/x-www-form-urlencoded'},
    body: 'code=' + encodeURIComponent(code)
  })
  .then(r => r.json())
  .then(json => {
    document.getElementById('msg').textContent = json.message;
    document.getElementById('attempts').textContent = json.attemptsLeft;
    if(json.result === 'ok') {
      document.getElementById('msg').style.color = 'green';
    } else {
      document.getElementById('msg').style.color = 'red';
    }
  });
}

function resetSession(){
  fetch('/reset', {method:'POST'}).then(r => r.json()).then(j=>{
    document.getElementById('msg').textContent = j.message;
    document.getElementById('attempts').textContent = j.attemptsLeft;
    if(document.getElementById('secret')) document.getElementById('secret').textContent = j.secret;
  });
}
</script>
</body>
</html>
```

### application.properties

```properties
server.port=8080
spring.thymeleaf.cache=false
```

#### Note

* La modalità di test si attiva aggiungendo `?test=true` all'URL: ad esempio `http://localhost:8080/?test=true`. In quella modalità il codice segreto viene mostrato nella pagina (`#secret`) per permettere ai test di Selenium di conoscerlo senza accedere internamente alla sessione.

---

## Esecuzione web app

1. Da `combination-lock/`:

   * `mvn clean package`
   * `mvn spring-boot:run`
2. Apri `http://localhost:8080/` (o `http://localhost:8080/?test=true` per la modalità test).

---

# 2) Test Selenium (Java) — progetto Maven separato o modulo di test nello stesso progetto

Puoi creare un progetto Maven separato `combination-lock-selenium` oppure aggiungere le dipendenze al `pom.xml` del progetto sopra. Qui do un `pom.xml` e un test JUnit 5.

### pom.xml (solo per test Selenium)

```xml
<project ...>
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.example</groupId>
  <artifactId>combination-lock-selenium</artifactId>
  <version>0.0.1-SNAPSHOT</version>

  <properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
    <junit.jupiter.version>5.10.0</junit.jupiter.version>
  </properties>

  <dependencies>
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>4.13.0</version>
    </dependency>
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>5.5.3</version>
    </dependency>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-api</artifactId>
      <version>${junit.jupiter.version}</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>${junit.jupiter.version}</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.1.2</version>
        <configuration>
          <useSystemClassLoader>true</useSystemClassLoader>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
```

### Example Selenium test (JUnit 5)

```java
package com.example.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LockSeleniumTest {

    private static WebDriver driver;
    private final String baseUrl = "http://localhost:8080/?test=true"; // important: test=true to reveal secret

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void testUnlockWithSecretFromPage() throws InterruptedException {
        driver.get(baseUrl);

        // legge il codice segreto mostrato in test mode
        WebElement secretEl = driver.findElement(By.id("secret"));
        String secret = secretEl.getText().trim();
        Assertions.assertTrue(secret.matches("\\d{4}"), "Secret must be 4 digits");

        // immette il codice e invia
        WebElement input = driver.findElement(By.id("code"));
        input.clear();
        input.sendKeys(secret);

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        // aspetta e verifica messaggio di successo
        WebElement msg = driver.findElement(By.id("msg"));
        // semplice polling: attendi fino a 3s che il messaggio cambi
        int attempts = 0;
        while (attempts < 6 && msg.getText().trim().length() == 0) {
            Thread.sleep(500);
            attempts++;
        }
        String text = msg.getText();
        Assertions.assertTrue(text.toLowerCase().contains("corretto") || text.toLowerCase().contains("aperto"),
                "Expected success message, got: " + text);
    }

    @Test
    void testWrongCodeDecrementsAttempts() {
        driver.get(baseUrl);

        // legge tentativi iniziali
        WebElement attemptsEl = driver.findElement(By.id("attempts"));
        int before = Integer.parseInt(attemptsEl.getText().trim());

        WebElement input = driver.findElement(By.id("code"));
        input.clear();
        input.sendKeys("9999"); // probabilmente sbagli

        driver.findElement(By.id("submit")).click();

        // leggi nuovo valore di tentativi (do small wait)
        try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        int after = Integer.parseInt(driver.findElement(By.id("attempts")).getText().trim());
        Assertions.assertTrue(after <= before, "Attempts should decrease or stay same");
        Assertions.assertEquals(before - 1, after, "Attempts should decrement by 1 on wrong guess");
    }
}
```

#### Note sui driver

* `WebDriverManager` (bonigarcia) scarica automaticamente il ChromeDriver compatibile. Serve che tu abbia Chrome installato. In alternativa puoi configurare un driver per Firefox (geckodriver) e cambiare `new ChromeDriver()` con `new FirefoxDriver()`.

---

# Considerazioni di sicurezza e test

* **Modalità test**: `?test=true` espone il codice nella pagina — utile per i test automatici ma **non** per la produzione. Se porti online l'app, rimuovi questa funzione o abilitala solo tramite profilo Spring `test`.
* Sessione utente: il codice è salvato in sessione; ogni sessione ha il suo codice.
* Limite tentativi: 10 (modificabile in controller).

---

# Esecuzione dei test Selenium

1. Avvia la web app (vedi sopra).
2. Apri un terminale nella cartella del progetto selenium e lancia:

   * `mvn test`
3. I test useranno ChromeDriver (WebDriverManager scarica il driver). Viene aperta una finestra Chrome e i test interagiranno con la pagina.

---

# Varianti/estensioni (idee per esercitazione)

* Cambiare feedback in stile "Bulls and Cows" (quante cifre giuste al posto giusto / giuste ma scambiate).
* Implementare rate-limiting/IP ban dopo X reset.
* Aggiungere una pagina di admin che mostra statistiche (per esercizi DB).
* Implementare test che provano la logica di frontend (input non numerici, 3 cifre ecc.)
* Eseguire i test con un CI (GitHub Actions) usando Chrome headless.

---

## **repository Maven multi-module** chiamato `combination-lock-project`, che contiene

* **`lock-webapp/`** → la web app Spring Boot “lucchetto 4 cifre”
* **`lock-selenium/`** → i test automatici Selenium + JUnit 5

Con un singolo `pom.xml` principale per gestire entrambi.

---

## 📁 Struttura completa

```
combination-lock-project/
 ├─ pom.xml                <-- POM genitore
 ├─ lock-webapp/           <-- Modulo web
 │   ├─ pom.xml
 │   └─ src/...
 └─ lock-selenium/         <-- Modulo test Selenium
     ├─ pom.xml
     └─ src/...
```

---

## 🧩 POM principale (`combination-lock-project/pom.xml`)

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>combination-lock-project</artifactId>
    <version>1.0.0</version>
    <packaging>pom</packaging>
    <modules>
        <module>lock-webapp</module>
        <module>lock-selenium</module>
    </modules>

    <properties>
        <java.version>17</java.version>
        <spring.boot.version>3.1.4</spring.boot.version>
        <selenium.version>4.13.0</selenium.version>
        <junit.jupiter.version>5.10.0</junit.jupiter.version>
    </properties>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>${spring.boot.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
</project>
```

---

## 🌐 Modulo 1 — `lock-webapp/pom.xml`

(identico alla web app precedente)

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" ...>
    <parent>
        <groupId>com.example</groupId>
        <artifactId>combination-lock-project</artifactId>
        <version>1.0.0</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>lock-webapp</artifactId>
    <name>Lock WebApp</name>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```

🔹 Tutti i file Java/HTML del modulo web sono gli stessi della versione che ti ho mostrato sopra.

---

## 🤖 Modulo 2 — `lock-selenium/pom.xml`

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" ...>
    <parent>
        <groupId>com.example</groupId>
        <artifactId>combination-lock-project</artifactId>
        <version>1.0.0</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>lock-selenium</artifactId>
    <name>Lock Selenium Tests</name>

    <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>${selenium.version}</version>
        </dependency>
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.5.3</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>${junit.jupiter.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>${junit.jupiter.version}</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.1.2</version>
                <configuration>
                    <useSystemClassLoader>true</useSystemClassLoader>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

---

## 📜 Esempio di test Selenium (`lock-selenium/src/test/java/com/example/tests/LockSeleniumTest.java`)

(corrisponde al test mostrato prima)

```java
package com.example.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LockSeleniumTest {

    private WebDriver driver;
    private final String baseUrl = "http://localhost:8080/?test=true";

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    void teardown() {
        if (driver != null) driver.quit();
    }

    @Test
    void unlockUsingSecret() throws InterruptedException {
        driver.get(baseUrl);

        String secret = driver.findElement(By.id("secret")).getText().trim();
        Assertions.assertTrue(secret.matches("\\d{4}"));

        WebElement code = driver.findElement(By.id("code"));
        code.clear();
        code.sendKeys(secret);
        driver.findElement(By.id("submit")).click();

        Thread.sleep(500);
        String msg = driver.findElement(By.id("msg")).getText();
        Assertions.assertTrue(msg.toLowerCase().contains("aperto") || msg.toLowerCase().contains("corretto"));
    }

    @Test
    void wrongCodeDecreasesAttempts() throws InterruptedException {
        driver.get(baseUrl);
        int before = Integer.parseInt(driver.findElement(By.id("attempts")).getText().trim());

        WebElement code = driver.findElement(By.id("code"));
        code.clear();
        code.sendKeys("9999");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(500);

        int after = Integer.parseInt(driver.findElement(By.id("attempts")).getText().trim());
        Assertions.assertEquals(before - 1, after);
    }
}
```

---

## 🚀 Come eseguire tutto

### 1️⃣ Clonare o creare la struttura

Crea la cartella `combination-lock-project/` con i file come sopra.

### 2️⃣ Avviare la web app

```bash
cd combination-lock-project/lock-webapp
mvn spring-boot:run
```

> App disponibile su [http://localhost:8080](http://localhost:8080)
> Usa `http://localhost:8080/?test=true` per la modalità test (mostra il codice segreto)

### 3️⃣ Eseguire i test Selenium

Apri un **nuovo terminale**:

```bash
cd combination-lock-project/lock-selenium
mvn test
```

Il test aprirà Chrome, leggerà il codice segreto e tenterà di sbloccare automaticamente il lucchetto.
