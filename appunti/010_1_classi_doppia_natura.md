# Tipologie di classi

* All'interno della libreria standard, le classi possono essere suddivise principalmente in **due categorie**:
  * Classi `istanziabili`
  * Classi non `istanziabili`
* Questa stessa distinzione si applica alle nostre classi.
* La separazione tra classi `istanziabili` e non `istanziabili` riflette il significato logico del loro utilizzo.
* Il termine "classe non `istanziabile`" sarà utilizzato per indicare una classe che non dovrebbe essere istanziata, in base alle sue caratteristiche.
---

## Non ci sono solo oggetti

* Tecnicamente, è possibile utilizzare l'operatore `new` su classi "non `istanziabili`" (composte solo da metodi e attributi statici), ma ciò non avrebbe senso pratico.
* Alcune classi, come quelle astratte, non consentono l'utilizzo dell'operatore `new`.
* La stragrande maggioranza delle classi è `istanziabile`, ma la presenza di alcune classi non `istanziabili` è necessaria.
* La classe (essenziale) che contiene il metodo `main` è normalmente non `istanziabile`.
* Poiché i numeri non sono oggetti, i metodi numerici appartengono a classi non `istanziabili`.

---

## Classi `istanziabili`

* Una classe `istanziabile` fornisce il prototipo di una famiglia di **oggetti** (istanze della classe) che condividono una **struttura simile**, ma hanno **proprietà distinte** a livello individuale (valori diversi degli attributi e, di conseguenza, risultati differenti prodotti dai metodi).
* L'uso tipico è la **creazione** di istanze (tramite `new`) e quindi l'**invocazione di metodi** su di esse.
* Nel caso di una classe `istanziabile`, attributi e metodi rappresentano proprietà possedute da tutti gli oggetti istanza della classe.
* Ogni oggetto istanza di una classe **possiede la sua identità** e "contiene" individualmente gli attributi e i metodi definiti nella classe.
* Ogni volta che si crea un'istanza con **`new`**, si genera un nuovo insieme di attributi e metodi individuali.

---

## Classi `istanziabili` II

* In una classe non `istanziabile`, attributi e metodi sono condivisi a livello della classe, senza istanze distinte che li differenziano.
* Una classe `istanziabile` rappresenta un concetto che esiste in molteplici versioni individuali, con una struttura comune ma ciascuna con una propria identità:
  * Ad esempio, ci sono molte sequenze di caratteri (la classe `String` è `istanziabile`).
  * Esistono diverse valute (la classe `Valuta` è `istanziabile`).
  * Ci sono molte persone (ipoteticamente, una classe `Persona` è `istanziabile`).

---


## una classe `istanziabile`

* Di solito, una classe `istanziabile` **dispone di costruttori**.
* Gli attributi e i metodi sono tutti (o quasi tutti) **non statici**.
* Quando penso all'esecuzione dei suoi metodi, devo immaginare un'istanza individuale a cui applicarli, anche senza argomenti esterni, poiché utilizzano attributi interni.
* Nel caso di classi `istanziabili`, attributi e metodi sono definiti a livello di istanza.
* Nel caso di classi non `istanziabili`, attributi e metodi sono definiti a livello di classe.

---

## Classi non `istanziabili`

* Una classe non `istanziabile` contiene un insieme di metodi (e eventualmente attributi) di natura generale, non legati alle proprietà di oggetti individuali specifici.
* La nozione di istanza della classe non ha senso in questo contesto poiché **non ci sono caratteristiche differenziabili** tra oggetti distinti.
* Una classe non `istanziabile` rappresenta un concetto concettualmente unico, che non esiste e non può esistere in versioni separate, ognuna con una propria identità:
  * Ad esempio, esiste una sola matematica (la classe `Math` non è `istanziabile`).
  * Esiste un unico sistema su cui un programma è eseguito (la classe `System` non è `istanziabile`).
  * Esiste un solo punto di inizio per un programma (le classi contenenti il metodo `main` non sono `istanziabili`).

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

---

**Titolo: Esplorando la Dualità delle Classi Istanziabili: Statiche e Dinamiche**

Le classi istanziabili svolgono un ruolo fondamentale nella programmazione orientata agli oggetti, rappresentando concetti che possono esistere in molteplici versioni individuali. Tuttavia, in alcuni casi, queste classi mostrano una dualità intrigante, incorporando sia aspetti statici che dinamici.

---

**Ibridi: Classi Istanziabili con Natura Statica e Dinamica**

Un esempio comune di questa dualità si trova in classi come `String` della libreria standard di Java. Sebbene siano classificate come istanziabili, contengono attributi o metodi statici, creando una sorta di ibridismo nella loro natura.

È come se queste classi avessero due sottoparti distintive: una statica e una dinamica, ciascuna operante secondo le proprie regole. La parte dinamica rappresenta le istanze specifiche di quella classe, ciascuna con la propria identità e dati unici. D'altra parte, la parte statica è condivisa tra tutte le istanze e può essere utilizzata senza dover istanziare un oggetto specifico.

---

**Consigli sulla Creazione di Classi Ibride**

Sebbene questa dualità possa sembrare interessante, è importante notare che, in generale, la creazione di classi istanziabili ibride è sconsigliata, salvo rari casi. Mentre l'uso di attributi costanti definiti come statici può essere accettabile, combinare aspetti statici e dinamici all'interno di una stessa classe può complicare la progettazione e la comprensione del codice.

Le classi istanziabili sono progettate per rappresentare concetti che esistono in molteplici forme, ciascuna con le proprie caratteristiche dinamiche. Introdurre elementi statici in questo contesto può portare a una confusione concettuale e potenziali problemi di manutenzione del codice.

---

In conclusione, mentre alcune classi istanziabili possono sfidare le convenzioni includendo elementi statici, è essenziale valutare attentamente la necessità di questa dualità nella progettazione del software. In genere, è consigliabile mantenere la distinzione tra classi istanziabili e non istanziabili, preservando la chiarezza e la coerenza nella struttura del codice.

[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)