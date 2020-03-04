# Esercizi su array


## Esercizio
Scrivere un programma **StampaZigZag** che prevede un array di 10 numeri interi contenente valori a piacere e ne stampa gli elementi secondo il seguente ordine: il primo, l’ultimo, il secondo, il penultimo, il terzo, il terz’ultimo, ecc... 

Il nome dell’array può essere scelto a piacere.


## Esercizio
Scrivere un programma **SommaPariDispari** che prevede un array di 10 numeri interi contenente valori a piacere e stampa Pari e dispari uguali se la somma dei numeri in posizioni pari dell’array è uguale alla somma dei numeri in posizioni dispari, altrimenti il programma stampa Pari e dispari diversi.


## Esercizio
Scrivere un programma **SecondoArray** che chiede all’utente di inserire 10 numeri interi e li memorizza in un array. 

Successivamente, crea un nuovo array di dimensione pari al numero di valori maggiori o uguali a zero inseriti dall’utente. 

Copia tutti i valori maggiori o uguali a zero nel nuovo array e ne stampa i valori in ordine inverso.


## Esercizio
Scrivere un programma **TreConsecutivi** che prevede un array di 10 numeri interi contenente valori a piacere, devi verificare se ci sono valori consecutivi uguali. 

Se l’array contiene tre valori uguali in tre posizioni consecutive, altrimenti stampa "NO".


## Esercizio
Scrivere un programma **DoppioUnoDellaltro** che he prevede un array di 10 numeri interi contenente valori a piacere e stampa "Doppio uno dell’altro" se nell’array sono presenti due valori che sono l’uno il doppio dell’altro, oppure stampa "NO" altrimenti.


## Esercizio
Scrivere un programma **DueSequenze** che chiede all’utente di inserire due sequenze di stringhe, ciascuna di 5 elementi, e poi stampa il messaggio "OK" se almeno una stringa della prima sequenza compare anche nella seconda, altrimenti stampa il messaggio "NO". 

Nel caso in cui le due sequenza abbiano almeno una stringa in comune, i confronti tra le sequenze si devono interrompere non appena una coppia di stringhe uguali viene trovata.

## Esercizio
Scrivere il programma **MinimoDiArray** che chiede all’utente di inserire 10 numeri, li memorizza in un array e poi stampa valore e posizione dell’elemento minimo dell’array. 

Se il valore minimo è presente più di una volta, stampa la posizione della prima occorrenza di tale valore nell’array.

## Esercizio
Scrivere il programma **Cerca** che crea e inizializza un array di int contenete 10 valori a piacere (usando il comando di inizializzazione che prevede la lista dei valori tra parentesi graffe), chiede all’utente di inserire un numero e stampa Presente se il numero è presente nell’array, oppure Assente se il numero non è presente. 

Provare a risolvere questo esercizio in due modi: tramite un for-each e tramite un while. 

Nel caso del while il ciclo deve interrompersi non appena l’elemento (se presente) viene trovato.

## Esercizio
Scrivere il programma **AlternaNumeri** che chiede all’utente di inserire 10 numeri e li ristampa, stampando prima i numeri inseriti negli inserimenti dispari (il primo, il terzo, il quinto, il settimo e il nono) e poi i numeri inseriti negli inserimenti pari (il secondo, il quarto, il sesto, l’ottavo e il decimo).


## Esercizio
Scrivere il programma **TantiPariQuantiDispari** che chiede all’utente di inserire 10 numeri e stampa il messaggio Tanti pari quanti dispari" se i numeri pari inseriti sono tanti quanti i numeri dispari. 

In caso contrario il programma stampa I numeri pari sono in numero supriore oppure In numeri dispari sono in numero superiore se l’utente ha inserito più numeri pari o più numeri dispari, rispettivamente.

## Esercizio
Scrivere il programma **CercaSomma** che chiede all’utente di inserire 5 numeri e stampa il messaggio Ci sono due numeri con somma pari a 100 se ci sono, tra i numeri inseriti dall’utente, due numeri la cui somma è pari a 100. 

In caso contrario il programma stampa il messaggio Non ci sono due numeri con somma pari a 100.


## Esercizio
Scrivere il programma **DueListe** che chiede all’utente di inserire 5 numeri seguiti da altri 5 numeri e stampa le 5 somme ottenute da un numero del primo gruppo e un numero del secondo gruppo in posizioni corrispondenti:


## Esercizio
Scrivere il programma **DueListe2** che chiede all’utente di inserire 5 numeri seguiti da altri 5 numeri e stampa quanti numeri sono presenti in entrambi i gruppi e la loro somma.

