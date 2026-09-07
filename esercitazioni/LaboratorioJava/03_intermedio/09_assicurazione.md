# Esercitazione 9 – Archivio di un'assicurazione

Un'assicurazione vuole realizzare un archivio elettronico per gestire clienti e automobili.

Definire una classe `Cliente`, identificata dal nominativo, e una classe `Automobile`, identificata dal numero di targa e associata al proprio proprietario.

Definire una classe `Archivio` che gestisca l'insieme dei clienti e delle automobili.

L'archivio deve permettere di:
- aggiungere un cliente;
- aggiungere un'automobile specificando targa e proprietario;
- ottenere l'elenco delle targhe appartenenti a un determinato cliente;
- dato un numero di targa, ottenere il proprietario;
- eliminare un'automobile;
- eliminare un cliente rimuovendo anche le sue automobili;
- contare quante automobili possiede un determinato cliente;
- individuare il cliente che possiede il maggior numero di automobili.

Non devono essere presenti due clienti con lo stesso nome né due automobili con la stessa targa.

Realizzare un programma di prova che eserciti tutte le funzionalità e gestisca correttamente le richieste relative a elementi inesistenti.

Utilizzare collezioni dinamiche e riferimenti tra oggetti, mantenendo separata la responsabilità delle diverse classi.
