# Negozio alimentari

Realizzare il sistema software per la gestione di *un negozio di generi alimentari.*

Il sistema deve gestire:

### Gli inventari
 La Classe 
 *	CassaNegozio contiene tutte le funzionalità.
 
 E' possibile definire l'inventario (elencando tutti i
 tipi di __Articolo__) ed aggiungere nuovi Articoli
 attraverso il __metodo__ __aggiungiArticolo()__. Un *Articolo* è
 caratterizzato da un codice univoco, da una descrizione
 e dal prezzo lordo di vendita. Per esempio:
 
Codice|Descrizione|Prezzo
---|---|---
00001|Pasta Barilla|0.7
00002|Latte TappoRosso|1.65
00003|Caffe' Latazza|2.5
00004|Caffe' Illy|2.0
00005|Biscotti Cioccolato|2.0
C00006|Vino Rosso|2.0

### Gli sconti
 E' possibile stabilire un prezzo promozionale (sconto)
 per un particolare __Articolo__. 
 Per semplicità si assuma  che è possibile avere un solo __Articolo__ in promozione
 per volta. 
 
 Per attivare la promozione si utilizza il
 __metodo__ __promozione()__ che riceve come parametri il codice
 del __Articolo__ da promuovere e un intero che indica la
 percentuale di sconto da applicare (e.g., il numero
 intero 20 indica uno sconto del 20%). Per disabilitare
 la promozione si passa al __metodo__ il codice di un __Articolo__
 inesistente.

### I Articoli venduti
 
 Ogni volta che viene letto il codice di un __Articolo__, la
 cassa accede ad un listino di Articoli e recupera il
 prezzo e la descrizione del __Articolo__. Il __metodo__ __leggi(),__
 restituisce informazioni sul pezzo acquistato.
 
 E' possibile, in qualsiasi momento, ottenere l'importo
 totale al lordo delle tasse attraverso il __metodo__
 __totale().__ E' inoltre possibile ottenere l'importo totale
 netto e l'ammontare dell'IVA attraverso i metodi __netto()__
 e __tasse().__ Il __metodo__ __stampa()__ permette di stampare a
 video l'elenco degli articoli venduti; la lista è
 ordinata lessicograficamente. Il __metodo__ __chiude()__ conclude
 la registrazione dei Articoli venduti.