# Esercizi su istruzioni condizionali e cicli


## Esercizio
Scrivere un programma che stampi a video i primi dieci numeri interi

## Esercizio
Scrivere un programma che stampi a video i primi dieci interi pari compresi fra 20 e 0, partendo da 20.

## Esercizio
Scrivere un programma che stampi le tabellina del numero dato come argomento

## Esercizio
Stampare a video la seguente figura:
```java
******
*****
****
***
**
*
```
## Esercizio
Stampare a video la seguente figura:
```java
#
##
###
####
#####
######
```

## Esercizio
Stampare a video la seguente figura:
```java
1      654321
12      54321
123      4321
1234      321
12345      21
123456      1
```

## Esercizio
Scrivere un programma che stampi i primi 100 elementi della successione di Fibonacci.



## Esercizio 2.1: 

Scrivere un programma **TuttiPositiviPari** che chiede all’utente di inserire una sequenza di interi (chiedendo prima quanti numeri voglia inserire) e poi, al termine dell’inserimento dell’intera sequenza, stampa "Tutti positivi e pari" se i numeri inseriti sono tutti positivi e pari, altrimenti stampa "NO". 

Risolvere questo esercizio senza usare array.

## Esercizio 2.2: 

Scrivere un programma **ContinuaFino** che chiede all’utente di inserire una sequenza di
interi. Il programma continua a chiedere all’utente di inserire valori fintanto che i valori inseriti soddisfano
almeno una delle seguenti condizioni:
* è negativo e divisibile per 2
* è positivo e divisibile per 3

Al termine il programma stampa la somma di tutti i valori inseriti escluso quello ha violato le condizioni.

Risolvere questo esercizio senza usare array.

## Esercizio 2.3: 

Scrivere un programma **PositivoNegativo** che chiede all’utente di inserire una sequenza
di interi terminata quando l’utente immette il valore 0 e poi stampa "OK" se la sequenza contiene un
valore positivo seguito da uno negativo, altrimenti stampa il messaggio "NO". A vostra scelta, la stampa
del messaggio "OK" può interrompere o meno l’inserimento dei valori. 

Risolvere questo esercizio senza usare array.

## Esercizio 2.4: 

Scrivere un programma **MediaMultipliDiTre** che chiede all’utente di inserire una sequenza di interi (chiedendo prima quanti numeri voglia inserire) e poi stampa la media di tutti i numeri inseriti che siano divisibili per tre. 

Per esempio, se si immettono i valori 5, 8, 9, 12, 7, 6 ,1 il risultato stampato dovrà essere 9. 

Risolvere questo esercizio senza usare array.
## Esercizio 2.5: 

Scrivere un programma **Ripetizioni** che chiede all’utente di inserire una sequenza di caratteri (chiedendo prima quanti caratteri voglia inserire) e li ristampa man mano che vengono inseriti.

L’intero procedimento (chiedere quanti caratteri voglia inserire, leggere i caratteri e man mano stamparli) dovrà essere ripetuto 5 volte.

Risolvere questo esercizio senza usare array.




## Esercizio
Scrivere un programma che calcoli il risultato dell’esame di uno studente.
    Il programma prenderà in ingresso:
        Il voto ottenuto nella prova scritta (variabile tra -8 e +8)
        Il voto ottenuto nella prova pratica (variabile tra 0 e 24)

Memorizzati questi dati procederà al calcolo del risultato finale in trentesimi procedendo come segue:

* Il risultato finale è la somma dei risultati.
* se il voto di teoria è minore (o uguale) di zero e la somma dei voti di teoria e pratica è maggiore di 18 lo studente è bocciato.
* se il voto di teoria è minore (o uguale) di zero e il voto di pratica è minore di 18 il programmalo studente è bocciato.
* se il voto di teoria è maggiore di zero e la somma dei voti di teoria e pratica è minore di 18lo studente è bocciato.
* se la somma di teoria e pratica vale 31 o 32 il programma stampa: “congratulazioni: 30 e lode”
* in tutti gli altri casi lo studente è promosso e viene riportato il voto calcolato.


## Esercizio
Scrivere un programma che chieda agli utenti due stringhe in ingresso, le stringhe possono valere solo: “carta”, “forbice” o “sasso”. 

Il programma dovrà quindi effettuare i dovuti controlli e dichiarare il vincitore secondo le regole: 
* forbice vince su carta, 
* carta vince su sasso, 
* sasso vince su forbice.

## Esercizio
Scrivere una funzione per calcolare l’importo di una tassa secondo la seguente tabella:
* Fino a 10.000 €, l’importo della tassa è del 10%
* Fino a 20.000 €, l’importo della tassa è del 10% per i primi 10.000 €, del 7 % sul restante.
* Fino a 30.000 €, l’importo è ancora del 10% per i primi 10.000 €, poi del 7% fino a 20.000 ed infine il 5% sul restante.
* Oltre i 30.000 € ci si comporta come prima, aggiungendo un ulteriore 3% è sulla porzione oltre i 30.000 €.
* Per ogni importo non valido si ritorni -1 (qualunque importo che non sia un numero reale e positivo).

* Esempi:Un importo di 10, dovrebbe tornare 1 (1 è il 10% di 10)
* Un importo di 21, dovrebbe tornare 1.75 (10% di 10 + 7% di 10 + 5% di 1)