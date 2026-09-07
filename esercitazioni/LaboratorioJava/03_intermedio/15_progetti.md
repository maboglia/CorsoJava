# Esercitazione 15 – Gestione dei progetti di una software house

Realizzare in Java un programma per la gestione dei progetti software di una software house.

Il programma deve leggere da tre file di testo le seguenti informazioni:

- `progetti.txt`: elenco dei progetti, con sigla e descrizione;
- `persone.txt`: elenco dei programmatori, con numero impiegato, cognome e nome;
- `relazioni.txt`: associazioni tra progetti e programmatori, con il numero di ore lavorate.

Formati:

`<sigla progetto> <descrizione>`

`<numero impiegato> <cognome> <nome>`

`<sigla progetto> <numero impiegato> <ore lavorate>`

Ogni progetto può avere uno o più programmatori e ogni programmatore può partecipare a uno o più progetti.

Dopo aver caricato i dati, il programma deve permettere di effettuare almeno due tipi di interrogazione.

Data la sigla di un progetto, visualizzare:
- descrizione del progetto;
- elenco dei programmatori coinvolti;
- ore lavorate da ciascun programmatore;
- totale delle ore lavorate sul progetto.

Dato il numero di matricola di un programmatore, visualizzare:
- nome e cognome;
- elenco dei progetti a cui ha partecipato;
- ore lavorate su ciascun progetto;
- totale delle ore lavorate.

Gestire dati mancanti o riferimenti a progetti o programmatori inesistenti.

Progettare opportunamente le classi e le strutture dati in memoria, evitando di effettuare inutilmente nuove scansioni dei file per ogni interrogazione.

Come estensione, aggiungere la possibilità di individuare il progetto con il maggior numero di ore lavorate e il programmatore che ha lavorato complessivamente più ore.
