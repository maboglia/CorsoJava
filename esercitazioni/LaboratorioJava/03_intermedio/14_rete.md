# Esercitazione 14 – Analisi del traffico di rete

Sia dato un file `traffico.txt` contenente la traccia dei dati scambiati su una rete locale.

Ogni riga contiene:

`ip_addr nbytes`

dove `ip_addr` è un indirizzo IPv4 nella forma `x.x.x.x` e `nbytes` è il numero di byte contenuti nel pacchetto.

Lo stesso nodo può comparire più volte nel file e la dimensione del file non è nota a priori.

Un secondo file, `indirizzi.txt`, contiene l'associazione tra indirizzi IP e nomi dei nodi:

`ip_addr nome`

Il numero di righe di questo secondo file è sufficientemente piccolo da poter essere caricato interamente in memoria.

Realizzare un programma Java che:
1. legga la tabella degli indirizzi;
2. legga il file del traffico;
3. sommi tutti i byte trasmessi da ciascun indirizzo IP;
4. associ ogni indirizzo al nome del nodo;
5. visualizzi per ogni nodo indirizzo IP, nome e totale dei byte trasmessi.

Gestire anche il caso in cui nel traffico compaia un indirizzo non presente nella tabella degli indirizzi.

Il programma deve essere progettato in modo da poter elaborare file di traffico molto grandi senza caricarli interamente in memoria.

Prestare attenzione all'uso di mappe (`Map`), alla lettura sequenziale dei file e alla gestione dei dati numerici.
