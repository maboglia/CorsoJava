# Esercitazione 8 — Lo zaino

Realizzare un'applicazione per simulare il contenuto di uno zaino.

Creare una classe `Oggetto` con:
- nome;
- descrizione;
- volume occupato.

Creare una classe `Zaino` con:
- marca;
- colore;
- volume massimo disponibile;
- elenco degli oggetti contenuti.

Lo zaino deve permettere di:
- inserire un oggetto solo se il volume disponibile è sufficiente;
- rimuovere un oggetto indicando la sua posizione;
- elencare gli oggetti presenti;
- calcolare il volume complessivamente occupato.

Utilizzare una `ArrayList<Oggetto>`.

Nel programma principale creare uno zaino, inserire diversi oggetti, tentare di inserire anche un oggetto che supera la capacità disponibile, visualizzare il contenuto e rimuovere un oggetto.

Gestire in modo appropriato anche l'inserimento e la rimozione da una posizione non valida.
