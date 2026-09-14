# Programmazione a Oggetti in Java
## Dalla metafora del ristorante alle basi dell'OOP

> **Obiettivo:** capire l'Object-Oriented Programming partendo da problemi concreti e traducendo i concetti direttamente in Java.

---

## 1. Perché la programmazione a oggetti?

Immaginiamo un ristorante gestito da una sola persona: prende gli ordini, cucina, serve ai tavoli e pulisce.

Finché il ristorante è piccolo può funzionare. Quando cresce, però, il problema non è lavorare più velocemente: è **organizzare meglio le responsabilità**.

La soluzione è dividere il lavoro:

- il cameriere prende gli ordini;
- il cuoco cucina;
- il responsabile coordina;
- il personale di pulizia si occupa della pulizia.

La stessa idea si applica al software.

Quando una sola funzione fa troppe cose, il codice diventa difficile da seguire e modificare: è il classico **spaghetti code**.

### Idea chiave

> **OOP = organizzare il software in oggetti che possiedono dati e responsabilità ben definite.**

---

## 2. Classi e oggetti

Nel ristorante possiamo modellare un cameriere.

Ci chiediamo:

1. **Che cosa possiede?** → dati/stato.
2. **Che cosa sa fare?** → comportamenti.

In Java:

```java
public class Waiter {
    private String name;

    public Waiter(String name) {
        this.name = name;
    }

    public void takeOrder() {
        System.out.println(name + " prende l'ordine");
    }
}
```

`Waiter` è una **classe**: il progetto, o blueprint.

Un oggetto è un'istanza concreta della classe:

```java
Waiter roberto = new Waiter("roberto");
Waiter simona = new Waiter("simona");

roberto.takeOrder();
simona.takeOrder();
```

### Classe vs oggetto

| Concetto | Significato |
|---|---|
| Classe | Definisce struttura e comportamento |
| Oggetto | Istanza concreta della classe |
| `new` | Crea un nuovo oggetto |
| Riferimento | Variabile che permette di usare l'oggetto |

**Metafora:** la classe è il progetto del cameriere; roberto e simona sono due camerieri reali costruiti su quel progetto.

---

## 3. Attributi e stato

Un oggetto contiene dati che descrivono il suo stato.

```java
public class Waiter {
    private String name;
    private int table;

    public Waiter(String name, int table) {
        this.name = name;
        this.table = table;
    }
}
```

Ogni oggetto può avere valori differenti:

```java
Waiter roberto = new Waiter("roberto", 4);
Waiter simona = new Waiter("simona", 6);
```

roberto e simona appartengono alla stessa classe, ma hanno **stato diverso**.

### Attenzione: attributi di istanza e statici

In Java è importante distinguere:

```java
private int table;          // attributo di istanza
private static int count;  // attributo della classe
```

- un attributo di istanza appartiene al singolo oggetto;
- un attributo `static` appartiene alla classe ed è condiviso.

Per evitare stato condiviso involontario, i dati che descrivono il singolo oggetto normalmente sono **attributi di istanza**.

---

## 4. Costruttore e `this`

Nel materiale originale il concetto è introdotto trfrancescoe `__init__` e `self` di Python.

In Java l'equivalente concettuale è:

- `__init__` → **costruttore**;
- `self` → **`this`**.

Esempio:

```java
public class Waiter {
    private String name;
    private int table;

    public Waiter(String name, int table) {
        this.name = name;
        this.table = table;
    }
}
```

`this` significa **l'oggetto corrente**.

Quando scriviamo:

```java
this.name = name;
```

il primo `name` è l'attributo dell'oggetto, mentre il secondo è il parametro del costruttore.

### Perché usare il costruttore?

Per garantire che ogni oggetto venga creato con uno stato iniziale coerente:

```java
Waiter roberto = new Waiter("roberto", 4);
Waiter simona = new Waiter("simona", 6);
```

---

## 5. Metodi

Un metodo è un comportamento associato a una classe.

```java
public class Waiter {
    private String name;

    public Waiter(String name) {
        this.name = name;
    }

    public void takeOrder() {
        System.out.println(name + " prende l'ordine");
    }
}
```

Il metodo usa lo stato dell'oggetto:

```java
Waiter roberto = new Waiter("roberto");
roberto.takeOrder();
```

e:

```java
Waiter simona = new Waiter("simona");
simona.takeOrder();
```

Stesso metodo, oggetti differenti, stato differente.

### Idea chiave

> **Un oggetto combina dati + comportamenti che operano su quei dati.**

---

## 6. Incapsulamento

L'incapsulamento significa mantenere insieme **stato e comportamento**, controllando come lo stato può essere modificato.

In Java è tipico dichiarare gli attributi `private`:

```java
public class Waiter {
    private int table;

    public Waiter(int table) {
        this.table = table;
    }

    public void assignTable(int table) {
        this.table = table;
    }

    public int getTable() {
        return table;
    }
}
```

