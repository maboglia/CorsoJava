# 🔹 Metodi in Java

Un **metodo** è un concetto fondamentale della programmazione orientata agli oggetti (OOP).
È un **insieme di istruzioni con un nome** che serve a:

* risolvere un problema scomponendolo in sottoproblemi,
* rendere il codice più chiaro e strutturato,
* favorire il riuso del codice.

Sinonimi in altri linguaggi: **funzioni**, **procedure**, **subroutines**.

---

## 🔹 Componenti di un metodo

Una dichiarazione di metodo può contenere fino a **sei parti principali** (alcune opzionali), nell’ordine:

1. **Modificatori** → `public`, `private`, `static`, ecc.
2. **Tipo restituito** → tipo del valore prodotto (`int`, `String`, `void` se non restituisce nulla).
3. **Nome del metodo** → segue le regole degli identificatori, ma per convenzione inizia con lettera minuscola e verbo (es. `calcolaArea`).
4. **Elenco parametri** → tra parentesi `()`, separati da virgole, ognuno con tipo e nome (`int x, int y`).
5. **Elenco di eccezioni** (opzionale) → con `throws`.
6. **Corpo del metodo** → tra `{}`, contiene le istruzioni da eseguire.

---

## 🔹 Argomenti attuali e formali

* Quando si **invoca** un metodo, si passano **argomenti attuali**.
* Questi devono corrispondere per numero, ordine e tipo agli **argomenti formali** dichiarati.
* Gli argomenti attuali possono essere variabili o espressioni.

Esempio:

```java
public static int somma(int a, int b) {
    return a + b;
}

int risultato = somma(5, 7); // argomenti attuali: 5, 7
```

---

## 🔹 Overloading dei metodi

È possibile definire più metodi con lo **stesso nome** ma firme diverse.
La **firma** (signature) = nome del metodo + lista tipi degli argomenti.

```java
public static int raddoppia(int x) { return 2 * x; }
public static String raddoppia(String s) { return s + s; }
```

⚠️ **Non è permesso l’overloading solo sul tipo di ritorno**.

---

## 🔹 Metodi statici (ausiliari)

* Un metodo dichiarato con `static` appartiene alla **classe** e non a una singola istanza.
* Si invoca con `NomeClasse.metodo()`.
* Esempio: `Math.sqrt(16)`.
* In programmi semplici (con `main`) si usano metodi statici **ausiliari** per separare la logica.

Esempio corretto:

```java
public class ProvaMetodiStatic {
    public static void main(String[] args) {
        metodoUno();
        metodoDue();
    }

    public static void metodoUno() {
        System.out.println("Hello World");
    }

    public static void metodoDue() {
        metodoUno();
        metodoUno();
    }
}
```

---

## 🔹 Quando e perché usare i metodi

1. Per **scomporre un problema complesso** in sottoproblemi gestibili.
2. Per **riutilizzare** codice già scritto.
3. Per rendere il codice più leggibile e modulare.
4. Approccio chiamato anche **programmazione procedurale** o **astrazione funzionale**.

---

## 🔹 Metodi non statici (di istanza)

* Sono operazioni eseguibili su singoli oggetti.
* Si invocano con la sintassi:

  ```java
  oggetto.metodo(args);
  ```

* Ogni parametro ha un tipo e un nome.
* Esempio:

  ```java
  String testo = "ciao";
  int lunghezza = testo.length();  // metodo di istanza
  ```

---

## 🔹 Metodi predicativi

Un **metodo predicativo** restituisce un `boolean` e può essere usato direttamente in condizioni.
Per convenzione, i nomi iniziano con `is` o `has`:

* `isEmpty()`
* `hasNext()`

Esempio:

```java
if (lista.isEmpty()) {
    System.out.println("Lista vuota");
}
```

---

## Varargs

I varargs (**variable arguments**) sono utili per ogni metodo che abbia a che fare con un numero di argomenti indeterminato.

Nelle API di Java si trova per esempio nel caso del metodo `String.format` che accetta un numero variabile di argomenti.

```java
public String formatWithVarArgs(String... values) {
    // ...
}

formatWithVarArgs();

formatWithVarArgs("a", "b", "c", "d");
```

L'utilizzo di varargs è sicuro se e solo se:

* Non memorizziamo nulla nell'array creato implicitamente.
* Non lasciamo che un riferimento all'array generato _sfugga_ al metodo

---

```java
public class Fuoristrada extends Automobile {
 private ArrayList<Automobile> updates;
 // Costruttori
 public Fuoristrada () {
  updates = new ArrayList<Automobile>();
 }
 public Fuoristrada (String nome) {
  super(nome);
  updates = new ArrayList<Automobile>();
 }
 public Fuoristrada (String nome, Automobile... caratteristiche) {
  super(nome);
  updates = new ArrayList<Automobile>();
  addUpdates(caratteristiche);
 }
 // Getters e Setters
 public void addUpdate (Automobile update) {
  updates.add(update);
 }
 public void removeUpdate (Automobile update) {
  updates.remove(update);
 }
 public void addUpdates (Automobile... caratteristiche) {
  for (Automobile update : caratteristiche) {
   updates.add(update);
  }
 }
 public void removeUpdates(Automobile... caratteristiche) {
  for (Automobile update : caratteristiche) {
   updates.remove(update);
  }
 }
}
```

---

# ✅ Riepilogo

* I **metodi** sono strumenti per organizzare, riutilizzare e rendere leggibile il codice.
* Possono essere **statici** (di classe) o **di istanza** (su oggetti).
* Supportano **overloading**, ma non solo per tipo di ritorno.
* I metodi predicativi (`boolean`) sono fondamentali per condizioni e controlli.
* I varargs permettono di gestire un numero variabile di argomenti in modo flessibile.

---

## codice esempi d'uso

* [raccolta esempi](https://github.com/maboglia/CorsoJava/blob/master/esempi/06_MetodiAusiliari.md)
* [Esempi sui metodi ausiliari](https://github.com/maboglia/CorsoJava/tree/master/esempi/01_base/03_metodi_ausiliari)
