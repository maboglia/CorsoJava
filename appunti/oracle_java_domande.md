Domande e Esercizi: Concetti di Programmazione Orientata agli Oggetti

**Domande:**

1. Gli oggetti del mondo reale contengono ___e___.
   - Risposta: Gli oggetti del mondo reale contengono stato (attributi) e comportamento (metodi).

2. Lo stato di un oggetto software è memorizzato in ___.
   - Risposta: Lo stato di un oggetto software è memorizzato negli attributi.

3. Il comportamento di un oggetto software è esposto attraverso ___.
   - Risposta: Il comportamento di un oggetto software è esposto attraverso i metodi.

4. Nascondere i dati interni dal mondo esterno e accedervi solo attraverso metodi pubblici esposti è noto come incapsulamento dei dati.

5. Una pianta per un oggetto software è chiamata ___.
   - Risposta: Una pianta per un oggetto software è chiamata classe.

6. Un comportamento comune può essere definito in un'___e ereditato in una___ utilizzando la parola chiave ___.
   - Risposta: Un comportamento comune può essere definito in un'interfaccia e ereditato in una classe utilizzando la parola chiave `implements`.

7. Una raccolta di metodi senza implementazione è chiamata un'___.
   - Risposta: Una raccolta di metodi senza implementazione è chiamata un'interfaccia.

8. Uno spazio dei nomi che organizza classi e interfacce per funzionalità è chiamato un ___.
   - Risposta: Uno spazio dei nomi che organizza classi e interfacce per funzionalità è chiamato un package.

9. L'acronimo API sta per ___?
   - Risposta: L'acronimo API sta per Application Programming Interface.

**Esercizi:**

1. Crea nuove classi per ogni oggetto del mondo reale osservato all'inizio di questo percorso. Fai riferimento alla classe Bicycle se dimentichi la sintassi richiesta.

2. Per ogni nuova classe che hai creato sopra, crea un'interfaccia che ne definisca il comportamento, quindi richiedi alla tua classe di implementarla. Ometti uno o due metodi e prova a compilare. Qual è l'errore che si verifica?

3. Controlla le tue risposte.

**Domande ed Esercizi: Variabili**

**Domande:**

1. Il termine "variabile di istanza" è un altro nome per ___.
   - Risposta: Il termine "variabile di istanza" è un altro nome per attributo di istanza.

2. Il termine "variabile di classe" è un altro nome per ___.
   - Risposta: Il termine "variabile di classe" è un altro nome per attributo di classe.

3. Una variabile locale memorizza uno stato temporaneo; viene dichiarata all'interno di un ___.
   - Risposta: Una variabile locale memorizza uno stato temporaneo; viene dichiarata all'interno di un metodo.

4. Una variabile dichiarata tra la parentesi di apertura e chiusura di una firma di metodo è chiamata una variabile ___.
   - Risposta: Una variabile dichiarata tra la parentesi di apertura e chiusura di una firma di metodo è chiamata una variabile parametro.

5. Quali sono gli otto tipi di dati primitivi supportati dal linguaggio di programmazione Java?
   - Risposta: Gli otto tipi di dati primitivi sono byte, short, int, long, float, double, char, boolean.

6. Le stringhe di caratteri sono rappresentate dalla classe ___.
   - Risposta: Le stringhe di caratteri sono rappresentate dalla classe String.

7. Un ___ è un oggetto contenitore che detiene un numero fisso di valori di un singolo tipo.
   - Risposta: Un array è un oggetto contenitore che detiene un numero fisso di valori di un singolo tipo.

**Esercizi:**

1. Crea un piccolo programma che definisce alcuni campi. Prova a creare alcuni nomi di campi illegali e vedi che tipo di errore produce il compilatore. Usa le regole e le convenzioni di denominazione come guida.

2. Nel programma creato nell'Esercizio 1, prova a lasciare i campi non inizializzati e stampa i loro valori. Prova la stessa cosa con una variabile locale e vedi che tipo di errori del compilatore puoi produrre. Conoscere gli errori comuni del compilatore renderà più facile riconoscere i bug nel tuo codice.

3. Controlla le tue risposte.

**Domande ed Esercizi: Operatori**

**Domande:**

