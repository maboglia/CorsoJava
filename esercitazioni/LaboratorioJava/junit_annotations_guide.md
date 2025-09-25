# Guida Completa alle Annotazioni JUnit 5

## 1. Annotazioni per l'Identificazione dei Test

### @Test
L'annotazione fondamentale che identifica un metodo come test.

```java
@Test
void testBasico() {
    // Questo metodo verrà eseguito come test
    assertEquals(4, 2 + 2);
}

@Test
void testConEccezione() {
    assertThrows(IllegalArgumentException.class, () -> {
        throw new IllegalArgumentException("Test exception");
    });
}
```

**Caratteristiche:**
- Il metodo deve essere `void`
- Non deve avere parametri (eccetto per i test parametrizzati)
- Non deve essere `static` (a meno che non sia in una classe `@TestInstance(Lifecycle.PER_CLASS)`)
- Può avere qualsiasi modificatore di visibilità

### @ParameterizedTest
Permette di eseguire lo stesso test con parametri diversi.

```java
@ParameterizedTest
@ValueSource(ints = {1, 2, 3, 4, 5})
@DisplayName("Test con diversi valori")
void testConParametri(int numero) {
    assertTrue(numero > 0);
    assertTrue(numero < 6);
}

@ParameterizedTest
@ValueSource(strings = {"radar", "level", "civic", "madam"})
void testPalindromi(String parola) {
    assertTrue(isPalindrome(parola));
}

@ParameterizedTest
@CsvSource({
    "1, 2, 3",
    "10, 20, 30", 
    "100, 200, 300"
})
void testAddizione(int a, int b, int risultatoAtteso) {
    assertEquals(risultatoAtteso, a + b);
}

@ParameterizedTest
@CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1)
void testDaFile(String input, String expected) {
    assertEquals(expected, processString(input));
}

@ParameterizedTest
@MethodSource("numeriProvider")
void testConMethodSource(int numero) {
    assertTrue(numero % 2 == 0);
}

static Stream<Integer> numeriProvider() {
    return Stream.of(2, 4, 6, 8, 10);
}
```

**Fonti di parametri disponibili:**
- `@ValueSource`: Per valori primitivi e stringhe
- `@CsvSource`: Per dati CSV inline
- `@CsvFileSource`: Per dati CSV da file
- `@MethodSource`: Per metodi che forniscono i dati
- `@ArgumentsSource`: Per provider personalizzati

### @RepeatedTest
Esegue un test multiple volte.

```java
@RepeatedTest(5)
@DisplayName("Test ripetuto 5 volte")
void testRipetuto() {
    double random = Math.random();
    assertTrue(random >= 0.0 && random < 1.0);
}

@RepeatedTest(value = 3, name = "Ripetizione {currentRepetition} di {totalRepetitions}")
void testConNomePersonalizzato() {
    // Il nome del test mostrerà: "Ripetizione 1 di 3", "Ripetizione 2 di 3", ecc.
}

@RepeatedTest(10)
void testConcorrenza(RepetitionInfo repetitionInfo) {
    // RepetitionInfo fornisce informazioni sulla ripetizione corrente
    int currentRep = repetitionInfo.getCurrentRepetition();
    int totalReps = repetitionInfo.getTotalRepetitions();
    
    System.out.println("Esecuzione " + currentRep + " di " + totalReps);
}
```

## 2. Annotazioni per il Ciclo di Vita

### @BeforeEach
Eseguito prima di ogni singolo test.

```java
class BankAccountTest {
    private BankAccount account;
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        // Questo metodo viene chiamato prima di ogni @Test
        account = new BankAccount("123456", 1000.0);
        calculator = new Calculator();
        System.out.println("Setup completato per un nuovo test");
    }
    
    @Test
    void testDeposito() {
        // account è già inizializzato
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }
    
    @Test  
    void testPrelievo() {
        // account è di nuovo inizializzato (nuovo oggetto)
        account.withdraw(200);
        assertEquals(800, account.getBalance());
    }
}
```

### @AfterEach
Eseguito dopo ogni singolo test.

