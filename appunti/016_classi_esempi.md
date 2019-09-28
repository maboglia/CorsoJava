
## Definizione di una Classe

### Definizione
```java
class <nomeClasse) {
<campi>
<metodi>
}
```
### Esempi
* Classe contenente dati ma non azioni

```java
class DataOnly {
boolean b;
char c;
int i;
float f;
}
```
* Classe contenente dati e azioni
```java

class Automobile {
    
    //Attributi
    String colore;
    String marca;
    boolean accesa;
    
    //metti i in moto
    void mettiInMoto() {
        accesa = true;
    }
    
    //vernicia
    void vernicia (String nuovoCol) { 
        colore = nuovoCol;
    }
    
    // stampaStato
    void stampaStato () {
        System.out.println("Questa automobile è una "+ marca + " " + colore);
        if (accesa)
        System.out.println("Il motore è acceso");
        else
        System.out.println("Il motore è spento");
    }
}
```


### Dati & Metodi
* Public: visibili all'esterno della classe
* Private: visibili solo dall'interno della classe
* Protected: ...
* Nessuna specifica (amichevole): ...

La definizione di classe non rappresenta alcun oggetto.


---

#



