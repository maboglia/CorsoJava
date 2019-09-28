
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

## Instanziare una Classe

### Crea degli oggetti appartenenti a una classe

### Gli oggetti sono caratterizzati da

* Classe di appartenenza - tipo (ne descrive attributi e metodi)
* Stato (valore attuale degli attributi)
* Identificatore univoco (reference - handle - puntatore)

### Per creare un oggetto occorre

* Dichiarare una istanza
* Tecnica analoga a quella utilizzata per i tipi primitivi
* La dichiarazione non alloca spazio ma solo una riferimento (puntatore) che per default vale null
* Allocazione e inizializzazione
* Riservano lo spazio necessario creando effettivamente l'oggetto appartenente a quella classe

---


## Notazioni Puntate

### Le notazioni puntate possono essere combinate

* System.out.println("Hello world!");
* System è una classe del package java.lang
* out è una variabile di classe contenente il riferimento ad un oggetto della classe PrintStream che punta allo standard output
* println è un metodo della classe PrintStream che stampa una linea di testo

---

## Operazioni su reference

### Definiti gli operatori relazionali == e !=

* Attenzione: il test di uguaglianza viene fatto sul puntatore (reference) e NON sull'oggetto
* Stabiliscono se i reference si riferiscono allo stesso oggetto

È definita l'assegnazione

È definito l'operatore punto (notazione puntata)

NON è prevista l'aritmetica dei puntatori

---


## Variabili e metodi di classe

---

## Variabili di classe

* Rappresentano proprietà comuni a tutte le istanze

* Esistono anche in assenza di istanze (oggetti)

* Dichiarazione: static

* Accesso: nome-classe . attributo

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



