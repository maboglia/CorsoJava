# Esercitazione 11 – Dizionario italiano-inglese con file

Realizzare in Java un programma che gestisca un dizionario italiano-inglese memorizzato su file.

Il file `dizionario.txt` deve contenere una parola italiana per riga, seguita dalle relative traduzioni inglesi. Ogni parola può avere una o più traduzioni.

Utilizzare il seguente formato:

`parola_italiana; traduzione_inglese_1 traduzione_inglese_2 ...`

Ad esempio:

`ciao; hello hi`

Il programma deve permettere all'utente di:
1. caricare il dizionario dal file;
2. inserire una nuova parola con una o più traduzioni;
3. cercare una parola italiana e visualizzarne tutte le traduzioni;
4. gestire il caso in cui la parola non sia presente;
5. salvare sul file le modifiche effettuate.

Il programma deve essere organizzato utilizzando classi separate per rappresentare una parola e per gestire il dizionario.

Gestire correttamente la lettura e la scrittura del file, la suddivisione delle righe nei diversi campi e la presenza di più traduzioni.

Come estensione, permettere di modificare o eliminare una parola già presente.
