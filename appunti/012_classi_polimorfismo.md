# Polimorfismo 

* La parola polimorfismo deriva dal greco e significa letteralmente molte forme.
* Nella OOP tale termine si riferisce ai metodi: per definizione, il polimorfismo è la capacità di un oggetto, la cui classe fa parte di una gerarchia, di chiamare la versione corretta di un metodo.
* Quindi il polimorfismo è necessario quando si ha una gerarchia di classi.


## Polimorfismo mediante (overloading)

Una classe può avere più metodi con lo stesso nome

## I metodi devono essere distinguibili in base a

* Numero dei parametri
* Tipo dei parametri

### Il metodo da eseguire viene scelto in base a

* Numero e tipo di parametri

Il metodo da eseguire **NON** viene scelto in base al **valore di ritorno**

---

### Il polimorfismo denota le differenze tra **Programmazione Procedurale e OOP**

* Nella programmazione procedurale, il codice è centrale e i dati sono subordinati
* abbiamo programmi che agiscono sui dati che di solito non sono strettamente collegati
* Nella programmazione a oggetti, gli oggetti sono l'elemento centrale.
* Un oggetto consiste nei **dati** (attributi, proprietà, ...)
* e nel codice che opera su tali dati: **metodi**
* **dati e metodi** sono strettamente collegati: è il concetto di **incapsulamento**
* l'**incapsulamento** permette anche di nascondere l'implementazione interna, utilizzando l'oggetto attraverso l'**interfaccia** pubblica.

---

### Per esempio: abbiamo un numero e vogliamo raddoppiarlo

Nel modo procedurale possiamo scrivere:

```java
n = n * 2
```

**Il codice moltiplica n per 2 e registra il risultato in n.**

### In OOP: abbiamo un numero e vogliamo raddoppiarlo

Nella programmazione orientata agli oggetti si invia un "messaggio" all'oggetto chiamando un metodo per raddoppiare: ```n.raddoppia();```

Un oggetto di tipo Operazione riceve la chiamata al metodo `raddoppia(<TIPO>)`, riconosce il tipo dell'argomento e richiama il metodo implementato per quel tipo.

```java
class Operazione{
 

 public int raddoppia(int n){
  return n * 2;
 }

 public String raddoppia(String s){
  return s+s;
 }

}
```

---

## Polimorfismo

Il vantaggio di questa tecnica è definito **polimorfismo**.

Se il programma richiede di replicare la procedura su un oggetto di tipo string come "bob", nel modo procedurale occorre invocare una nuova funzione con un codice e un nome differente.
