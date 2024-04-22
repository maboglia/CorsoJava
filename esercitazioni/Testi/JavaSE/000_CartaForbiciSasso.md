# Esercitazione: Gioco Carta, Forbici, Sasso in Java

## Descrizione

In questa esercitazione, svilupperemo un'applicazione Java per giocare al classico gioco "Carta, Forbici, Sasso" contro il computer. Il gioco consisterà nel permettere all'utente di fare una scelta (Carta, Forbici o Sasso) e confrontarla con la scelta casuale del computer. Alla fine, verrà annunciato il vincitore.

## Requisiti

1. Crea una classe chiamata `GiocoCartaForbiciSasso` che gestisca il gioco.

2. Implementa un metodo `public void gioca()` che consenta all'utente di inserire la sua scelta (ad esempio, "C" per Carta, "F" per Forbici o "S" per Sasso). Usa l'input da tastiera per ottenere la scelta dell'utente.

3. Genera casualmente la scelta del computer tra Carta, Forbici e Sasso.

4. Confronta la scelta dell'utente con quella del computer e determina il vincitore del round secondo le seguenti regole:
   - Carta batte Sasso
   - Forbici battono Carta
   - Sasso batte Forbici
   - In caso di scelte identiche, il round termina in parità.

5. Tieni traccia del punteggio dell'utente e del computer.

6. Chiedi all'utente se desidera continuare a giocare e avvia un nuovo round se la risposta è sì.

7. Alla fine del gioco (quando l'utente decide di smettere di giocare), visualizza il punteggio totale e annuncia il vincitore.

## Esempio

Ecco un esempio di output atteso dell'applicazione:

```
Benvenuto a Carta, Forbici, Sasso!

Round 1: Scelto utente: Carta, Scelto computer: Sasso
Utente vince il round 1!

Round 2: Scelto utente: Forbici, Scelto computer: Forbici
Round 2 finisce in parità!

Round 3: Scelto utente: Sasso, Scelto computer: Forbici
Utente vince il round 3!

Vuoi giocare ancora? (Sì/No): Sì

Round 4: Scelto utente: Carta, Scelto computer: Carta
Round 4 finisce in parità!

Round 5: Scelto utente: Forbici, Scelto computer: Carta
Utente vince il round 5!

Vuoi giocare ancora? (Sì/No): No

Punteggio totale:
Utente: 3
Computer: 0

Utente vince il gioco!
```

## Suggerimenti

- Usa la classe `Random` per generare casualmente la scelta del computer.
- Puoi utilizzare un'istruzione `switch` per confrontare le scelte dell'utente e del computer e determinare il vincitore del round.
- Implementa un sistema per tenere traccia del punteggio.
- Utilizza un ciclo `while` per consentire all'utente di giocare più round fino a quando decide di smettere.

## Consegna

Concludi l'esercizio scrivendo il codice sorgente completo per la classe `GiocoCartaForbiciSasso`, includendo uno screenshot o un file di testo con l'output ottenuto durante il test dell'applicazione. Assicurati che il codice sia ben commentato e formattato in modo leggibile.

