# Negozio alimentari

Realizzare il sistema software per la gestione di *un negozio di generi alimentari.*

Il sistema deve gestire:


### Gli inventari

 La Classe 
 
 *	CassaNegozio contiene tutte le funzionalità.
 
 E' possibile definire l'inventario (elencando tutti i
 tipi di __prodotto__) ed aggiungere nuovi prodotti
 attraverso il metodo __aggiungiProdotto()__. Un *prodotto* è
 caratterizzato da un codice univoco, da una descrizione
 e dal prezzo lordo di vendita. Per esempio:
 
Codice|Descrizione|Prezzo
---|---|---
C00001|Pasta Barilla|0.7
C00002|Latte TappoRosso|1.65
C00003|Caffe' Lavazza|2.5
C00004|Caffe' Illy|2.0
C00005|Biscotti Cioccolato|2.0
C00006|Vino Rosso|2.0



### Gli sconti

E' possibile stabilire un prezzo promozionale (sconto)
per un particolare __prodotto__. 
Per semplicità si assuma  che è possibile avere un solo __prodotto__ in promozione
per volta. 
 
Per attivare la promozione si utilizza il
metodo __promozione()__ che riceve come parametri il codice
del __prodotto__ da promuovere e un intero che indica la
percentuale di sconto da applicare (e.g., il numero
intero 20 indica uno sconto del 20%). Per disabilitare
la promozione si passa al metodo il codice di un __prodotto__
inesistente.


### I prodotti venduti
 
Ogni volta che viene letto il codice di un __prodotto__, la
cassa accede ad un listino di prodotti e recupera il
prezzo e la descrizione del __prodotto__. Il metodo __leggi(),__
restituisce informazioni sul pezzo acquistato.

E' possibile, in qualsiasi momento, ottenere l'importo
totale al lordo delle tasse attraverso il metodo
__totale().__ E' inoltre possibile ottenere l'importo totale
netto e l'ammontare dell'IVA attraverso i metodi __netto()__
e __tasse().__ Il metodo __stampa()__ permette di stampare a
video l'elenco degli articoli venduti; la lista è
ordinata lessicograficamente. Il metodo __chiude()__ conclude
la registrazione dei prodotti venduti.