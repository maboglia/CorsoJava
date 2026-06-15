# Il Metodo Costruttore

Il **costruttore** è un metodo speciale che serve a **inizializzare un nuovo oggetto** di una classe, impostando i valori iniziali degli attributi e svolgendo eventuali operazioni necessarie all’avvio.

Ogni volta che si crea un oggetto con `new`, viene automaticamente richiamato il costruttore della classe.

![costruttore](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/model/Class-Concept.png)

---

## Caratteristiche del costruttore

* Ha **lo stesso nome** della classe (inizia quindi con lettera maiuscola).
* Non ha **tipo di ritorno** (nemmeno `void`).
* Inizializza gli attributi della classe.
* Se non viene definito, il compilatore genera un **costruttore di default** (senza parametri e vuoto).

> In Java, anche se non inizializzi esplicitamente gli attributi, vengono comunque assegnati valori di **default** (es. `0` per numeri, `false` per boolean, `null` per oggetti).

---

## Costruttore di default e costruttore definito dall’utente

Se non scrivi alcun costruttore, Java fornisce automaticamente un **costruttore di default**:

```java
class Persona {
    String nome;
    int eta;
    // costruttore di default implicito
}
```

Puoi anche **definirne uno personalizzato**:

```java
class Persona {
    String nome;
    int eta;
    
    // costruttore esplicito
    Persona(String n, int e) {
        nome = n;
        eta = e;
    }
}
```

---

## Overloading dei costruttori

È possibile avere più costruttori (con **parametri diversi**) nella stessa classe:

```java
class Automobile {
    String marca;
    String modello;
    
    // costruttore vuoto
    Automobile() {
        marca = "Sconosciuta";
        modello = "Standard";
    }

    // costruttore con un parametro
    Automobile(String marca) {
        this.marca = marca;
        this.modello = "Standard";
    }

    // costruttore con due parametri
    Automobile(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }
}
```

---

## Operatore `new`

L’operatore `new` ha tre funzioni principali:

1. **Crea una nuova istanza** della classe (allocando memoria).
2. **Chiama il costruttore** corrispondente.
3. **Restituisce un riferimento** all’oggetto creato.

Esempio:

```java
Automobile a = new Automobile("Fiat", "500");
String s = new String("ABC");
```

---

## Invio di messaggi (chiamata di metodi)

Un oggetto può ricevere **messaggi** (invocazioni di metodi) con la **notazione puntata**:

```java
a.mettiInMoto();
a.accelera(50);
a.frena();
```

All’interno della stessa classe, è sottinteso il riferimento all’oggetto corrente:

```java
public class Libro {
    int nPagine;

    public void leggiPagina(int n) {
        System.out.println("Leggo pagina " + n);
    }

    public void leggiTutto() {
        for (int i = 1; i <= nPagine; i++)
            leggiPagina(i); // this.leggiPagina(i); è implicito
    }
}
```

---

## Attributi e `this`

* Gli attributi si accedono sempre tramite il **reference** dell’oggetto:

  ```java
  Automobile a = new Automobile();
  a.colore = "Blu";
  ```

* All’interno della classe, si può omettere il riferimento:

  ```java
  public class Automobile {
      String colore;
      void vernicia() {
          colore = "Verde"; // è sottinteso this.colore
      }
  }
  ```

* La parola chiave **`this`** è usata per:

  * Riferirsi all’oggetto corrente.
  * Distinguere variabili locali da attributi.

Esempio:

```java
Automobile(String colore) {
    this.colore = colore; // senza this ci sarebbe ambiguità
}
```

---

## Distruzione degli oggetti

In Java la gestione della memoria è automatica grazie al **Garbage Collector**:

* Quando un oggetto non è più referenziato da nessuna variabile, la memoria viene liberata.
* Non esistono distruttori manuali come in C++.