1. Considera il seguente frammento di codice.
   `arrayOfInts[j] > arrayOfInts[j+1]`
   Quali operatori contiene il codice?

2. Considera il seguente frammento di codice.

   ```java
   int i = 10;
   int n = i++%5;
   ```

   Quali sono i valori di i e n dopo l'esecuzione del codice?

3. Quali sono i valori finali di i e n se, invece di utilizzare l'operatore di incremento postfisso (i++), si utilizza la versione prefisso (++i))?

4. Per invertire il valore di un booleano, quale operatore useresti?

5. Quale operatore viene utilizzato per confrontare due valori, = o ==?

6. Spiega il seguente esempio di codice: `result = someCondition ? value1 : value2;`

**Esercizi:**

1. Modifica il seguente programma per utilizzare assegnazioni composte:

   ```java
   class ArithmeticDemo {
       public static void main (String[] args){
            
            int result = 1 + 2; // result is now 3
            System.out.println(result);

            result = result - 1; // result is now 2
            System.out.println(result);

            result = result * 2; // result is now 4
            System.out.println(result);

            result = result / 2; // result is now 2
            System.out.println(result);

            result = result + 8; // result is now 10
            result = result % 7; // result is now 3
            System.out.println(result);
       }
   }
   ```

2. Nel programma seguente, spiega perché il valore "6" viene stampato due volte di seguito:

   ```java
   class PrePostDemo {


      public static void main(String[] args){
          int i = 3;
          i++;
          System.out.println(i);    // "4"
          ++i;                     
          System.out.println(i);    // "5"
          System.out.println(++i);  // "6"
          System.out.println(i++);  // "6"
          System.out.println(i);    // "7"
      }
   }
   ```

3. Controlla le tue risposte.

**Domande ed Esercizi: Espressioni, Istruzioni e Blocchi**

**Domande:**

1. Gli operatori possono essere utilizzati nella costruzione di espressioni, che calcolano valori.

2. Le espressioni sono i componenti fondamentali delle istruzioni.

3. Le istruzioni possono essere raggruppate in blocchi.

4. Il seguente frammento di codice è un esempio di un'espressione ___.
   `1 * 2 * 3`

5. Le istruzioni sono approssimativamente equivalenti a frasi nei linguaggi naturali, ma invece di terminare con un periodo, una dichiarazione termina con un ___.

6. Un blocco è un gruppo di zero o più istruzioni tra parentesi bilanciate {} e può essere utilizzato ovunque sia consentita una singola ___.

**Esercizi:**

Identifica i seguenti tipi di istruzioni di espressione:

- `aValue = 8933.234;`
- `aValue++;`
- `System.out.println("Hello World!");`
- `Bicycle myBike = new Bicycle();`

Controlla le tue risposte.

**Domande ed Esercizi: Istruzioni di Controllo del Flusso**

**Domande:**

1. L'istruzione di controllo del flusso più basilare supportata dal linguaggio di programmazione Java è l'istruzione ___.
   - Risposta: L'istruzione di controllo del flusso più basilare è l'istruzione `if`.

2. L'istruzione ___ consente qualsiasi numero di percorsi di esecuzione possibili.
   - Risposta: L'istruzione `switch` consente qualsiasi numero di percorsi di esecuzione possibili.

3. L'istruzione ___ è simile all'istruzione while, ma valuta la sua espressione alla fine del ciclo.
   - Risposta: L'istruzione `do-while` è simile all'istruzione while, ma valuta la sua espressione alla fine del ciclo.

4. Come si scrive un ciclo infinito utilizzando l'istruzione for?
   - Risposta: `for(;;)` crea un ciclo infinito utilizzando l'istruzione for.

5. Come si scrive un ciclo infinito utilizzando l'istruzione while?
   - Risposta: `while(true)` crea un ciclo infinito utilizzando l'istruzione while.

**Esercizi:**

1. Considera il seguente frammento di codice:

   ```java
   if (aNumber >= 0)
      if (aNumber == 0)
          System.out.println("first string");
   else System.out.println("second string");
   System.out.println("third string");
   ```

   Qual è l'output che pensi produrrà il codice se aNumber è 3?

