# Reader e Writer

Gli stream di tipo più basilare non tengono conto del tipo dei
dati scambiati.

Semplicemente, trasportano i dati attraverso
il flusso, senza curarsi del loro effettivo contenuto. 

Perquesto, classi come InputStream e OutputStream sono idonee
alla gestione di sequenze binarie (immagini, audio, eseguibili, e cosè via). 

Per la gestione dei flussi di testo, è meglio servirsi di classi più specializzate. 

In questo modo, anzichè ragionare per byte, si potrè ragionare per caratteri e
per stringhe. 

Le classi astratte Reader e Writer sono l'equivalente di InputStream e OutputStream, nell'ambito dei
flussi di testo.

---

## I membri di Reader

Metodi pubblici|Descrizione
---|---
`void close()`|Chiude lo stream.
`void mark(int readlimit)`|Memorizza l'attuale posizione dello stream, in modo che poi sia possibile tornarci chiamando reset. Dopo readlimit caratteri letti, comunque, la posizione viene dimenticata.
`boolean markSupported()`|Restituisce true se lo stream corrente supporta la funzionalitè offerta da `mark()` e reset().
`int read()`|Legge un carattere dallo stream, e lo restituisce come valore int. Restituisce -1 se lo stream ha raggiunto il termine.
`int read(char[] c)`|Come read(c, 0, c.length).
`int read(char[] c, int off,int len)`|Legge len caratteri dallo	stream, salvandoli nell'array c, a partire dalla posizione off. Restituisce il numero di caratteri effettivamente letti, o -1 se la fine dello stream è stata raggiunta.
`void reset()`|Torna al punto raggiunto nello stream nell'ultima volta che è stato chiamato `mark()`.
long skip(long n)|Avanza di n caratteri nello stream, senza leggerli. Restituisce il numero dei caratteri effettivamente saltati.

---				

## I membri di Writer

Metodi pubblici|Descrizione
---|---
`void close()`|Chiude lo stream.
`void flush()`|Scrive il buffer nello stream.
`void writer(int c)`|Scrive un carattere nel buffer o nello stream.
`void write(char[] c)`|Scrive tutti i caratteri di c nel buffer o nello stream.
`void write(byte[] c, int off, int len)`|Scrive len caratteri nel buffer o nello stream, prelevandoli dall'array c a partire dalla posizione off.
`void write(String str)`|Scrive tutti i caratteri della stringa str nel buffer o nello stream.
`void write(String srt, int off, int len)`| Scrive len caratteri nel buffer o nello stream, prelevandoli dalla stringa str a partire dalla posizione off.