```java
@AfterEach
void tearDown() {
    // Pulizia dopo ogni test
    if (account != null) {
        account.closeAccount();
    }
    // Chiusura connessioni, file temporanei, ecc.
    System.out.println("Cleanup completato");
}

@AfterEach
void verificaStatoSistema() {
    // Verifica che il sistema sia in stato pulito
    assertFalse(SystemStatus.hasOpenConnections());
    assertTrue(TempFileManager.isEmpty());
}
```

### @BeforeAll
Eseguito una sola volta prima di tutti i test della classe.

```java
class DatabaseTest {
    private static DatabaseConnection connection;
    private static TestDataGenerator dataGenerator;
    
    @BeforeAll
    static void setUpClass() {
        // Questo metodo deve essere static
        // Viene chiamato UNA SOLA VOLTA per tutta la classe
        connection = DatabaseManager.connect("test-database");
        dataGenerator = new TestDataGenerator();
        dataGenerator.createTestData();
        
        System.out.println("Setup della classe completato");
    }
    
    @Test
    void testQuery1() {
        // Usa la connessione condivisa
        ResultSet result = connection.query("SELECT * FROM users");
        assertNotNull(result);
    }
    
    @Test
    void testQuery2() {
        // Stessa connessione, dati già presenti
        ResultSet result = connection.query("SELECT * FROM products");
        assertNotNull(result);
    }
}
```

### @AfterAll
Eseguito una sola volta dopo tutti i test della classe.

```java
@AfterAll
static void tearDownClass() {
    // Pulizia finale, deve essere static
    if (connection != null) {
        connection.close();
    }
    dataGenerator.cleanupTestData();
    
    System.out.println("Cleanup della classe completato");
}
```

**Esempio completo del ciclo di vita:**

```java
class LifecycleTest {
    
    @BeforeAll
    static void initAll() {
        System.out.println("1. BeforeAll - eseguito una volta");
    }
    
    @BeforeEach
    void init() {
        System.out.println("2. BeforeEach - prima di ogni test");
    }
    
    @Test
    void testUno() {
        System.out.println("3. Test Uno");
    }
    
    @Test
    void testDue() {
        System.out.println("3. Test Due");  
    }
    
    @AfterEach
    void tearDown() {
        System.out.println("4. AfterEach - dopo ogni test");
    }
    
    @AfterAll
    static void tearDownAll() {
        System.out.println("5. AfterAll - eseguito una volta alla fine");
    }
}
```

**Output dell'esecuzione:**
```
1. BeforeAll - eseguito una volta
2. BeforeEach - prima di ogni test
3. Test Uno
4. AfterEach - dopo ogni test
2. BeforeEach - prima di ogni test
3. Test Due
4. AfterEach - dopo ogni test
5. AfterAll - eseguito una volta alla fine
```

## 3. Annotazioni per la Documentazione

### @DisplayName
Fornisce nomi leggibili per test e classi.

```java
@DisplayName("Test della classe Calculator")
class CalculatorTest {
    
    @Test
    @DisplayName("La somma di due numeri positivi dovrebbe restituire un risultato positivo")
    void testSommaNumeriPositivi() {
        Calculator calc = new Calculator();
        double result = calc.add(5.0, 3.0);
        assertTrue(result > 0);
        assertEquals(8.0, result);
    }
    
    @Test
    @DisplayName("➗ Divisione per zero → Dovrebbe lanciare ArithmeticException")
    void testDivisionePerZero() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
    
    @ParameterizedTest
    @DisplayName("🔢 Test fattoriale con diversi input")
    @ValueSource(ints = {0, 1, 3, 5, 10})
    void testFattoriale(int n) {
        Calculator calc = new Calculator();
        int result = calc.factorial(n);
        assertTrue(result > 0);
    }
}
```

**Vantaggi di @DisplayName:**
- Report più leggibili
- Possibilità di usare emoji e caratteri speciali
- Descrizioni più dettagliate del comportamento testato
- Migliore documentazione vivente del codice

## 4. Annotazioni per il Controllo dell'Esecuzione

### @Disabled
Disabilita temporaneamente test o classi.

```java
@Test
@Disabled("Test disabilitato fino alla risoluzione del bug #123")
void testProblematico() {
    // Questo test non verrà eseguito
    failingMethod();
}

@Test
@Disabled // Senza messaggio
void testInSviluppo() {
    // Test ancora da implementare
}

@Disabled("Classe non ancora pronta per il testing")
class ClasseInSviluppo {
    // Tutti i test in questa classe saranno ignorati
    
    @Test
    void test1() { }
    
    @Test
    void test2() { }
}
```