2. Scrivi un programma di test contenente il frammento di codice precedente; imposta aNumber su 3. Qual è l'output del programma? È quello che hai previsto? Spiega il flusso di controllo per il frammento di codice.

3. Utilizzando solo spazi e interruzioni di riga, riformatta il frammento di codice per rendere più comprensibile il flusso di controllo.

4. Usa le parentesi graffe, { e }, per chiarire ulteriormente il codice.

Controlla le tue risposte.

**Domande ed Esercizi: Classi**

**Domande:**

1. Considera la seguente classe:

   ```java
   public class IdentifyMyParts {
      public static int x = 7; 
      public int y = 3; 
   }
   ```

   Quali sono le variabili di classe?

2. Quali sono le variabili di istanza?

3. Qual è l'output del seguente codice:

   ```java
   IdentifyMyParts a = new IdentifyMyParts();
   IdentifyMyParts b = new IdentifyMyParts();
   a.y = 5;
   b.y = 6;
   a.x = 1;
   b.x = 2;
   System.out.println("a.y = " + a.y);
   System.out.println("b.y = " + b.y);
   System.out.println("a.x = " + a.x);
   System.out.println("b.x = " + b.x);
   System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
   ```

**Esercizi:**

1. Scrivi una classe le cui istanze rappresentano una singola carta da gioco in un mazzo di carte. Le carte da gioco hanno due proprietà distintive: rango e seme. Assicurati di conservare la tua soluzione, poiché ti verrà chiesto di riscriverla usando Enum Types.

2. Scrivi una classe le cui istanze rappresentano un mazzo completo di carte. Dovresti anche conservare questa soluzione.

3. Scrivi un piccolo programma per testare le tue classi di mazzo e carte. Il programma può essere semplice come creare un mazzo di carte e visualizzarne le carte.

Controlla le tue risposte.

**Domande ed Esercizi: Oggetti**

**Domande:**

1. Cosa c'è di sbagliato nel seguente programma?

   ```java
   public class SomethingIsWrong {
      public static void main(String[] args) {
         Rectangle myRect;
         myRect.width = 40;
         myRect.height = 50;
         System.out.println("myRect's area is " + myRect.area());
      }
   }
   ```

2. Il seguente codice crea un array e un oggetto stringa. Quante referenze a questi oggetti esistono dopo l'esecuzione del codice? Uno qualsiasi degli oggetti è idoneo per la garbage collection?

   ```java
   String[] students = new String[10];
   String studentName = "Peter Parker";
   students[0] = studentName;
   studentName = null;
   ```

3. Come un programma distrugge un oggetto che crea?

**Esercizi:**

1. Correggi il programma chiamato SomethingIsWrong mostrato nella Domanda 1.

2. Dato il segu

ente codice:

   ```java
   public class NumberHolder {
      public int anInt;
      public float aFloat;
   }
   ```

   Scrivi del codice che crea un'istanza della classe, inizializza le sue due variabili membro e quindi visualizza il valore di ciascuna variabile membro.

Controlla le tue risposte.

**Domande ed Esercizi: Classi Nidificate**

**Domande:**

1. Il programma Problem.java non si compila. Cosa devi fare per farlo compilare? Perché?

2. Usa la documentazione API di Java per la classe Box (nel pacchetto javax.swing) per rispondere alle seguenti domande.
   - Quale classe nidificata statica definisce Box?
   - Quale classe interna definisce Box?
   - Qual è la superclasse della classe interna di Box?
   - Quale delle classi nidificate di Box puoi utilizzare da qualsiasi classe?
   - Come si crea un'istanza della classe Filler di Box?

**Esercizi:**

1. Ottieni il file Class1.java. Compila ed esegui Class1. Qual è l'output?

