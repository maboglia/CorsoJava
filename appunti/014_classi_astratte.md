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