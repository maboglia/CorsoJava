# Metodi **getter e setter**

I cosiddetti metodi getters e setters, cioè accessori e mutatori, regolano l'accesso alle proprietà ed ai metodi delle classi


## Principi di encapsulation e visibilità

* **Modularità** = diminuire le interazioni
* **Information Hiding** = delegare responsabilità
* `private` attributo/metodo visibile solo da istanze della stessa classe
* `public` attributo/metodo visibile ovunque

---

### Ad esempio

```java
class NomeClasse{  
       
       private double nome1, nome2;

       public double getNome1(){
              return nome1;
       } 
       public void setNome1(double nome1){ 
              this.nome1 = nome1; 
       }
```

* Vantaggi: 
* possiamo cambiare la rappresentazione interna, 
* verificare che i valori siano corretti, 
* modificare altri aspetti dell'oggetto

---

## Getters e setters

Metodi accessori e mutatori per leggere scrivere un attributo privato

```java
String getColore() {
       return colore;
}
void setColore(String nuovoColore) {
       this.colore = nuovoColore;
}
```

---

## Proprietà visibili

```java
class Automobile {
       public String colore;
}
//creazione oggetto
Automobile a = new Automobile();
a.colore = "bianco"; // ok
```

---

## Classe incapsulata

```java

class Automobile {
       private String colore;
       public void vernicia(String colore) {
              this.colore = colore;
       }
}

//creazione oggetto
Automobile a = new Automobile();
a.colore = "bianco"; // error
a.vernicia("verde"); // ok
```

---

[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)
