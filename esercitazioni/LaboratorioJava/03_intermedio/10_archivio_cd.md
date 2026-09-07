# Esercitazione 10 – Archivio di CD e brani musicali

Realizzare in Java un'applicazione per la gestione di una collezione di CD musicali.

Definire una classe `Brano` con:
- titolo;
- durata.

Definire una classe `CD` con:
- titolo;
- autore;
- elenco dei brani.

Definire una classe `ArchivioCD` che contenga una collezione dinamica di CD.

L'applicazione deve permettere di:
1. inserire un nuovo CD;
2. aggiungere brani a un CD;
3. visualizzare l'intero archivio;
4. cercare un CD per titolo;
5. calcolare, per un CD, la durata complessiva dei brani;
6. impedire l'inserimento di CD duplicati;
7. gestire correttamente un archivio vuoto.

Realizzare un'interfaccia testuale da console per permettere all'utente di utilizzare le funzionalità.

Utilizzare `ArrayList` o un'altra collezione dinamica e ridefinire `toString()` dove utile per ottenere una rappresentazione leggibile degli oggetti.

Prestare attenzione alla relazione tra un CD e i suoi brani e alla separazione delle responsabilità tra le classi.
