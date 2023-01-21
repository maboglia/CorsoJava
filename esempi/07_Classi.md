# Le classi

## Definizione di una Classe

```java
class NomeClasse {
    <proprietà, attributi, campi>
    <metodi>
}
```

---

### Esempi - Classe contenente dati ma non azioni

```java
class DataOnly {
    boolean b;
    char c;
    int i;
    float f;
}
```

---

### Esempi - Classe contenente dati e azioni

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

---

## Dichiarazione di classe e lista di attributi

```java
package model;

/**
 * @author Mauro
 *
 */
public class Studente {
 
 private String nome;
 private String cognome;
 private int anno;
 private int numMatricola;
 private boolean presente;
 static int cont=0;
```

---

## metodo costruttore dell'oggetto

```java
**
 * @param nome
 * @param cognome
 * @param anno
 * @param numMatricola
 * @param presente
 */
public Studente(String nome, String cognome, int anno) {
 this.nome = nome;
 this.cognome = cognome;
 this.anno = anno;
 this.presente = true;
 this.numMatricola = ++cont;
}

```

---

### Visibilità Dati & Metodi - Incapsulamento

* `Public`: visibili all'esterno della classe
* `Private`: visibili solo dall'interno della classe
* `Protected`: visibili ai discendenti e dall'interno del package
* `Nessuna` specifica (visibilità package, friendly): ...

NB: La definizione di classe non rappresenta alcun oggetto. Occorre istanziare usando l'operatore `new`

---

## metodi getters e setters

Dato che le proprietà sono private, per accedervi in lettura o scrittura occorrono dei metodi c.d. accessori (getters) e mutatori (setters)

```java
/**
 * @return the nome
 */
public String getNome() {
 return nome;
}

public void setAssente() {
 this.presente = false;
}
//in caso di boolean il getter ha prefisso is
public boolean isAssente() {
 return this.assente;
}


```

---

## metodo toString

```java
@Override
public String toString() {
 StringBuilder s= new StringBuilder();
 s.append(numMatricola);
 s.append("\t\t");
 s.append(nome);
 s.append("\t\t");
 s.append(cognome);
 s.append("\t\t");
 s.append(anno);
 s.append("\t\t");
 s.append(presente ? "" : "Assente");
 
 return s.toString();
}

```

---

## model - altri esempi di classi incapsulate

* [model Allievo](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Allievo.java)
* [model Automobile](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Automobile.java)
* [model Bicicletta](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Bicicletta.java)
* [model Box](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Box.java)
* [model Citta](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Citta.java)
* [model Contatore](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Contatore.java)
* [model ContoCorrente](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/ContoCorrente.java)
* [model Corso](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Corso.java)
* [model Dado](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Dado.java)
* [model Employee](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Employee.java)
* [model Funzionario](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Funzionario.java)
* [model Impiegato](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Impiegato.java)
* [model Motocicletta](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Motocicletta.java)
* [model Oggetto](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Oggetto.java)
* [model Persona](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Persona.java)
* [model Punto](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Punto.java)
* [model Rettangolo](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Rettangolo.java)
* [model Studente](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Studente.java)
* [model Zaino](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/Zaino.java)
