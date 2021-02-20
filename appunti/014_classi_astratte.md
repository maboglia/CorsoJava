# Classi Astratte

### Una classe astratta è una classe avente **almeno un metodo astratto**


```java
abstract class Forma {
...
abstract void stampa();
...
}
```

Un metodo astratto è un metodo di cui non viene specificata l'implementazione

---

### Una classe astratta

* È una classe non completamente definita
* Non può essere istanziata

Per ottenere una classe concreta (istanziabile) da una astratta occorre definire tutte le implementazioni mancanti ovvero

* Ereditare la classe facendo l'overriding di tutti i metodi astratti

---

### Permette di trattare omogeneamente oggetti con caratteristiche diverse

Man mano che si sale nella gerarchia dell'ereditarietà, le
classi diventano sempre più generiche e probabilmente
più astratte.

Ad un certo punto la classe superiore diventa a tal punto
generica che la si può pensare come una base per le altre
classi piuttosto che come una classe di cui creare un
oggetto.

---


### METODO ASTRATTO

Voglio obbligare tutte le sottoclassi di una classe A ad avere
un metodo ```nomeMetodo()``` ma allo stesso tempo non voglio
implementare tale metodo nella classe A.

**SINTASSI:**

`public abstract int nomeMetodo( ) ;`

* un metodo astratto deve essere obbligatoriamente pubblico,  altrimenti non avrebbe senso
* lascio il metodo indefinito. infatti non apro il relativo blocco con le parentesi graffe ed il codice del metodo.

---

Le Classi Astratte, oltre ad avere Metodi Astratti, possono avere
 metodi ed attributi *normali*.

Se una classe è astratta, non posso istanziarla.

**NON POSSO CREARE OGGETTI DI UNA CLASSE ASTRATTA**

---

Che senso ha definire dei metodi astratti e di conseguenza rendere una classe astratta?

Definisco un metodo astratto quando voglio forzare tutte le sottoclassi ad avere un determinato metodo.

I metodi astratti funzionano come segnaposto dei metodi implementati poi nella sottoclasse.

---

**le sottoclassi**

La sottoclasse deve implementare tutti i metodi che la superclasse aveva astratti.

Se la sottoclasse a sua volta non definisce i metodi che la superclasse aveva dichiarato astratti, anche la sottoclasse deve essere dichiarata astratta.
