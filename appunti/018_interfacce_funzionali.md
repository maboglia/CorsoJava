# Interfacce funzionali

Le interfacce funzionali sono un concetto introdotto in Java 8 e rappresentano un tipo di interfaccia che contiene un solo metodo astratto. Queste interfacce sono strettamente legate alla programmazione funzionale e sono utilizzate in congiunzione con le espressioni lambda per consentire una scrittura più concisa e leggibile del codice. Ecco alcuni aspetti importanti delle interfacce funzionali in Java:

---

1. **Il Concetto di Interfaccia Funzionale:**
   - Un'interfaccia funzionale è un'interfaccia che contiene esattamente un metodo astratto. Questo metodo rappresenta il contratto che le classi che implementano l'interfaccia devono soddisfare.

   ```java
   @FunctionalInterface
   public interface OperazioneMatematica {
       int eseguiOperazione(int a, int b);
   }
   ```

   L'annotazione `@FunctionalInterface` è opzionale ma consigliata; essa assicura che l'interfaccia abbia un solo metodo astratto, e se ciò non è vero, genera un errore di compilazione.

---

2. **Lambda Expressions:**
   - Le espressioni lambda consentono di definire in modo conciso implementazioni di interfacce funzionali. Questo riduce notevolmente la quantità di codice necessario.

   ```java
   OperazioneMatematica somma = (a, b) -> a + b;
   ```

   In questo esempio, `somma` è un'istanza di un'interfaccia funzionale, implementata con un'espressione lambda.

---

3. **Metodi di Default e Statici:**
   - Le interfacce funzionali possono includere metodi di default (implementazioni predefinite) e metodi statici senza violare il requisito di avere un solo metodo astratto.

   ```java
   @FunctionalInterface
   public interface OperazioneAvanzata extends OperazioneMatematica {
       default int doppio(int a) {
           return a * 2;
       }

       static int triplo(int a) {
           return a * 3;
       }
   }
   ```

---

4. **Tipi di Ritorno:**
   - L'uso di un'interfaccia funzionale non è limitato a operazioni con tipi primitivi. Può anche essere utilizzata con tipi di ritorno più complessi, come oggetti o strutture dati.

   ```java
   @FunctionalInterface
   public interface EstrattoreStringa {
       String estrai(String input);
   }
   ```

---

5. **API di Java per le Interfacce Funzionali:**
   - Java fornisce un pacchetto `java.util.function` che contiene diverse interfacce funzionali predefinite, come `Function`, `Predicate`, e `Consumer`, progettate per gestire tipi di operazioni comuni nella programmazione funzionale.

   ```java
   import java.util.function.Predicate;

   public class Esempio {
       public static void main(String[] args) {
           Predicate<String> isStringNotEmpty = s -> !s.isEmpty();
           System.out.println(isStringNotEmpty.test("Hello")); // Output: true
       }
   }
   ```

---

Le interfacce funzionali insieme alle espressioni lambda offrono un modo elegante per lavorare con funzionalità di alto livello in Java, rendendo il codice più pulito e leggibile. Questi concetti sono particolarmente utili quando si lavora con API che richiedono oggetti con un solo metodo astratto, come è il caso delle operazioni con i thread o dei metodi di callback.

---

```java

Studente studente = getUtente(1);

//passo i dati come argomento
BigDecimal mediaVoti = calcolaMedia(studente);


//passaggio come funzionalità
ExecutorService thread = Executors.newFixedThreadPool(4);

//funzionalità da eseguire
RUnnable calcolaMedia = new Runnable(){
    public void run(){
        //calcola media voti
    }
}

//passo la funzionalità come argomento
thread.submit(calcolaMedia);

//la funzionalità è descritta nel metodo run()
public interface Runnable {
    void run();
}

```

---

## Le interfacce funzionali rappresentano funzionalità invece di dati

Per esempio

* Runnable
  * void run()
* Callable<V>
  * V call() throws Exception
