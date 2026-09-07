# Esercitazione 4 — Il conto corrente

Realizzare una classe `ContoCorrente` per rappresentare un conto bancario.

Ogni conto deve avere:
- un numero di conto univoco;
- un saldo;
- eventualmente il nome del titolare.

Il numero di conto deve essere assegnato automaticamente alla creazione di ogni nuovo oggetto, utilizzando un contatore condiviso tra tutte le istanze.

Prevedere costruttori che permettano di:
- creare un conto vuoto;
- creare un conto con un saldo iniziale;
- creare un conto associato a un titolare.

Implementare i metodi:
- `versamento(...)`;
- `prelievo(...)`, che deve essere possibile solo se il saldo è sufficiente;
- un metodo per restituire le informazioni principali del conto.

Nel `main` creare diversi conti, effettuare versamenti e prelievi e verificare che i numeri assegnati siano differenti.
