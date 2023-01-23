# Il Metodo Costruttore

Specifica le operazioni di inizializzazione (attributi, etc.) che vogliamo vengano eseguite su ogni oggetto della classe appena viene creato

## Il metodo **costruttore** ha:

* Lo **stesso nome** della classe: inizia quindi _con lettera Maiuscola_
* Tipo di ritorno **non** specificato

Non possono esistere attributi non inizializzati

* Gli attributi vengono inizializzati comunque con valori di **default**

![costruttore](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/model/Class-Concept.png)

---

## il costruttore è sempre presente

Se _non viene dichiarato_ un costruttore, ne viene creato uno di **default** _vuoto e senza parametri_

Spesso si usa l'**overloading** dei metodi definendo diversi costruttori per gli oggetti di un certo tipo

La distruzione di oggetti non è a carico del programmatore (garbage-collection)

### Il costrutto new

* Crea una nuova istanza della classe specificata, allocandone la memoria
* Restituisce il riferimento all'oggetto creato
* Chiama il costruttore del nuovo oggetto

```java
Automobile a = new Automobile ();
Motorcycle m = new Motorcycle ();
String s = new String ("ABC");
```

---

### Per "gestire" una classe occorre

* Accedere mediante il reference ai metodi della classe
* Accedere mediante il reference agli attributi della classe

### inviare Messaggi

* L'invio di un messaggio provoca l'esecuzione del metodo

Inviare un messaggio ad un oggetto

* Usare la notazione "puntata" `oggetto.messaggio(parametri)`
* I metodi definiscono l'**implementazione** delle operazioni
* I messaggi che un oggetto può accettare coincidono con i nomi dei metodi
* p.es mettiInMoto(), frena(), accelera(100), etc.
* Spesso i messaggi includono uno o più parametri
* .vernicia("Rosso")

---

### Esempi

```java
Automobile a = new Automobile();
a.mettiInMoto();
a.accelera(10);
a.frena(5);
a.spegni();
```

---

### All'interno della classe

* I metodi che devono inviare messaggi allo stesso oggetto cui appartengono non devono obbligatoriamente utilizzare la notazione puntata: è sottinteso il riferimento

```java
public class Libro {
    int nPagine;
    public void leggiPagina (int nPagina) {
        //    ...
    }
    public void leggiTutto () {
        for (int i=0; i<nPagine; i++)
            leggiPagina (i);
    }
}
```

---

## Attributi

* Stessa notazione "puntata" dei messaggi `oggetto.attributo`
* Il riferimento viene usato come una qualunque variabile

```java
Automobile a=new Automobile();
a.colore = "Blu";
boolean x = a.accesa;
```

---

I metodi che fanno riferimento ad attributi dello stesso oggetto possono tralasciare il riferimento all'oggetto

```java
public class Automobile {
    String colore;
    void vernicia(){
        colore = "Verde";// colore si riferisce all'oggetto corrente
    }
}
```

---

## Operatore `this` (Puntatore Auto-referenziante)

La parola riservata `this` e' utilizzata quale puntatore auto-referenziante

* `this` riferisce l'oggetto (e.g., classe) corrente

Utilizzato per:

* Referenziare la classe appena istanziata
* Evitare il conflitto tra nomi


---

### Esempio (costruttori con `overloading` e `this`)

```java
class Automobile {
    String marca;
    String modello;
    // Automobile senza marca nè modello
    Automobile () {
        //...
    }
    // Automobile con marca senza modello
    Automobile (String marca) {
        //...
        this.marca = marca;
    }
    // Automobile con marca e modello
    Automobile (String marca, String modello) {
        //...
        this.marca = marca; 
        this.modello = modello;
    }
}
```
[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)