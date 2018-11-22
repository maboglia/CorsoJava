# Linguaggio Java


### La prima applicazione Java

File HelloWorld.java
```java
public class HelloWorld {
public static void main (String args[]) {
System.out.println ("Hello world!");
}
}
> javac HelloWorld.java
> java HelloWorld
HelloWorld!
>
Compilazione
(produce HelloWord.class)
Esecuzione
```

### Classi ...
* Non contengono istruzioni
* Contengono metodi

### Metodi ...
* Contengono le istruzioni
* Attivati solo dall'interno di un altro metodo
* Eventuale uso di parametri & valore di ritorno
* Tra i vari metodi esiste il metodo main da cui si "parte"

### Lettere minuscole VS Maiuscole 

## Metodi

### Analoghi alle funzioni di altri linguaggi (C, PHP)

* Meccanismo di attivazione call & return
* Parametri in ingresso
* Variabili locali & istruzioni
* Valore di ritorno

### Invocazione

* Parametri attuali (chiamante)
* Parametri formali (chiamato – definizione)

### Passaggio di parametri

* Possono essere:
  * Dati primitivi
  * Reference
* Avviene  sempre per valore
* Nel caso di parametri reference, quello che viene copiato è il reference, NON l'oggetto
  * Equivale al passaggio per riferimento

### Valore di ritorno

* Analogo ad altri linguaggi
* Il tipo del metodo e il tipo ritornato devo coincidere

### Possibilità di definire 

* metodi ricorsivi
* [Tipi primitivi](02_tipi.md), 
* Costanti e 
* [Operatori](02_operatori.md)


### Modificatore final
```java
final float pigreco = 3.14;
pigreco = 16.0; // NO
```
* Dichiara costanti simboliche
* Dovrebbero essere dichiarate sempre static
(per non sprecare spazio per ogni istanza)

## Operatori per Interi e Reali

## Strutture elementari

## Commenti

### Commenti multilinea

/* questo e` un commento
che si estende su due linee */

### Commenti su linea singola

// questo e` un commento monolinea

### Commenti di documentazione

/** commento per javadoc
.... */

## Blocchi e regole di scope

### I blocchi

* Definiti da { e }

### Visibilità (scope)

* I parametri sono locali al metodo
* Le variabili possono essere
  * Locali al metodo
  * Locali al blocco

### Ogni blocco

* Introduce un nuovo scope per le variabili
* Le variabili si possono dichiarare
  * All'inizio del blocco
  * All'interno del blocco

```java

{
int x;
for (int i=0; i<N; i++){
x = 12;
...
int y;
...
}
}
```

## Costrutti Condizionali

* if-else
* switch

### Attenzione: gli interi NON sono booleani

* NON è possibile fare test del tipo `if(x)` con x intero
* Occorre usare operatori relazionali `if (x != 0)`

## Costrutti iterativi

### Semantica e sintassi

* while
* do-while
* for
* break
* continue


## Input Output (Elementare)

### L'input/output di caratteri e di interi è relativamente spartano

### Richiede l'utilizzo di concetti "complessi"

* Eccezioni
* I/O

## Output

### Comandi:
* System.out.println (...)
* System.out.print (...)
* System.out.printf (...)

### Esempi:
* Visualizzare il valore di una variabile
`System.out.print (x);`
* Visualizzare una stringa
`System.out.print ("Valore =");`
* Visualizzazione con sequenze di escape
`System.out.print ("\tValore =\n");`
* Utilizzo dell'operatore di concatenazione di stringhe
`System.out.println ("Concatenazione" + " di" + " stringhe");`
* Il costrutto di concatenazione vale anche per tipi diversi dal tipo String
`System.out.println ("Valore = " + x);`


## Input

### Lettura di un vettore di byte

```java
byte vettore[] = new byte[10];
...
try{
System.in.read (vettore);
} catch (Exception e) {}
...
```

### Trasformazione della stringa di byte in valori booleani

* valori interi (con segno)
* valori reali (con segno)
* etc.

```java
byte s[] = new byte[10];
int val = 0;
...
try{
System.in.read (s)
} catch (Exception e) {}
...
for (int i=0; i<s.length; i++) {
if (s[i]>=‘0' && s[i]<=‘9')
val = val ### 10 + s[i] – ‘0';
}
...
```

## Input/Output in modalità grafiche

### Java è stato progettato per lavorare in modalità grafiche

### Una possibilità è utilizzare la classe JOptionPane definita nel package javax.swing

```java

(package swing)
// Importa Classe JOPtionPane
import javax.swing.JOptionPane;
...
String inputS;
String outputS;
int nValue;
...
// Input
inputS = JOptionPane.showInputDialog
("Messaggio");
nValue = Integer.parseInt (inputS);
...
// Output
// (previa creazione della stringa output)
JOptionPane.showMessageDialog (
null, output, "Messaggio",
JOptionPane.INFORMATION_MESSAGE );
```

* [array](03_array.md)
* [Stringhe e Caratteri](03_stringhe.md)
* [Metodi & Classi: Concetti base](03_classi.md)

## Ereditarietà

### Meccanismo Java che realizza la

