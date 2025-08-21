# Metodi Ausiliari in Java

I **metodi ausiliari** sono funzioni definite all’interno delle classi per suddividere problemi complessi in parti più semplici, evitando duplicazioni di codice e migliorando la leggibilità.

---

## 1. Struttura di un metodo

```java
<modificatore> <tipo_di_ritorno> <nomeMetodo>(parametri) {
    // corpo del metodo
    return valore; // se non è void
}
````

Esempio:

```java
public static int quadrato(int n) {
    return n * n;
}
```

---

## 2. Metodi `static`

Appartengono alla classe e non a una specifica istanza.
Si richiamano con `NomeClasse.metodo()`.

```java
public class MathUtils {
    public static int somma(int a, int b) {
        return a + b;
    }
}

int risultato = MathUtils.somma(3, 5);
```

---

## 3. Metodi con parametri

I metodi possono ricevere **tipi primitivi** o **oggetti**:

```java
public static void saluta(String nome) {
    System.out.println("Ciao " + nome + "!");
}

saluta("Mauro");
```

### Parametri variabili (Varargs)

```java
public static int media(int... valori) {
    int somma = 0;
    for (int v : valori) somma += v;
    return somma / valori.length;
}

int m = media(2, 5, 8, 78);
```

---

## 4. Metodi con valore di ritorno

Un metodo può restituire un valore da usare altrove:

```java
public static boolean pari(int n) {
    return n % 2 == 0;
}
```

---

## 5. Riuso del codice con metodi ausiliari

I metodi possono richiamarsi tra loro per comporre soluzioni più complesse:

```java
public static int massimo(int a, int b) {
    return (a > b) ? a : b;
}

public static int massimo3(int a, int b, int c) {
    return massimo(massimo(a, b), c);
}
```

---

## 6. Overloading

È possibile definire più metodi con lo stesso nome ma parametri diversi:

```java
public static int somma(int a, int b) {
    return a + b;
}

public static double somma(double a, double b) {
    return a + b;
}
```

Il compilatore sceglie la versione più adatta in base ai tipi degli argomenti.

---

## 7. Metodi di utilità (esempi)

### Calcolo area

```java
public static int area(int base, int altezza) {
    return base * altezza;
}
```

### Conversione in maiuscolo

```java
public static String toUpper(String s) {
    return s.toUpperCase();
}
```

### Ricerca in array

```java
public static boolean contiene(int[] arr, int valore) {
    for (int x : arr) if (x == valore) return true;
    return false;
}
```

---

# ✅ Conclusioni

I metodi ausiliari sono fondamentali perché:

* Spezzano i problemi in sottoproblemi più semplici
* Eliminano duplicazioni di codice
* Migliorano leggibilità e riuso
* Supportano **overloading** e **varargs**

Sono la base della buona programmazione strutturata e orientata agli oggetti in Java.
