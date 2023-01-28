# 1. Esercizi sui metodi ausiliari

## 1.1. Es. 1: 

Scrivere un programma **Ripeti** che chiede all’utente di inserire una stringa e un numero intero positivo. 

Entrambe gli elementi dovranno essere passati a un metodo ausiliario che stamperà tante copie della stringa quante indicate nel numero inserito dall’utente. 

Se il numero inserito dall'utente è negativo il metodo ausiliario stamperà "ERRORE: numero negativo". 

Il nome del metodo ausiliario può essere scelto a piacere.

---

## 1.2. Es. 2: 

Scrivere un programma "**TuttiUguali**" che chiede all'utente di inserire tre numeri e stampa "Tutti uguali!" se i tre numeri sono tutti uguali,altrimenti stampa "Almeno uno e' diverso".

Il controllo che i tre numeri siano uguali dovrà essere fatto da un metodo ausiliario, mentre il messaggio dovrà essere stampato dal metodo main.


---

## 1.3. Es. 3: 

Scrivere un programma **MezziCasuali** che stampa un numero frazionario ottenuto come risultato della chiamata di un metodo ausiliario che al suo interno richiama il metodo di libreria Math.random(). 

Se il risultato di Math.random() e minore di 0.5 il metodo lo restituisce cosı com'e. 

Se invece il risultato di Math.random() e maggiore o uguale a 0.5 il metodo lo restituisce diminuito di 0.5. 

Il nome del metodo ausiliario può essere scelto a piacere.

---

## 1.4. Es. 4: 

Scrivere un programma **Concatena** che chiede all'utente di inserire tre singole parole e le ristampa interponendovi un asterisco.

Per esempio, se l'utente inserisce "gatto", "cane" e "topo" il programma stamperà gatto*cane*topo.

Per concatenare le tre parole si utilizzi un metodo ausiliario che prende due stringhe e restituisce la stringa ottenuta concatenando la prima parola ricevuta, un asterisco e la seconda parola ricevuta.

---

## 1.5. Esercizio 5

Scrivere un programma **Incrementa** contenente un metodo ausiliario che
incrementi il valore di una variabile.

---

## 1.6. Esercizio Swap

* Scambia il contenuto di due variabili, usando un metodo ausiliario swap(a,b)

---

## 1.7. max di interi

Trova il valore max tra 2 numeri interi usando un metodo ausiliario max(x, y)

## 1.8. Esercizi sui metodi statici con esempio di soluzione

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

---
