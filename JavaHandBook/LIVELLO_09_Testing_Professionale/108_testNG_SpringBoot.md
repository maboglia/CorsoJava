# TestNG in SpringBoot

Per utilizzare TestNG in un progetto Spring Boot, puoi seguire i seguenti passi:

---

### 1. Aggiungi dipendenze Maven o Gradle

Assicurati di aggiungere le dipendenze necessarie per Spring Boot e TestNG nel tuo file di configurazione di Maven o Gradle.

---

#### Maven

```xml
<dependencies>
    <!-- Dipendenze di Spring Boot -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>

    <!-- Dipendenza di TestNG -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.3.0</version> <!-- Verifica la versione più recente su Maven Central -->
        <scope>test</scope>
    </dependency>
</dependencies>
```

---

#### Gradle

```groovy
dependencies {
    // Dipendenze di Spring Boot
    implementation 'org.springframework.boot:spring-boot-starter'

    // Dipendenza di TestNG
    testImplementation 'org.testng:testng:7.3.0' // Verifica la versione più recente su Maven Central
}
```

---

### 2. Configura TestNG

Crea un file di configurazione TestNG XML per specificare la suite di test. Ad esempio, puoi creare un file chiamato `testng.xml`:

```xml
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="SpringBootTestSuite">
    <test name="SpringBootTests">
        <packages>
            <package name="com.example.myproject.tests" />
        </packages>
    </test>
</suite>
```

---

### 3. Scrivi i TestNG Tests

Crea le tue classi di test utilizzando le annotazioni di TestNG. Ad esempio:

```java
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

@SpringBootTest
public class MySpringBootTest {

    @Test
    public void testSomething() {
        // Il tuo codice di test qui
    }
}
```

---

### 4. Esegui i Test

Per eseguire i test, puoi utilizzare il plugin Maven o Gradle o eseguire direttamente TestNG tramite la riga di comando fornendo il percorso del file `testng.xml` come argomento:

```bash
# Esegui con Maven
mvn clean test

# Esegui con Gradle
./gradlew clean test

# Esegui direttamente TestNG
java -cp "target/classes:target/test-classes:lib/*" org.testng.TestNG testng.xml
```

---

### 5. Integrazione con Spring Boot Test Annotations

Puoi utilizzare le annotazioni di testing fornite da Spring Boot in combinazione con TestNG. Ad esempio, puoi utilizzare `@SpringBootTest` e `@Autowired` per iniettare i bean di Spring nel tuo test.

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
public class MySpringBootTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private MyService myService;

    @Test
    public void testSomething() {
        // Usa myService nel tuo test
    }
}
```

Con questi passaggi, dovresti essere in grado di integrare TestNG nei tuoi progetti Spring Boot e scrivere e eseguire i test con successo.
