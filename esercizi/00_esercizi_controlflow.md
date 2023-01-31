# 1. Esercizi su istruzioni condizionali e cicli


## 1.1. Esercizio dieci numeri interi

Scrivere un programma che stampi a video i primi dieci numeri interi

---

## 1.2. Esercizio dieci interi pari

Scrivere un programma che stampi a video i primi dieci interi pari compresi fra 20 e 0, partendo da 20.

---

## 1.3. Esercizio tabellina

Scrivere un programma che stampi la tabellina del numero dato come argomento

---

## 1.4. Esercizio

Stampare a video la seguente figura:

```java
******
*****
****
***
**
*
```

---

## 1.5. Esercizio

Stampare a video la seguente figura:

```java
#
##
###
####
#####
######
```

---

## 1.6. Esercizio

Stampare a video la seguente figura:

```java
1      654321
12      54321
123      4321
1234      321
12345      21
123456      1
```

---

## 1.7. Esercizio Fibonacci

Scrivere un programma che stampi i primi 100 elementi della successione di Fibonacci.

---

## 1.8. Esercizio TuttiPositiviPari

Scrivere un programma **TuttiPositiviPari** che chiede all’utente di inserire una sequenza di interi (chiedendo prima quanti numeri voglia inserire) e poi, al termine dell’inserimento dell’intera sequenza, stampa "Tutti positivi e pari" se i numeri inseriti sono tutti positivi e pari, altrimenti stampa "NO". 

---

## 1.9. Esercizio ContinuaFino

Scrivere un programma **ContinuaFino** che chiede all’utente di inserire una sequenza di
interi. Il programma continua a chiedere all’utente di inserire valori fintanto che i valori inseriti soddisfano
almeno una delle seguenti condizioni:

* è negativo e divisibile per 2
* è positivo e divisibile per 3

Al termine il programma stampa la somma di tutti i valori inseriti escluso quello ha violato le condizioni.

---

## 1.10. Esercizio PositivoNegativo

Scrivere un programma **PositivoNegativo** che chiede all’utente di inserire una sequenza di interi terminata quando l’utente immette il valore 0 e poi stampa "OK" se la sequenza contiene un valore positivo seguito da uno negativo, altrimenti stampa il messaggio "NO". A vostra scelta, la stampa
del messaggio "OK" può interrompere o meno l’inserimento dei valori. 

---

## 1.11. Esercizio MediaMultipliDiTre

Scrivere un programma **MediaMultipliDiTre** che chiede all’utente di inserire una sequenza di interi (chiedendo prima quanti numeri voglia inserire) e poi stampa la media di tutti i numeri inseriti che siano divisibili per tre. 

Per esempio, se si immettono i valori 5, 8, 9, 12, 7, 6 ,1 il risultato stampato dovrà essere 9. 

---

## 1.12. Esercizio Ripetizioni

Scrivere un programma **Ripetizioni** che chiede all’utente di inserire una sequenza di caratteri (chiedendo prima quanti caratteri voglia inserire) e li ristampa man mano che vengono inseriti.

L’intero procedimento (chiedere quanti caratteri voglia inserire, leggere i caratteri e man mano stamparli) dovrà essere ripetuto 5 volte.

---

## 1.13. Esercizio Classificazione voto esame

Una classe di 10 studenti ha sostenuto un esame.

I voti sono espressi con lettere: 

* 'O' = ottimo (corrispondente al 10), 
* 'B' = buono (8),
* 'S' = sufficiente (6), 
* 'I' = insufficiente (4).

Scrivere un  programma che consenta il calcolo
della media aritmetica dei voti di tale esame.

---

## 1.14. Esercizio 44 gatti

Scrivere un programma per stampare 44 caratteri
(inseriti da tastiera) in fila per 6 con resto
di 2.


---

## 1.15. Esercizio Codi ASCII

Scrivere un programma che stampi 10 caratteri
(letti da tastiera) ed i relativi codici ASCII.

---

## Esercizio Triangolo isoscele

* con i cicli innestati stampare a video la figura di un triangolo isoscele composto di lettere A maiuscola

---

## 1.17. Esercizio Calcola il voto dell’esame

Scrivere un programma che calcoli il risultato dell’esame di uno studente.
    Il programma prenderà in ingresso:
        Il voto ottenuto nella prova scritta (variabile tra -8 e +8)
        Il voto ottenuto nella prova pratica (variabile tra 0 e 24)

Memorizzati questi dati procederà al calcolo del risultato finale in trentesimi come segue:

* Il risultato finale è la somma dei risultati.
* se il voto di teoria è minore (o uguale) di zero e la somma dei voti di teoria e pratica è maggiore di 18 lo studente è bocciato.
* se il voto di teoria è minore (o uguale) di zero e il voto di pratica è minore di 18 il programmalo studente è bocciato.
* se il voto di teoria è maggiore di zero e la somma dei voti di teoria e pratica è minore di 18lo studente è bocciato.
* se la somma di teoria e pratica vale 31 o 32 il programma stampa: "congratulazioni: 30 e lode"
* in tutti gli altri casi lo studente è promosso e viene riportato il voto calcolato.


---

## 1.18. Esercizio Carta, forbici, sasso

Scrivere un programma che chieda agli utenti due stringhe in ingresso, le stringhe possono valere solo: "carta", "forbici" o "sasso". 

Il programma dovrà quindi effettuare i dovuti controlli e dichiarare il vincitore secondo le regole: 

* forbici vince su carta, 
* carta vince su sasso, 
* sasso vince su forbici.

---

