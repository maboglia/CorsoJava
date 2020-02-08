# Polimorfismo (overloading)

Una classe può avere più metodi con lo stesso nome

### I metodi devono essere distinguibili in base a

* Numero dei parametri
* Tipo dei parametri

### Il metodo da eseguire viene scelto in base a

* Numero e tipo di parametri

Il metodo da eseguire **NON** viene scelto in base al valore di ritorno

---

### Esempio
```java
class Automobile {
    String colore;
    void vernicia () {
    colore = "bianco";
    }
    void vernicia (int i) {
    switch (i) {
    case 1: colore = "nero"; break;
    ...
    }
    }
    void vernicia (String nuovoCol) {
    colore = nuovoCol;
    }
}
```
