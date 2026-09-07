# Esercitazione 2 – Conto corrente

Realizzare in Java una classe `ContoCorrente` per rappresentare un conto bancario.

Ogni conto deve avere:
- il nome del titolare;
- un numero di conto assegnato automaticamente;
- il saldo;
- un tasso di interesse.

Il numero di conto deve essere generato automaticamente utilizzando un contatore `static`, in modo che ogni nuovo conto riceva un numero diverso.

Prevedere due costruttori:
- uno che crea un conto con saldo iniziale pari a zero;
- uno che permette di specificare il saldo iniziale.

Implementare i metodi necessari per:
- effettuare un versamento;
- effettuare un prelievo solo se il saldo disponibile è sufficiente;
- leggere il saldo;
- modificare il tasso di interesse;
- ottenere i dati principali del conto attraverso `toString()`.

Nel programma di prova:
1. creare un conto;
2. versare 1000 euro;
3. prelevare 500 euro;
4. prelevare altri 400 euro;
5. visualizzare il saldo rimanente;
6. creare un secondo conto con un saldo iniziale;
7. applicare un interesse del 10% e visualizzare il risultato.

Utilizzare correttamente incapsulamento, costruttori, metodi di accesso e membri statici.
