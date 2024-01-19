# Stringhe e Caratteri

La gestione delle stringhe è fondamentale in Java, e il linguaggio offre un'ampia varietà di metodi e funzionalità per manipolare le stringhe. Ecco alcuni concetti e operazioni comuni nella gestione delle stringhe in Java:

---

### Creazione di Stringhe

```java
// Dichiarazione e inizializzazione di una stringa
String str1 = "Hello, World!";

// Creazione di una stringa utilizzando il costruttore
String str2 = new String("Java String");

// Concatenazione di stringhe
String concatString = str1 + " " + str2;
```

---

### Metodi Principali

```java
// Lunghezza di una stringa
int length = str1.length();

// Ottenere un carattere in posizione specifica
char charAtIndex = str1.charAt(7);

// Confronto di stringhe (sensibile alle maiuscole/minuscole)
boolean areEqual = str1.equals(str2);

// Confronto di stringhe (ignorando maiuscole/minuscole)
boolean areEqualIgnoreCase = str1.equalsIgnoreCase("hello, world!");

// Ricerca di una sottostringa
boolean containsSubstring = str1.contains("Hello");

// Estrazione di sottostringhe
String substring = str1.substring(0, 5);

// Conversione di stringhe in minuscolo/maiuscolo
String lowercase = str1.toLowerCase();
String uppercase = str1.toUpperCase();

// Rimozione degli spazi bianchi iniziali e finali
String trimmedString = "   Trim Me   ".trim();
```

---

### Concatenazione di Stringhe

```java
// Utilizzo dell'operatore +
String fullName = firstName + " " + lastName;

// Utilizzo del metodo concat()
String greeting = "Hello".concat(" World");

// Utilizzo di StringBuilder per concatenazioni efficienti
StringBuilder stringBuilder = new StringBuilder();
stringBuilder.append("Java");
stringBuilder.append(" StringBuilder");
String result = stringBuilder.toString();
```

---

### Formattazione di Stringhe

```java
// Utilizzo di String.format()
String formattedString = String.format("Il prezzo è %.2f", 12.3456);

// Utilizzo di StringBuilder per la costruzione di stringhe complesse
StringBuilder complexString = new StringBuilder();
complexString.append("Utente: ").append(username).append(", Punteggio: ").append(score);
```

---

### Conversione tra Stringhe e Tipi Primitivi

```java
// Conversione da String a int
int intValue = Integer.parseInt("123");

// Conversione da int a String
String stringValue = String.valueOf(456);

// Altre conversioni con i metodi parseXXX()
double doubleValue = Double.parseDouble("3.14");
boolean booleanValue = Boolean.parseBoolean("true");
```

---

### Manipolazione di Caratteri

```java
// Ottenere l'indice di un carattere
int index = str1.indexOf('W');

// Sostituire caratteri
String replacedString = str1.replace('l', 'z');

// Divisione di una stringa in base a un delimitatore
String[] parts = str1.split(",");

// Trasformazione di una stringa in un array di caratteri
char[] charArray = str1.toCharArray();
```

---

### Verifica di Null e Stringhe Vuote

```java
// Verifica se una stringa è nulla o vuota
if (str1 == null || str1.isEmpty()) {
    // Fai qualcosa
}

// Verifica se una stringa è nulla o contiene solo spazi bianchi
if (str1 == null || str1.trim().isEmpty()) {
    // Fai qualcosa
}
```

Questi sono solo alcuni degli aspetti principali della gestione delle stringhe in Java. La classe `String` offre molte altre funzionalità che possono essere utili a seconda delle esigenze specifiche dell'applicazione. Inoltre, l'uso di `StringBuilder` è consigliato per operazioni di concatenazione efficienti, specialmente quando si lavora con molte operazioni di modifica di stringhe.

---

## Classi disponibili

* String
  * Modella stringhe (sequenze – array di caratteri)
  * **Non modificabile** (dichiarata final)
* StringBuilder
  * Modificabile
* StringBuffer (non si usa più)
  * Modificabile
* Character
* CharacterSet

---

### Definizione

`String myString;`
`myString = new String ("stringa esempio");`

* Oppure

`String myString = new String ("stringa esempio");`

* Solo per il tipo String vale l'inizializzazione

`String myString = "stringa esempio";`

* Il carattere " (doppi apici) può essere incluso come \\"
* Il nome della stringa è il riferimento alla stringa stessa
* Confrontare due stringhe NON significa confrontare i riferimenti