### @EnabledOnOs / @DisabledOnOs
Condiziona l'esecuzione in base al sistema operativo.

```java
@Test
@EnabledOnOs(OS.WINDOWS)
void testSoloSuWindows() {
    // Eseguito solo su Windows
    WindowsSpecificOperation.execute();
}

@Test
@EnabledOnOs({OS.LINUX, OS.MAC})
void testSuUnixLike() {
    // Eseguito solo su Linux o Mac
    UnixCommand.execute();
}

@Test
@DisabledOnOs(OS.WINDOWS)
void testNonSuWindows() {
    // Non eseguito su Windows
    BashScript.run();
}
```

### @EnabledOnJre / @DisabledOnJre
Condiziona l'esecuzione in base alla versione Java.

```java
@Test
@EnabledOnJre(JRE.JAVA_8)
void testSoloJava8() {
    // Funzionalità specifica di Java 8
}

@Test
@EnabledOnJre({JRE.JAVA_11, JRE.JAVA_17})
void testJavaModerne() {
    // Test per versioni moderne
    var result = methodWithVarKeyword();
    assertNotNull(result);
}

@Test
@DisabledOnJre(JRE.JAVA_8)
void testNonJava8() {
    // Usa funzionalità non disponibili in Java 8
    Stream.of(1, 2, 3).takeWhile(x -> x < 3);
}
```

### @EnabledIf / @DisabledIf
Condizioni personalizzate basate su system properties o metodi.

```java
@Test
@EnabledIf("java.util.logging.manager")
void testSeLoggingManagerPresente() {
    // Eseguito solo se system property presente
}

@Test
@DisabledIf("user.name == 'guest'")  
void testNonPerUtentiGuest() {
    // Non eseguito se utente è 'guest'
}

@Test
@EnabledIf("customCondition")
void testConConditionePersonalizzata() {
    // Eseguito solo se il metodo customCondition() ritorna true
}

boolean customCondition() {
    return System.getProperty("test.environment").equals("production");
}
```

## 5. Annotazioni per la Gestione delle Eccezioni

### Esempio Avanzato con Timeout

```java
@Test
@DisplayName("Test che deve completare entro 2 secondi")
@Timeout(value = 2, unit = TimeUnit.SECONDS)
void testConTimeout() {
    // Simulazione operazione lunga
    try {
        Thread.sleep(1000); // OK, meno di 2 secondi
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
    assertTrue(true);
}

@Test
@Timeout(1) // Default: secondi
void testTimeoutDefault() {
    // Deve completare entro 1 secondo
    performFastOperation();
}
```

## 6. Annotazioni per il Raggruppamento

### @Tag
Permette di raggruppare e filtrare i test.

```java
@Test
@Tag("fast")
@Tag("unit")
void testVeloce() {
    // Test rapido e unitario
    assertEquals(4, 2 + 2);
}

@Test  
@Tag("slow")
@Tag("integration")
void testLento() {
    // Test di integrazione più lento
    DatabaseConnection conn = connectToDatabase();
    ResultSet result = conn.query("SELECT * FROM large_table");
    assertNotNull(result);
}

@Test
@Tag("api")
@Tag("external")
void testChiamataApi() {
    // Test che chiama servizi esterni
    ApiResponse response = apiClient.call();
    assertEquals(200, response.getStatusCode());
}
```

**Esecuzione con filtri Maven:**
```bash
# Esegui solo test veloci
mvn test -Dgroups="fast"

# Esegui test di integrazione
mvn test -Dgroups="integration"

# Escludi test lenti
mvn test -DexcludedGroups="slow"

# Combinazioni
mvn test -Dgroups="fast & unit"
mvn test -Dgroups="api | integration"
```

### @Nested
Organizza test in classi annidate per struttura logica.

