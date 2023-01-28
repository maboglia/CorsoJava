# Esercizi con proposta di soluzione

## Esercizio  1. 

Si consideri il seguente frammento di codice in linguaggio Java:

```java
int[] b = lista;
boolean condizione = true;
int i = 0;
while (i<b.length-1 && condizione) {
    if (b[i] == b[i+1])
condizione = false;
else i++;
}
```

Determinare il valore finale delle variabili condizione e i nei seguenti casi:

1) lista = {4,5,6,4,5};
2) lista = {4,3,4,4,4};
3) lista = {4}.

Soluzione

1) i = 4 e condizione = true;
2) i = 2 e condizione = false;
3) i = 0 e condizione = true.

---



## Esercizio StampaZigZag

Scrivere un programma StampaZigZag

* che prevede un array di 10 numeri interi contenente valori a piacere
(senza bisogno di chiederli all’utente) e ne stampa gli elementi secondo il seguente ordine:
* il primo, l’ultimo, il secondo, il penultimo, il terzo, il terz’ultimo, ecc...
* Il nome dell’array pu`o essere scelto a piacere.

```java
     
int [] valori = { 4 , 5 , 2 , 5 , 7 , 6 , 3 , 1 , 3 , 6 };
for ( int i =0; i <5; i++) {
 int j = 9 - i ;
 System . out . println ( valori[i]);
 System . out . println ( valori[j]);
}


```

---

## Esercizio SommaPariDispari

Scrivere un programma SommaPariDispari che prevede un array di 10 numeri interi contenente valori a piacere

* (senza bisogno di chiederli all’utente) e stampa Pari e dispari uguali se la somma dei numeri in posizioni pari dell’array
* è uguale alla somma dei numeri in posizioni dispari, altrimenti il programma stampa Pari e dispari diversi.

```java

  
int [] valori = { 4 , 5 , 2 , 5 , 7 , 6 , 3 , 1 , 3 , 2 };
int sommaPari = 0;
int sommaDispari = 0;
for ( int i =0; i <10; i +=2) {
 sommaPari += valori[i];
 sommaDispari += valori[i+1];
}
if ( sommaPari == sommaDispari )
 System . out . println ( " Pari e dispari uguali " );
else
 System . out . println ( " Pari e dispari diversi " );
  
```

---

## Esercizio SecondoArray

Scrivere un programma SecondoArray che chiede all’utente di inserire 10 numeri interi e li memorizza in un array.
Successivamente, crea un nuovo array di dimensione pari al numero di valori maggiori o uguali a zero inseriti dall’utente.
Copia tutti i valori maggiori o uguali a zero nel nuovo array e ne stampa i  valori in ordine inverso.

```java

Scanner input = new Scanner ( System . in );
int [] valori = new int [10];
int contPositivi =0;
// inizializza l ’ array
System . out . println ( " Inserisci 10 numeri : " );
for ( int i =0; i <10; i++) {
 valori[i] = input . nextInt ();
 if ( valori[i] >=0) 
  contPositivi++;
}
// crea il secondo array e copia i valori
int [] positivi = new int [ contPositivi ];
int j =0;
for ( int x : valori ) {
 if (x >=0) {
  positivi[j]= x ;
  j++;
 }
}
// stampa il secondo array
for ( int i = positivi . length -1; i >=0; i--)
System . out . println ( positivi[i]);
  
```

---

## Esercizio TreConsecutivi

Scrivere un programma TreConsecutivi che prevede un array di 10 numeri interi contenente

* valori a piacere e stampa "Tre valori consecuitivi uguali" se
* l’array contiene tre valori uguali in tre posizioni consecutive, oppure stampa "NO" altrimenti.

```java

  
int [] valori = { 4 , 5 , 2 , 5 , 7 , 6 , 3 , 6 , 5 , 4 };
boolean trovato = false ;
for ( int i =0; i <=7; i++) {
 if ( valori[i]== valori[i+1] && valori[i+1]== valori [ i +2])
  trovato = true ;
 }
if ( trovato ) 
 System . out . println ( " Tre valori consecutivi uguali " );
else 
 System . out . println ( " NO " );
  
  
```

---

## Esercizio DoppioUnoDellaltro

Scrivere un programma DoppioUnoDellaltro che he prevede un array di 10 numeri interi contenente valori a

* piacere e stampa "Doppio uno dell’altro" se nell’array sono presenti due
* valori che sono l’uno il doppio dell’altro, oppure stampa "NO" altrimenti.

```java

