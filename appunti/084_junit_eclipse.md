# Esempio d'uso di JUnit in Eclipse

Ecco un esempio di base di come utilizzare JUnit con Eclipse per creare e eseguire un test. In questo esempio, creeremo una classe di test per una semplice calcolatrice.

---

## Passo 1: Creare un progetto Java in Eclipse.

- Apri Eclipse e seleziona "File" -> "New" -> "Java Project".
- Assegna un nome al tuo progetto (ad esempio, "CalculatorTest") e fai clic su "Finish".

---

## Passo 2: Aggiungi JUnit al tuo progetto.

- Clic destro sul tuo progetto -> "Build Path" -> "Add Libraries" -> "Junit" -> "JUnit 4" -> "Finish".

---

## Passo 3: Crea la classe di test.

- Clic destro sulla cartella "src" nel tuo progetto -> "New" -> "Class".
- Assegna un nome alla tua classe di test (ad esempio, "CalculatorTest") e seleziona l'opzione "public static void main(String[] args)".
- Fai clic su "Finish".

---

## Passo 4: Scrivi il test utilizzando JUnit.

- Importa le necessarie classi di JUnit e il tuo codice da testare.
- Scrivi metodi di test utilizzando annotazioni come `@Test` e assert statements.

Ecco un esempio di come potrebbe apparire la tua classe di test:

```java
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }
}
```

---

## Passo 5: Scrivi la classe da testare.

- Crea una classe separata che implementa la logica che desideri testare. In questo caso, una semplice classe `Calculator`.

```java
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
```

---

## Passo 6: Esegui il test.

- Clic destro sulla tua classe di test (`CalculatorTest`) -> "Run As" -> "JUnit Test".
- Verifica l'esito del test nella finestra "JUnit" in basso nell'Eclipse.

Questo esempio mostra come utilizzare JUnit in Eclipse per testare una semplice classe `Calculator`. Puoi espandere questa struttura di base per scrivere test più complessi e organizzati in suite, utilizzando funzionalità aggiuntive di JUnit come `@Before`, `@After`, e altro ancora.
