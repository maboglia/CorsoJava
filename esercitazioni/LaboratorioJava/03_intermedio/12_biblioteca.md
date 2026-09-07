# Esercitazione 12 – Gestione di una biblioteca

Realizzare in Java un'applicazione per la gestione di una biblioteca.

La biblioteca deve gestire:
- gli autori;
- i libri;
- le persone che prendono libri in prestito.

Definire le classi necessarie per rappresentare:
- `Autore`;
- `Libro`;
- `Persona`;
- un prestito che colleghi una persona a un libro.

La biblioteca deve offrire un menu con almeno le seguenti operazioni:
1. inserire un nuovo libro nel catalogo, specificando autore e titolo;
2. registrare il prestito di un libro a una persona;
3. registrare la restituzione di un libro;
4. visualizzare la situazione dei prestiti;
5. terminare il programma.

Un libro non può essere dato in prestito se è già in prestito. La restituzione deve essere possibile solo per un prestito effettivamente registrato.

Organizzare i dati utilizzando collezioni dinamiche e mantenere coerenti i riferimenti tra libri, autori, persone e prestiti.

Gestire correttamente i casi di autore, libro o persona inesistenti e impedire la creazione di duplicati.

Prestare particolare attenzione alla progettazione delle relazioni tra gli oggetti e all'implementazione di `equals()` quando necessaria per effettuare ricerche nelle collezioni.