int [] valori = { 4 , 5 , 1 , 5 , 7 , 6 , 2 , 6 , 5 , 4 };
boolean trovato = false ;
for ( int i =0; i <9; i++) {
 for ( int j = i +1; j <10; j++) {
  if ( valori[i]==2* valori[j] || valori[j]==2* valori[i])
   trovato = true ;
 }
}
if ( trovato ) 
 System . out . println ( " Doppio uno dell ’ altro " );
else 
 System . out . println ( " NO " )
  
```

---

## Esercizio DueSequenze

Scrivere un programma DueSequenze che chiede all’utente di inserire due sequenze di stringhe,

* ciascuna di 5 elementi, e poi stampa il messaggio "OK" se almeno una stringa della prima sequenza compare anche nella seconda,
* altrimenti stampa il messaggio "NO". Nel caso in cui le due sequenza abbiano almeno una stringa in comune,
* i confronti tra le sequenze si devono interrompere non appena una coppia di stringhe uguali viene trovata.
  
```java

Scanner input = new Scanner ( System . in );
String [] seq1 = new String [5];
String [] seq2 = new String [5];
System . out . println ( " Inserisci 5 stringhe : " );
for ( int i =0; i <5; i++)
 seq1[i] = input . nextLine ();
System . out . println ( " Inserisci altre 5 stringhe : " );
for ( int i =0; i <5; i++)
 seq2[i] = input . nextLine ();
int i =0;
boolean trovato = false ;
while (i <5 && ! trovato ) {
 int j =0;
 while (j <5 && ! trovato ) {
  if ( seq1[i]. equals ( seq2[j]))
   trovato = true ;
  j++;
 }
i++;
}
if ( trovato ) 
 System . out . println ( " OK " );
else 
 System . out . println ( " NO " );


