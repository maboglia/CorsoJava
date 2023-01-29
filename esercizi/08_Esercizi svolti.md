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

---

## Esercizi sui metodi statici con esempio di soluzione

## 1.9. Esercizio dati un array di interi a ed un intero n

Scrivere un metodo che, dati un array di interi a ed un intero n, restituisce true se n compare in a, false altrimenti.

```java
public static boolean occorre (int[] a, int n) {
    int i = 0;
boolean trovato = false;
while (i<a.length && !trovato) {
if (a[i] == n)
trovato = true;
i++;
}
return trovato;
}
```

Un metodo equivalente che sfrutta il costrutto return senza introdurre una variabile
booleana è il seguente:

```java
public static boolean occorre (int[] a, int n) {
    int i = 0;
while (i<a.length) {
    if (a[i] == n)
return true;
i++;
}
return false;
}
```

---

## 1.10. Esercizio   numero delle occorrenze di n in a

Scrivere un metodo che, dati un array di interi a ed un intero n, restituisce il numero delle occorrenze di n in a.

```java
public static int occorrenze (int[] a, int n) {
    int cont = 0;
for (int i=0; i<a.length; i++) {
    if (a[i] == n)
cont++;
}
return cont;
}

```

---

## 1.11. Esercizio  prima occorrenza di n in a

Scrivere un metodo che, dati un array di interi a ed un intero n, restituisce la posizione della prima occorrenza di n in a, e -1 se n non compare in a.

```java
public static int posizione (int[] a, int n) {
    int i = 0;
boolean trovato = false;
while (i<a.length && !trovato) {
    if (a[i] == n)
trovato = true;
else i++;
}
if (trovato)
return i;
else return -1;
}
```

---

## 1.12. Esercizio  elementi identici

Scrivere un metodo in linguaggio Java che dato un array di interi restituisca true se
tutti i suoi elementi sono identici, e false altrimenti.

```java
public static boolean uguali (int[] a) {
    boolean equal = true;
int i = 0;
while (i<a.length-1 && equal) {
    if (a[i] != a[i+1])
equal = false;
else
i++;
}
return equal;
}
```

---

## 1.13. Esercizio ordine non decrescente

Scrivere un metodo in linguaggio Java che, dato un array di interi a, restituisca true se
i suoi elementi sono in ordine non decrescente (a[0]≤ a[1] ≤ . . .), e false altrimenti.

```java
public static boolean nondecr (int[] a) {
    boolean cond = true;
int i = 0;
while (i<a.length-1 && cond) {
    if (a[i] > a[i+1]) {
        cond = false;
}
i++;
}
return cond;
}
```

Un semplice metodo main per provare i metodi uguali e nondecr è il seguente (si assume che entrambi i metodi siano definiti in una classe ArrayProp):

```java
public static void main (String[] args) {
    int[] a = new int[args.length];
for (int i=0; i<a.length; i++) {
    a[i] = Integer.parseInt(args[i]);
}
System.out.println("Elementi identici? " + ArrayProp.uguali(a));
System.out.println("Elementi non decrescenti? " + ArrayProp.nondecr(a));
}
```

Scrivere una versione diversa per i metodi uguali e nondecr in cui, invece di definire una variabile booleana locale, vengono utilizzate opportune istruzioni di return.

---

## 1.14. Esercizio  valore minimo

Scrivere un metodo che, dato un array di interi a, restituisce il valore minimo in a.

```java
public static int minimo (int[] a) {
    int min = a[0];
for (int i=1; i<a.length; i++)
if (a[i] < min)
min = a[i];
return min;
}
```

---

## 1.15. Esercizio 7

Scrivere un metodo che, dati un array di interi `a` ed un intero `k`, restituisce true se in `a` compaiono almeno `k` numeri strettamente positivi, false altrimenti.

```java
public static boolean almenokPos (int[] a, int k) {
    int i = 0, cont = 0;
while (i<a.length) {
if (a[i] > 0) {
cont++;
if (cont >= k) return true;
}
i++;
}
return false;
}
```
