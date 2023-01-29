# Esercizi con gli array

### Esercizio

Scrivere un metodo che, dato un array di interi a, restituisce il valore massimo in a.

---


## Esercizio  Matrici

Scrivere un programma che legga i valori di due
matrici in input, ne effettui il prodotto e stampi
il risultato.

---

## Esercizio StampaZigZag

Scrivere un programma **StampaZigZag** che prevede un array di 10 numeri interi contenente valori a piacere e ne stampa gli elementi secondo il seguente ordine: il primo, l’ultimo, il secondo, il penultimo, il terzo, il terz’ultimo, ecc... 

Il nome dell’array può essere scelto a piacere.

---


## Esercizio 1

Scrivere un programma che disegni l'istogramma di
un array di interi precaricato.

Es. Se vettore = {4, 7, 2}, l'output sarà:
0: ****
1: *******
2: **

---

## Esercizio SommaPariDispari

Scrivere un programma **SommaPariDispari** che prevede un array di 10 numeri interi contenente valori a piacere e stampa Pari e dispari uguali se la somma dei numeri in posizioni pari dell’array è uguale alla somma dei numeri in posizioni dispari, altrimenti il programma stampa Pari e dispari diversi.

---

## Esercizio SecondoArray

Scrivere un programma **SecondoArray** che chiede all’utente di inserire 10 numeri interi e li memorizza in un array. 

Successivamente, crea un nuovo array di dimensione pari al numero di valori maggiori o uguali a zero inseriti dall’utente. 

Copia tutti i valori maggiori o uguali a zero nel nuovo array e ne stampa i valori in ordine inverso.

---

## Esercizio TreConsecutivi

Scrivere un programma **TreConsecutivi** che prevede un array di 10 numeri interi contenente valori a piacere, devi verificare se ci sono valori consecutivi uguali. 

Se l’array contiene tre valori uguali in tre posizioni consecutive, altrimenti stampa "NO".

---

## Esercizio DoppioUnoDellaltro

Scrivere un programma **DoppioUnoDellaltro** che he prevede un array di 10 numeri interi contenente valori a piacere e stampa "Doppio uno dell’altro" se nell’array sono presenti due valori che sono l’uno il doppio dell’altro, oppure stampa "NO" altrimenti.

---

## Esercizio DueSequenze

Scrivere un programma **DueSequenze** che chiede all’utente di inserire due sequenze di stringhe, ciascuna di 5 elementi, e poi stampa il messaggio "OK" se almeno una stringa della prima sequenza compare anche nella seconda, altrimenti stampa il messaggio "NO". 

Nel caso in cui le due sequenza abbiano almeno una stringa in comune, i confronti tra le sequenze si devono interrompere non appena una coppia di stringhe  uguali viene trovata.

---

## Esercizio MinimoDiArray

Scrivere il programma **MinimoDiArray** che chiede all’utente di inserire 10 numeri, li memorizza in un array e poi stampa valore e posizione dell’elemento minimo dell’array. 
Se il valore minimo è presente più di una volta, stampa la posizione della prima occorrenza di tale valore nell’array.

---

## Esercizio Cerca

Scrivere il programma **Cerca** che crea e inizializza un array di int contenente 10 valori a piacere (usando il comando di inizializzazione che prevede la lista dei valori tra parentesi graffe), chiede all’utente di inserire un numero e stampa Presente se il numero è presente nell’array, oppure Assente se il numero non è presente. 
Provare a risolvere questo esercizio in due modi: tramite un for-each e tramite un while. 
Nel caso del while il ciclo deve interrompersi non appena l’elemento (se presente) viene trovato.

---

## Esercizio AlternaNumeri

Scrivere il programma **AlternaNumeri** che chiede all’utente di inserire 10 numeri e li ristampa, stampando prima i numeri inseriti negli inserimenti dispari (il primo, il terzo, il quinto, il settimo e il nono) e poi i numeri inseriti negli inserimenti pari (il secondo, il quarto, il sesto, l’ottavo e il decimo).

---

## Esercizio TantiPariQuantiDispari

Scrivere il programma **TantiPariQuantiDispari** che chiede all’utente di inserire 10 numeri e stampa il messaggio Tanti pari quanti dispari" se i numeri pari inseriti sono tanti quanti i numeri dispari. 

In caso contrario il programma stampa I numeri pari sono in numero supriore oppure In numeri dispari sono in numero superiore se l’utente ha inserito più 
---numeri pari o più numeri dispari, rispettivamente.

## Esercizio CercaSomma

Scrivere il programma **CercaSomma** che chiede all’utente di inserire 5 numeri e stampa il messaggio Ci sono due numeri con somma pari a 100 se ci sono, tra i numeri inseriti dall’utente, due numeri la cui somma è pari a 100. 

In caso contrario il programma stampa il messaggio Non ci sono due numeri con somma pari a 100.

---

## Esercizio DueListe

Scrivere il programma **DueListe** che chiede all’utente di inserire 5 numeri seguiti da altri 5 numeri e stampa le 5 somme ottenute da un numero del primo gruppo e un numero del secondo gruppo in posizioni corrispondenti:

