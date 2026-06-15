# singleton pattern

Il **Singleton Pattern** è un design pattern creazionale che garantisce che una classe abbia una sola istanza e fornisce un punto di accesso globale a tale istanza. Questo pattern è utilizzato quando una sola istanza di una classe è sufficiente per coordinare azioni in tutto il sistema, come ad esempio la gestione di risorse condivise o la configurazione.

### Caratteristiche del Singleton Pattern:

1. **Costruttore Privato:**
   - La classe ha un costruttore privato per impedire la creazione di istanze mediante il costruttore standard.

    ```java
    public class Singleton {
        private static Singleton instance;

        private Singleton() {
            // Costruttore privato
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
    ```

2. **Variabile Statica Privata:**
   - La classe mantiene una variabile statica privata che contiene l'unica istanza della classe.

3. **Metodo Statico Pubblico:**
   - Fornisce un metodo statico pubblico per ottenere l'istanza unica della classe (solitamente denominato `getInstance`).

### Utilizzo del Singleton Pattern:

```java
public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Le due istanze sono lo stesso oggetto
        System.out.println(instance1 == instance2); // Output: true
    }
}
```

In questo esempio, `Client` ottiene l'istanza di `Singleton` utilizzando il metodo `getInstance`. Poiché il Singleton Pattern garantisce che ci sia una sola istanza, le due variabili `instance1` e `instance2` puntano allo stesso oggetto.

### Vantaggi del Singleton Pattern:

1. **Controllo sull'Istanza Unica:**
   - Assicura che ci sia una sola istanza della classe, fornendo un controllo centralizzato sull'accesso a quella istanza.

2. **Accesso Globale:**
   - Fornisce un punto di accesso globale all'istanza, consentendo l'accesso da qualsiasi parte dell'applicazione.

3. **Risparmio di Memoria:**
   - Riduce il consumo di memoria, in particolare in situazioni in cui una sola istanza è sufficiente.

### Considerazioni e Potenziali Problemi:

1. **Creazione Lazy:**
   - L'implementazione presentata è una creazione lazy dell'istanza (creata solo quando necessario). Esistono anche varianti di creazione anticipata.

2. **Thread Safety:**
   - La versione presentata non è thread-safe. In un ambiente multithreading, è necessario gestire la concorrenza per garantire l'unicità dell'istanza.

3. **Serializzazione:**
   - La classe dovrebbe implementare `Serializable` per garantire che la deserializzazione restituisca l'istanza unica.

4. **Dependency Injection:**
   - L'uso di Singleton può rendere difficile l'iniezione di dipendenze, poiché introduce un'accoppiamento globale nell'applicazione.

Il Singleton Pattern è utile in situazioni in cui è necessaria una sola istanza di una classe e offre un modo semplice per gestire tale requisito. Tuttavia, è importante trattare le considerazioni multithreading e altri aspetti specifici dell'applicazione durante l'implementazione.

---

![singleton](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/singleton_pattern_uml_diagram.jpg)

---

## Step 1

**SingleObject.java**

```java
public class SingleObject {

   //create an object of SingleObject
   private static SingleObject instance = new SingleObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject(){}

   //Get the only object available
   public static SingleObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}
```

---

## Step 2


**SingletonPatternDemo.java**

```java
public class SingletonPatternDemo {
   public static void main(String[] args) {

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
      SingleObject object = SingleObject.getInstance();

      //show the message
      object.showMessage();
   }
}
```


