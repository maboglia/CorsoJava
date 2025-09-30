# Lezione: Debugging e Testing in Java con Eclipse e Maven

## Obiettivi della Lezione
- Comprendere i principi del debugging in Java
- Imparare a usare il debugger di Eclipse
- Introduzione al testing con JUnit
- Integrazione di Maven per la gestione delle dipendenze
- Best practices per debugging e testing

## Parte 1: Setup del Progetto Maven

### Creazione del Progetto
1. **File → New → Maven Project**
2. Selezionare "Create a simple project"
3. Group ID: `com.esempio.corso`
4. Artifact ID: `debugging-testing-demo`
5. Version: `1.0.0`
6. Packaging: `jar`

### Struttura del Progetto
```
debugging-testing-demo/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/esempio/corso/
│   │           ├── Calculator.java
│   │           ├── BankAccount.java
│   │           └── StringUtils.java
│   └── test/
│       └── java/
│           └── com/esempio/corso/
│               ├── CalculatorTest.java
│               ├── BankAccountTest.java
│               └── StringUtilsTest.java
```

### Configurazione pom.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.esempio.corso</groupId>
    <artifactId>debugging-testing-demo</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>
    
    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <junit.version>5.9.2</junit.version>
    </properties>
    
    <dependencies>
        <!-- JUnit 5 -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>
        
        <!-- Mockito for mocking -->
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <version>5.1.1</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
    
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M9</version>
            </plugin>
        </plugins>
    </build>
</project>
```

## Parte 2: Classi di Esempio per il Debugging

### Calculator.java (con bug intenzionali)
```java
package com.esempio.corso;

public class Calculator {
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    // BUG: Divisione per zero non gestita
    public double divide(double a, double b) {
        return a / b;
    }
    
    // BUG: Logica errata per numeri negativi
    public double sqrt(double number) {
        if (number < 0) {
            return -1; // Dovrebbe lanciare eccezione
        }
        return Math.sqrt(number);
    }
    
    // BUG: Off-by-one error
    public int factorial(int n) {
        if (n <= 1) return 1;
        int result = 1;
        for (int i = 1; i < n; i++) { // Dovrebbe essere i <= n
            result *= i;
        }
        return result;
    }
}
```

### BankAccount.java
```java
package com.esempio.corso;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private boolean isActive;
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.isActive = true;
    }
    
    public void deposit(double amount) {
        if (!isActive) {
            throw new IllegalStateException("Account is closed");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance += amount;
    }
    
    // BUG: Non controlla se il conto è attivo
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    public void closeAccount() {
        this.isActive = false;
    }
}
```

### StringUtils.java
```java
package com.esempio.corso;

public class StringUtils {
    
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        
        // BUG: Non gestisce case sensitivity e spazi
        String cleaned = str.trim();
        int left = 0;
        int right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static String reverseString(String str) {
        if (str == null) return null;
        
        StringBuilder sb = new StringBuilder();
        // BUG: Possibile IndexOutOfBoundsException
        for (int i = str.length(); i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    
    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        
        // BUG: Non gestisce spazi multipli
        String[] words = text.split(" ");
        return words.length;
    }
}
```

## Parte 3: Debugging con Eclipse

### 3.1 Breakpoints
- **Line Breakpoint**: Click sulla barra sinistra del numero di riga
- **Conditional Breakpoint**: Tasto destro sul breakpoint → Properties
- **Method Breakpoint**: Breakpoint all'inizio di un metodo
- **Exception Breakpoint**: Window → Show View → Breakpoints

### 3.2 Debug Perspective
1. **Attivazione**: Window → Perspective → Open Perspective → Debug
2. **Viste principali**:
   - Variables: Valori delle variabili
   - Expressions: Espressioni personalizzate
   - Call Stack: Stack delle chiamate
   - Breakpoints: Gestione breakpoints

### 3.3 Comandi di Debug
- **F5**: Step Into (entra nel metodo)
- **F6**: Step Over (esegue la riga)
- **F7**: Step Return (esce dal metodo)
- **F8**: Resume (continua l'esecuzione)

### 3.4 Esercizio Pratico di Debugging
```java
public class DebuggingExercise {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Metti breakpoint qui e analizza i valori
        double result1 = calc.divide(10, 0); // Division by zero
        System.out.println("Result 1: " + result1);
        
        // Debugging del factorial
        int factResult = calc.factorial(5);
        System.out.println("5! = " + factResult);
        
        // Debugging di BankAccount
        BankAccount account = new BankAccount("123456", 1000);
        account.closeAccount();
        account.withdraw(100); // Should fail but doesn't check active status
    }
}
```

## Parte 4: Testing con JUnit 5

### 4.1 Struttura di un Test
```java
@Test
@DisplayName("Descrizione del test")
void nomeTest() {
    // Arrange - Preparazione
    // Act - Esecuzione
    // Assert - Verifica
}
```

### 4.2 Annotazioni Principali
- `@Test`: Identifica un metodo di test
- `@BeforeEach`: Eseguito prima di ogni test
- `@BeforeAll`: Eseguito una volta prima di tutti i test
- `@AfterEach`: Eseguito dopo ogni test
- `@AfterAll`: Eseguito una volta dopo tutti i test
- `@DisplayName`: Nome descrittivo del test
- `@Disabled`: Disabilita un test

### 4.3 Assertions Comuni
```java
// Uguaglianza
assertEquals(expected, actual);
assertNotEquals(unexpected, actual);

// Boolean
assertTrue(condition);
assertFalse(condition);

// Null checking
assertNull(object);
assertNotNull(object);