---

## Esercizio DueListe2

Scrivere il programma **DueListe2** che chiede all’utente di inserire 5 numeri seguiti da altri 5 numeri e stampa quanti numeri sono presenti in entrambi i gruppi e la loro somma.

---

## Esercizio RubricaTelefonica

Scrivere un programma **RubricaTelefonica** che chiede all’utente di inserire 5 nomi e numeri di telefono e li ristampa in ordine alfabetico sul nome. 

Note: usare due array distinti per memorizzare i nomi e i numeri di telefono; attenzione al problema (commentato a lezione) dei caratteri che mandano a capo il testo nell’uso di Scanner.

---

## Esercizio Lettura e stampa di un array

* Scrivere un programma che legge da input 5 elementi interi, li memorizza in un array e stampa il contenuto dell’array

---

## Massimo elemento in un array

* Scrivere un metodo int massimoArray(int[ ] a) che calcola e restituisce il valore del massimo elemento di un array di interi non vuoto a
* **massimoArray**( new int[ ] { 3, 1, 2 } ) deve restituire 3
* **massimoArray**( new int[ ] { 3, 7, 5 } ) deve restituire 7
* Scrivere un metodo int posizioneMassimo(int[ ] a)
che calcola la posizione dell’elemento di valore
massimo di a
* **posizioneMassimo**( new int[ ] { 3, 1, 2 } ) deve restituire 0
* **posizioneMassimo**( new int[ ] { 3, 1, 3 } ) può restituire 0 o 2

---

## Verifica Sequenza crescente

* Scrivere un metodo boolean `crescente(int[ ] a)` che verifica se a è ordinato in modo crescente
* un array è ordinato in modo crescente se per ogni indice k, l’elemento di indice k è maggiore di tutti gli elementi di indice minore di k
* è sufficiente verificare se ogni elemento è minore dell’elemento che lo segue immediatamente
* intuitivamente, bisogna confrontare ciascun elemento di indice i dell’array con l’elemento che lo segue immediatamente, quello di indice i+1
* attenzione – l’ultimo elemento di un array non ha un elemento che lo segue immediatamente

---

## Verifica esistenza coppia elementi uguali

* Scrivere un metodo boolean coppiaUguali(int[ ] a) che verifica se a contiene almeno una coppia di elementi uguali
* bisogna confrontare ciascun elemento X dell’array con ogni altro elemento Y dell’array
* dove X e Y sono elementi diversi, nel senso che hanno indici diversi
* bisogna confrontare ciascun elemento di indice i dell’array con ogni altro elemento di indice j dell’array - dove i e j hanno valore diverso
* quindi è necessario utilizzare due variabili indice per accedere agli elementi di uno stesso array

---

## Inverso di una sequenza

* Scrivere un metodo int[ ] inverso(int[ ] a) che crea e restituisce un array che contiene gli stessi elementi di a, ma disposti in ordine inverso
* Osservazioni:
* Il metodo non deve modificare a, ma creare un nuovo array: v
* Input: a
* Output: v
* Algoritmo: il primo elemento di a va memorizzato come ultimo in v, il secondo come penultimo, ... l’ultimo come primo

Inoltre

* Modificare il programma precedente in modo che l’array inverso risultato, invece di essere un nuovo array creato, sia lo stesso array iniziale ma con i suoi elementi modificati.
---

## Elemento più frequente

* Scrivere un metodo che, dato un array a, calcola e restituisce l’elemento più frequente di a
* calcolare prima l’array occorrenze delle frequenze degli elementi di a
* l’elemento da restituire è quello che in a occupa la posizione del massimo di occorrenze

---

## Elemento più frequente: nuovo algoritmo

* bisogna calcolare la frequenza delle occorrenze
di un elemento se è già stato esaminato?
* a
* occ
2 -3 0 7 11 2 11 7 11 11
0 1 2 3 4 5 6 7 8 9
2 1 1 2 4 2 4 2 4 4
0 1 2 3 4 5 6 7 8 9
* Si devono ricordare gli elementi di cui si sono già calcolate le occorrenze, come?
* Con un array di booleani in cui ogni elemento è true se l’occorrenza è ancora da calcolare, false altrimenti

---

## Esercizio Temperature

Scrivere un programma `Temperature` che crea e inizializza un array di double contenente
12 valori a piacere che rappresentano temperature atmosferiche (usando il comando di inizializzazione
che prevede la lista dei valori tra parentesi graffe). Il programma calcola la media di tali temperature e,
per ogni valore di temperatura nell’array, stampa un messaggio che dice se essa è maggiore (o uguale)
oppure inferiore alla media.

---

## Esercizio ParoleMisteriose

Scrivere un programma `ParoleMisteriose` che crea e inizializza un array di stringhe
contenente 5 parole a piacere (usando il comando di inizializzazione che prevede la lista dei valori tra
parentesi graffe) e chiede all’utente di indovinare una tra le 5 parole entro 3 tentativi.


