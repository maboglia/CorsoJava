# Il modificatore static

* La parola riservata `static` viene usata per indicare il livello di definizione di un **attributo o metodo**
* Se la parola `static` è presente l’attributo o metodo è definito **a livello di classe**
* Se la parola `static` **non** è presente l’attributo o metodo è definito **a livello di istanza** (esemplare della classe)

## Static vs. non static

* Ogni attributo o metodo non static esiste concretamente **in ogni istanza creata**
* Esiste in “molteplici versioni” se vengono create più istanze
* **Non esiste** concretamente **se il programma non crea almeno un’istanza** (tramite operatore new)

* Ogni attributo o metodo static esiste concretamente a livello di classe
* Esiste in un’unica versione
* La sua esistenza non dipende da cosa fa il programma

---

## Accesso a metodi e attributi static
* Essendo definiti a livello di classe, attributi e metodi static sono acceduti/invocati tramite il nome della classe:
* `Math.sqrt (2);`
* `String.valueOf ( Math .PI);`
* In caso di classe istanziabile ibrida si può accedere tramite una qualunque istanza della classe, ma è meglio non farlo.
* Nel corpo di un metodo `static` non si può accedere ad attributi e metodi non `static` della stessa classe
* Il metodo `static` deve poter essere invocato a livello di classe (anche in assenza di istanze) mentre attributi e metodi non `static` esistono solo se c’è almeno un’istanza
* Se nel corpo di un metodo appare il nome di un metodo o attributo `static` della sua classe è sottinteso che sia preceduto dal nome della classe stessa
* Eventuali mescolanze improprie di `static` e non `static` causano errori di compilazione

---

## Accesso a metodi e attributi non static
* La sintassi è simile al caso precedente, ma ovviamente l’accesso/invocazione è possibile solo tramite un’istanza specifica (ed ogni accesso è diversificato): 
* Nel corpo di un metodo non `static` si può accedere a qualunque attributo e metodo della stessa classe
* All'interno del corpo di un metodo si possono riferire in modo abbreviato attributi e metodi definiti nella stessa classe
* Se nel corpo di un metodo non `static` appare il nome di un metodo o attributo non `static` della sua classe è sottinteso che sia riferito all’istanza su cui è stato invocato il metodo

