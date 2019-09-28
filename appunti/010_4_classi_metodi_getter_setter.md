# Metodi **getter e setter**

* Danno accesso agli attributi:

```java
class NomeClasse{  private double nome1, nome2;

       public double getNome1(){
       return nome1;<
       } 
       public void setNome1(double nome1){ 
       this.nome1 = nome1; 
       }
```

* Vantaggi: possiamo cambiare la rappresentazione interna, verificare che i valori siano corretti, modificare altri aspetti dell'oggetto


## Visibilità ed encapsulation

Motivazione
* Modularità = diminuire le interazioni
* Information Hiding = delegare responsabilità

Supporto sintattico
* private attributo/metodo visibile solo da istanze della stessa classe
* public attributo/metodo visibile ovunque

---

## Getters e setters

Aggiungere metodi per leggere scrivere un attributo privato

Può infrangere (indirettamente) l'encapsulation

```java
String getColor() {
return color;
}
void setColor(String newColor) {
color = newColor;
}

class Automobile {
public String colore;
}
Automobile a = new Automobile();
a.colore = "bianco"; // ok
class Automobile {
private String colore;
public void vernicia(String colore)
{this.colore = colore;}
// ok
}

Automobile a = new Automobile();
a.colore = "bianco"; // error
a.vernicia("verde"); // ok
```


---