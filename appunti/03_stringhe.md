
# Stringhe e Caratteri
Caratteristiche principali

### Classi disponibili
* String
  * Modella stringhe (sequenze – array di caratteri)
  * Non modificabile (dichiarata final)
* StringBuffer
  * Modificabile
* Character
* CharacterSet

## Classe String

### Definizione
String myString;
myString = new String ("stringa esempio");
* Oppure
String myString =
new String ("stringa esempio");
* Solo per il tipo String vale
String myString = "stringa esempio";
* Il carattere " può essere incluso come \"
* Il nome della stringa è il riferimento alla
stringa stessa
* Confrontare due stringhe NON significa
confrontare i riferimenti

### I metodi che gestiscono il tipo String
NON modificano la stringa ma ne
creano una nuova

### Concatenazione di stringhe
* Operatore concat
  * myString1.concat(myString2)
  * String s2 = "Ciao".concat(" a tutti").concat("!");
  * String s2 = "Ciao".concat(" a tutti".concat("!"));
* Utile per definire stringhe che occupano più di una riga
3* Operatore +
"questa stringa" + "e` formata da tre" +
"stringhe"
* La concatenazione funziona anche con altri tipi, che vengono automaticamente convertiti in stringhe
System.out.println ("pi Greco = " + 3.14);
System.out.println ("x = " + x);

### Lunghezza stringa
* int length()
  * myString.length()
  * "Ciao".length() restituisce 4
  * "".length() restituisce 0
* Se la lunghezza è N, i caratteri sono indicizzati da 0 a N-1

### Carattere i-esimo
* char charAt (int)
* myString.charAt(i)

### Confronta stringa con s
* boolean equals (String s)
 * myString.equals ("stringa") ritorna true o false
* boolean equalsIgnoreCase (String s)
* myString.equalsIgnoreCase ("StRiNgA")

### Confronta con s facendone la differenza
* int compareTo (String str)
* myString.compareTo ("stringa") ritorna un valore >=< 0

### Trasforma int in String
* String valueOf (int)
* Disponibile per tutti tipi primitivi

### Restituisce indice prima occorrenza di c
* int indexOf (char c)
* int indexOf (char c, int fromCtrN)

### Altri metodi
* String toUpperCase (String str)
* String toLowerCase (String str)
* String substring (int startIndex, int endIndex)
* String substring (int startIndex)

### Esempio
...
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
...
StringTokenizer

### La classe StringTokenizer permette l'estrazione di sottostringhe
* StringTokenizer (String str, String delim)
 * Costruisce un estrattore di token per la stringa str
* delim e' il delimitatore ricercato tra i token estratti
* La classe StringTokenizer mette quindi a disposizione metodi per la gestione dei token
  * public boolean hasMoreTokens()
  * public String nextToken()

###  Esempio
// il numero di token e' noto: nome, eta', reddito
String str;
StringTokenizer st = new StringTokenizer(str," ");
// Anche: StringTokenizer st =
//
new StringTokenizer (str);
while (st.hasMoreTokens()){
String token = st.nextToken();
... Integer.parseInt(token) ...
// int eta = Integer.parseInt (st.nextToken ());
// double reddito = Double.parseDouble
//
(st.nextToken ());
}


## Classe StringBuffer

### Un oggetto String
* NON è modificabile
* Una volta creato non possiamo aggiungere, eliminare, modificare caratteri (i metodi visti creano nuove stringhe)
* Tale restrizione è dovuta a ragioni di efficienza

### Le considerazione precedenti non sono vere per la classe StringBuffer

### Esempio
StringBuffer myStringBuffer = new
stringBuffer ("stringa modificabile");
myStringBuffer.setCharAt (8, ‘M');
// Trasforma in "stringa Modificabile"

### Si usa raramente

### Un oggetto StringBuffer non può essere utilizzato per operazioni di I/O
System.out.println
(myStringBuffer.toString());

### Metodi:
* Aggiunta di caratteri 
myStringBuffer.append ("aggiunta");
* insert
* delete
* reverse

## Classe Character

### La classe involucro Character si trova in java.lang

### Include metodi statici per verificare le proprietà di un carattere

### Esempio
String s = "Stringa Generica."
char c = s.charAt (0);
... Character.isUpperCase(c) ... // true
... Character.isDigit(c) ...
// false
...

### Predicati vari
* boolean isLetter (char c)
* boolean isDigit (char c)
* boolean isLetterOrDigit (char c)
* boolean isSpaceChar (char c)
* boolean isLowerCase (char c)
* boolean isUpperCase (char c)

### Trasformazioni varie

* char toUpperCase (char c)
* char toLowerCase (char c)