* Specializzazione
* Generalizzazione
* permettendo l'estensione di "vecchie classi" in "nuove classi"

### La classe che eredita da un'altra

* Eredita attributi e operazioni
* Può modificare attributi/operazioni ereditati (override)
* Può aggiungere attributi/operazioni

### Visibilità di attributi e metodi

* public: sono accessibili senza restrizioni
* private: sono accessibili solo all'interno della classe in cui sono definiti
* protected: sono accessibili dalla classe e in più sono accessibili dalle classi derivate da quella in cui sono definiti

### Puntatori

* this riferisce l'oggetto corrente
* super riferisce l'oggetto "sopra" this("superoggetto") ovvero la superclasse

```java
class AutomobileElettrica extends Automobile {
boolean batterieCariche;
void ricarica() {
batterieCariche=true;
}
void mettiInMoto() {
if(batterieCariche)
super.mettiInMoto();
}
}
```

## Ereditarietà e costruttori

### Ogni oggetto contiene un'istanza della propria superclasse

* La superclasse deve essere inizializzata
* Il compilatore Java inserisce automaticamente una chiamata al costruttore di default del superoggetto
* La chiamata al costruttore del superoggetto viene inserita come PRIMA istruzione del nuovo costruttore
  * L'esecuzione dei costruttori procede dalla radice verso il basso nella gerarchia di ereditarietà
  * È garantito che quando un metodo di una classe viene eseguito (costruttore compreso), la superclasse sia già inizializzata completamente

### Se i costruttori hanno parametri

* Il compilatore non è in grado di inserire automaticamente la chiamata
* Le istanze delle superclassi devono essere inizializzate correttamente tramite chiamate esplicite ai costruttori (utilizzando la variabile super)
* La chiamata del costruttore della superclasse deve essere la PRIMA istruzione del costruttore
  * Il compilatore lo controlla
  * L'ordine di inizializzazione degli oggetti è sempre quello giusto

```java
class Dirigente extends Impiegato {
int grado;
Dirigente(String n, double s) {
super (n,s);
grado = 1;
}
void aumentaStipendio(double percentuale) {
int bonus = grado ### 3;
super.aumentaStipendio(percentuale+bonus);
}
...
}
```

## La classe Object - Albero di derivazione

### Tutte le classi in Java derivano dalla classe Object

### Non si può definire una classe che non eredita da nessun'altra classe

* Ogni classe esclusa Object ha una superclasse
* Se non specificato altrimenti, una classe deriva direttamente da Object

```java
class Mammifero {
...
}
```

## La classe Object

### Contiene alcuni metodi generali

* String toString()
  * Restituisce una stringa che rappresenta univocamente l'oggetto
* boolean equals(Object obj)
  * Restituisce vero se obj e this sono lo stesso oggetto

### Normalmente questi metodi sono ridefiniti (overridden) nelle classi derivate

## Dynamic binding

### Per binding si intende l'associazione messaggio – metodo

```java
Automobile a;
for(int i=0; i<garage.length; i++){
a = garage[i]
a.mettiInMoto();
}
```

### Due scelte possibili

* Statico
  * Associazione fatta in base al tipo a compile time
* Dinamico (default in Java)
  * Associazione fatta in base al tipo a run time
  * Java sceglie il corretto metodo dell'appropriata sottoclasse associata all'oggetto

### N.B. se le classi non sono legate da ereditarietà è possibile una scelta sola

```java
Moto m;
m.mettiInMoto();
Aereo a;
a.mettiInMoto();
```

## L'attributo final

### Definisce un dato elemento come non più modificabile

* Applicato a variabile la trasforma in costante
* Applicato a un metodo
  * Ne impedisce l'overriding in classi derivate
  * Ne rende possibile l'inlining (binding statico - più efficiente)
* Applicato a una classe
  * Impedisce di derivare da essa altre classi (la classe deve essere una foglia dell'albero di ereditarietà)

## Type Casting di Oggetti

### È possibile modificare il tipo di un riferimento ad oggetto soltanto tra tipi in relazione di ereditarietà

### L'oggetto rimane invariato

## Upcasting

### Caratteristiche

* È sempre affidabile (è sempre vero che un auto elettrica è un auto)
* È automatico

### Poichè ogni classe è (direttamente o indirettamente) sottoclasse di Object è sempre possibile fare upcast di qualsiasi oggetto su Object

```java
QualcheClasse a = new QualcheClasse();
Object o;
o = a;
```

## Downcasting

### Caratteristiche

* Non è automatico (richiede cast esplicito)
* Può non essere affidabile
  * Non tutte le auto sono autoelettriche
  * Un downcasting può provocare un errore run-time

### Per evitare un errore a run time

* `instanceof (Run Time Type Identification)`

```java
Automobile a = new Automobile();
AutoElettrica ae;
if (a instanceof AutoElettrica){
ae = (AutoElettrica) a;
ae.ricarica();
}
```

## Package

### La classe è un elemento di modularizzazione più potente della procedura

* Progresso rispetto al modello procedurale
* È ancora piccolo
* Occorre un livello di modularità più ampio
  * Insieme di classi

* [package](20_JavaPackages.md) 



* [Tipi Primitivi – Classi Wrapper](02_tipi.md)