## Esercizio
Scrivere un programma **RubricaTelefonica** che chiede all’utente di inserire 5 nomi e numeri di telefono e li ristampa in ordine alfabetico sul nome. 

Note: usare due array distinti per memorizzare i nomi e i numeri di telefono; attenzione al problema (commentato a lezione) dei caratteri che mandano a capo il testo nell’uso di Scanner.


## Esercizio 1
Scrivere un programma che disegni l'istogramma di
un array di interi precaricato.
Es. Se vettore = {4, 7, 2}, l'output sarà:
0:	****
1:	*******
2:	**

## Esercizio 2
Scrivere un programma che implementi l'algoritmo di
ordinamento per selezione su un vettore di 10
caratteri inseriti da tastiera.
Si ricorda l'algoritmo:
for (int i = 0; i < N - 1; i++)
    for (int j = i; j < N; j++)
         if (a[i] > a[j]) {
              temp = a[i];
              a[i] = a[j];
              a[j] = temp;
	 }

## Esercizio 3
Scrivere un programma contenente la definizione e
l'uso di un metodo cotangente(x).
Si ricorda che cotangente(x) = cos(x)/sin(x).
Calcolare x come 3.14/4

## Esercizio 4
Scrivere un programma che converta una sequenza
di caratteri letti in input nei corrispondenti
caratteri maiuscoli.
Suggerimento: per convertire c in maiuscolo
usare (c + 'A' - 'a').

## Esercizio 5
Scrivere un programma contenente un metodo che
incrementi il valore di una variabile.

## Esercizio 6
Scrivere un programma che legge da tastiera un
intero, lo incrementa e lo restituisce in output.
Suggerimento: per gestire un numero su più cifre
occorre gestire l'input nel seguente modo
res = res * 10 + b[i] - '0'


## Esercizio  1
Scrivere un programma che legga i valori di due
matrici in input, ne effettui il prodotto e stampi
il risultato.

## Esercizio  2
Scrivere un programma che contenga un metodo
ricorsivo per il calcolo del fattoriale.

## Esercizio  3
Scrivere un programma che implementi il TDA
pila di interi.

## Esercizio  4
Scrivere un programma che implementi il TDA
coda di interi.


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

## Esercizio  2.
Si consideri il seguente metodo in linguaggio Java.

```java
public static boolean metodo (int[] a) {
    boolean condizione = true;
for (int i = 0; i < a.length-1; i++) {
    if (a[i] != 2*a[i+1]) {
        condizione = false;
}
}
return condizione;
}
```
(a) Determinare quale caratteristica deve soddisfare l’array a perché il metodo restituisca il valore true.
(b) Riscrivere il metodo usando il ciclo while. Spiegare quale delle due soluzioni sia la piú efficiente e il perché.

Soluzione
1. Affinché il metodo restituisca il valore true, gli elementi dell’array a devono essere
ciascuno il doppio dell’elemento successivo in a.
2. Soluzione con il while:
```java
public static boolean metodo (int[] a) {
    boolean condizione = true;
int i = 0;
while (i < a.length-1 && condizione) {
    if (a[i] != 2*a[i+1]) {condizione = false;
}
i++;
}
return condizione;
}
```
La soluzione piú efficiente è quella con il while, in quanto nel caso in cui l’array non
soddisfi la caratteristica detta al punto 1., l’iterazione termina non appena si trova
un elemento dell’array che non è il doppio del successivo, senza scandire tutto l’array.
Tale scansione di tutto l’array viene invece sempre eseguita dalla soluzione con il for
indipendentemente dal valore finale di condizione.


## Esercizio  1. 
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
## Esercizio  2. 
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
## Esercizio  3. 
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
## Esercizio  4.

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
## Esercizio  5. 
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
Un semplice metodo main per provare i metodi uguali e nondecr è il seguente (si
assume che entrambi i metodi siano definiti in una classe ArrayProp):
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
### Esercizio
Scrivere una versione diversa per i metodi uguali e nondecr in cui, invece di definire
una variabile booleana locale, vengono utilizzate opportune istruzioni di return.
## Esercizio  6. 

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
### Esercizio
Scrivere un metodo che, dato un array di interi a, restituisce il valore massimo in a.
## Esercizio 7. 
Scrivere un metodo che, dati un array di interi a ed un intero k, restituisce true se in a compaiono almeno k numeri strettamente positivi, false altrimenti.
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