# Classi Astratte

### Un metodo astratto è un metodo di cui
non viene specificata l'implementazione

### Una classe astratta è una classe avente **almeno un metodo astratto**


```java
abstract class Forma {
...
abstract void stampa();
...
}
```

## Uso delle Classi Astratte

### Una classe astratta
* È una classe non completamente definita
* Non può essere istanziata

### Per ottenere una classe concreta (istanziabile) da una astratta occorre definire tutte le implementazioni mancanti ovvero
* Ereditare la classe facendo l'overriding di tutti i metodi astratti

### Permette di trattare omogeneamente oggetti con caratteristiche diverse (tramite upcasting)

Man mano che si sale nella gerarchia dell'ereditarietà, le
classi diventano sempre più generiche e probabilmente
più astratte.

Ad un certo punto la classe superiore diventa a tal punto
generica che la si può pensare come una base per le altre
classi piuttosto che come una classe di cui creare un
oggetto.

### METODO ASTRATTO:

Voglio obbligare tutte le sottoclassi di una classe A ad avere
un metodo nomeMetodo ( ) ma allo stesso tempo non voglio
implementare tale metodo nella classe A.

SINTASSI:

`public abstract int nomeMetodo( ) ;`

UN METODO ASTRATTO
DEVE ESSERE OBBLIGATORIAMENTE
PUBBLICO, ALTRIMENTI NON AVREBBE
SENSO

LASCIO IL METODO INDEFINITO.
INFATTI NON APRO IL RELATIVO
BLOCCO CON LE PARENTESI
GRAFFE ED IL CODICE DEL
METODO.

Una classe, avente anche un solo metodo astratto, deve essere
dichiarata anch'essa astratta.

Le Classi Astratte, oltre ad avere Metodi Astratti, possono avere
tranquillamente metodi ed attributi normali.

ATTENZIONE: se però una classe è astratta, non posso
istanziarla. Ovvero NON POSSO CREARE OGGETTI DI
UNA CLASSE ASTRATTA

Motivazioni
Che senso ha definire dei metodi astratti e di conseguenza
rendere una classe astratta?

Definisco un metodo astratto quando voglio forzare tutte
le sottoclassi ad avere un determinato metodo.

I metodi astratti funzionano come segnaposto dei metodi
implementati poi nella sottoclasse.

le sottoclassi
Cosa accade ad una sottoclasse che estende una classe
astratta?

Se la sottoclasse a sua volta non definisce 1 o più metodi
che la superclasse aveva astratti, anche la sottoclasse
deve essere dichiarata astratta.

Altrimenti la sottoclasse deve implementare tutti i metodi
che la superclasse aveva astratti.