Il codice client non deve necessariamente modificare direttamente il campo:

```java
Waiter roberto = new Waiter(4);
roberto.assignTable(5);
```

In questo modo la classe può controllare le modifiche e mantenere le proprie invarianti.

### Stato

Lo **stato** è l'insieme dei valori degli attributi di un oggetto in un determinato momento.

---

## 7. Ereditarietà

Nel ristorante tutti i membri del personale condividono alcune caratteristiche:

- nome;
- turno;
- comportamento comune.

Possiamo rappresentare questa parte comune con una classe base:

```java
public class Staff {
    protected String name;
    protected String shift;

    public Staff(String name, String shift) {
        this.name = name;
        this.shift = shift;
    }

    public void startWork() {
        System.out.println(name + " inizia il turno");
    }
}
```

Poi specializziamo:

```java
public class Waiter extends Staff {

    public Waiter(String name, String shift) {
        super(name, shift);
    }

    public void takeOrder() {
        System.out.println(name + " prende l'ordine");
    }
}
```

```java
public class Chef extends Staff {

    public Chef(String name, String shift) {
        super(name, shift);
    }

    public void cook() {
        System.out.println(name + " cucina");
    }
}
```

Creiamo gli oggetti:

```java
Waiter roberto = new Waiter("roberto", "sera");
Chef francesco = new Chef("francesco", "sera");

roberto.startWork();
francesco.startWork();
```

Il metodo `startWork()` è definito una sola volta nella classe `Staff`.

### Idea chiave

> **Ereditarietà = una classe deriva da un'altra e riutilizza/estende struttura e comportamento.**

Relazione:

> **Waiter is a Staff**  
> **Chef is a Staff**

---

## 8. Polimorfismo

Il manager vuole impartire un solo comando:

```java
staff.work();
```

ma ogni ruolo deve lavorare in modo diverso.

In Java possiamo usare un metodo ridefinito (`override`):

```java
public class Staff {
    public void work() {
        System.out.println("Il personale lavora");
    }
}
```

```java
public class Waiter extends Staff {
    @Override
    public void work() {
        System.out.println("Il cameriere prende gli ordini");
    }
}
```

```java
public class Chef extends Staff {
    @Override
    public void work() {
        System.out.println("Il cuoco prepara il cibo");
    }
}
```

Ora possiamo trattare oggetti diversi attraverso il tipo comune:

```java
Staff roberto = new Waiter();
Staff francesco = new Chef();

roberto.work();
francesco.work();
```

Output concettuale:

```text
Il cameriere prende gli ordini
Il cuoco prepara il cibo
```

### Che cosa è successo?

Il comando è lo stesso:

```java
work();
```

ma il comportamento effettivo dipende dall'oggetto concreto.

Questo è **polimorfismo**.

> **Stessa interfaccia, comportamenti differenti.**

---

## 9. Astrazione

L'astrazione serve a definire ciò che una classe deve garantire senza stabilire necessariamente come realizzarlo.

In Java possiamo usare una **classe astratta**:

```java
public abstract class Staff {

    protected String name;

    public Staff(String name) {
        this.name = name;
    }

    public void startWork() {
        System.out.println(name + " inizia il turno");
    }

    public abstract void work();
}
```

`work()` è un metodo astratto: dichiara un requisito, ma non ne fornisce l'implementazione.

La sottoclasse deve implementarlo:

```java
public class Waiter extends Staff {

    public Waiter(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " prende gli ordini");
    }
}
```

Se una sottoclasse non implementa tutti i metodi astratti, rimane astratta e non può essere istanziata direttamente.

Non possiamo fare:

```java
Staff staff = new Staff("Mario"); // errore
```

Possiamo invece fare:

```java
Staff roberto = new Waiter("roberto");
```

### Idea chiave

> **Astrazione = stabilire che cosa deve esistere, lasciando alle implementazioni concrete il compito di definire come.**

---

## 10. Composizione

I sistemi reali non sono costruiti solo con l'ereditarietà.

Un cameriere **non è** un cuoco.

Un cameriere **ha** un cuoco con cui collaborare.

Questa è una relazione **has-a**.

```java
public class Chef {

    public void cook() {
        System.out.println("Il cuoco prepara il cibo");
    }
}
```

Il cameriere riceve un riferimento a un `Chef`:

```java
public class Waiter {

    private String name;
    private Chef chef;

    public Waiter(String name, Chef chef) {
        this.name = name;
        this.chef = chef;
    }

    public void takeOrder() {
        System.out.println(name + " prende l'ordine");
        chef.cook();
    }
}
```

Utilizzo:

```java
Chef chef = new Chef();
Waiter roberto = new Waiter("roberto", chef);

roberto.takeOrder();
```

Il flusso è:

```text
Waiter
   |
   | collabora con
   v
 Chef
   |
   v
 cook()
```

