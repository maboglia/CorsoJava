# 📚 Stringhe e Caratteri in Java

La gestione delle stringhe è fondamentale in Java. La classe `String` e le relative utility offrono un'ampia varietà di metodi e funzionalità per manipolarle.

---

## 🔹 Creazione di Stringhe

```java
// Dichiarazione e inizializzazione
String str1 = "Hello, World!";

// Con costruttore (sconsigliato salvo casi particolari)
String str2 = new String("Java String");

// Concatenazione
String concat = str1 + " " + str2;
```

---

## 🔹 Metodi Principali

```java
String s = "Java Programming";

// Lunghezza
int len = s.length();              // 16

// Carattere in posizione
char c = s.charAt(5);              // 'P'

// Confronto
boolean eq = s.equals("Java");     // false
boolean eqIgnore = s.equalsIgnoreCase("java programming"); // true

// Contiene sottostringa
boolean found = s.contains("gram"); // true

// Sottostringhe
String sub = s.substring(0, 4);    // "Java"

// Maiuscole / minuscole
String up = s.toUpperCase();
String low = s.toLowerCase();

// Trim
String t = "   test   ".trim();    // "test"
```

---

## 🔹 Concatenazione di Stringhe

```java
// Operatore +
String fullName = firstName + " " + lastName;

// Metodo concat()
String greet = "Hello".concat(" World");

// StringBuilder (efficiente in loop)
StringBuilder sb = new StringBuilder();
sb.append("Java").append(" Rocks!");
String result = sb.toString();
```

---

## 🔹 Formattazione

```java
String name = "Alice";
int age = 30;

// String.format
String msg = String.format("Ciao %s, hai %d anni.", name, age);

// printf
System.out.printf("Ciao %s, hai %d anni.%n", name, age);

// MessageFormat (utile per i18n)
import java.text.MessageFormat;
String text = MessageFormat.format("Utente {0}, punti {1}", name, age);
```

---

## 🔹 Conversione tra Stringhe e Tipi Primitivi

```java
// String → numeri
int i = Integer.parseInt("123");
double d = Double.parseDouble("3.14");

// Numeri → String
String s1 = String.valueOf(456);
String s2 = Double.toString(3.14);

// String → boolean
boolean b = Boolean.parseBoolean("true");
```

---

## 🔹 Manipolazione di Caratteri

```java
String s = "Hello World";

// Indice di un carattere
int idx = s.indexOf('W');    // 6
int last = s.lastIndexOf('o'); // 7

// Sostituire caratteri o sottostringhe
String r1 = s.replace('l', 'x');       // Hexxo Worxd
String r2 = s.replace("World", "Java"); // Hello Java

// Split
String[] parts = s.split(" "); // ["Hello", "World"]

// Array di caratteri
char[] chars = s.toCharArray();
```

---

## 🔹 Null e Stringhe Vuote

```java
if (s == null || s.isEmpty()) {
    // nulla o stringa vuota
}

if (s == null || s.trim().isEmpty()) {
    // nulla o solo spazi
}
```

---

## 🔹 Classi disponibili

* `String` → **immutabile**, final.
* `StringBuilder` → mutabile, non thread-safe (più usata).
* `StringBuffer` → mutabile, thread-safe (quasi mai usata oggi).
* `Character` → wrapper di `char`.

---

## 🔹 Text Blocks (Java 13+)

Permettono di scrivere stringhe multilinea leggibili:

```java
String json = """
    {
        "nome": "Alice",
        "eta": 30
    }
    """;
```

---

## 🔹 String Templates (Java 21+, preview)

Nuova interpolazione di stringhe:

```java
String nome = "Luca";
int punti = 120;

String msg = STR."Benvenuto \{nome}, hai \{punti} punti.";
System.out.println(msg);
// Output: Benvenuto Luca, hai 120 punti.
```

👉 Supportano anche espressioni:

```java
int a = 5, b = 3;
String res = STR."Somma: \{a+b}"; // Somma: 8
```

---

# ✅ Conclusione

* `String` rimane immutabile → ogni operazione crea una nuova istanza.
* Per modifiche ripetute, usare `StringBuilder`.
* Per testo leggibile su più righe, usare **Text Blocks**.
* Per interpolazione diretta, da Java 21 sono disponibili le **String Templates** (in preview).

---

## Domande

Qual è la caratteristica principale della classe String in Java?
A. È mutabile
B. È immutabile
C. È thread-safe
D. È una sottoclasse di StringBuilder

---

Quale metodo restituisce la lunghezza di una stringa?
A. size()
B. count()
C. length()
D. len()

---

Cosa restituisce l’istruzione "Java".charAt(2)?
A. 'J'
B. 'a'
C. 'v'
D. 'A'

---

Quale tra i seguenti è più efficiente per concatenazioni ripetute in un ciclo?
A. String
B. StringBuffer
C. StringBuilder
D. Character

---

Quale metodo si usa per verificare se una stringa è vuota?
A. isNull()
B. isEmpty()
C. isBlank()
D. equals("")

---

Come si converte il numero intero 123 in una stringa?
A. Integer.toString(123)
B. String.valueOf(123)
C. "" + 123
D. Tutte le precedenti

---

Cosa produce il seguente codice?
String s = " Hello ";
System.out.println(s.trim());
A. " Hello "
B. "Hello"
C. " Hello"
D. "Hello "

---

Quale classe usare per gestire stringhe mutabili in modo NON thread-safe?
A. String
B. StringBuilder
C. StringBuffer
D. Character

---

Qual è il vantaggio dei Text Blocks introdotti in Java 13+?
A. Permettono di creare stringhe multilinea leggibili
B. Sono più veloci delle stringhe normali
C. Rendono le stringhe immutabili
D. Consentono la concatenazione automatica

---

Quale istruzione con String Templates (Java 21+) stampa "Ciao Luca" se nome="Luca"?
A. STR."Ciao {nome}"
B. STR."Ciao \{nome}"
C. String.format("Ciao %s", nome)
D. STR."Ciao nome"