```

## backAround.java

```java
// Given a string, take the last char and return a new string with the last char added at the front and back,
// so "cat" yields "tcatt". The original string will be length 1 or more. 
public String backAround(String str) {
  char last = str.charAt(str.length()-1);
  return last + str + last;
}
```

---

## close10.java

```java
// Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
// Note that Math.abs(n) returns the absolute value of a number. 
public int close10(int a, int b) {
  if (Math.abs(10-a) < Math.abs(10-b)) {
     return a;
  } else if (Math.abs(10-a) > Math.abs(10-b)) {
     return b;
  } else {
     return 0;
  }
}
```

---

## delDel.java

```java
// Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. 
// Otherwise, return the string unchanged. 
public String delDel(String str) {
   if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
      return str.charAt(0) + str.substring(4, str.length());
   } else {
      return str;
   }
}
```

---

## diff21.java

```java
// Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21. 
public int diff21(int n) {
  return ((21-n) >= 0) ? 21-n : -2 * (21-n);
}
```

---

## endUp.java

```java
// Given a string, return a new string where the last 3 chars are now in upper case. 
// If the string has less than 3 chars, uppercase whatever is there. 
public String endUp(String str) {
  int length = str.length();
  if (length <= 3) {
     return str.toUpperCase();
  }
  
  return str.substring(0, length-3) + str.substring(length-3, length).toUpperCase();
}
```

---

## everyNth.java

```java
// Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. 
// So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more. 
public String everyNth(String str, int n) {
  int length = str.length();
  String result = "";
  for(int i=0; i<length; i+=n) {
     result += str.charAt(i);
  }
  return result;
}
```

---

## front22.java

```java
// Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, 
// so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
public String front22(String str) {
  String first = (str.length() >= 2) ? str.substring(0, 2) : str.substring(0, str.length());
  return first +str + first;
}
```

---

## front3.java

```java
// Given a string, we'll say that the front is the first 3 chars of the string. 
// If the string length is less than 3, the front is whatever is there. 
// Return a new string which is 3 copies of the front. 
public String front3(String str) {
  int length = (str.length()>=3) ? 3 : str.length();
  String temp = str.substring(0, length) + str.substring(0, length) + str.substring(0, length);
  return temp;
}
```

---

## frontBack.java

```java
// Given a string, return a new string where the first and last chars have been exchanged. 
public String frontBack(String str) {
  int length = str.length();
    
  if (length < 2) {
     return str;
  } 
  
  String middle = str.substring (1, length-1);  
  return str.charAt(length-1) + middle + str.charAt(0);
}
```

---

## hasTeen.java

```java
// We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
// Given 3 int values, return true if 1 or more of them are teen.
public boolean hasTeen(int a, int b, int c) {
  return ((a>=13 && a<=19) || 
          (b>=13 && b<=19) || 
          (c>=13 && c<=19));
}
```

---

## icyHot.java

```java
// Given two temperatures, return true if one is less than 0 and the other is greater than 100.
public boolean icyHot(int temp1, int temp2) {
  return ((temp1<0 && temp2>100) || (temp1>100 && temp2<0));
}
```

---

## in1020.java

```java
// Given 2 int values, return true if either of them is in the range 10..20 inclusive. 
public boolean in1020(int a, int b) {
  return ((a>=10 && a<=20) || (b>=10 && b<=20));
}
```

---

## in3050.java

```java
// Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive. 
public boolean in3050(int a, int b) {
  return ((a>=30 && a<=40 && b>=30 && b<=40) ||
          (a>=40 && a<=50 && b>=40 && b<=50));
}
```

---

## intMax.java

```java
// Given three int values, a b c, return the largest. 
public int intMax(int a, int b, int c) {
  return Math.max (Math.max(a, b), Math.max(b, c));
}
```

---

## lastDigit.java

```java
// Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
// Note that the % "mod" operator computes remainders, so 17 % 10 is 7. 
public boolean lastDigit(int a, int b) {
  return (a%10 == b%10);
}
```

---

## loneTeen.java

```java
// We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
// Given 2 int values, return true if one or the other is teen, but not both. 
public boolean loneTeen(int a, int b) {
  boolean first = (a>=13 && a<=19);
  boolean second = (b>=13 && b<=19);
  return (first && !second) || (!first && second);
}
```

---

## makes10.java

```java
// Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10. 
public boolean makes10(int a, int b) {
  return ( (a == 10) || (b == 10) || (a+b == 10));
}
```

---

## max1020.java

```java
// Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
// or return 0 if neither is in that range. 
public int max1020(int a, int b) {
  boolean aInRange = (a>=10 && a<=20);
  boolean bInRange = (b>=10 && b<=20);
  if (aInRange && bInRange) {
     return Math.max (a, b);
  } else if (aInRange && !bInRange) {
     return a;
  } else if (!aInRange && bInRange) {
     return b;
  }
  return 0;
}
```

---

## missingChar.java

```java
// Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
// The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
public String missingChar(String str, int n) {
  String temp;
  temp = str.substring(0, n) + str.substring(n+1, str.length());
  return temp;
}
```

---

## mixStart.java

```java
// Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count. 
public boolean mixStart(String str) {
  return (str.length()>=3 && str.substring(1,3).equals("ix"));
}
```

---

## monkeyTrouble.java

```java
// We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
// We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble. 
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return ((!aSmile && !bSmile) || (aSmile && bSmile));
}
```

---

## nearHundred.java

```java
// Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number. 
public boolean nearHundred(int n) {
  return ((Math.abs(100-n)) <= 10 || (Math.abs(200-n)) <= 10);
}
```

---

## notString.java

```java
// Given a string, return a new string where "not " has been added to the front. 
// However, if the string already begins with "not", return the string unchanged.
public String notString(String str) {
  if (str.length() >=3 && str.substring(0,3).equals("not")) {
     return str;
  }
  return "not " + str;
}
```

---

## or35.java

```java
// Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
public boolean or35(int n) {
  return ((n%3 == 0) || (n%5==0));
}
```

---

## parrotTrouble.java

```java
// We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
// We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble. 
public boolean parrotTrouble(boolean talking, int hour) {
  return (talking && (hour < 7 || hour > 20));
}
```

---

## posNeg.java

```java
// Given 2 int values, return true if one is negative and one is positive. 
// Except if the parameter "negative" is true, then return true only if both are negative. 
public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
     return (a<0 && b<0);
  } else {
     return ((a<0 && b>0) || (a>0 && b<0));
  }
}
```

---

## startHi.java

```java
// Given a string, return true if the string starts with "hi" and false otherwise.
public boolean startHi(String str) {
  if (str.length() < 2) {
     return false;
  }
  String first = str.substring(0, 2);
  return first.equals("hi");
}
```

---

## startOz.java

```java
// Given a string, return a string made of the first 2 chars (if present), 
// however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
public String startOz(String str) {
  String result = "";
  
  if (str.length() >= 1 && str.charAt(0) == 'o') {
     result += 'o';
  }
  
  if (str.length() >= 2 && str.charAt(1) == 'z') {
     result += 'z';
  }
  
  return result;
}
```

---

## stringE.java

```java
// Return true if the given string contains between 1 and 3 'e' chars. 
public boolean stringE(String str) {
  int count = 0;
  int length = str.length();
  for(int i=0; i<length; i++) {
     if (str.charAt(i) == 'e') {
        count++;
     }
  }
  
  return (count>=1 && count<=3);
}
```

---

## sumDouble.java

```java
// Given two int values, return their sum. Unless the two values are the same, then return double their sum. 
public int sumDouble(int a, int b) {
 if (a==b) {
    return 2*(a+b);
 } 
 return a+b;
}
```

---
