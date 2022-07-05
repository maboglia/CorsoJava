# Esercizi Java sui file

## Esercizio 1
Scrivere un programma Java per la gestione di un
archivio di persone e animali. Definire, in
particolare, la seguente gerarchia:
- Essere vivente (con attributo eta')
  - Animale (con nome)
  - Persona (con cognome, nome)
    - Studente (con matricola)
    - Lavoratore (con lavoro e stipendio)
  
## Esercizio 2
Scrivere un programma che visualizzi il contenuto
di un file.

## Esercizio 3
Scrivere un programma che copi, byte dopo byte, un
file in un altro file.

## Esercizio 4
Scrivere un programma che crei un file di tipi
primitivi.

## Esercizio 5
Scrivere un programma che crei un file tmp, vi
scriva i caratteri "abcdef" e poi acceda a tmp
utilizzando un'istanza di RandomAccessFile, il
metodo seek() e il metodo readByte() per leggere
un byte alla volta.

## Esercizio 6 Archivio studenti

Alla fine dell’anno scolastico, il Preside desidera archiviare in una file gli esiti di fine anno degli
studenti della sua scuola. I dati da archiviare, per ogni studente sono:
cognome studente
nome studente
classe
esito di fine anno: “P” per indicare che lo studente è stato promosso e “B” per indicare che lo studente è stato bocciato.

Scrivere i seguenti programmi:

1. Registrazione dei dati in un file sequenziale.

2. Leggendo tutti i record del file, visualizzare i dati immessi per gli studenti promossi, il numero di studenti promossi e non promossi e le rispettive percentuali sul numero totale di studenti.