# Biglietteria teatro

L’applicazione da progettare riguarda la gestione della vendita di biglietti in un teatro. 

## spettacolo

Ogni spettacolo che si svolge nel teatro è caratterizzato da:

* titolo (una stringa), 
* nome del regista (una stringa) e 
* nome degli attori che vi recitano (un array non vuoto di stringhe)

## replica

Per uno spettacolo si prevedono un certo numero di repliche (almeno una), di cui interessa la data e l’ora in cui si svolgono. 

## posto

Dei posti del teatro interessa conoscere la fila, il numero ed il tipo (platea, palco, galleria, ecc.). 

__Alcuni posti sono adatti ad accogliere disabili.__

## biglietto

Il costo del biglietto riferito ad un posto (un reale positivo) è stabilito in base al tipo di posto ed allo spettacolo 
(ad esempio, per lo spettacolo __“Cats”__, il costo dei posti di platea è di 50 euro). 

## Prenotazione 

Di una prenotazione p interessa il nome del cliente (una stringa) che l’ha effettuata, la data in cui è stata effettuata, la replica dello spettacolo a cui p si riferisce, ed i posti (almeno uno) che sono prenotati tramite p. 

Inoltre, se p prenota anche posti per disabili, interessa conoscere il tipo di disabilità (una stringa) di colui per cui è prenotato il posto. 

Si noti che data una prenotazione è di interesse conoscere i posti per disabili eventualmente prenotati (con annesse disabilità indicate per i vari posti prenotati).

## Addetto biglietteria

L’addetto alla biglietteria del teatro è interessato ad effettuare alcuni controlli. 

In particolare:

* dato uno spettacolo s ed una tipologia di posto t, 
  * restituire il costo associato alla tipologia t per lo spettacolo s, 
  * se questo costo è specificato ed è unico. 
  * Restituire −1 in caso contrario (questo segnala una situazione di errore);

* dato un insieme I di posti ed una replica r, 
  * restituire l’insieme dei posti in I che sono disponibili per r 
  * (cioè i posti contenuti in I che non risultano prenotati per r).