2. Le seguenti esercitazioni coinvolgono la modifica della classe DataStructure.java, di cui la sezione Esempio di classe interna discute.
   - Definisci un metodo chiamato print(DataStructureIterator iterator). Invoca questo metodo con un'istanza della classe EvenIterator in modo che esegua la stessa funzione del metodo printEven.
   - Invoca il metodo print(DataStructureIterator iterator) in modo che stampi gli elementi che hanno un valore di indice dispari. Usa una classe anonima come argomento del metodo anziché un'istanza dell'interfaccia DataStructureIterator.
   - Definisci un metodo chiamato print(java.util.function.Function<Integer, Boolean> iterator) che svolge la stessa funzione del metodo print(DataStructureIterator iterator). Invoca questo metodo con un'espressione lambda per stampare gli elementi che hanno un valore di indice pari. Invoca nuovamente questo metodo con un'espressione lambda per stampare gli elementi che hanno un valore di indice dispari.
   - Definisci due metodi in modo che le seguenti due istruzioni stampino elementi che hanno un valore di indice pari e elementi che hanno un valore di indice dispari:

     ```java
     DataStructure ds = new DataStructure()
     // ...
     ds.print(DataStructure::isEvenIndex);
     ds.print(DataStructure::isOddIndex);
     ```

Controlla le tue risposte.

**Domande ed Esercizi: Tipi Enumerati**

**Domande:**

1. Vero o falso: un tipo Enum può essere una sottoclasse di java.lang.String.

**Esercizi:**

1. Riscrivi la classe Card dall'esercizio in Domande ed Esercizi: Classi in modo che rappresenti il rango e il seme di una carta con tipi Enum.

2. Riscrivi la classe Deck.

Controlla le tue risposte.

**Domande ed Esercizi: Annotationi**

**Domande:**

1. Cosa c'è di sbagliato nell'interfaccia seguente?

   ```java
   public interface House {
      @Deprecated
      void open();
      void openFrontDoor();
      void openBackDoor();
   }
   ```