```java
@DisplayName("Test completi per BankAccount")
class BankAccountTest {
    
    private BankAccount account;
    
    @BeforeEach
    void setUp() {
        account = new BankAccount("123456", 1000.0);
    }
    
    @Nested
    @DisplayName("Test per operazioni di deposito")
    class DepositTests {
        
        @Test
        @DisplayName("Deposito valido dovrebbe aumentare il saldo")
        void depositoValidoAumentaSaldo() {
            double importoIniziale = account.getBalance();
            account.deposit(500);
            assertEquals(importoIniziale + 500, account.getBalance());
        }
        
        @Test
        @DisplayName("Deposito di importo negativo dovrebbe lanciare eccezione")
        void depositoNegativoLanciaEccezione() {
            assertThrows(IllegalArgumentException.class, 
                () -> account.deposit(-100));
        }
        
        @Test
        @DisplayName("Deposito zero dovrebbe lanciare eccezione")
        void depositoZeroLanciaEccezione() {
            assertThrows(IllegalArgumentException.class, 
                () -> account.deposit(0));
        }
    }
    
    @Nested
    @DisplayName("Test per operazioni di prelievo")
    class WithdrawTests {
        
        @Test
        @DisplayName("Prelievo valido dovrebbe diminuire il saldo")
        void prelievoValidoDiminuisceSaldo() {
            double importoIniziale = account.getBalance();
            account.withdraw(300);
            assertEquals(importoIniziale - 300, account.getBalance());
        }
        
        @Test
        @DisplayName("Prelievo superiore al saldo dovrebbe fallire")
        void prelievoEccessivoFallisce() {
            assertThrows(IllegalArgumentException.class, 
                () -> account.withdraw(1500));
        }
        
        @Nested
        @DisplayName("Test per conto chiuso")
        class ClosedAccountTests {
            
            @BeforeEach
            void chiudiConto() {
                account.closeAccount();
            }
            
            @Test
            @DisplayName("Prelievo da conto chiuso dovrebbe fallire")
            void prelievoContChiusoFallisce() {
                assertThrows(IllegalStateException.class, 
                    () -> account.withdraw(100));
            }
            
            @Test
            @DisplayName("Deposito su conto chiuso dovrebbe fallire")
            void depositoContoChiusoFallisce() {
                assertThrows(IllegalStateException.class, 
                    () -> account.deposit(100));
            }
        }
    }
    
    @Nested
    @DisplayName("Test per stato del conto")
    class AccountStatusTests {
        
        @Test
        @DisplayName("Conto nuovo dovrebbe essere attivo")
        void contoNuovoAttivo() {
            assertTrue(account.isActive());
        }
        
        @Test
        @DisplayName("Conto chiuso non dovrebbe essere attivo")
        void contoChiusoNonAttivo() {
            account.closeAccount();
            assertFalse(account.isActive());
        }
    }
}
```

## 7. Annotazioni Avanzate

### @TestInstance
Controlla il ciclo di vita delle istanze di test.

```java
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestConIstanzaPerClasse {
    
    private ExpensiveResource resource;
    
    // Non serve static perché c'è una sola istanza della classe di test
    @BeforeAll  
    void setUpExpensiveResource() {
        resource = new ExpensiveResource();
        resource.initialize();
    }
    
    @Test
    void testUno() {
        // Usa la stessa istanza resource
        resource.doSomething();
    }
    
    @Test
    void testDue() {
        // Stessa istanza resource
        resource.doSomethingElse();
    }
    
    @AfterAll
    void cleanUpResource() {
        resource.cleanup();
    }
}
```

### @TestMethodOrder
Controlla l'ordine di esecuzione dei test.

```java
@TestMethodOrder(OrderAnnotation.class)
class TestConOrdine {
    
    @Test
    @Order(1)
    void primoTest() {
        System.out.println("Primo test");
    }
    
    @Test  
    @Order(3)
    void terzoTest() {
        System.out.println("Terzo test");
    }
    
    @Test
    @Order(2)
    void secondoTest() {
        System.out.println("Secondo test");
    }
}

@TestMethodOrder(MethodName.class)
class TestOrdineAlfabetico {
    // I test vengono eseguiti in ordine alfabetico del nome del metodo
    
    void aTest() { }
    void bTest() { }
    void cTest() { }
}
```

## 8. Esempio Completo con Tutte le Annotazioni