// Eccezioni
assertThrows(ExceptionType.class, () -> {
    // codice che dovrebbe lanciare eccezione
});

// Arrays
assertArrayEquals(expectedArray, actualArray);

// Timeout
assertTimeout(Duration.ofSeconds(1), () -> {
    // codice da eseguire entro il timeout
});
```

## Parte 5: Test di Esempio

### CalculatorTest.java
```java
package com.esempio.corso;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    @DisplayName("Test addizione di numeri positivi")
    void testAddPositiveNumbers() {
        // Arrange
        double a = 5.0;
        double b = 3.0;
        double expected = 8.0;
        
        // Act
        double result = calculator.add(a, b);
        
        // Assert
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test divisione per zero dovrebbe lanciare eccezione")
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
    
    @Test
    @DisplayName("Test factorial con numeri positivi")
    void testFactorialPositive() {
        assertEquals(1, calculator.factorial(0));
        assertEquals(1, calculator.factorial(1));
        assertEquals(6, calculator.factorial(3));
        assertEquals(120, calculator.factorial(5));
    }
    
    @Test
    @DisplayName("Test sqrt con numero negativo")
    void testSqrtNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.sqrt(-4);
        });
    }
    
    @ParameterizedTest
    @ValueSource(doubles = {1.0, 4.0, 9.0, 16.0})
    @DisplayName("Test sqrt con numeri positivi")
    void testSqrtPositive(double input) {
        double result = calculator.sqrt(input);
        assertTrue(result >= 0);
        assertEquals(Math.sqrt(input), result, 0.0001);
    }
}
```

### BankAccountTest.java
```java
package com.esempio.corso;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    
    private BankAccount account;
    
    @BeforeEach
    void setUp() {
        account = new BankAccount("123456789", 1000.0);
    }
    
    @Test
    @DisplayName("Test creazione conto con saldo iniziale")
    void testAccountCreation() {
        assertEquals("123456789", account.getAccountNumber());
        assertEquals(1000.0, account.getBalance());
        assertTrue(account.isActive());
    }
    
    @Test
    @DisplayName("Test deposito importo valido")
    void testValidDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }
    
    @Test
    @DisplayName("Test deposito importo negativo")
    void testNegativeDeposit() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100.0);
        });
    }
    
    @Test
    @DisplayName("Test prelievo importo valido")
    void testValidWithdraw() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }
    
    @Test
    @DisplayName("Test prelievo con fondi insufficienti")
    void testInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(1500.0);
        });
    }
    
    @Test
    @DisplayName("Test operazioni su conto chiuso")
    void testClosedAccountOperations() {
        account.closeAccount();
        assertFalse(account.isActive());
        
        assertThrows(IllegalStateException.class, () -> {
            account.deposit(100.0);
        });
        
        // BUG: Questo test dovrebbe fallire perché withdraw non controlla isActive
        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(100.0);
        });
    }
}
```

## Parte 6: Coverage e Metriche

### 6.1 JaCoCo Plugin per Maven
Aggiungere al pom.xml:
```xml
<plugin>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>0.8.8</version>
    <executions>
        <execution>
            <goals>
                <goal>prepare-agent</goal>
            </goals>
        </execution>
        <execution>
            <id>report</id>
            <phase>test</phase>
            <goals>
                <goal>report</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

### 6.2 Esecuzione Coverage
```bash
mvn clean test jacoco:report
```
Report disponibile in: `target/site/jacoco/index.html`

## Parte 7: Best Practices

### 7.1 Debugging
1. **Usa nomi di variabili descrittivi**
2. **Aggiungi logging strategico**
3. **Scrivi test prima di debuggare**
4. **Usa breakpoints condizionali per cicli lunghi**
5. **Analizza lo stack trace completamente**

### 7.2 Testing
1. **Segui il pattern AAA (Arrange, Act, Assert)**
2. **Un test deve verificare una sola cosa**
3. **Test devono essere indipendenti**
4. **Usa nomi di test descrittivi**
5. **Copri casi limite ed eccezioni**
6. **Mantieni test veloci**

### 7.3 Struttura Test
```java
@Test
@DisplayName("Cosa sto testando e in che condizioni")
void nomeTestDescriptive() {
    // Arrange - Setup dati e condizioni
    String input = "test input";
    String expected = "expected result";
    
    // Act - Esegui l'operazione
    String actual = methodUnderTest(input);
    
    // Assert - Verifica risultato
    assertEquals(expected, actual, "Messaggio di errore descrittivo");
}
```

## Esercizi Pratici

1. **Debugging Exercise**: Trova e risolvi tutti i bug nelle classi fornite
2. **Test Exercise**: Scrivi test completi per tutte le funzionalità
3. **Coverage Exercise**: Raggiungi 90% di coverage
4. **Integration Exercise**: Crea test di integrazione tra Calculator e BankAccount

## Comandi Maven Utili
```bash
# Compilare il progetto
mvn compile

# Eseguire i test
mvn test

# Compilare e testare
mvn clean compile test

# Generare report coverage
mvn clean test jacoco:report

# Eseguire solo test specifici
mvn test -Dtest=CalculatorTest

# Eseguire in modalità debug
mvn test -Dmaven.surefire.debug
```

## Risorse Aggiuntive
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Eclipse Debugging Guide](https://help.eclipse.org/latest/topic/org.eclipse.jdt.doc.user/tasks/task-debugging_java_programs.htm)
- [Maven Surefire Plugin](https://maven.apache.org/surefire/maven-surefire-plugin/)
- [JaCoCo Documentation](https://www.jacoco.org/jacoco/trunk/doc/)