### Inheritance vs Composition

| Relazione | Esempio | Java |
|---|---|---|
| **is-a** | Waiter è Staff | `extends` |
| **has-a** | Waiter ha un Chef | attributo/riferimento |

> **Composizione = costruire oggetti complessi combinando oggetti più semplici.**

---

## 11. I concetti OOP in una mappa

```text
                    OOP
                     |
        +------------+------------+
        |            |            |
     Classe       Oggetto       Metodo
        |            |
     blueprint      stato
                     |
              +------+------+
              |             |
       Encapsulazione    Collaborazione
              |             |
              |        Composizione
              |
        controllo stato

        Ereditarietà
              |
              v
        Polimorfismo
              |
              v
          Astrazione
```

---

## 12. I cinque concetti da ricordare

### 1. Incapsulamento
Raggruppare dati e comportamenti e controllare l'accesso allo stato.

### 2. Ereditarietà
Riutilizzare ed estendere una classe base.

### 3. Polimorfismo
Usare un'interfaccia comune ottenendo comportamenti diversi.

### 4. Astrazione
Definire ciò che deve essere presente senza imporre necessariamente come realizzarlo.

### 5. Composizione
Costruire un oggetto collaborando con altri oggetti.

---

## 13. La traduzione Python → Java

| Concetto nel materiale | Python | Java |
|---|---|---|
| Classe | `class Waiter:` | `class Waiter { }` |
| Istanza | `Waiter()` | `new Waiter()` |
| Costruttore | `__init__` | `Waiter(...)` |
| Oggetto corrente | `self` | `this` |
| Metodo | `def take_order()` | `void takeOrder()` |
| Attributo | `self.table` | `private int table` |
| Ereditarietà | `class Waiter(Staff)` | `class Waiter extends Staff` |
| Override | ridefinizione metodo | `@Override` |
| Classe astratta | `ABC` | `abstract class` |
| Metodo astratto | `@abstractmethod` | `abstract` |
| Composizione | attributo oggetto | riferimento a un altro oggetto |

---

## 14. Esempio finale integrato

```java
public abstract class Staff {

    protected String name;

    public Staff(String name) {
        this.name = name;
    }

    public void startWork() {
        System.out.println(name + " inizia il turno");
    }

    public abstract void work();
}
```

```java
public class Chef extends Staff {

    public Chef(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " cucina");
    }

    public void cook() {
        System.out.println(name + " prepara il piatto");
    }
}
```

```java
public class Waiter extends Staff {

    private Chef chef;

    public Waiter(String name, Chef chef) {
        super(name);
        this.chef = chef;
    }

    @Override
    public void work() {
        System.out.println(name + " prende gli ordini");
    }

    public void takeOrder() {
        System.out.println(name + " prende l'ordine");
        chef.cook();
    }
}
```

```java
public class RestaurantDemo {

    public static void main(String[] args) {

        Chef chef = new Chef("francesco");
        Staff waiter = new Waiter("roberto", chef);

        waiter.startWork();
        waiter.work();

        ((Waiter) waiter).takeOrder();
    }
}
```

### Lettura dell'esempio

- `Staff` → **astrazione**;
- `Waiter` e `Chef` → **ereditarietà**;
- `work()` → **polimorfismo**;
- campi `private` → **incapsulamento**;
- `Waiter` contiene un `Chef` → **composizione**;
- `new` → creazione di oggetti;
- `this` → riferimento all'oggetto corrente.

---

## 15. Messaggio finale

La programmazione a oggetti non va imparata come una lista di definizioni isolate.

Partiamo da un problema:

> **Come organizzo un sistema complesso senza trasformarlo in un unico blocco difficile da modificare?**

Poi assegniamo responsabilità a oggetti diversi.

```text
Problema complesso
       ↓
Responsabilità
       ↓
Classi
       ↓
Oggetti
       ↓
Dati + comportamenti
       ↓
Collaborazione
       ↓
Sistema più organizzato
```

Il punto non è usare più classi possibile.

Il punto è **modellare responsabilità, stato e collaborazione in modo comprensibile e mantenibile**.

---

## 16. Checklist per lo studente

Al termine della lezione dovresti saper spiegare:

- [ ] che cos'è una classe;
- [ ] che cos'è un oggetto;
- [ ] la differenza tra classe e istanza;
- [ ] che cos'è un attributo;
- [ ] che cos'è lo stato di un oggetto;
- [ ] che cos'è un metodo;
- [ ] perché esiste un costruttore;
- [ ] che cosa significa `this`;
- [ ] che cos'è l'incapsulamento;
- [ ] che cos'è l'ereditarietà;
- [ ] che cos'è il polimorfismo;
- [ ] che cos'è una classe astratta;
- [ ] che cos'è la composizione;
- [ ] la differenza tra relazione **is-a** e **has-a**.