* Comparator<T>
  * int compare(T o1, T o2)

Queste interfacce, già presenti in Java da molto tempo, possono essere definite interfacce funzionali.
Da Java 8 si possono usare con tali interfacce le **Espressioni Lambda**

---

## Espressioni Lambda

```java
Comparator<Utente> comparator = new Comparator<Utente>(){
    @Override
    public int compare(Utente u1, Utente u2){
        return u1.getId.compareTo(u2.getId());
    }
};
```

con le Lambda diventa

```java
Comparator<Utente> comparator = (u1, u2) -> u1.getId.compareTo(u2.getId());
```

---

## Nuove interfacce funzionali in Java 8
* Predicate<T>
  * boolean test(T t)
* Consumer<T>
  * void accept(T t)
* Supplier<T>
  * T get()
* Function<T, R>
  * R apply(T t)

---

![FunctionaInterface_01.png](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/FunctionaInterface_01.png)

---

I `Predicate` in Java sono una parte delle interfacce funzionali introdotte con Java 8 nel pacchetto `java.util.function`. Un `Predicate` rappresenta una condizione che può essere valutata come vera o falsa per un determinato input. È comunemente utilizzato per definire condizioni nei filtri o nelle operazioni di selezione in diverse librerie e framework. Ecco alcuni aspetti importanti sui `Predicate`:

---

1. **Interfaccia Predicate:**
   - L'interfaccia `Predicate` è parametrizzata per indicare il tipo di oggetto su cui verrà eseguita la condizione. Essa dichiara un solo metodo astratto chiamato `test`.

   ```java
   @FunctionalInterface
   public interface Predicate<T> {
       boolean test(T t);
   }
   ```

---

2. **Utilizzo di Predicate:**
   - I `Predicate` sono spesso utilizzati in combinazione con altre classi o interfacce che richiedono una valutazione booleana, come i filtri nelle raccolte o le operazioni di selezione.

   ```java
   Predicate<String> lunghezzaSuperioreAQuattro = s -> s.length() > 4;

   if (lunghezzaSuperioreAQuattro.test("Java")) {
       System.out.println("La stringa ha lunghezza maggiore di 4.");
   }
   ```

---

3. **Metodi Predefiniti in Predicate:**
   - L'interfaccia `Predicate` fornisce alcuni metodi predefiniti che consentono la composizione e la combinazione di predicati. Ad esempio, i metodi `and`, `or`, e `negate`.

   ```java
   Predicate<Integer> maggioreDiZero = n -> n > 0;
   Predicate<Integer> minoreDiDieci = n -> n < 10;

   Predicate<Integer> traZeroEDieci = maggioreDiZero.and(minoreDiDieci);

   if (traZeroEDieci.test(5)) {
       System.out.println("Il numero è compreso tra 0 e 10.");
   }
   ```

---

4. **Composizione di Predicati:**
   - È possibile combinare predicati in modi complessi utilizzando i metodi di composizione. Ad esempio, `and`, `or`, e `negate` consentono di creare nuovi predicati combinando quelli esistenti.

   ```java
   Predicate<String> iniziaConA = s -> s.startsWith("A");
   Predicate<String> lunghezzaSuperioreAQuattro = s -> s.length() > 4;

   Predicate<String> condizioneComplessa = iniziaConA.and(lunghezzaSuperioreAQuattro);

   if (condizioneComplessa.test("Avanzato")) {
       System.out.println("La stringa inizia con 'A' e ha lunghezza maggiore di 4.");
   }
   ```

---

5. **Metodi Statici in Predicate:**
   - L'interfaccia `Predicate` fornisce anche alcuni metodi statici di utilità. Ad esempio, il metodo `isEqual` restituisce un predicato che verifica l'uguaglianza con un oggetto dato.

   ```java
   Predicate<String> isEqualJava = Predicate.isEqual("Java");

   if (isEqualJava.test("Java")) {
       System.out.println("La stringa è uguale a 'Java'.");
   }
   ```

