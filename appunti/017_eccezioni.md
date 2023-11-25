# Eccezioni

Le eccezioni in Java sono eventi anomali o condizioni di errore che si verificano durante l'esecuzione di un programma. Le eccezioni offrono un modo per gestire situazioni impreviste e problematiche che potrebbero verificarsi durante l'esecuzione del codice.

---

Ecco alcuni concetti fondamentali sulle eccezioni in Java:

1. **Tipi di Eccezioni:**
   - **Eccezioni Controllate:** Sono eccezioni che devono essere gestite esplicitamente nel codice, altrimenti il programma non verrà compilato. Ad esempio, le eccezioni di tipo `IOException`.
   - **Eccezioni Non Controllate:** Sono eccezioni che possono essere gestite ma non è obbligatorio farlo. Ad esempio, le eccezioni di tipo `NullPointerException` o `ArrayIndexOutOfBoundsException`.

---

2. **Blocchi Try-Catch:**
   - Per gestire un'eccezione, è possibile utilizzare blocchi `try-catch`. Il codice che potrebbe generare un'eccezione viene inserito nel blocco `try`, e il blocco `catch` gestisce l'eccezione se si verifica.

   ```java
   try {
       // Codice che potrebbe generare un'eccezione
   } catch (TipoEccezione e) {
       // Gestione dell'eccezione
   }
   ```

---

3. **Finally:**
   - Il blocco `finally` viene utilizzato per contenere il codice che deve essere eseguito sempre, indipendentemente dal verificarsi o meno di un'eccezione. Ad esempio, la chiusura di risorse aperte.

   ```java
   try {
       // Codice che potrebbe generare un'eccezione
   } catch (TipoEccezione e) {
       // Gestione dell'eccezione
   } finally {
       // Codice che viene eseguito sempre
   }
   ```

---

4. **Throw e Throws:**
   - La parola chiave `throw` viene utilizzata per lanciare manualmente un'eccezione in un blocco di codice. La parola chiave `throws` viene utilizzata nella firma del metodo per indicare che un metodo potrebbe lanciare una particolare eccezione.

   ```java
   void metodo() throws TipoEccezione {
       // Codice che potrebbe generare un'eccezione
       if (condizione) {
           throw new TipoEccezione("Messaggio di errore");
       }
   }
   ```

---

5. **Gerarchia di Eccezioni:**
   - Le eccezioni in Java seguono una gerarchia di classi. La classe `Throwable` è la radice di questa gerarchia, suddividendosi in `Exception` (eccezioni controllate) e `RuntimeException` (eccezioni non controllate).

   ```java
   try {
       // Codice che potrebbe generare un'eccezione
   } catch (Exception e) {
       // Gestione generica delle eccezioni
   }
   ```

---

6. **Creare Eccezioni Personalizzate:**
   - È possibile creare eccezioni personalizzate estendendo la classe `Exception` o `RuntimeException`. Ciò può essere utile per gestire situazioni specifiche all'interno del proprio codice.

   ```java
   public class MiaEccezione extends Exception {
       // Costruttore, metodi, ecc.
   }
   ```

---

Le eccezioni forniscono un meccanismo robusto per gestire condizioni anomale durante l'esecuzione di un programma e migliorano la manutenibilità e la robustezza del codice.

---

## Le RuntimeException comprese nel pacchetto java.lang

Eccezione|Significato
---|---
ArithmeticException|Operazione matematica non valida.
ArrayIndexOutOfBoundsException|L'indice usato in un array non è valido.
ArrayStoreException|Incompatibilità di tipo durante la assegnazione di un elemento di un array.
ClassCastException|Conversione di tipo non valida.
IllegalArgumentException|Argomento di un metodo non valido.
IllegalMonitorStateException|Monitor su thread non valido.
IllegalStateException|Oggetto in uno stato che non consente l'operazione richiesta.
IllegalThreadStateException|Operazione incompatibile con lo stato attuale di un thread.
IndexOutOfBoundsException|Indice non valido.
NegativeArraySizeException|Array creato con dimensione negativa.
NullPointerException|Utilizzo non corretto di un valore null.
NumberFormatException|Conversione non valida di una stringa in un valore numerico.
SecurityException|Violazione delle norme di sicurezza.
StringIndexOutOfBoundsException|Indice non valido per i caratteri di una stringa.
UnsupportedOperationException|Operazione non supportata.

---

[esempi](https://github.com/maboglia/CorsoJava/blob/master/esempi/10_eccezioni.md)
