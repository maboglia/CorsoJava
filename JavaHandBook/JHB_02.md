# 🔹 Classi in Java

La **classe** è uno dei concetti fondamentali della **programmazione orientata agli oggetti (OOP)**.
Una classe è un **modello (blueprint)** per la creazione di **oggetti**, che rappresentano entità con **stato** (attributi) e **comportamenti** (metodi).

---

## 🔹 Caratteristiche principali

* Una **classe** non consuma memoria da sola: occupa memoria solo quando vengono create istanze (`new`).
* Una classe può essere **istanziata più volte**, producendo oggetti distinti.
* Ogni classe dovrebbe rispettare il **principio di responsabilità singola (SRP)**: fare bene una sola cosa.

---

## 🔹 Java è orientato agli oggetti

* **Classe**: definisce un nuovo tipo, con **proprietà** (attributi) e **azioni** (metodi).
* **Oggetto**: istanza della classe, con dati propri e metodi applicabili a essi.
* In Java **quasi tutto è un oggetto**, tranne:

  * i **tipi primitivi** (`int`, `double`, `boolean`, …)
  * gli **array**, che sono oggetti ma trattati in modo speciale.

---

## 🔹 Le classi definiscono

* **Attributi** (o campi) → dati che descrivono lo stato dell’oggetto.
* **Metodi** → operazioni che l’oggetto può eseguire o che agiscono sui dati.

Esempi:

* Definite dal programmatore (`Automobile`, `Studente`, `Persona` …).
* Definite da Java (`String`, `System`, `Scanner` …).

---

## 🔹 Creazione di oggetti

La creazione di un oggetto si chiama **istanza** e avviene con `new`.

```java
Persona p1 = new Persona("Luca", "Rossi", 25);
```

Ogni volta che uso `new` creo un nuovo oggetto con i suoi valori indipendenti.

---

## 🔹 Struttura di una classe

```java
package model;

public class Persona {

    // attributi (incapsulati)
    private String nome;
    private String cognome;
    private int eta;

    // costruttore
    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    // metodo di istanza
    public void saluta() {
        System.out.println("Ciao, sono " + nome);
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " (" + eta + " anni)";
    }
}
```

---

## 🔹 Regole di base per le classi

* Ogni classe deve stare in un file con **lo stesso nome** e estensione `.java`.
* Una classe può contenere:

  * **Attributi**: variabili che rappresentano lo stato.
  * **Costruttori**: metodi speciali per inizializzare l’oggetto.
  * **Metodi**: azioni sugli oggetti.
* Per convenzione:

  * i **nomi delle classi** iniziano con la maiuscola (`Persona`),
  * i **metodi** con la minuscola (`saluta`).

---

## 🔹 Documentazione e libreria standard

* Java fornisce una ricca **libreria di classi pronte all’uso** (principio DRY: *Don’t Repeat Yourself*).
* Ogni classe della libreria è documentata con API ufficiali.
* Dalla **Java 9** la libreria standard è stata organizzata in **moduli**.

📌 Documentazione ufficiale:

* [Java 8](https://docs.oracle.com/javase/8/docs/api/overview-summary.html)
* [Java 11](https://docs.oracle.com/en/java/javase/11/)
* [Java 17](https://docs.oracle.com/en/java/javase/17/)
* [Java 21](https://docs.oracle.com/en/java/javase/21/)

---

# ✅ Riepilogo

* Una **classe** è un progetto (blueprint) → gli **oggetti** sono istanze reali.
* Ogni oggetto ha **proprietà** (attributi) e **comportamenti** (metodi).
* Le classi possono essere create dal programmatore o già pronte nella libreria Java.
* Buona pratica: seguire il **principio di responsabilità singola (SRP)**.

---

## Domande

---

Che cos’è una classe in Java?
A. Una variabile che contiene più valori
B. Un insieme di istruzioni che definisce un tipo di oggetto
C. Un metodo speciale
D. Una struttura per gestire array

---

Che cos’è un oggetto in Java?
A. Una variabile di tipo primitivo
B. Un’istanza di una classe
C. Un metodo statico
D. Una costante

---

Quale parola chiave viene usata per creare un nuovo oggetto in Java?
A. class
B. this
C. new
D. void

---

Cosa rappresentano gli attributi di una classe?
A. Le azioni che un oggetto può compiere
B. Lo stato o le proprietà dell’oggetto
C. Il costruttore della classe
D. Le regole di visibilità

---

Quale componente di una classe inizializza i suoi oggetti?
A. Metodo getter
B. Metodo setter
C. Costruttore
D. Attributo statico

---

Quale convenzione si usa per il nome delle classi in Java?
A. Tutte maiuscole
B. Tutte minuscole
C. PascalCase (iniziale maiuscola)
D. snake_case

---

Cosa restituisce il metodo toString() se non viene sovrascritto?
A. Una descrizione leggibile dell’oggetto
B. Null
C. Un identificatore interno formato da nome classe + hashcode
D. Una lista di attributi

---

Quanti oggetti posso creare a partire da una classe?
A. Uno solo
B. Nessuno
C. Un numero qualsiasi
D. Solo se la classe è statica

---

Quali tra i seguenti NON sono oggetti in Java?
A. ArrayList
B. String
C. int
D. Scanner

---

Quale principio di progettazione dice che una classe deve fare una sola cosa?
A. DRY
B. SRP (Single Responsibility Principle)
C. OCP
D. LSP
---
# 🔹 Tipologie di classi in Java

In Java, possiamo distinguere le classi in due grandi categorie:

1. **Classi istanziabili** → possono generare oggetti con `new`.
2. **Classi non istanziabili** → non hanno senso come oggetti o non possono essere create con `new`.

👉 Questa distinzione vale sia per le classi della libreria standard, sia per le classi definite da noi.

---

## 🔹 Classi istanziabili

* Forniscono il **prototipo** di una famiglia di oggetti che condividono struttura e comportamento.
* Ogni oggetto (istanza) ha **identità propria** e contiene i propri valori per gli attributi.
* I metodi operano sui dati dell’istanza.
* Tipicamente hanno **costruttori** e attributi/metodi **non statici**.

### Esempio

```java
class Persona {
    String nome;
    int eta;

    Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    void saluta() {
        System.out.println("Ciao, mi chiamo " + nome);
    }
}

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Luca", 25);
        p1.saluta(); // "Ciao, mi chiamo Luca"
    }
}
```

---

## 🔹 Classi non istanziabili

* Raccolgono **metodi e costanti statici** utili in generale, senza legame con istanze.
* Non hanno senso come oggetti singoli (es. non esistono “più matematiche”).
* Possono essere rese non istanziabili **omettendo costruttori** o rendendoli `private`.
* Sono usate per **utility**, **costanti** o per definire un **punto d’ingresso (`main`)**.

### Esempi

* `Math` → metodi matematici (`Math.sqrt(2)`) e costanti (`Math.PI`).
* `System` → accesso al sistema (`System.out.println(...)`).

```java
System.out.println(Math.sqrt(9));  // 3.0
System.out.println(Math.PI);       // 3.1415...
```

---

## 🔹 Classi ibride

Alcune classi **istanziabili** includono anche metodi statici.

* Esempio: `String` → è istanziabile (`new String("abc")` o letterale `"abc"`), ma ha anche metodi statici (`String.valueOf(...)`).

👉 Questo **ibridismo** va usato con cautela:

* È accettabile avere **costanti statiche** o pochi metodi statici di utilità.
* Ma mischiare troppi elementi statici e dinamici può rendere il design poco chiaro.

---

## 🔹 Classi astratte e interfacce

* Una **classe astratta** non può essere istanziata, ma serve come base per altre classi.
* Un’**interfaccia** definisce solo firme di metodi (contratti), non istanze.

```java
abstract class Animale {
    abstract void verso();
}

class Cane extends Animale {
    void verso() { System.out.println("Bau!"); }
}
```

---

# ✅ Riepilogo

* **Classi istanziabili** → rappresentano concetti con molteplici versioni individuali (`Persona`, `String`, `ArrayList`).
* **Classi non istanziabili** → rappresentano concetti unici, usate per metodi e costanti (`Math`, `System`).
* **Classi ibride** → istanziabili con qualche elemento statico (`String`).
* **Classi astratte/interfacce** → non istanziabili, ma fondamentali per l’ereditarietà e il polimorfismo.

---
# 🔹 1. Istanze di una Classe: gli Oggetti

In **programmazione orientata agli oggetti (OOP)**, un **oggetto** è l’elemento centrale: rappresenta un’entità del mondo reale con **stato** e **comportamenti**.

* **Stato** → definito dai valori dei campi (attributi).
* **Comportamenti** → definiti dai metodi.
* Ogni oggetto è un’**istanza di una classe**, cioè un esempio concreto del modello astratto definito dalla classe.
* Un oggetto **occupa spazio in memoria** e può **comunicare** con altri oggetti tramite lo scambio di messaggi (invocazione di metodi).

Questa capacità di interazione è uno dei pilastri di OOP e permette la costruzione di sistemi complessi e dinamici.

---

## 🔹 1.1. Cos’è un oggetto?

* È un’entità concreta derivata da una classe.
* Ha **stato** (valori degli attributi) e **comportamenti** (metodi).
* Occupa memoria.
* Può interagire con altri oggetti.

Ogni oggetto è caratterizzato da:

1. **Classe di appartenenza** → definisce attributi e metodi.
2. **Stato** → i valori attuali dei campi.
3. **Identificatore univoco** → il riferimento (reference) che permette di accedere a quell’oggetto.

---

## 🔹 1.2. Creazione di un oggetto

La creazione di un oggetto richiede due passaggi:

1. **Dichiarazione** → crea una variabile di tipo reference, inizialmente `null`.
2. **Allocazione e inizializzazione** → con `new` si riserva memoria e si inizializza l’oggetto.

```java
Persona p;                // dichiarazione (reference nullo)
p = new Persona("Luca");  // allocazione e inizializzazione
```

---

## 🔹 1.3. Notazione puntata

Si usa il **punto** (`.`) per accedere ad attributi e metodi:

```java
System.out.println("Hello World!");
```

* `System` → classe del package `java.lang`.
* `out` → variabile di classe (reference a `PrintStream`).
* `println()` → metodo di `PrintStream`.

---

## 🔹 1.4. Operazioni sui reference (`==`, `!=`)

* In Java i **reference** puntano agli oggetti in memoria.
* `==` e `!=` confrontano i **reference**, non i contenuti degli oggetti.
* Non esiste l’aritmetica dei puntatori (a differenza di C/C++).

Esempio:

```java
String s1 = new String("ciao");
String s2 = new String("ciao");

System.out.println(s1 == s2);      // false (reference diversi)
System.out.println(s1.equals(s2)); // true  (contenuto uguale)
```

---

## 🔹 1.5. Operazioni sulle istanze

Con una variabile di tipo reference si può:

* **Assegnare** un nuovo oggetto → `p = new Persona("Anna");`
* **Confrontare** reference o contenuti (`==`, `equals()`).
* **Invocare metodi** → `p.saluta();`.

Una variabile può riferirsi a oggetti diversi in momenti diversi.
Se il reference vale `null`, la variabile non punta ad alcun oggetto.

---

## 🔹 1.6. Accesso ad attributi e metodi non static

Dentro un metodo **non statico**:

* Posso usare direttamente gli attributi e metodi della stessa classe.
* L’oggetto implicito è quello su cui è stato invocato il metodo.

Esempio:

```java
public class Persona {
    private String nome;

    public Persona(String nome) { this.nome = nome; }

    public void saluta() {
        System.out.println("Ciao, sono " + nome); // implicito this.nome
    }
}
```

---

## 🔹 1.7. Oggetti e riferimenti

* Gli oggetti **non hanno nome**, ma vengono manipolati tramite variabili reference.
* Un oggetto può avere **più variabili** che lo referenziano.
* Quando un oggetto non è più referenziato, diventa irraggiungibile → il **garbage collector** libera la memoria.

```java
Persona p1 = new Persona("Luca");
Persona p2 = p1;  // p2 e p1 puntano allo stesso oggetto
```

---

## 🔹 1.8. Confronti con `null`

* Se una variabile vale `null`, non punta ad alcun oggetto.
* Il confronto `variabile != null` è usato per verificare se esiste un riferimento valido.

```java
if (p1 != null) {
    p1.saluta();
}
```

---

## 🔹 1.9. Confronto tra reference vs contenuto

* `==` → confronta se due variabili puntano **allo stesso oggetto**.
* `equals()` → confronta il **contenuto logico** degli oggetti.

Esempio con `String`:

```java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1 == s2);      // true (ottimizzazione string pool)
System.out.println(s1.equals(s2)); // true
```

---

📌 [Esempi sulle classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)

---

## Domande

---

Che cos’è un oggetto in Java?
A. Una funzione che ritorna un valore
B. Un’entità con stato e comportamento
C. Una classe con soli metodi statici
D. Una variabile primitiva

---

Che cosa significa che un oggetto è un’istanza di una classe?
A. È una copia della classe
B. È un esempio concreto creato a partire da una classe
C. È il riferimento alla classe stessa
D. È un metodo che appartiene alla classe

---

Cosa rappresentano i campi (attributi) di un oggetto?
A. Le azioni che un oggetto può compiere
B. Lo stato dell’oggetto
C. I metodi di una classe
D. I reference agli oggetti

---

Quale parola chiave si usa in Java per creare un nuovo oggetto?
A. class
B. new
C. void
D. this

---

Cosa confronta l’operatore == applicato a due oggetti in Java?
A. I contenuti logici degli oggetti
B. I loro attributi
C. I riferimenti in memoria
D. I valori dei metodi toString()

---

Quale metodo si usa per confrontare il contenuto logico di due oggetti?
A. compare()
B. isEqual()
C. equals()
D. ==

---

Cosa succede a un oggetto quando nessuna variabile fa più riferimento ad esso?
A. Rimane in memoria fino al riavvio del programma
B. Viene automaticamente eliminato dal garbage collector
C. Genera un errore di compilazione
D. Si trasforma in un array vuoto

---

Cosa significa se una variabile di tipo reference vale null?
A. Non è stata dichiarata
B. Non punta ad alcun oggetto
C. Punta a un oggetto vuoto
D. È un valore booleano speciale

---

Come si accede a un attributo o metodo di un oggetto?
A. Con la parentesi quadra []
B. Con l’operatore ->
C. Con l’operatore .
D. Con la keyword this

---

Quale delle seguenti affermazioni è corretta?
A. In Java è possibile fare aritmetica dei reference
B. Due reference possono puntare allo stesso oggetto
C. Ogni oggetto ha sempre un solo riferimento
D. Un oggetto non può contenere metodi
---
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
---
# Metodi **Getter e Setter**

I **getter** e i **setter** (detti anche **accessor** e **mutator**) sono metodi che permettono di **accedere** e **modificare** in modo controllato gli attributi di una classe.

Si usano per implementare i principi di **incapsulamento** e **information hiding** tipici della programmazione orientata agli oggetti.

---

## Principi di Encapsulation e Visibilità

* **Modularità** → ridurre le interazioni tra le parti del codice.
* **Information Hiding** → nascondere i dettagli interni e delegare la responsabilità ai metodi pubblici.

In Java la **visibilità** degli attributi/metodi si regola con gli **access modifier**:

* `private` → visibile solo all’interno della stessa classe.
* `public` → accessibile ovunque.
* `protected` → accessibile da classi nello stesso package e dalle sottoclassi.
* *(di default, package-private)* → accessibile solo nello stesso package.

---

## Perché usare Getter e Setter?

* **Protezione degli attributi**: gli attributi restano privati (`private`).
* **Controllo sui valori**: nei setter si possono verificare i dati prima di assegnarli.
* **Flessibilità**: è possibile modificare l’implementazione interna senza cambiare l’interfaccia pubblica.
* **Leggibilità**: getter e setter seguono una convenzione standard (`getNome()`, `setNome()`).

---

## Esempio base

```java
class Automobile {
    private String colore;

    // getter
    public String getColore() {
        return colore;
    }

    // setter
    public void setColore(String nuovoColore) {
        this.colore = nuovoColore;
    }
}

// utilizzo
Automobile a = new Automobile();
a.setColore("Rosso");            // modifica sicura
System.out.println(a.getColore()); // lettura
```

---

## Esempio con controllo nei setter

```java
class ContoBancario {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double importo) {
        if (importo >= 0) {
            this.saldo = importo;
        } else {
            System.out.println("Errore: saldo non può essere negativo!");
        }
    }
}
```

---

## Proprietà pubbliche (sconsigliate)

Gli attributi **pubblici** espongono direttamente i dati:

```java
class Automobile {
    public String colore;
}

Automobile a = new Automobile();
a.colore = "Bianco"; // accesso diretto
```

⚠️ In questo caso non c’è **controllo** sull’assegnazione dei valori → **violazione dell’incapsulamento**.

---

## Classe incapsulata (consigliata)

Gli attributi diventano **privati** e vengono gestiti con metodi pubblici:

```java
class Automobile {
    private String colore;

    public void vernicia(String colore) {
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }
}

Automobile a = new Automobile();
// a.colore = "Bianco";  // ERRORE: colore è privato
a.vernicia("Verde");     // OK
System.out.println(a.getColore());
```

---

## Conclusione

* **Senza getter e setter** → dati esposti, difficile garantire consistenza.
* **Con getter e setter** → controllo sui dati, rispetto dell’incapsulamento, codice più robusto.

👉 In Java si segue la convenzione:

* `getNomeAttributo()` per leggere.
* `setNomeAttributo(...)` per modificare.
---
# Incapsulamento e visibilità in Java

Due aspetti fondamentali in un software orientato agli oggetti sono:

* **Interfaccia** → l’insieme degli elementi **visibili dall’esterno** (ciò che l’utente o altre classi possono utilizzare).
* **Implementazione** → la parte interna della classe: attributi, logica dei metodi, dettagli nascosti al mondo esterno.

L’**incapsulamento** è uno dei concetti fondamentali della **programmazione orientata agli oggetti (OOP)**.
Consiste nel **nascondere lo stato interno di un oggetto** e nell’esporre solo i metodi necessari per interagirvi, garantendo **controllo, sicurezza e indipendenza tra interfaccia e implementazione**.

---

## Incapsulamento

* Gli **attributi** di un oggetto sono **occultati** (tipicamente `private`).
* Lo stato interno può essere **modificato solo tramite metodi pubblici** appositamente definiti (`getter` e `setter`).
* L’interfaccia deve essere progettata per essere **il più possibile indipendente** dall’implementazione, così da poterla modificare senza impatto sul codice che usa la classe.

👉 Esempio tipico: la proprietà `saldo` di un oggetto `ContoCorrente` non deve essere accessibile liberamente dall’esterno, ma solo tramite metodi di deposito/prelievo che ne garantiscano la coerenza.

---

## Vantaggi dell’incapsulamento

* Codice **debolmente accoppiato** → minore dipendenza tra le classi.
* Maggior **riuso del codice**.
* **Sicurezza** → protezione dei dati da accessi non autorizzati o incoerenti.
* Codice più **robusto e facile da testare**.
* Possibilità di **modificare la rappresentazione interna** senza cambiare l’interfaccia pubblica.

---

## Visibilità in Java

In Java l’incapsulamento si realizza attraverso i **modificatori di accesso**:

* `public` → accessibile da qualsiasi classe.
* `private` → accessibile solo all’interno della stessa classe.
* `protected` → accessibile dalla classe attuale, dalle sottoclassi e dalle classi nello stesso package.
* *(default, package-private)* → se non specifichi nulla, l’elemento è accessibile solo dalle classi dello stesso package.

---

## Accesso agli attributi della classe

* Gli **attributi** fanno parte dell’**implementazione interna** e conviene dichiararli sempre `private`.
* Per renderli accessibili in modo controllato, si usano **getter** e **setter**:

```java
class ContoCorrente {
    private double saldo;

    // getter
    public double getSaldo() {
        return saldo;
    }

    // setter con controllo
    public void setSaldo(double nuovoSaldo) {
        if (nuovoSaldo >= 0) {
            this.saldo = nuovoSaldo;
        } else {
            System.out.println("Errore: saldo non può essere negativo.");
        }
    }
}
```

---

## Vantaggio: modificare la rappresentazione interna

Se in futuro cambiamo la struttura interna della classe, l’interfaccia pubblica può rimanere la stessa.

Esempio:

```java
class Rettangolo {
    private int base;
    private int altezza;

    public int getArea() {
        return base * altezza;
    }
}
```

In futuro potremmo salvare solo l’**area** come attributo, eliminando `base` e `altezza`.
Il codice esterno non dovrà cambiare, perché continuerà a chiamare `getArea()`.

---

## Riepilogo

* **Incapsulamento** = separare interfaccia da implementazione, nascondendo i dettagli interni.
* **Visibilità** = regolare l’accesso con `public`, `private`, `protected`, `package`.
* Gli **attributi** devono essere privati, e accessibili tramite **getter/setter**.
* Vantaggi → sicurezza, indipendenza, riusabilità, manutenibilità.
---
# 🔑 Punti chiave sull’astrazione in OOP

* **Cos’è**: mostrare *solo* i dettagli rilevanti, nascondendo quelli superflui.
* **Obiettivo**: ridurre la complessità → ci concentriamo su *cosa* fa un oggetto, non su *come* lo fa.
* **Mezzi in Java**:

  * **classi astratte** → definiscono attributi e metodi comuni, possono avere metodi implementati e metodi astratti (da implementare nelle sottoclassi).
  * **interfacce** → definiscono un “contratto” di comportamento (solo firme dei metodi, senza implementazione fino a Java 7; da Java 8 anche metodi `default` e `static`).

---

## 📐 Esempio con classe astratta

```java
abstract class Veicolo {
    protected String targa;

    public Veicolo(String targa) {
        this.targa = targa;
    }

    // metodo astratto: non ha corpo
    public abstract void muovi();

    // metodo concreto
    public void mostraTarga() {
        System.out.println("Targa: " + targa);
    }
}

class Automobile extends Veicolo {
    public Automobile(String targa) {
        super(targa);
    }

    @Override
    public void muovi() {
        System.out.println("L'automobile si muove su strada.");
    }
}
```

Uso:

```java
Veicolo v = new Automobile("AB123CD");
v.muovi();          // L'automobile si muove su strada.
v.mostraTarga();    // Targa: AB123CD
```

---

## 📑 Esempio con interfaccia

```java
interface Volante {
    void vola();
}

class Aereo implements Volante {
    @Override
    public void vola() {
        System.out.println("L'aereo vola ad alta quota.");
    }
}
```

Uso:

```java
Volante mezzo = new Aereo();
mezzo.vola();  // L'aereo vola ad alta quota.
```

---

## 📊 Differenza tra **astrazione** e **incapsulamento**

| Concetto           | Obiettivo principale                                                        | Mezzi in Java                                                                 |
| ------------------ | --------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| **Incapsulamento** | Nascondere i dati e controllarne l’accesso                                  | Modificatori di visibilità (`private`, `public`, `protected`) + getter/setter |
| **Astrazione**     | Nascondere i dettagli implementativi e mostrare solo l’interfaccia pubblica | Classi astratte e interfacce                                                  |

---
# **type casting di oggetti** in Java

## 🔑 Concetti base

* Il **casting** modifica solo il **tipo del riferimento**, non l’oggetto.
* Funziona **solo tra classi in relazione di ereditarietà** (superclasse ↔ sottoclasse).
* Se il cast non è valido → **ClassCastException a runtime**.

---

## 🟢 Upcasting

* **Da sottoclasse a superclasse**
* È **sicuro** e avviene anche **implicitamente**.

Esempio:

```java
class Veicolo {}
class Automobile extends Veicolo {}
class AutoElettrica extends Automobile {}

AutoElettrica tesla = new AutoElettrica();
Automobile auto = tesla;  // upcasting implicito
Veicolo v = tesla;        // valido: una Tesla è un Veicolo
```

---

## 🔴 Downcasting

* **Da superclasse a sottoclasse**
* È **esplicito** e può fallire.

Esempio corretto:

```java
Veicolo v = new AutoElettrica();
AutoElettrica ae = (AutoElettrica) v;  // ok
ae.ricarica();
```

Esempio pericoloso:

```java
Veicolo v = new Automobile();
// Compila, ma a runtime lancia ClassCastException
AutoElettrica ae = (AutoElettrica) v;
```

---

## ✅ Uso di `instanceof` per la sicurezza

```java
Veicolo v = new Automobile();

if (v instanceof AutoElettrica) {
    AutoElettrica ae = (AutoElettrica) v;
    ae.ricarica();
} else {
    System.out.println("Non è un'auto elettrica!");
}
```

---

## 📊 Tabella riassuntiva

| Operazione      | Direzione                 | Sicurezza     | Cast esplicito? | Note               |
| --------------- | ------------------------- | ------------- | --------------- | ------------------ |
| **Upcasting**   | Sottoclasse → Superclasse | Sempre sicuro | No              | Automatico         |
| **Downcasting** | Superclasse → Sottoclasse | Può fallire   | Sì              | Usare `instanceof` |

---
# Associazione

L’**associazione** è uno dei concetti fondamentali della **Programmazione Orientata agli Oggetti (OOP)**.
Essa descrive la **relazione tra due classi indipendenti**, ovvero classi che non appartengono gerarchicamente l’una all’altra (non c’è ereditarietà né composizione).

L’associazione definisce una **relazione di molteplicità tra oggetti**, cioè specifica come e quanti oggetti di una classe possono essere collegati ad oggetti di un’altra classe.

---

## Caratteristiche principali

* **Indipendenza**: le classi coinvolte nell’associazione non dipendono l’una dall’altra per esistere.
* **Nessun proprietario**: non esiste un "titolare" della relazione, gli oggetti hanno un proprio ciclo di vita indipendente.
* **Durata di vita autonoma**: la distruzione di un oggetto non implica la distruzione automatica dell’altro.
* **Direzione**: l’associazione può essere:

  * **Unidirezionale**: un oggetto "conosce" l’altro e può utilizzarne i metodi/attributi.
  * **Bidirezionale**: entrambi gli oggetti si conoscono e possono interagire.
* **Molteplicità**:

  * **Uno-a-uno (1:1)**
  * **Uno-a-molti (1:N)**
  * **Molti-a-uno (N:1)**
  * **Molti-a-molti (N:M)**

---

## Differenze con altri tipi di relazione

* **Aggregazione**: relazione "ha un" in cui un oggetto può contenere altri, ma questi possono esistere anche da soli.
* **Composizione**: relazione "fa parte di" più forte, in cui il ciclo di vita dei sotto-oggetti dipende dall’oggetto contenitore.
* **Associazione**: relazione più generica, senza vincolo di contenimento.

---

## Rappresentazione UML

In UML l’associazione è rappresentata con una **linea semplice** che collega le due classi.

* La direzionalità viene indicata con una **freccia** (→) se unidirezionale.
* La molteplicità si indica vicino alle estremità (es. `1..*`, `0..1`, `*`).

![Rappresentazione UML](https://github.com/maboglia/CorsoJava/raw/master/appunti/img/aggregazione-composizione-associazione.png)

---

## Esempio in Java

### Associazione uno-a-molti (un Dipartimento ha più Docenti)

```java
class Docente {
    private String nome;

    public Docente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Dipartimento {
    private String nome;
    private List<Docente> docenti;

    public Dipartimento(String nome) {
        this.nome = nome;
        this.docenti = new ArrayList<>();
    }

    public void aggiungiDocente(Docente docente) {
        docenti.add(docente);
    }

    public List<Docente> getDocenti() {
        return docenti;
    }
}

public class Main {
    public static void main(String[] args) {
        Dipartimento dip = new Dipartimento("Informatica");
        Docente d1 = new Docente("Rossi");
        Docente d2 = new Docente("Bianchi");

        dip.aggiungiDocente(d1);
        dip.aggiungiDocente(d2);

        for (Docente d : dip.getDocenti()) {
            System.out.println(d.getNome() + " lavora nel dipartimento " + dip);
        }
    }
}
```

In questo esempio:

* **Dipartimento** e **Docente** sono indipendenti.
* Un **Dipartimento** può avere più **Docenti**.
* I docenti esistono anche senza il dipartimento (indipendenza della vita degli oggetti).

---
# Aggregazione

L’**aggregazione** è uno dei concetti fondamentali dell’**OOP** ed è considerata un **caso particolare di associazione unidirezionale**.

L’aggregazione descrive una relazione di tipo **HAS-A** (“ha un”), in cui un oggetto contiene un riferimento ad altri oggetti, pur mantenendo ciascuno il proprio ciclo di vita indipendente.

---

## Caratteristiche principali

* **Specializzazione dell’associazione**: è un’associazione, ma con un concetto semantico più forte.
* **Relazione HAS-A**: un oggetto possiede o utilizza un altro oggetto.
* **Ciclo di vita indipendente**: gli oggetti coinvolti non dipendono l’uno dall’altro per la loro esistenza. La distruzione di un oggetto non implica la distruzione dell’altro.
* **Proprietario logico**: uno degli oggetti (l’aggregatore) è considerato proprietario logico della relazione, ma non del ciclo di vita degli oggetti.

---

## Differenze rispetto ad altri concetti

* **Associazione**: relazione generica, senza vincolo di contenimento.
* **Aggregazione**: relazione più specifica di tipo HAS-A, con proprietà logica ma indipendenza di ciclo di vita.
* **Composizione**: relazione più forte in cui gli oggetti contenuti **non possono esistere** senza l’oggetto contenitore.

---

## Rappresentazione UML

In UML l’aggregazione è rappresentata con:

* Una **linea** che collega le due classi.
* Un **rombo vuoto** sul lato dell’oggetto contenitore (l’aggregatore).

![Rappresentazione UML](https://github.com/maboglia/CorsoJava/raw/master/appunti/img/aggregazione-composizione-associazione.png)

---

## Esempio in Java

### Aggregazione uno-a-molti (una Scuola ha più Studenti)

```java
class Studente {
    private String nome;

    public Studente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Scuola {
    private String nome;
    private List<Studente> studenti;

    public Scuola(String nome) {
        this.nome = nome;
        this.studenti = new ArrayList<>();
    }

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public List<Studente> getStudenti() {
        return studenti;
    }
}

public class Main {
    public static void main(String[] args) {
        Scuola scuola = new Scuola("Liceo Scientifico");
        Studente s1 = new Studente("Luca");
        Studente s2 = new Studente("Anna");

        scuola.aggiungiStudente(s1);
        scuola.aggiungiStudente(s2);

        for (Studente s : scuola.getStudenti()) {
            System.out.println(s.getNome() + " frequenta " + scuola);
        }
    }
}
```

### Nota sull’esempio

* La **Scuola** contiene una lista di **Studenti** (relazione HAS-A).
* Gli **Studenti** esistono anche senza la **Scuola** (ciclo di vita indipendente).
* L’oggetto **Scuola** è proprietario logico della relazione, ma non della vita degli **Studenti**.
---
# Composizione

La **composizione** è uno dei concetti chiave dell’**OOP** ed è considerata un **caso più restrittivo di aggregazione**.

Mentre nell’aggregazione gli oggetti hanno un ciclo di vita indipendente, nella composizione la relazione **HAS-A** diventa molto più forte:
un oggetto contenitore **contiene** uno o più oggetti che **non possono esistere senza di esso**.

---

## Caratteristiche principali

* **Relazione forte HAS-A / PART-OF**: un oggetto è **parte integrante** di un altro.
* **Dipendenza del ciclo di vita**: se l’oggetto contenitore viene distrutto, vengono distrutti automaticamente anche gli oggetti contenuti.
* **Creazione interna**: di solito gli oggetti "parte" vengono creati all’interno della classe contenitore.
* **Migliore dell’ereditarietà**: la composizione è spesso preferita all’ereditarietà perché favorisce:

  * il **riuso del codice** (un oggetto può contenere altri oggetti con responsabilità specifiche),
  * il **controllo della visibilità** degli oggetti (gli oggetti parte non sono accessibili direttamente dall’esterno).

---

## PART-OF

La relazione di composizione può essere vista come **PART-OF** (“parte di”).

Esempio tipico:

* Un’**Auto** ha un **Motore**.
* Il **Motore** è parte integrante dell’auto.
* Se l’auto viene distrutta, anche il motore cessa di esistere.

---

## Differenze con altri concetti

* **Associazione**: relazione generica, senza vincolo di contenimento.
* **Aggregazione**: relazione HAS-A con ciclo di vita indipendente.
* **Composizione**: relazione HAS-A / PART-OF con ciclo di vita dipendente.

---

## Rappresentazione UML

In UML la composizione è rappresentata con:

* Una **linea** che collega le due classi.
* Un **rombo pieno** sul lato del contenitore.

![Rappresentazione UML](https://github.com/maboglia/CorsoJava/raw/master/appunti/img/aggregazione-composizione-associazione.png)

---

## Esempio in Java

### Composizione (un’Auto ha un Motore)

```java
class Motore {
    private int cilindrata;

    public Motore(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void avvia() {
        System.out.println("Motore avviato con cilindrata: " + cilindrata);
    }
}

class Auto {
    private String modello;
    private Motore motore;  // parte integrante

    public Auto(String modello, int cilindrata) {
        this.modello = modello;
        this.motore = new Motore(cilindrata); // il motore è creato insieme all’auto
    }

    public void avvia() {
        System.out.println("Avvio dell’auto " + modello);
        motore.avvia();
    }
}

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Fiat Panda", 1200);
        auto.avvia();
        // Quando "auto" viene distrutta, anche "motore" cessa di esistere
    }
}
```

### Nota sull’esempio

* **Auto** e **Motore** formano una relazione di composizione.
* Il **Motore** non può esistere senza l’**Auto** (ciclo di vita dipendente).
* La **composizione** garantisce un forte legame PART-OF.
---
# Ereditarietà in Java

## Riutilizzare il codice

* Uno dei grandi vantaggi della programmazione a oggetti è la facilità nel riutilizzare il codice

* In Java si realizza attraverso **l’ereditarietà**


---
* Per esempio immaginiamo di programmare un software per veicoli

```Automobile {attributi: marca, modello}```

---

* Dobbiamo modificare il sistema per aggiungere un nuovo attributo, le ruote motrici

a) Modifichiamo direttamente la classe Automobile: Errore!

b) Creiamo una nuova classe che erediti da Automobile:

```Fuoristrada {Automobile + attributo: 4 ruote motrici}```

---

### Quando utilizzare l’ereditarietà

* Per modificare classi già esistenti, specialmente quando abbiamo molte classi da gestire

* Per non dover riprogrammare due volte lo stesso codice

[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)
---
# Polimorfismo 

* La parola polimorfismo deriva dal greco e significa letteralmente molte forme.
* Nella OOP tale termine si riferisce ai metodi: per definizione, il polimorfismo è la capacità di un oggetto, la cui classe fa parte di una gerarchia, di chiamare la versione corretta di un metodo.
* Quindi il polimorfismo è necessario quando si ha una gerarchia di classi.

![polimorfismo UML](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Polimorfismo1.png)

---

## Polimorfismo per metodi mediante overloading

Una classe può avere più metodi con lo stesso nome

---

## I metodi devono essere distinguibili in base a

* Numero dei parametri
* Tipo dei parametri

---

### Il metodo da eseguire viene scelto in base a

* Numero e tipo di parametri

Il metodo da eseguire **NON** viene scelto in base al **valore di ritorno**

---

### Il polimorfismo evidenzia le differenze tra **Programmazione Procedurale e OOP**

* Nella programmazione procedurale, il codice è centrale e i dati sono subordinati
* abbiamo programmi che agiscono sui dati che di solito non sono strettamente collegati
* Nella programmazione a oggetti, gli oggetti sono l'elemento centrale.
* Un oggetto consiste nei **dati** (attributi, proprietà, ...)
* e nel codice che opera su tali dati: **metodi**
* **dati e metodi** sono strettamente collegati: è il concetto di **incapsulamento**
* l'**incapsulamento** permette anche di nascondere l'implementazione interna, utilizzando l'oggetto attraverso l'**interfaccia** pubblica.

---

### Per esempio: abbiamo un numero e vogliamo raddoppiarlo

Nel modo procedurale possiamo scrivere:

```java
n = n * 2
```

**Il codice moltiplica n per 2 e registra il risultato in n.**

---

### In OOP: abbiamo un numero e vogliamo raddoppiarlo

Nella programmazione orientata agli oggetti si invia un "messaggio" all'oggetto chiamando un metodo per raddoppiare: `n.raddoppia();`

Un oggetto di tipo Operazione riceve la chiamata al metodo `raddoppia(<TIPO>)`, riconosce il tipo dell'argomento e richiama il metodo implementato per quel tipo.

---

### Codice esempio

```java
class Operazione{
 

 public int raddoppia(int n){
  return n * 2;
 }

 public String raddoppia(String s){
  return s+s;
 }

}
```

---

## Polimorfismo

Il vantaggio di questa tecnica è definito **polimorfismo**.

Se il programma richiede di replicare la procedura su un oggetto di tipo string come "bob", nel modo procedurale occorre invocare una nuova funzione con un codice e un nome differente.

---

[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)
---
# Il modificatore static

* La parola riservata `static` viene usata per indicare il livello di definizione di un **attributo o metodo**
* Se la parola `static` è presente l’attributo o metodo è definito **a livello di classe**
* Se la parola `static` **non** è presente l’attributo o metodo è definito **a livello di istanza** (esemplare della classe)

---

## Static vs. non static

* Ogni attributo o metodo non static esiste concretamente **in ogni istanza creata**
* Esiste in “molteplici versioni” se vengono create più istanze
* **Non esiste** concretamente **se il programma non crea almeno un’istanza** (tramite operatore new)
* Ogni attributo o metodo static esiste concretamente a livello di classe
* Esiste in un’unica versione
* La sua esistenza non dipende da cosa fa il programma

---

## Variabili di classe

* Rappresentano proprietà comuni a tutte le istanze
* Esistono anche in assenza di istanze (oggetti)
* Dichiarazione: static
* Accesso: NomeClasse.attributo

```java
class Automobile {
	static int numeroRuote = 4;
}

Automobile.numeroRuote;
```

---

## Metodi di classe: funzioni non associate ad alcuna istanza

* Dichiarazione: static
* Accesso: NomeClasse . nomeMetodoStatic()

```java
class HelloWorld {
public static void main (String args[]) {
System.out.println("Hello World!");

//p.es  cos(x): metodo static della classe Math, ritorna un double
double y = Math.cos(x);
}
}
```

---

## Accesso a metodi e attributi static

* Essendo definiti a livello di classe, attributi e metodi static sono acceduti/invocati tramite il nome della classe:
* `Math.sqrt (2);`
* `String.valueOf( Math .PI);`
* In caso di classe istanziabile ibrida si può accedere tramite una qualunque istanza della classe, ma è meglio non farlo.

---

## Accesso a metodi e attributi static

* Nel corpo di un metodo `static` non si può accedere ad attributi e metodi non `static` della stessa classe
* Il metodo `static` deve poter essere invocato a livello di classe (anche in assenza di istanze) mentre attributi e metodi non `static` esistono solo se c’è almeno un’istanza
* Se nel corpo di un metodo appare il nome di un metodo o attributo `static` della sua classe è sottinteso che sia preceduto dal nome della classe stessa
* Eventuali mescolanze improprie di `static` e non `static` causano errori di compilazione

---

[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)
---
# Classi Astratte

---

## Una classe avente **almeno un metodo astratto** deve essere dichiarata come classe astratta

NB: **Posso** comunque dichiarare una classe astratta **anche se non contiene** alcun metodo astratto!

```java
abstract class Forma {
...
abstract void stampa();
...
}
```

Un metodo astratto è un metodo di cui non viene specificata l'implementazione

---

### Una classe astratta

* È una classe non completamente definita (nella parte astratta)
* **Non** può essere **istanziata**

Per ottenere una classe concreta (istanziabile) da una astratta occorre definire tutte le implementazioni mancanti ovvero

* Ereditare la classe facendo l'overriding di tutti i metodi astratti

---

### Permette di trattare omogeneamente oggetti con caratteristiche diverse

Man mano che si sale nella gerarchia dell'ereditarietà, le classi diventano sempre più generiche e probabilmente più astratte.

Ad un certo punto la classe superiore diventa a tal punto generica che la si può pensare come una base per le altre classi piuttosto che come una classe di cui creare un oggetto.

---

### METODO ASTRATTO

Posso usare la classe astratta quando voglio **obbligare** tutte le sottoclassi di una classe A ad avere un metodo ```nomeMetodo()```, ma allo stesso tempo non voglio implementare tale metodo nella classe A.

**SINTASSI:**

`public abstract int nomeMetodo( ) ;`

* un metodo astratto deve essere obbligatoriamente pubblico,  altrimenti non avrebbe senso
* lascio il metodo indefinito. infatti non apro il relativo blocco con le parentesi graffe ed il codice del metodo.

---

## Le classi parzialmente astratte

Le Classi Astratte, oltre ad avere **metodi astratti**, possono avere metodi ed attributi **normali**.

Se una classe è astratta, non posso istanziarla: **NON POSSO CREARE OGGETTI DA UNA CLASSE ASTRATTA**


---

Che senso ha definire dei metodi astratti e di conseguenza rendere una classe astratta?

* Definisco un metodo astratto quando voglio forzare tutte le sottoclassi ad avere un determinato metodo.
* I metodi astratti funzionano come **segnaposto** dei metodi implementati poi nella sottoclasse.

---

## Regole per le **sottoclassi**

La sottoclasse deve implementare **tutti i metodi** che la superclasse aveva astratti.

Se la sottoclasse a sua volta **non definisce** i metodi che la superclasse aveva dichiarato astratti, **anche** la **sottoclasse deve essere dichiarata astratta**.

---

[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)
---
# Interfacce

Le interfacce in Java sono uno strumento potente per definire contratti o specifiche di comportamento che le classi devono implementare. Ecco alcuni concetti chiave sulle interfacce in Java:

---

1. **Definizione di un'Interfaccia:**
   - Un'interfaccia è definita utilizzando la parola chiave `interface`. Essa contiene dichiarazioni di metodi, ma non fornisce l'implementazione dei metodi stessi.

   ```java
   public interface Contratto {
       void obbligoUno();
       int obbligoDue(String parametro);
   }
   ```

---


2. **Implementazione di un'Interfaccia:**
   - Una classe implementa un'interfaccia utilizzando la parola chiave `implements`. La classe deve fornire un'implementazione per tutti i metodi dichiarati nell'interfaccia.

   ```java
   public class MiaClasse implements Contratto {
       @Override
       public void obbligoUno() {
           // Implementazione del obbligoUno
       }

       @Override
       public int obbligoDue(String parametro) {
           // Implementazione del obbligoDue
           return 42;
       }
   }
   ```

---


3. **Estensione di Interfacce:**
   - Un'interfaccia può estendere una o più interfacce. Questo consente di creare gerarchie di interfacce, ereditando i metodi delle interfacce padre.

   ```java
   public interface AltraInterfaccia extends Contratto {
       void nuovoMetodo();
   }
   ```

---


4. **Variabili in un'Interfaccia:**
   - In Java 8 e versioni successive, è possibile dichiarare variabili di istanza in un'interfaccia. Queste variabili sono implicitamente pubbliche, statiche e finali.

   ```java
   public interface InterfacciaConVariabile {
       int VALORE_COSTANTE = 42;
   }
   ```

---


5. **Default Methods:**
   - Dal Java 8, è possibile fornire un'implementazione di default per i metodi in un'interfaccia. Questo consente di estendere le interfacce senza dover modificare tutte le classi che le implementano.

   ```java
   public interface InterfacciaConDefault {
       void metodo();
       
       default void metodoDefault() {
           // Implementazione di default
       }
   }
   ```

---


6. **Metodi Statici in un'Interfaccia:**
   - Si possono definire metodi statici all'interno di un'interfaccia, che possono essere chiamati senza creare un'istanza dell'interfaccia.

   ```java
   public interface InterfacciaConMetodoStatico {
       static void metodoStatico() {
           // Implementazione del metodo statico
       }
   }
   ```

---


7. **Utilità delle Interfacce:**
   - Le interfacce consentono la progettazione di codice più flessibile e modulare. Possono essere utilizzate per definire contratti comuni, permettendo l'implementazione polimorfica e facilitando la manutenzione del codice.

---


Le interfacce svolgono un ruolo fondamentale nella progettazione orientata agli oggetti, consentendo una separazione chiara tra contratto e implementazione. La loro utilità diventa evidente quando si desidera che diverse classi condividano un comportamento comune senza ereditarietà multipla diretta, poiché Java non supporta la multi-ereditarietà di classi.



---

## Un'interfaccia

* Ha tutti i vantaggi e le indicazioni d'uso delle classi astratte
* Presenta maggior flessibilità rispetto all'ereditarietà di una classe astratta
* È possibile definire solo "attributi" final (in pratica costanti)
* Definendo un attributo in un'interfaccia questo viene automaticamente considerato final

Un'interfaccia può essere considerata un modo per cosa dovrebbero fare le classi senza specificare come farlo.

Quindi un'interfaccia non è una classe ma un insieme di requisiti per le classi che si vogliono conformare ad essa.


---


## interface

Si utilizza la parola chiave **interface** anzichè **class**

I **metodi** sono implicitamente **pubblici** e **astratti**, non bisogna indicarlo

Se una classe decide di soddisfare i requisiti di un'interfaccia si dice che la classe implementa l'interfaccia.

---

### proprietà

Le interfacce non sono classi; **non si può utilizzare new** per crearne oggetti.

I metodi di un'interfaccia sono automaticamente **public** (quindi non è necessario scriverlo)

Gli attributi di un'interfaccia sono sempre **public static final** (non è necessario scriverlo).

Un'interfaccia con il nome **NomeInterfaccia** va salvata nel file NomeInterfaccia.java (come accade per le classi).

---

### ereditarietà multipla

Una sottoclasse può estendere solo una superclasse (non è permessa in Java l'ereditarietà multipla)

Con le interfacce invece la situazione è diversa: una classe può implementare quante interfacce vuole.

---

## Estendere interfacce

Un'interfaccia può estendere un'altra interfaccia, sempre con ereditarietà singola.
Possono così essere implementate gerarchie di interfacce (e classi astratte, vedi per esempio [JCF](./022_JCF_collezioni.md))

---

### Sintassi di esempio

```java
public interface NomeInterfaccia extends AltraInterfaccia {
  int metodo1( );
}
```

---

## Tipi di interfacce

* Normali
* Single Abstract method - @FunctionalInterface
* Marker

Con java 1.8 le interfacce sono state modificate: è possibile implementare due tipi di metodi (!!!)

* default
* static

---

## Interfacce funzionali e **Lambda expressions**

Con le interfacce contenenti un singolo metodo astratto, è possibile utilizzare le espressioni lambda

* Ad esempio: `Integer raddoppiato = (o) -> o * 2 ;`
* [Interfacce funzionali](./018_interfacce_funzionali.md)


---

[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)
---
# Enum

In Java, le enum (abbreviazione di "enumeration") sono un tipo di dato speciale che rappresenta un insieme di costanti. Le enum sono state introdotte in Java 5 per consentire la dichiarazione di un tipo di dato che consiste in un insieme fisso di valori ben noti. Le enum forniscono un modo pulito e leggibile per rappresentare costanti nel codice.

Ecco alcune caratteristiche chiave delle enum in Java:

---

1. **Dichiarazione:**
   Puoi dichiarare un tipo enum utilizzando la parola chiave `enum`. Ad esempio:

   ```java
   public enum Days {
       MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
   }
   ```

   In questo esempio, `Days` è una enum con sette costanti rappresentanti i giorni della settimana.

---

2. **Valori della Enum:**
   Gli elementi di una enum sono chiamati valori della enum. Nel caso dell'esempio sopra, i valori sono `MONDAY`, `TUESDAY`, ecc.

---

3. **Uso delle Enum:**
   Puoi utilizzare le enum in dichiarazioni di variabili, switch statement, e altri contesti in cui sono richiesti valori costanti.

   ```java
   Days today = Days.MONDAY;

   switch (today) {
       case MONDAY:
           System.out.println("Inizia la settimana!");
           break;
       case FRIDAY:
           System.out.println("Giorno del weekend!");
           break;
       // Altri casi...
   }
   ```

---

4. **Metodi nelle Enum:**
   Puoi aggiungere campi e metodi alle enum. Ad esempio, ogni valore di una enum può avere attributi associati.

   ```java
   public enum Days {
       MONDAY("Start of the week"), TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

       private String description;

       // Costruttore
       Days(String description) {
           this.description = description;
       }

       // Metodo per ottenere la descrizione
       public String getDescription() {
           return description;
       }
   }
   ```

---

   Ora puoi ottenere la descrizione di un giorno:

   ```java
   System.out.println(Days.MONDAY.getDescription()); // Stampa "Start of the week"
   ```

---

5. **Metodo `values()` e `valueOf()`:**
   Le enum forniscono metodi utili come `values()`, che restituisce un array di tutte le costanti di una enum, e `valueOf(String)`, che restituisce la costante con il nome specificato.

   ```java
   Days[] allDays = Days.values(); // Restituisce un array di tutte le costanti
   Days aDay = Days.valueOf("MONDAY"); // Restituisce la costante con il nome specificato
   ```

Le enum sono utili quando devi rappresentare un insieme fisso e ben noto di valori correlati, come giorni della settimana, mesi, ecc. Forniscono un codice più leggibile e robusto rispetto all'utilizzo di costanti intere o stringhe.


---
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

---

Eccezione|Significato
---|---
IndexOutOfBoundsException|Indice non valido.
NegativeArraySizeException|Array creato con dimensione negativa.
NullPointerException|Utilizzo non corretto di un valore null.
NumberFormatException|Conversione non valida di una stringa in un valore numerico.
SecurityException|Violazione delle norme di sicurezza.
StringIndexOutOfBoundsException|Indice non valido per i caratteri di una stringa.
UnsupportedOperationException|Operazione non supportata.

---

[esempi](https://github.com/maboglia/CorsoJava/blob/master/esempi/10_eccezioni.md)
---
# Nested classes

In Java, le "nested classes" (classi innestate) si riferiscono alla capacità di definire una classe all'interno di un'altra classe. Questa tecnica consente di organizzare e strutturare il codice in modo più logico e coerente. Le classi innestate possono essere suddivise in due categorie principali: classi interne (inner classes) e classi innestate statiche (static nested classes).

---

1. **Classi Interne (Inner Classes):**

   - **Definizione:** Una classe interna è dichiarata all'interno di un'altra classe. Ha accesso diretto ai membri della classe esterna, compresi quelli dichiarati privati.

   - **Esempio:**

     ```java
     class OuterClass {
         class InnerClass {
             // ...
         }
     }
     ```

---

   - **Utilità:**
     - Raggruppare logicamente classi utilizzate solo in un'unica posizione.
     - Aumentare l'incapsulamento permettendo a una classe interna di accedere ai membri privati della classe esterna.
     - Migliorare la leggibilità e la manutenibilità del codice.

   - **Istanziamento:**

     ```java
     OuterClass outerObject = new OuterClass();
     OuterClass.InnerClass innerObject = outerObject.new InnerClass();
     ```

---

2. **Classi Innestate Statiche (Static Nested Classes):**

   - **Definizione:** Una classe innestata statica è associata alla sua classe esterna, ma non ha accesso diretto ai membri non statici della classe esterna. È simile a una classe di primo livello e può essere istanziata senza creare un'istanza della classe esterna.

   - **Esempio:**

     ```java
     class OuterClass {
         static class StaticNestedClass {
             // ...
         }
     }
     ```

---

   - **Utilità:**
     - Incapsulamento simile a quello di una classe di primo livello per motivi di convenienza di impacchettamento.
     - Non ha accesso ai membri non statici della classe esterna.

   - **Istanziamento:**

     ```java
     OuterClass.StaticNestedClass staticNestedObject = new OuterClass.StaticNestedClass();
     ```

L'utilizzo di classi innestate è particolarmente utile quando si desidera organizzare e strutturare il codice in modo che le classi siano strettamente collegate o quando si vuole nascondere l'implementazione dettagliata di una classe all'esterno.
---
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

---
