# Il modificatore static

* La parola riservata `static` viene usata per indicare il livello di definizione di un **attributo o metodo**
* Se la parola `static` è presente l’attributo o metodo è definito **a livello di classe**
* Se la parola `static` **non** è presente l’attributo o metodo è definito **a livello di istanza** (esemplare della classe)

---

## Static vs. non static

* Ogni attributo o metodo non static esiste concretamente **in ogni istanza creata**
* Esiste in “molteplici versioni” se vengono create più istanze
* **Non esiste** concretamente **se il programma non crea almeno un’istanza** (tramite operatore new)
* Ogni attributo o metodo static esiste concretamente a livello di classe
* Esiste in un’unica versione
* La sua esistenza non dipende da cosa fa il programma

---

## Variabili di classe

* Rappresentano proprietà comuni a tutte le istanze
* Esistono anche in assenza di istanze (oggetti)
* Dichiarazione: static
* Accesso: NomeClasse.attributo

```java
class Automobile {
	static int numeroRuote = 4;
}

Automobile.numeroRuote;
```

---

## Metodi di classe

### Funzioni non associate ad alcuna istanza

* Dichiarazione: static
* Accesso: nome-classe . metodo()

```java
class HelloWorld {
public static void main (String args[]) {
System.out.println("Hello World!");

//p.es  cos(x): metodo static della classe Math, ritorna un double
double y = Math.cos(x);
}
}
```

---

## Accesso a metodi e attributi static

* Essendo definiti a livello di classe, attributi e metodi static sono acceduti/invocati tramite il nome della classe:
* `Math.sqrt (2);`
* `String.valueOf( Math .PI);`
* In caso di classe istanziabile ibrida si può accedere tramite una qualunque istanza della classe, ma è meglio non farlo.
* Nel corpo di un metodo `static` non si può accedere ad attributi e metodi non `static` della stessa classe
* Il metodo `static` deve poter essere invocato a livello di classe (anche in assenza di istanze) mentre attributi e metodi non `static` esistono solo se c’è almeno un’istanza
* Se nel corpo di un metodo appare il nome di un metodo o attributo `static` della sua classe è sottinteso che sia preceduto dal nome della classe stessa
* Eventuali mescolanze improprie di `static` e non `static` causano errori di compilazione

[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)