I `Predicate` forniscono un modo flessibile e potente per esprimere condizioni booleane in Java, specialmente quando si tratta di filtrare dati o definire comportamenti condizionali. La loro natura funzionale li rende particolarmente adatti all'utilizzo con le espressioni lambda.

---

### Esempio uso Predicate<T>

```java
        List<Utente> utenti = Utente.getAllUsers();
        utenti.removeIf(new Predicate<Utente>() {
            @Override
            public boolean test(Utente utente) {
                return !utente.isAssente();
            }
        });
        //con le Lambda diventa
        utenti.removeIf(utente->!utente.isAssente());

```

---

![FunctionaInterface_02.png](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/FunctionaInterface_02.png)

---

## Consumer

L'interfaccia `Consumer` fa parte del pacchetto `java.util.function` introdotto in Java 8. Un `Consumer` rappresenta un'operazione che accetta un argomento di input e non restituisce alcun risultato. È spesso utilizzato quando si vuole eseguire un'azione su ciascun elemento di una collezione o quando si vuole elaborare un dato in modo specifico senza restituire un valore. Ecco alcuni aspetti importanti sui `Consumer`:

---

1. **Interfaccia Consumer:**
   - L'interfaccia `Consumer` è parametrizzata per indicare il tipo di oggetto su cui verrà eseguita l'operazione. Essa dichiara un solo metodo astratto chiamato `accept`.

   ```java
   @FunctionalInterface
   public interface Consumer<T> {
       void accept(T t);
   }
   ```

---

2. **Utilizzo di Consumer:**
   - I `Consumer` sono spesso utilizzati in combinazione con altre classi o interfacce che richiedono un'azione senza restituire un valore, come i metodi `forEach` nelle raccolte.

   ```java
   Consumer<String> stampaMessaggio = s -> System.out.println("Messaggio: " + s);

   stampaMessaggio.accept("Hello, World!");
   ```

---

3. **Metodi Predefiniti in Consumer:**
   - L'interfaccia `Consumer` fornisce alcuni metodi predefiniti che consentono la composizione e la concatenazione di consumatori. Ad esempio, il metodo `andThen` permette di concatenare due consumer.

   ```java
   Consumer<String> stampaInMaiuscolo = s -> System.out.println(s.toUpperCase());

   Consumer<String> operazioneComposta = stampaMessaggio.andThen(stampaInMaiuscolo);

   operazioneComposta.accept("Hello, World!");
   ```

---

4. **Utilizzo con Raccolte:**
   - I `Consumer` sono spesso utilizzati per eseguire un'azione su ciascun elemento di una raccolta.

   ```java
   List<String> elencoNomi = Arrays.asList("Alice", "Bob", "Charlie");

   Consumer<String> stampaNome = nome -> System.out.println("Nome: " + nome);

   elencoNomi.forEach(stampaNome);
   ```

---

5. **Esempi di Utilizzo con Map e Stream:**
   - I `Consumer` possono essere utilizzati in combinazione con operazioni su flussi (`Stream`) per eseguire azioni su elementi di una raccolta in modo conciso.

   ```java
   Map<Integer, String> mappa = Map.of(1, "Uno", 2, "Due", 3, "Tre");

   Consumer<Map.Entry<Integer, String>> stampaEntry = entry -> System.out.println(entry.getKey() + ": " + entry.getValue());

   mappa.entrySet().forEach(stampaEntry);
   ```

---

6. **Metodi Statici in Consumer:**
   - L'interfaccia `Consumer` fornisce alcuni metodi statici di utilità. Ad esempio, il metodo `identity` restituisce un consumatore che esegue l'operazione di identità.

   ```java
   Consumer<String> identita = Consumer.identity();

   identita.accept("Qualsiasi Stringa");
   ```

