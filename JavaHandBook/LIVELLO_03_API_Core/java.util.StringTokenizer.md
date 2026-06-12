# Package `java.util`

Il package java.util contiene una serie di classi utili come il framework "Collections" per gestire collezioni eterogenee di ogni tipo, il modello a eventi, classi per la gestione facilitata delle date e degli orari, classi per la gestione dell’internazionalizzazione e tante altre utilità come un separatore di stringhe (StringTokenizer), un generatore di numeri casuali ecc.

---

## StringTokenizer

### La classe StringTokenizer permette l'estrazione di sottostringhe

* StringTokenizer (String str, String delim)
  * Costruisce un estrattore di token per la stringa str
* delim e' il delimitatore ricercato tra i token estratti
* La classe StringTokenizer mette quindi a disposizione metodi per la gestione dei token
  * public boolean hasMoreTokens()
  * public String nextToken()

### Esempio

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

### Classe StringTokenizer

Spesso risulta necessario manipolare dei token di testo.
Una semplice classe che permette di separare i contenuti di una stringa in più parti, chiamate token, è la classe
__StringTokenizer__.

Questa classe si utilizza solitamente per estrarre le parole di una stringa
L’utilizzo di base è estremamente semplice, occorrono:
una stringa da "navigare", cioè da cui estrarre i token
un delimitatore, che serve per identificare i token
Un token è, quindi, la sequenza massima di caratteri consecutivi che non sono delimitatori.

---

## CREARE OGGETTO STRINGTOKENIZER

Occorre creare in prima istanza l’oggetto StringTokenizer, usando il costruttore dell’omonima classe.

* Il costruttore può accettare da 1 a 3 parametri:
la stringa da cui estrarre i token
il delimitatore, che può essere:
esplicito [st2 – st3]
di default " \t\n\r\f" (notare che il primo delimitatore e uno spazio) [st1]
un booleano che, se settato a true, considera token anche gli stessi delimitatori

```java
StringTokenizer st1 = new StringTokenizer("Stringa da dividere");
StringTokenizer st2 = new StringTokenizer("Stringa sezionata", ";");
StringTokenizer st3 = new StringTokenizer("Ciao Mamma", "a", true);
``` 

Per scandire l’intero testo si può usare un ciclo while con all’interno l’invocazione del metodo hasMoreTokens() che ritorna true se sono presenti altri token, altrimenti false.
Per stampare il token appena recuperato si può invocare il metodo nextToken() sull’oggetto StringTokenizer.

```java
StringTokenizer st = new StringTokenizer("Stringa da dividere");
while (st.hasMoreTokens()) {
 // Due metodi per fare la stessa cosa
System.out.println(st.nextToken());
System.out.println(st.nextElement().toString());
}
```

### Costruttori pubblici

Costruttore|definizione
---|---
StringTokenizer(String str)|Costruisce uno StringTokenizer per la stringa str, che come delimitatori usa i caratteri "\t\n\r\f".
StringTokenizer(String str, String delim)|  Costruisce uno StringTokenizer per la stringa str, che come delimitatori usa i caratteri contenuti nella stringa delim.
StringTokenizer(String str, String delim, boolean returnDelims)|Costruisce uno StringTokenizer per la stringa str, che come delimitatori usa i caratteri contenuti nella stringa delim. Se returnDelims è true, i caratteri divisori verranno restituiti come token.

Metodi pubblici:
Metodo|Definizione
---|---
int countTokens()|Restituisce il numero dei token elaborati.
boolean hasMoreElements()|Come il successivo hasMoreTokens().
boolean hasMoreTokens()|Restituisce true se ci sono ancora dei token da considerare.
Object nextElement()|Restituisce il token successivo, sotto forma di Object.
String nextToken()|Restituisce il token successivo, sotto forma di String.
String nextToken(String delim)|Imposta una nuova serie di caratteri delimitatori, quindi restituisce il token successivo.
