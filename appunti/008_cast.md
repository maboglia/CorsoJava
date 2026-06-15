# 🔄 Casting e Promotion in Java

Il **casting** e la **promotion** sono due meccanismi che consentono di convertire valori da un tipo primitivo o reference a un altro.

---

## 🔹 Casting dei tipi primitivi

* `(tipo) variabile`
* `(tipo) espressione`

👉 Trasforma il valore della variabile (o espressione) in un altro tipo.

### Regole generali

* Il **cast esplicito** è richiesto quando si passa da un tipo più "grande" a uno più "piccolo".
* La **promotion** avviene automaticamente quando serve (es. `int → long`, `int → double`).
* Il cast si applica anche a `char` (che internamente è un intero positivo).
* Il cast può causare **perdita di informazione**.

---

### Esempio: cast e differenza di ordine di valutazione

```java
int i = (int) 3.0 * (int) 4.5;     // i = 12
int j = (int) (3.0 * 4.5);         // j = 13
```

👉 Nel primo caso ogni valore viene troncato prima della moltiplicazione, nel secondo dopo.

---

## 🔹 Promotion (conversione implicita)

La **promotion** è automatica quando i tipi sono compatibili e non si rischia perdita di dati.

```java
char a = 'a';
int b = a;  // char → int (promotion automatica)

System.out.println(a); // a
System.out.println(b); // 97
```

Altro esempio:

```java
int valore = 56;
long valoreLong = valore;  // int → long
System.out.println(valoreLong); // 56
```

---

## 🔹 Type Casting (esplicito)

Quando si forza un valore in un tipo più piccolo o incompatibile, si parla di **cast esplicito**.

```java
byte b = (byte) 261;
System.out.println(b); // 5

System.out.println(Integer.toBinaryString(b));   // 101 (valore troncato)
System.out.println(Integer.toBinaryString(261)); // 100000101
```

```java
double d = 1936.27;
int a = (int) d;   // troncamento
System.out.println(a); // 1936
```

---

## 🔹 Casting e boolean

⚠️ Con il tipo `boolean` **non è possibile** fare cast verso o da tipi numerici:

```java
int a = (int) true;      // ERRORE: boolean cannot be converted to int
boolean b = (boolean) 0; // ERRORE: int cannot be converted to boolean
```

---

## 🔹 Casting dei tipi reference (oggetti)

Il cast sui tipi reference è consentito **solo con ereditarietà**:

* Conversione da **subclass → superclass**: **automatica (upcasting)**.
* Conversione da **superclass → subclass**: **richiede cast esplicito (downcasting)**.
* Conversione tra tipi **senza relazione**: **non permessa**.

### Esempio

```java
class Animale {}
class Cane extends Animale {}

Animale a = new Cane();   // upcasting (automatico)
Cane c = (Cane) a;        // downcasting (esplicito)

// Animale a2 = new Animale();
// Cane c2 = (Cane) a2;   // Compila, ma genera ClassCastException a runtime!
```

---

# ✅ Riepilogo

* **Promotion** = automatica, sicura (es. `int → long`, `char → int`).
* **Casting esplicito** = a rischio perdita di dati (es. `double → int`, `int → byte`).
* Con i **reference**:

  * Upcasting = sempre sicuro.
  * Downcasting = possibile ma rischioso (può lanciare `ClassCastException`).
* **Boolean** = non convertibile con cast.

---

[Altri esempi](https://github.com/maboglia/CorsoJava/tree/master/esempi/01_base/00_Foundations)