I `Consumer` sono utili quando si desidera eseguire operazioni su elementi di una collezione o su oggetti specifici senza restituire alcun valore. La loro natura funzionale li rende particolarmente adatti all'utilizzo con le espressioni lambda e con le nuove funzionalità introdotte in Java 8.

---

### Esempio uso Consumer<T>

```java

    static void stampaUtente(Utente u){
        System.out.println(u);
    }

    public static void main(String[] args) {

        List<Utente> utenti = Utente.getAllUsers();
        utenti.removeIf(new Predicate<Utente>() {
            @Override
            public boolean test(Utente utente) {
                return !utente.isAssente();
            }
        });

        utenti.stream().forEach(utente->stampaUtente(utente));


    }

```

---

![FunctionaInterface_03.png](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/FunctionaInterface_03.png)

---

## Supplier

L'interfaccia `Supplier` è parte del pacchetto `java.util.function` introdotto in Java 8. Un `Supplier` rappresenta un fornitore di un risultato, senza alcun argomento in ingresso. È spesso utilizzato quando si desidera generare o fornire un valore, ad esempio in situazioni di lazy loading o quando è necessario generare un valore dinamicamente. Ecco alcuni aspetti importanti su `Supplier`:

---

1. **Interfaccia Supplier:**
   - L'interfaccia `Supplier` è parametrizzata per indicare il tipo di oggetto che verrà fornito. Essa dichiara un solo metodo astratto chiamato `get`.

   ```java
   @FunctionalInterface
   public interface Supplier<T> {
       T get();
   }
   ```

---

2. **Utilizzo di Supplier:**
   - I `Supplier` sono spesso utilizzati per generare valori in modo lazy, cioè solo quando il valore è effettivamente richiesto.

   ```java
   Supplier<Double> fornisciNumeroCasuale = () -> Math.random();

   double numeroCasuale = fornisciNumeroCasuale.get();

   System.out.println("Numero casuale: " + numeroCasuale);
   ```

---

3. **Utilizzo con Lazy Loading:**
   - L'interfaccia `Supplier` è utile in situazioni in cui si desidera ritardare il calcolo o l'ottenimento di un valore fino a quando non è effettivamente richiesto.

   ```java
   class Configurazione {
       // Alcune configurazioni complesse o costose
   }

   class Applicazione {
       private Supplier<Configurazione> configurazioneLazy = () -> calcolaConfigurazione();

       private Configurazione calcolaConfigurazione() {
           // Logica per calcolare la configurazione
           return new Configurazione();
       }

       public void eseguiApplicazione() {
           Configurazione configurazione = configurazioneLazy.get();
           // Utilizza la configurazione
       }
   }
   ```

---

4. **Metodi Statici in Supplier:**
   - L'interfaccia `Supplier` fornisce alcuni metodi statici di utilità. Ad esempio, il metodo `of` crea un fornitore costante che restituisce sempre lo stesso valore.

   ```java
   Supplier<String> fornitoreCostante = Supplier.of("Valore costante");

   String valore = fornitoreCostante.get();

   System.out.println(valore);  // Output: Valore costante
   ```

---

5. **Utilizzo con Stream API:**
   - I `Supplier` possono essere utilizzati con Stream API per generare sequenze di valori in modo dinamico.

   ```java
   Stream.generate(() -> Math.random())
         .limit(5)
         .forEach(System.out::println);
   ```

---

6. **Esempio con Combinazione di Supplier:**
   - È possibile combinare diversi fornitori utilizzando i metodi di composizione per creare fornitori più complessi.

   ```java
   Supplier<String> primaParte = () -> "Hello";
   Supplier<String> secondaParte = () -> " World";

   Supplier<String> messaggioCompleto = () -> primaParte.get() + secondaParte.get();

   System.out.println(messaggioCompleto.get());  // Output: Hello World
   ```

I `Supplier` sono utili quando si desidera ritardare la generazione di un valore fino a quando non è effettivamente richiesto o quando si desidera creare sequenze di valori dinamicamente. La loro natura funzionale li rende particolarmente adatti all'utilizzo con le espressioni lambda e con le nuove funzionalità introdotte in Java 8.

