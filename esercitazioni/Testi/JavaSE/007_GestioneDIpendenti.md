# Gestione dipendenti

## Dipendente

Scrivere la classe **Dipendente** che ha i seguenti attributi 

* matricola: una stringa indicante il numero di matricola del dipendente, 
* stipendio: un numero con la virgola indicante lo stipendio base che possiede il dipendente, 
* straordinario: un numero con la virgola indicante l’importo dovuto per ciascuna ora di straordinario effettuata dal dipendente. 
* Il costruttore ha come parametri una stringa per la matricola, un numero con la virgola per lo stipendio ed un numero con la virgola per lo straordinario ed assegna opportunamente i valori dei parametri agli attributi.

* Scrivere il `metodo getStipendio` che restituisce il valore dell’attributo stipendio,
* scrivere inoltre il `metodo paga` che ha come parametro un numero intero indicante il numero di ore di straordinario effettuate dal dipendente, il metodo restituisce il valore ottenuto sommando all’attributo stipendio il risultato del prodotto tra il parametro del metodo e l’attributo straordinario. 
* Scrivere il `metodo stampa` che stampa il valore degli attributi della classe.

## DipendenteA

Scrivere la sottoclasse **DipendenteA** della classe **Dipendente** che ha in più
l’attributo **malattia**: un numero intero indicante i giorni di malattia presi che viene
inizializzato a zero. 

Aggiungere il `metodo prendiMalattia` che ha come parametro un numero intero indicante i giorni di malattia presi, il `metodo modifica` il valore dell’attributo malattia aggiungendogli il valore del parametro. 
Ridefinire il `metodo paga` in modo che prima definisce una variabile p a cui assegna il valore ottenuto richiamando il `metodo paga` della superclasse, poi se l’attributo malattia è uguale a zero il `metodo restituisce` il valore di p altrimenti restituisce il valore ottenuto sottraendo a p il valore del prodotto tra malattia e 15,0. 
Definire un `metodo stampaMalattia` che stampa il valore dell’attributo malattia.

---
## CalcolaStipendi

Scrivere la classe **CalcolaStipendi** che ha il `metodo main` in cui istanziare un oggetto
di tipo **Dipendente** con matricola 00309 stipendio 1000,00 e straordinario 7,50.
Richiamare il `metodo paga` con parametro pari a 10, stampare il valore dello
stipendio di tale oggetto richiamando getStipendio. Istanziare un altro oggetto di
tipo **DipendenteA** con matricola 00201 stipendio 1500,0 e straordinario 8,50.

Richiamare il `metodo prendiMalattia` con parametro pari a 5, richiamare il `metodopaga` con parametro pari a 3 ed il `metodo stampaMalattia`.
