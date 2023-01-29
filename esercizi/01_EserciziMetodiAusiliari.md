# 1. Esercizi sui metodi ausiliari

## Ripeti

Scrivere un programma **Ripeti** che chiede all’utente di inserire una stringa e un numero intero positivo. 

Entrambe gli elementi dovranno essere passati a un metodo ausiliario che stamperà tante copie della stringa quante indicate nel numero inserito dall’utente. 

Se il numero inserito dall'utente è negativo il metodo ausiliario stamperà "ERRORE: numero negativo". 

Il nome del metodo ausiliario può essere scelto a piacere.

---

## TuttiUguali

Scrivere un programma "**TuttiUguali**" che chiede all'utente di inserire tre numeri e stampa "Tutti uguali!" se i tre numeri sono tutti uguali,altrimenti stampa "Almeno uno e' diverso".

Il controllo che i tre numeri siano uguali dovrà essere fatto da un metodo ausiliario, mentre il messaggio dovrà essere stampato dal metodo main.


---

## MezziCasuali

Scrivere un programma **MezziCasuali** che stampa un numero frazionario ottenuto come risultato della chiamata di un metodo ausiliario che al suo interno richiama il metodo di libreria Math.random(). 

Se il risultato di Math.random() e minore di 0.5 il metodo lo restituisce cosı com'è. 

Se invece il risultato di Math.random() e maggiore o uguale a 0.5 il metodo lo restituisce diminuito di 0.5. 

Il nome del metodo ausiliario può essere scelto a piacere.

---

## Concatena

Scrivere un programma **Concatena** che chiede all'utente di inserire tre singole parole e le ristampa interponendovi un asterisco.

Per esempio, se l'utente inserisce `"gatto", "cane" e "topo"` il programma stamperà `gatto*cane*topo`.

Per concatenare le tre parole si utilizzi un metodo ausiliario che prende due stringhe e restituisce la stringa ottenuta concatenando la prima parola ricevuta, un asterisco e la seconda parola ricevuta.

---

## Incrementa

Scrivere un programma **Incrementa** contenente un metodo ausiliario che
incrementi il valore di una variabile.

---

## Swap

* Scambia il contenuto di due variabili, usando un metodo ausiliario `swap(a,b)`

---

## Max di interi

Trova il valore max tra 2 numeri interi usando un metodo ausiliario `max(x, y)`

---

## Bisestile 

Scrivere un programma Bisestile che chiede all’utente di inserire un numero intero che rappresenta un anno, e stampa Anno bisestile se l’anno inserito è bisestile, Anno non bisestile se l’anno inserito non è bisestile, oppure Errore se il numero inserito è negativo.

Un anno per essere bisestile deve:

* essere divisibile per 4 e inoltre
* qualora sia divisibile per 100, deve anche essere divisibile per 400

Realizzare il programma usando il metodo ausiliario `bisestile(anno)` che restituisce true o false a
seconda che anno sia bisestile o meno.

---

## MinimoTraDieci

Scrivere il programma MinimoTraDieci che chiede all’utente di inserire 10 numeri interi
calcola il minimo tra essi e lo stampa come risultato.

Il programma deve utilizzare un metodo ausiliario minimo(x,y) che restituisce il minimo tra x e y.