---

### Esempio uso Supplier<T>

![FunctionaInterface_04.png](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/FunctionaInterface_04.png)

---

## Function

L'interfaccia `Function` è parte del pacchetto `java.util.function` introdotto in Java 8. Una `Function` rappresenta una funzione che accetta un argomento di input e restituisce un risultato. È spesso utilizzata per eseguire trasformazioni o operazioni sui dati, dove l'output dipende dall'input. Ecco alcuni aspetti importanti sulla `Function`:

---

1. **Interfaccia Function:**
   - L'interfaccia `Function` è parametrizzata per indicare il tipo di oggetto di input (`T`) e il tipo di oggetto di output (`R`). Essa dichiara un solo metodo astratto chiamato `apply`.

   ```java
   @FunctionalInterface
   public interface Function<T, R> {
       R apply(T t);
   }
   ```

---

2. **Utilizzo di Function:**
   - Le `Function` sono spesso utilizzate in combinazione con altre classi o interfacce che richiedono una trasformazione o un'applicazione di funzione.

   ```java
   Function<String, Integer> lunghezzaStringa = s -> s.length();

   int lunghezza = lunghezzaStringa.apply("Java");

   System.out.println("La lunghezza della stringa è: " + lunghezza);
   ```

---

3. **Metodi Predefiniti in Function:**
   - L'interfaccia `Function` fornisce alcuni metodi predefiniti che consentono la composizione e la concatenazione di funzioni. Ad esempio, il metodo `andThen` permette di concatenare due funzioni.

   ```java
   Function<String, Integer> lunghezzaStringa = s -> s.length();
   Function<Integer, String> descriviLunghezza = n -> "La lunghezza è " + n;

   Function<String, String> lunghezzaDescrittiva = lunghezzaStringa.andThen(descriviLunghezza);

   String risultato = lunghezzaDescrittiva.apply("Java");

   System.out.println(risultato);
   ```

---

4. **Utilizzo con Raccolte e Stream:**
   - Le `Function` sono spesso utilizzate con le operazioni su flussi (`Stream`) per trasformare i dati all'interno di una raccolta.

   ```java
   List<String> elencoNomi = Arrays.asList("Alice", "Bob", "Charlie");

   Function<String, String> trasformaInMaiuscolo = s -> s.toUpperCase();

   List<String> nomiInMaiuscolo = elencoNomi.stream().map(trasformaInMaiuscolo).collect(Collectors.toList());

   System.out.println(nomiInMaiuscolo);
   ```

---

5. **Metodi Statici in Function:**
   - L'interfaccia `Function` fornisce alcuni metodi statici di utilità. Ad esempio, il metodo `identity` restituisce una funzione che restituisce il suo input senza modifiche.

   ```java
   Function<String, String> identita = Function.identity();

   String risultato = identita.apply("Java");

   System.out.println(risultato);
   ```

---

6. **Esempio con Combinazione di Funzioni:**
   - È possibile combinare diverse funzioni utilizzando i metodi di composizione per creare trasformazioni più complesse.

   ```java
   Function<String, Integer> lunghezzaStringa = s -> s.length();
   Function<Integer, String> descriviLunghezza = n -> "La lunghezza è " + n;
   
   Function<String, String> trasformazioneComposta = lunghezzaStringa.andThen(descriviLunghezza);

   String risultato = trasformazioneComposta.apply("Java");

   System.out.println(risultato);
   ```

Le `Function` forniscono un modo flessibile e potente per esprimere trasformazioni o operazioni sui dati in Java. La loro natura funzionale li rende particolarmente adatti all'utilizzo con le espressioni lambda e con le nuove funzionalità introdotte in Java 8.

---

### Esempio uso Function<T, R>

![FunctionaInterface_05.png](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/FunctionaInterface_05.png)

