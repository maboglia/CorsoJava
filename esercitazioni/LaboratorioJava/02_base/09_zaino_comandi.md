# Esercitazione 9 — Gestione interattiva dello zaino

Partendo dall'esercitazione dello zaino, realizzare una versione **interattiva da console**.

Lo zaino deve contenere una collezione di oggetti e avere una capacità massima espressa in termini di volume.

Il programma deve mostrare un ciclo di comandi che permetta all'utente di:
- `elenca` — visualizzare il contenuto;
- `metti` — inserire un nuovo oggetto specificandone nome, descrizione e volume;
- `prendi` — rimuovere un oggetto indicando la posizione;
- `volume` — visualizzare il volume occupato e quello ancora disponibile;
- `q` — terminare il programma.

Ogni operazione deve utilizzare i metodi della classe `Zaino`: il programma principale non deve modificare direttamente la collezione interna.

Gestire gli errori più comuni, ad esempio:
- inserimento di un oggetto troppo grande;
- posizione inesistente;
- comando non riconosciuto;
- valori numerici non validi.

L'obiettivo è realizzare una piccola applicazione completa che faccia collaborare **più classi, collezioni, metodi e input da console**.
