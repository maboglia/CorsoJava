# Tipologie di classi

* Le classi disponibili nella libreria standard si possono distinguere in **due tipologie** principali:
  * Classi `istanziabili`
  * Classi non `istanziabili`
* La stessa distinzione è applicabile alle nostre classi
* La distinzione tra classi `istanziabili` e non `istanziabili` riguarda il senso logico del loro utilizzo
* Il termine "classe non `istanziabile` " sarà utilizzato per indicare una classe che non ha senso istanziare, date le sue caratteristiche

---

## Non ci sono solo oggetti

* Tecnicamente sarebbe possibile usare l'operatore new su classi "non `istanziabili` " (composte di metodi e attributi tutti static ) ma non avrebbe senso pratico
* Alcune classi (p.es. quelle astratte) non permettono l'uso dell'operatore new
* La stragrande maggioranza delle classi è `istanziabile` ma l'esistenza di alcune classi non `istanziabili` è necessaria
* La classe (indispensabile) che contiene il main è normalmente non `istanziabile`
* Poiché i numeri non sono oggetti, i metodi numerici appartengono a classi non `istanziabili`

---

## Classi `istanziabili`

* Una classe `istanziabile` fornisce il prototipo di una famiglia di oggetti (istanze della classe) che hanno struttura simile ma proprietà distinte a livello individuale (valori diversi degli attributi e quindi risultati diversi prodotti dai metodi)
* L'uso tipico è la costruzione di istanze (tramite new) e quindi l'invocazione di metodi su di esse
* Nel caso di una classe `istanziabile` attributi e metodi rappresentano proprietà possedute da tutti gli oggetti istanza della classe
* Ogni oggetto istanza di una classe ha una sua identità "contiene" individualmente gli attributi e i metodi definiti nella classe
* Ogni volta che si costruisce un'istanza con new si crea un nuovo insieme di attributi e metodi individuali

---

## Classi `istanziabili` II

* Nel caso di una classe non `istanziabile` attributi e metodi sono "unici" a livello della classe (non esistono istanze diversificate)
* Una classe `istanziabile` rappresenta "qualcosa" che esiste in molteplici versioni individuali che hanno una struttura comune ma ciascuna con una propria identità:
* esistono molte sequenze di caratteri (la classe String è `istanziabile` )
* esistono molte valute (la classe Valuta è `istanziabile` )
* esistono molte persone (un'ipotetica classe Persona è `istanziabile` )

---


## una classe `istanziabile`

* Normalmente **ha costruttori**
* Attributi e metodi sono tutti (o quasi) **non static**
* Quando penso all'esecuzione dei suoi metodi ho bisogno di immaginare un'istanza individuale a cui applicarli (anche senza argomenti esterni, perché usano attributi interni)
* Nel caso di classi `istanziabili` attributi e metodi sono definiti a livello di istanza
* Nel caso di classi non `istanziabili` attributi e metodi sono definiti a livello di classe

---

## Classi non `istanziabili`

* Una classe non `istanziabile` contiene un insieme di metodi (ed eventualmente attributi) di natura generale non legati alle proprietà di oggetti individuali specifici
* Non ha senso la nozione di istanza della classe poiché **non ci sono caratteristiche differenziabili** tra oggetti distinti
* Una classe non `istanziabile` rappresenta "qualcosa" di concettualmente unico, che non esiste e non può esistere in versioni separate ciascuna con una propria identità:
* esiste una sola matematica (la classe Math non è `istanziabile` )
* esiste un solo sistema su cui un programma è eseguito (la classe System non è `istanziabile` )
* esiste un solo punto di inizio di un programma (le classi contenenti il main non sono `istanziabili` )

---

## una classe non `istanziabile`

* Non ha costruttori
* Attributi e metodi sono tutti static
* I suoi metodi sono applicabili direttamente alla classe con almeno un argomento, non è necessaria un'istanza individuale

```java
Math . sqrt (2)
Math . abs ( - 3)

// In memoria ...
Math.E //2.7182
MATH.PI //3.1415

```

---

## Classi `istanziabili` “ibride”

* Alcune classi `istanziabili` (p.e. String ) della libreria standard contengono attributi o metodi static ed hanno quindi natura ibrida
* E’ come se la classe avesse due sottoparti (una static e una no) ognuna delle quali segue le proprie regole
* Salvo rari casi, è sconsigliabile realizzare classi `istanziabili` ibride (sono accettabili attributi costanti definiti come static).

[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)