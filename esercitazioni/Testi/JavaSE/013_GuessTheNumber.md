# Esercitazione: Gioco "Indovina il Numero" in Java

## Descrizione

In questa esercitazione, svilupperemo un'applicazione Java che consente all'utente di giocare a "Indovina il Numero". Il computer sceglierà un numero casuale e l'utente dovrà indovinare il numero corretto entro un certo numero di tentativi.

## Requisiti

1. Crea una classe chiamata `GuessTheNumber` che gestisca il gioco.

2. Genera casualmente un numero segreto compreso tra un minimo e un massimo specificati (ad esempio, tra 1 e 100). Questo sarà il numero che l'utente dovrà indovinare.

3. Chiedi all'utente di inserire un limite superiore per il range dei numeri (ad esempio, 100). Questo definirà il valore massimo per il numero segreto.

4. Chiedi all'utente di indovinare il numero segreto. Consentigli di inserire un numero e confrontalo con il numero segreto.

5. Se il numero inserito dall'utente è diverso dal numero segreto, fornisci un suggerimento se il numero segreto è maggiore o minore.

6. Ripeti il processo finché l'utente indovina correttamente il numero o supera il numero massimo di tentativi consentiti (ad esempio, 10 tentativi).

7. Alla fine del gioco, visualizza un messaggio che informa l'utente se ha vinto o perso, insieme al numero segreto.

## Esempio

Ecco un esempio di output atteso dell'applicazione:

```
Benvenuto a Indovina il Numero!

Inserisci il limite superiore per il range dei numeri: 100
Ho scelto un numero tra 1 e 100. Prova ad indovinare!

Tentativo 1: 50
Il mio numero è più grande!

Tentativo 2: 75
Il mio numero è più piccolo!

Tentativo 3: 63
Il mio numero è più piccolo!

Tentativo 4: 56
Il mio numero è più grande!

Tentativo 5: 59
Il mio numero è più piccolo!

Tentativo 6: 58
Complimenti! Hai indovinato il numero segreto (58) in 6 tentativi!
Vuoi giocare ancora? (Sì/No): No

Grazie per aver giocato!
```

## Suggerimenti

- Usa la classe `Random` per generare casualmente il numero segreto.
- Utilizza un ciclo `while` per consentire all'utente di continuare a indovinare fino a quando non ha indovinato correttamente o ha superato il numero massimo di tentativi.
- Mantieni un conteggio dei tentativi dell'utente.

## Consegna

Concludi l'esercizio scrivendo il codice sorgente completo per la classe `GuessTheNumber`, includendo uno screenshot o un file di testo con l'output ottenuto durante il test dell'applicazione. Assicurati che il codice sia ben commentato e formattato in modo leggibile.