**NB: I metodi che gestiscono il tipo String NON modificano la stringa, ma ne creano una nuova**

---

### Esempio

```java
String s1, s2;
s1 = new String("Prima stringa");
s2 = new String("Prima stringa");
System.out.println(s1);
/// Prima stringa
System.out.println("Lunghezza di s1 = " +
s1.length());
// 26
if (s1.equals(s2)) ...
// true
if (s1 == s2) ...
// false
String s3 = s3.substring (2, 6);
// s3 == "ima s"
```

[altri esempi sulle stringhe](https://github.com/maboglia/CorsoJava/tree/master/esempi/04_Stringhe.md)

---

### Concatenare stringhe

* Operatore concat
  * `myString1.concat(myString2)`
  * `String s2 = "Ciao".concat(" a tutti").concat("!");`
  * `String s2 = "Ciao".concat(" a tutti".concat("!"));`

* Utile per definire stringhe che occupano più di una riga

* Operatore `+`
`"questa stringa" + "e` formata da tre" `+` "stringhe"
* La concatenazione funziona anche con altri tipi, che vengono automaticamente convertiti in stringhe
* `System.out.println ("pi Greco = " + 3.14);`

**NB: La classe String crea nuovi oggetti ogni volta che concateni con `+`, meglio usare la classe StringBuilder...**

### Carattere i-esimo

* `char charAt (int)`
* `myString.charAt(i)`

---

### Lunghezza stringa

* `int length()`
  * esempio: `myString.length()`
  * `"Ciao".length()` restituisce 4
  * `"".length()` restituisce 0
* Se la lunghezza è N, i caratteri sono indicizzati **da 0 a N-1**

---

### Confronta stringa con altra stringa

* `boolean equals(String s)`
* `myString.equals("stringa")` ritorna true o false
* `boolean equalsIgnoreCase(String s)`
* `myString.equalsIgnoreCase("StRiNgA")`

### Confronta con altra stringa facendone la differenza

* `int compareTo(String str)`
* `myString.compareTo("stringa")` ritorna un valore >=< 0

### Trasforma int in String

* `String valueOf(int)`
* Disponibile per tutti tipi primitivi

---

### Restituisce indice prima occorrenza di c

* `int indexOf(char c)`
* `int indexOf(char c, int fromCtrN)`

### Altri metodi

* `String toUpperCase(String str)`
* `String toLowerCase(String str)`
* `String substring(int startIndex, int endIndex)`
* `String substring(int startIndex)`

---

### compareTo

```java
int compareTo(String other)
```

Esegue una comparazione lessicale. Ritorna un intero:

* `< 0` se la stringa corrente è minore della stringa other
* `= 0` se le due stringhe sono identiche
* `> 0` se la stringa corrente è maggiore di other

---

#### indexOf

```java
int indexOf(int ch)
```

Restituisce l’indice del carattere specificato

#### lastIndexOf

```java
int lastIndexOf(int ch)
```

E’ come indexOf() ma viene restituito l’indice dell’ultima occorrenza trovata

#### length

```java
int length()
```

Restituisce il numero di caratteri di cui è costituita la stringa corrente

#### replace

```java
String replace(char oldChar, char newChar)
```

Restituisce una nuova stringa, dove tutte le occorrenze di oldChar sono rimpiazzate con newChar

---

#### substring

```java
String substring(int startIndex)
```

Restituisce una sottostringa della stringa corrente, composta dai caratteri che partono dall’indice startIndex alla fine

#### substring

```java
String substring(int startIndex, int number)
```

Restituisce una sottostringa della stringa corrente, composta dal numero number di caratteri che partono dall’indice startIndex

#### toLowerCase

```java
String toLowerCase()
```

Restituisce una nuova stringa equivalente a quella corrente ma con tutti i caratteri minuscoli

#### toUpperCase

```java
String toUpperCase()
```

Restituisce una nuova stringa equivalente a quella corrente ma con tutti i caratteri maiuscoli

---

## codice esempi d'uso

* [raccolta esempi](https://github.com/maboglia/CorsoJava/blob/master/esempi/04_Stringhe.md)
* [altri esempi](https://github.com/maboglia/CorsoJava/tree/master/esempi/04_API_Java/P01_java.lang/String)
* [stringbuilder](https://github.com/maboglia/CorsoJava/tree/master/esempi/04_API_Java/P01_java.lang/StringBuilder)
