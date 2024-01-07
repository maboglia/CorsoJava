# Stringhe e Caratteri

Caratteristiche principali

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