## 1.19. Esercizio calcolare l’importo di una tassa

Scrivere una funzione per calcolare l’importo di una tassa secondo la seguente tabella:

* Fino a 10.000 €, l’importo della tassa è del 10%
* Fino a 20.000 €, l’importo della tassa è del 10% per i primi 10.000 €, del 7 % sul restante.
* Fino a 30.000 €, l’importo è ancora del 10% per i primi 10.000 €, poi del 7% fino a 20.000 ed infine il 5% sul restante.
* Oltre i 30.000 € ci si comporta come prima, aggiungendo un ulteriore 3% è sulla porzione oltre i 30.000 €.
* Per ogni importo non valido si ritorni -1 (qualunque importo che non sia un numero reale e positivo).

* Esempi: Un importo di 10, dovrebbe tornare 1 (1 è il 10% di 10)
* Un importo di 21, dovrebbe tornare 1.75 (10% di 10 + 7% di 10 + 5% di 1)

---

## 1.20. Esercizio IndovinaZero

Scrivere un programma **IndovinaZero** che chiede all’utente di inserire numeri interi uno dopo l’altro fino a quando non inserisce il numero 0.

---

## 1.21. Esercizio ScrivoScrivoScrivo

Scrivere un programma **ScrivoScrivoScrivo** che chiede all’utente di inserire un numero maggiore o uguale a zero e un messaggio, quindi stampa il messaggio ciclando un numero di volte pari al numero inserito dall’utente. 

Se il valore inserito dall’utente è negativo il programma stampa un messaggio di errore.

---

## 1.22. Esercizio Conteggio

Scrivere un programma **Conteggio** che chiede all’utente di inserire un numero maggiore o uguale a zero e stampa uno dopo l’altro tutti i numeri da 0 al numero inserito compreso. 
Se il valore inserito dall’utente è negativo il programma stampa un messaggio di errore.

---

## 1.23. Esercizio ContaNumeriCrescenti

Scrivere un programma **ContaNumeriCrescenti** che chiede all’utente di inserire una sequenza di numeri interi crescenti (man mano sempre più grandi) e ne stampa la lunghezza (il numero di valori inseriti dall’utente). Il programma termina non appena l’utente inserisce un valore minore o uguale al precedente).

---

## 1.24. Esercizio MediaNumeri

Scrivere un programma **MediaNumeri** che chiede all’utente di inserire una sequenza di numeri interi positivi. Non appena l’utente inserisce un numero negativo il programma si arresta e visualizza la media aritmetica dei valori positivi inseriti.

---

## 1.25. Esercizio Asterischi

Scrivere un programma **Asterischi** che chiede all’utente di inserire un numero intero e stampa un triangolo fatto di asterischi con un numero di righe pari al valore inserito dall’utente.

Se l’utente inserisce un valore negativo il programma deve visualizzare un messaggio di errore.

---

## 1.26. Esercizio TavolaPitagorica

Scrivere un programma **TavolaPitagorica** in modo che i valori stampati siano ben incolonnati

---

## 1.27. Esercizio Ordinamento per selezione

Scrivere un programma che implementi l'algoritmo di
ordinamento per selezione su un vettore di 10
caratteri inseriti da tastiera.

Algoritmo:

```java
for (int i = 0; i < N - 1; i++)
    for (int j = i; j < N; j++)
         if (a[i] > a[j]) {
              temp = a[i];
              a[i] = a[j];
              a[j] = temp;
  }
```

---

## 1.28. Esercizio Converti in maiuscolo

Scrivere un programma che usando i cicli converta una sequenza di caratteri letti in input nei corrispondenti caratteri maiuscoli.

---

## Esercizio TestaCroce

Scrivere un programma `TestaCroce` che genera un numero casuale 0 oppure 1 e stampa
Testa se ha generato 0, o Croce se ha generato 1.

---

## Esercizio GrandiNumeri

Scrivere un programma `GrandiNumeri` che genera 0 oppure 1 per 1000 volte e stampa quante volte è stato generato 0 e quante volte è stato generato 1.

---

## Esercizio ordina 3 numeri interi

Esercizio: dati 3 numeri visualizzarli in ordine crescente.

### uso `if` e `and`

```java

      int num1 = 15;
      int num2 = -5;
      int num3 = 7;
      if (num1 >= num2 && num1 >= num3)
         System.out.println( num1 + " è il numero maggiore.");
      else if (num2 >= num1 && num2 >= num3)
         System.out.println( num2 + " è il numero maggiore.");
      else
         System.out.println( num3 + " è il numero maggiore.");

```

Logica per ordinarli:

```java
if (a > c)
   swap(a, c);

if (a > b)
   swap(a, b);

//Controlla il 2° e il 3°

if (b > c)
   swap(b, c);
```

Dove swap(...) è un metodo che scambia i valori

---

## Esercizio ordina 3 numeri interi (2)

### uso `if` e `or`

```java
double max = z;
if (x > max || y > max) {
    if (x > y) {
        max = x;
    } else {
        max = y;
    }
}
double min = z;
if (x < min || y < min) {
    if (x < y) {
        min = x;
    } else {
        min = y;
    }
}

double mid = x + y + z - max - min;
System.out.printf("In ordine %f %f %f%n", min, mid, max);
```

---

## Esercizio ordina 3 numeri interi (3)

### uso `Math.max()`

```java
double max = Math.max(x, Math.max(y, z));
double min = Math.min(x, Math.min(y, z));
double mid = x + y + z - max - min;
System.out.printf("In ordine %f %f %f%n", min, mid, max);
```