2. Considera questa implementazione dell'interfaccia House, mostrata nella Domanda 1.

   ```java
   public class MyHouse implements House {
      public void open() {}
      public void openFrontDoor() {}
      public void openBackDoor() {}
   }
   ```

   Se compili questo programma, il compilatore produce un avviso perché open è stato deprecato (nell'interfaccia). Cosa puoi fare per eliminare quell'avviso?

3. Il seguente codice compilerà senza errori? Perché sì o perché no?

   ```java
   public @interface Meal { ... }

   @Meal("breakfast", mainDish="cereal")
   @Meal("lunch", mainDish="pizza")
   @Meal("dinner", mainDish="salad")
   public void evaluateDiet() { ... }
   ```

**Esercizi:**

1. Definisci un tipo di annotazione per una richiesta di miglioramento con gli elementi id, synopsis, engineer e date. Specifica il valore predefinito come non assegnato per engineer e sconosciuto per date.

Controlla le tue risposte.

**Domande ed Esercizi: Interfacce**

**Domande:**

1. Quali metodi dovrebbe implementare una classe che implementa l'interfaccia java.lang.CharSequence?

2. Cosa c'è di sbagliato nell'interfaccia seguente?

   ```java
   public interface SomethingIsWrong {
      void aMethod(int aValue){
          System.out.println("Hi Mom");
      }
   }
   ```

3. La seguente interfaccia è valida?

   ```java
   public interface Marker {
   }
   ```

**Esercizi:**

1. Scrivi una classe che implementa l'interfaccia CharSequence trovata nel pacchetto java.lang. La tua implementazione dovrebbe restituire la stringa al contrario. Scegli una delle frasi di questo libro da utilizzare come dati. Scrivi un piccolo metodo principale per testare la tua classe; assicurati di chiamare tutti e quattro i metodi.

2. Supponi di avere scritto un server di tempo che notifica periodicamente i suoi client della data e dell'ora correnti. Scrivi un'interfaccia che il server potrebbe utilizzare per imporre un protocollo specifico sui suoi client.

Controlla le tue risposte.

**Domande ed Esercizi: Ereditarietà**

**Domande:**

1. Considera le seguenti due classi:

   ```java
   public class ClassA {
      public void methodOne(int i) {
      }
      public void methodTwo(int i) {
      }
      public static void methodThree(int i) {
      }
      public static void methodFour(int i) {
      }
   }

   public class ClassB extends ClassA {
      public static void methodOne(int i) {
      }
      public void methodTwo(int i) {
      }
      public void methodThree(int i) {
      }
      public static void methodFour(int i) {
      }
   }
   ```

   a. Quale metodo sovrascrive un metodo nella superclass?
   b. Quale metodo nasconde un metodo nella superclass?
   c. Cosa fanno gli altri metodi?

2. Considera le classi Card, Deck e DisplayDeck che hai scritto in Domande ed Eserc

izi: Tipi Enumerati. Riscrivi queste classi in modo che Card e Deck estendano rispettivamente Rank e Suit, e DisplayDeck estenda Deck.

3. Qual è il risultato di compilare la seguente classe?

   ```java
   public class Test {
      public static void main(String[] args) {
         Base obj = new Derived();
         obj.show();
      }
   }

   class Base {
      public void show() {
         System.out.println("Base's show()");
      }
   }

   class Derived extends Base {
      public void show() {
         System.out.println("Derived's show()");
      }
   }
   ```

**Esercizi:**

1. Dato il codice seguente:

   ```java
   class Animal {
      public void eat() {
         System.out.println("This animal eats insects.");
      }
   }

   class Bird extends Animal {
      public void eat() {
         System.out.println("This bird eats seeds.");
      }
   }
   ```

   Qual è l'output del seguente frammento di codice?

   ```java
   Animal myAnimal = new Bird();
   myAnimal.eat();
   ```

2. Crea una classe base "Shape" con un metodo "draw" che stampa "Drawing a shape". Deriva due sottoclassi, "Circle" e "Square", che sovrascrivono il metodo "draw" per stampare "Drawing a circle" e "Drawing a square" rispettivamente. Crea un'istanza di ciascuna classe e chiama il metodo "draw" su ciascuna.

Controlla le tue risposte.

**Domande ed Esercizi: Polimorfismo**

**Domande:**

1. Cosa significa il termine "polimorfismo" nel contesto della programmazione orientata agli oggetti?

2. Cosa fa il seguente codice?

   ```java
   public void someMethod(Animal myAnimal) {
      myAnimal.eat();
   }
   ```

3. Dato il seguente codice:

   ```java
   public void doSomething(Shape shape) {
      shape.draw();
   }
   ```

   Puoi chiamare il metodo doSomething passando un'istanza di Circle come argomento?

**Esercizi:**

1. Riscrivi la classe Animal con un metodo "makeSound". Sovrascrivi questo metodo nelle classi derivate Bird e Dog per far stampare rispettivamente "Tweet" e "Bark". Crea un'istanza di ciascuna classe e chiama il metodo "makeSound" su ciascuna.

2. Riscrivi le classi Shape, Circle e Square dall'Esercizio 2 in Domande ed Esercizi: Ereditarietà per includere un metodo "calculateArea". Sovrascrivi il metodo nelle classi derivate per calcolare l'area effettiva di un cerchio o un quadrato. Crea un'istanza di ciascuna classe e chiama il metodo "calculateArea" su ciascuna.

Controlla le tue risposte.

**Domande ed Esercizi: Gestione delle Eccezioni**

**Domande:**

1. Cosa succede se un'eccezione non viene gestita nel blocco try-catch?

2. Cosa fa l'istruzione `throw new MyException("This is a custom exception");`?

3. Qual è la differenza tra `finally` e `finalize` in Java?

**Esercizi:**

1. Scrivi un programma che chieda all'utente di inserire un numero intero. Gestisci l'eccezione se l'utente inserisce qualcosa che non è un numero.

2. Modifica il programma dell'Esercizio 1 in modo che gestisca anche l'eccezione se l'utente inserisce un numero troppo grande per essere rappresentato come int.

3. Scrivi una classe "Calculator" con un metodo che effettui la divisione di due numeri. Gestisci l'eccezione se il denominatore è zero.

Controlla le tue risposte.

**Domande ed Esercizi: Input/Output (I/O)**

**Domande:**

1. Qual è la differenza tra i canali di I/O con orientamento al byte e quelli con orientamento al carattere in Java?

2. Cosa fa il seguente codice Java?

   ```java
   FileReader fileReader = new FileReader("example.txt");
   BufferedReader bufferedReader = new BufferedReader(fileReader);
   ```

3. Qual è la differenza principale tra l'utilizzo di `FileInputStream` e `FileReader` per leggere un file?

**Esercizi:**

1. Scrivi un programma Java che legge da un file di testo e conta quante volte appare ciascuna parola nel testo. Puoi utilizzare un oggetto `Map<String, Integer>` per tenere traccia delle occorrenze delle parole.

2. Modifica il programma dell'Esercizio 1 per scrivere i risultati in un nuovo file di testo.

3. Scrivi un programma che copia il contenuto di un file in un altro file. Puoi utilizzare un `FileInputStream` e un `FileOutputStream` per questo.

Controlla le tue risposte.

**Domande ed Esercizi: Thread**

**Domande:**

1. Cos'è un thread in programmazione?

2. Qual è la differenza tra un thread e un processo?

3. Cosa fa il seguente codice?

   ```java
   Thread thread = new Thread(new MyRunnable());
   thread.start();
   ```

**Esercizi:**

1. Scrivi un programma Java che utilizza due thread per stampare numeri pari e dispari alternati. Ad esempio, se il thread A stampa numeri pari, il thread B dovrebbe stampare numeri dispari e così via.

2. Modifica il programma dell'Esercizio 1 per utilizzare la sincronizzazione dei thread in modo che i numeri vengano stampati in ordine corretto.

3. Scrivi un programma che utilizza `ExecutorService` per creare un pool di thread e assegnare loro compiti. Ad esempio, il programma può avere un pool di thread che eseguono compiti di stampa e un pool di thread che eseguono compiti di elaborazione.

Controlla le tue risposte.

**Domande ed Esercizi: Concorrenza**

**Domande:**

**1. Qual è il vantaggio di utilizzare l'API di concorrenza di Java rispetto a implementare la concorrenza manualmente?**

L'utilizzo dell'API di concorrenza di Java fornisce un insieme di strumenti e strutture dati predefinite che semplificano lo sviluppo di applicazioni concorrenti. Questi vantaggi includono:

- **Semplificazione del Codice:** L'API di concorrenza semplifica la gestione di thread, lock e sincronizzazione, riducendo la complessità del codice.
  
- **Thread Pooling:** Fornisce strutture per la gestione automatica di pool di thread, consentendo una gestione più efficiente delle risorse del sistema.

- **Sincronizzazione a Livello di Oggetto:** L'API offre meccanismi come i monitor e le classi di lock per gestire la sincronizzazione a livello di oggetto.

- **Collezioni Concorrenti:** Fornisce collezioni specifiche per l'utilizzo in contesti concorrenti, come `ConcurrentHashMap`, che elimina la necessità di scrivere manualmente codice sincronizzato.

- **Atomicità delle Operazioni:** L'API offre classi atomiche come `AtomicInteger` e `AtomicReference`, che consentono operazioni atomiche senza l'uso esplicito di synchronized.

In sintesi, l'API di concorrenza semplifica il processo di sviluppo di applicazioni concorrenti, migliorando la leggibilità del codice e riducendo il rischio di errori di sincronizzazione.

**2. Cos'è un deadlock e come può verificarsi?**

Un deadlock è una situazione in cui due o più thread sono bloccati indefinitamente, ognuno in attesa che l'altro rilasci una risorsa. Ciò si verifica quando ogni thread possiede una risorsa e attende il rilascio di una risorsa detenuta da un altro thread, creando un circolo chiuso di dipendenze.

Ecco un esempio semplificato:

- Thread 1 detiene la risorsa A e aspetta la risorsa B.
- Thread 2 detiene la risorsa B e aspetta la risorsa A.

Entrambi i thread rimarranno bloccati indefinitamente, poiché ognuno aspetta la risorsa detenuta dall'altro.

**3. Cosa fa il seguente codice?**

```java
Executor executor = Executors.newSingleThreadExecutor();
```

Questo codice crea un `Executor` che è un'interfaccia per eseguire task asincroni. In particolare, `Executors.newSingleThreadExecutor()` restituisce un `ExecutorService` che utilizza un singolo thread per eseguire i task.

Questo è utile quando si desidera eseguire task in modo sequenziale, uno dopo l'altro, utilizzando un singolo thread. L'`ExecutorService` restituito può essere utilizzato per inviare task utilizzando il metodo `execute()` o `submit()`. Quando si utilizza un singolo thread executor, i task vengono gestiti in ordine di arrivo e ciascun task viene eseguito completamente prima di passare al successivo.
