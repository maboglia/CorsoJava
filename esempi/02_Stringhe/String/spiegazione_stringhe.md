# Le Stringhe in Java – Guida Completa con Esempi

Questa guida raccoglie e spiega i principali aspetti dell’uso delle **stringhe in Java**, partendo dai file forniti.  
Gli esempi sono riorganizzati per argomento, evitando ripetizioni, e accompagnati da brevi spiegazioni.

---

## 1. Dichiarazione e creazione di stringhe

In Java una stringa può essere creata in due modi:

```java
String s1 = "Ciao";               // notazione letterale
String s2 = new String("Ciao");   // costruttore (meno usato)
```

Le stringhe sono **oggetti immutabili**: ogni modifica crea una nuova stringa.

È anche possibile costruire una stringa a partire da un array di caratteri:

```java
char[] caratteri = { 'c','i','a','o' };
String s3 = new String(caratteri);
```

---

## 2. Concatenazione di stringhe

La concatenazione può essere fatta con l’operatore `+` o con `String.join` (da Java 8):

```java
String s1 = "Aula: ";
String s2 = "1B";
String s3 = s1 + s2;   // Aula: 1B

String nani = String.join(" e ", "Pisolo", "Mammolo", "Gongolo");
String stati = String.join(",", "Italia", "Spagna", "Portogallo");
```

---

## 3. Confronto tra stringhe: `==` vs `.equals()`

Uno degli errori più comuni è usare `==` invece di `.equals()`:

```java
String a = new String("Ciao");
String b = a;
if (a == b) System.out.println("== confronta i riferimenti");

if (a.equals(b)) System.out.println(".equals confronta il contenuto");
```

- **`==`** → confronta i riferimenti in memoria (se due variabili puntano allo stesso oggetto).  
- **`.equals()`** → confronta il contenuto della stringa.  
- **`.equalsIgnoreCase()`** → confronta ignorando maiuscole/minuscole.

```java
String s1 = "Hello ";
String s2 = "World";
String s3 = s1 + s2;          // nuovo oggetto
String s4 = "Hello World";    // literal in pool
System.out.println(s3 == s4);        // false
System.out.println(s3.equals(s4));   // true
```

---

## 4. Lunghezza e accesso ai caratteri

```java
String testo = "Java";
System.out.println(testo.length());     // 4
System.out.println(testo.charAt(0));    // 'J'
```

È possibile scorrere una stringa come array di caratteri:

```java
for (int i = 0; i < testo.length(); i++) {
    System.out.println(testo.charAt(i));
}
```

O convertirla in un array di char:

```java
char[] chars = testo.toCharArray();
for (char c : chars) {
    System.out.println(c);
}
```

---

## 5. Metodi utili delle stringhe

### Trasformazioni
```java
String s = "Ciao Mondo";
System.out.println(s.toUpperCase()); // "CIAO MONDO"
System.out.println(s.toLowerCase()); // "ciao mondo"
System.out.println(s.trim());        // rimuove spazi iniziali/finali
System.out.println(s.replace('o','i')); // sostituisce caratteri
```

### Ricerca di sottostringhe
```java
String frase = "Hello World, Bye World";
System.out.println(frase.indexOf("World"));      // prima occorrenza
System.out.println(frase.lastIndexOf("World"));  // ultima occorrenza
System.out.println(frase.indexOf("o", 5));       // ricerca da indice
```

### Estrazione
```java
String corso = "Benvenuti al corso Java";
System.out.println(corso.substring(13));    // "corso Java"
System.out.println(corso.substring(0, 5));  // "Benve"
```

### Confronti alfabetici
```java
System.out.println("abc".compareTo("xyz"));             // < 0
System.out.println("abc".compareToIgnoreCase("ABC"));   // 0
```

---

## 6. Conversioni e formattazioni

Da numeri o booleani a stringa:

```java
int valoreInt = 112;
String fromInt = Integer.toString(valoreInt);

boolean vero = true;
String fromBool = Boolean.toString(vero);
```

Formattazione con separatori:

```java
import java.text.NumberFormat;

long valoreLong = 10_000_000;
NumberFormat nf = NumberFormat.getNumberInstance();
String formato = nf.format(valoreLong); // "10.000.000"
```

---

## 7. Hashcode e uguaglianza

Ogni stringa ha un `hashCode` calcolato sul contenuto:

```java
String s1 = "Ciao";
String s2 = "Ci" + "ao";
System.out.println(s1.hashCode() == s2.hashCode()); // true
System.out.println(s1.equals(s2));                  // true
```

⚠️ Non usare **solo** `hashCode()` per confrontare stringhe: possono esistere collisioni.

---

## 8. Esempi didattici

Alcuni esercizi inclusi nei file:

- Stampare i caratteri di una stringa al contrario:
```java
for (int i = testo.length()-1; i >= 0; i--) {
    System.out.print(testo.charAt(i));
}
```

- Ignorare spazi bianchi:
```java
for (char c : testo.toCharArray()) {
    if (c != ' ') System.out.println(c);
}
```

- Estrarre prime/ultime lettere e convertirle in maiuscolo:
```java
String messaggio = "questo è il messaggio da analizzare";
System.out.println(messaggio.charAt(0));                  // 'q'
System.out.println(messaggio.charAt(messaggio.length()-1)); // 'e'
System.out.println(messaggio.toUpperCase());
```

---

# ✅ Conclusioni

Le esercitazioni mostrano l’uso completo delle stringhe in Java:
- Creazione e concatenazione
- Confronto corretto (`==` vs `.equals`)
- Iterazione e conversione in array di caratteri
- Metodi per manipolazione e ricerca
- Conversioni da altri tipi
- HashCode e uguaglianza

Questo insieme di esempi costituisce un’ottima base per comprendere come lavorare con le stringhe in Java in maniera sicura ed efficace.
