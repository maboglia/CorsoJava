# Esercitazione 5 – Agenda degli impegni

Realizzare in Java una semplice agenda giornaliera.

Definire una classe `Impegno` che rappresenti un appuntamento con:
- argomento;
- luogo;
- priorità.

Definire una classe `Agenda` che permetta di memorizzare un impegno per ciascuna ora compresa tra le 8:00 e le 17:00.

Implementare almeno i metodi:
- `definisci(...)`, per inserire o sostituire un impegno a una determinata ora;
- `visualizza(...)`, per ottenere la descrizione dell'impegno associato a un'ora.

Se non è stato fissato alcun impegno, la visualizzazione deve restituire una stringa vuota o un messaggio appropriato.

Realizzare un programma di prova che:
1. crei un'agenda;
2. inserisca diversi impegni;
3. visualizzi alcuni orari occupati;
4. verifichi il comportamento degli orari liberi;
5. verifichi la sostituzione di un impegno già presente.

Prestare attenzione alla conversione tra l'orario reale e l'indice dell'array e alla gestione dei valori non validi.
