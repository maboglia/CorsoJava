# I membri di OutputStream.

## Metodi pubblici:

metodo|descrizione
---|---
void close()|Chiude lo stream.
void flush()|Scrive il buffer nello stream.
void write(int b)|Scrive un byte nel buffer o	nello stream.
void write(byte[] b)|Scrive tutti i byte di b nel buffer o nello stream.
void write(byte[] b, int off, int len)|Scrive len byte nel buffer o nello stream, prelevandoli dall'array b a partire dalla posizione off.
