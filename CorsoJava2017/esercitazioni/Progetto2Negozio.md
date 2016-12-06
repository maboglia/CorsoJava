##Esercitazione Progetto2
Realizzare il sistema software per la gestione di
 *un negozio di generi alimentari.*
 Il sistema deve gestire:

###1) Gli inventari
 La Classe 
 *	CassaNegozio contiene tutte le funzionalità.
 
 E' possibile definire l'inventario (elencando tutti i
 tipi di _prodotto_) ed aggiungere nuovi prodotti
 attraverso il _metodo_ *aggiungiProdotto*. Un *prodotto* è
 caratterizzato da un codice univoco, da una descrizione
 e dal prezzo lordo di vendita. Per esempio:
 
 Codice	Descrizione	Prezzo
 * C00001	Pasta Barilla	0.7
 * C00002	Latte TappoRosso	1.65
 * C00003	Caffe' Latazza	2.5
 * C00004	Caffe' Illy	2.0
 * C00005	Biscotti Cioccolato 2.0
 * C00006	Vino Rosso	2.0

###2) Gli sconti
 E' possibile stabilire un prezzo promozionale (sconto)
 per un particolare _prodotto_. 
 Per semplicità si assuma  che è possibile avere un solo _prodotto_ in promozione
 per volta. 
 
 Per attivare la promozione si utilizza il
 _metodo_ __promozione()__ che riceve come parametri il codice
 del _prodotto_ da promuovere e un intero che indica la
 percentuale di sconto da applicare (e.g., il numero
 intero 20 indica uno sconto del 20%). Per disabilitare
 la promozione si passa al _metodo_ il codice di un _prodotto_
 inesistente.

###3) I prodotti venduti
 
 Ogni volta che viene letto il codice di un _prodotto_, la
 cassa accede ad un listino di prodotti e recupera il
 prezzo e la descrizione del _prodotto_. Il _metodo_ __leggi(),__
 restituisce informazioni sul pezzo acquistato.
 
 E' possibile, in qualsiasi momento, ottenere l'importo
 totale al lordo delle tasse attraverso il _metodo_
 __totale().__ E' inoltre possibile ottenere l'importo totale
 netto e l'ammontare dell'IVA attraverso i metodi __netto()__
 e __tasse().__ Il _metodo_ __stampa()__ permette di stampare a
 video l'elenco degli articoli venduti; la lista è
 ordinata lessicograficamente. Il _metodo_ __chiude()__ conclude
 la registrazione dei prodotti venduti.