# Ereditarietà in Java

## Riutilizzare il codice

* Uno dei grandi vantaggi della programmazione a oggetti è la facilità nel riutilizzare il codice

* In Java si realizza attraverso l’ereditarietà

* Per esempio immaginiamo di disporre di un sistema di georeferenziazione in cui la classe principale è

```Geopunto {attributi: longitudine, latitudine}```

* Dobbiamo modificare il sistema per aggiungere un nuovo attributo, l’altitudine

a) Modifichiamo direttamente la classe Geopunto Errore

b) Creiamo una nuova classe che erediti da Geopunto:

```NuovoGeopunto {Geopunto + attributo: altitudine}```

### Estendere la classe

### Quando utilizzare l’ereditarietà

* Per modificare classi già esistenti

* In un ambiente di sviluppo reale disponiamo di centinaia di classi. Per esempio la classe Button che rappresenta un bottone

* Immagina di dover creare un nuovo tipo di bottone che riproduca un suono quando viene schiacciato

* Con l’ereditarietà risulta molto semplice

* Per non dover riprogrammare due volte lo stesso codice

* Devi creare varie classi, p.es Cliente, Venditore, Distributore

* Esiste una parte del codice comune a tutte quante, p.es Piva, indirizzo, SpedireLettera()

* Crei una classe addizionale che raccolga il codice comune, es ParteCommerciale da cui ereditino le parti comuni

