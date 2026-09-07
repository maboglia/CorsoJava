# Esercitazione 3 – Conto bancario e gestione delle eccezioni

Partendo dal concetto di conto bancario, realizzare in Java una classe `BankAccount`.

Il conto deve contenere un saldo e deve permettere di:
- essere creato con un saldo iniziale oppure con saldo zero;
- effettuare versamenti;
- effettuare prelievi;
- leggere il saldo;
- applicare un interesse espresso come percentuale.

Modificare il comportamento del prelievo introducendo una gestione delle eccezioni: se l'importo richiesto è superiore al saldo disponibile, il metodo deve segnalare l'errore attraverso un'eccezione.

Realizzare inoltre una seconda versione della classe che estenda `BankAccount` e introduca un metodo specifico per eseguire un prelievo con controllo.

Scrivere un programma di test che verifichi sia le operazioni corrette sia almeno un tentativo di prelievo non consentito, gestendo opportunamente l'eccezione.

L'obiettivo è esercitarsi con:
- ereditarietà;
- overriding;
- `throws`, `try` e `catch`;
- progettazione di classi robuste rispetto agli input non validi.