```java
@DisplayName("🧮 Test Suite Completa per Calculator")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
class CalculatorCompleteTest {
    
    private Calculator calculator;
    private TestLogger logger;
    
    @BeforeAll
    void setUpClass() {
        logger = TestLogger.create("CalculatorTest");
        logger.info("Inizio test suite Calculator");
    }
    
    @BeforeEach
    void setUp(TestInfo testInfo) {
        calculator = new Calculator();
        logger.info("Preparazione test: " + testInfo.getDisplayName());
    }
    
    @Test
    @Order(1)
    @DisplayName("➕ Test addizione base")
    @Tag("fast")
    @Tag("arithmetic")
    void testAddizione() {
        assertEquals(8.0, calculator.add(5.0, 3.0));
        assertEquals(0.0, calculator.add(-5.0, 5.0));
    }
    
    @ParameterizedTest
    @Order(2)
    @DisplayName("➗ Test divisione con parametri multipli")
    @Tag("parametrized")
    @CsvSource({
        "10.0, 2.0, 5.0",
        "15.0, 3.0, 5.0", 
        "100.0, 4.0, 25.0"
    })
    void testDivisioneParametrizzata(double dividend, double divisor, double expected) {
        assertEquals(expected, calculator.divide(dividend, divisor), 0.0001);
    }
    
    @Test
    @Order(3)
    @DisplayName("💥 Test divisione per zero")
    @Tag("exception")
    @EnabledOnOs({OS.LINUX, OS.WINDOWS, OS.MAC})
    void testDivisionePerZero() {
        ArithmeticException exception = assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(10.0, 0.0),
            "La divisione per zero dovrebbe lanciare ArithmeticException"
        );
        
        assertThat(exception.getMessage())
            .contains("Division by zero");
    }
    
    @RepeatedTest(value = 5, name = "🔄 Test casualità - Ripetizione {currentRepetition}/{totalRepetitions}")
    @Tag("random")
    @Tag("slow")
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testOperazioneCasuale(RepetitionInfo repetitionInfo) {
        double a = Math.random() * 100;
        double b = Math.random() * 100;
        
        double result = calculator.add(a, b);
        
        assertTrue(result >= 0, "La somma di due numeri positivi dovrebbe essere positiva");
        assertTrue(result <= 200, "La somma dovrebbe essere ragionevole");
        
        logger.debug("Ripetizione " + repetitionInfo.getCurrentRepetition() + 
                    ": " + a + " + " + b + " = " + result);
    }
    
    @Test
    @Order(4)
    @DisplayName("🚫 Test disabilitato per sviluppo futuro")
    @Disabled("Funzionalità non ancora implementata - Issue #456")
    @Tag("future")
    void testFunzionalitaFutura() {
        // Test per funzionalità da implementare
        calculator.advancedOperation();
    }
    
    @Nested
    @DisplayName("🔢 Test operazioni complesse")
    @Tag("complex")
    class OperazioniComplesse {
        
        @BeforeEach
        void setUpComplex() {
            // Setup specifico per test complessi
            calculator.setHighPrecisionMode(true);
        }
        
        @Test
        @DisplayName("📊 Test fattoriale")
        void testFattoriale() {
            assertEquals(1, calculator.factorial(0));
            assertEquals(1, calculator.factorial(1));
            assertEquals(6, calculator.factorial(3));
            assertEquals(120, calculator.factorial(5));
        }
        
        @ParameterizedTest
        @DisplayName("√ Test radice quadrata")
        @ValueSource(doubles = {0.0, 1.0, 4.0, 9.0, 16.0, 25.0})
        void testRadiceQuadrata(double input) {
            double result = calculator.sqrt(input);
            assertEquals(Math.sqrt(input), result, 0.0001);
            assertTrue(result >= 0);
        }
        
        @Test
        @DisplayName("⚠️ Test radice di numero negativo")
        void testRadiceNegativa() {
            IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.sqrt(-4.0)
            );
            
            assertThat(exception.getMessage())
                .containsIgnoringCase("negative");
        }
    }
    
    @AfterEach
    void tearDown(TestInfo testInfo) {
        logger.info("Completato test: " + testInfo.getDisplayName());
        // Cleanup per ogni test
    }
    
    @AfterAll  
    void tearDownClass() {
        logger.info("Fine test suite Calculator");
        logger.close();
    }
}
```

Questo esempio mostra come tutte le annotazioni lavorano insieme per creare una test suite completa, organizzata e ben documentata. Ogni annotazione ha il suo ruolo specifico nel rendere i test più espressivi, organizzati e controllabili.