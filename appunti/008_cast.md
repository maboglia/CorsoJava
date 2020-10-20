# Casting e promotion

* `( nometipo ) variabile`
* `( nometipo ) espressione`
* Trasforma il valore della variabile (espressione) in quello corrispondente in un tipo diverso
* Il cast si applica anche a `char`, visto come tipo intero positivo

* La promotion è automatica quando necessaria
  * Es. `double d = 3 + 4;`
* Il casting deve essere esplicito: il programmatore si assume la responsabilità di eventuali perdite di informazione
  * Per esempio 
  * `int i = ( int ) 3.0 * ( int ) 4.5;` i assume il valore 12
  * `int j = ( int ) (3.0 * 4.5);` j assume il valore 13

---

## casting dei tipi reference (oggetti)

* è permesso solo in caso di **ereditarietà**
* la conversione da sotto-classe a super-classe è **automatica**
* la conversione da super-classe a sotto-classe richiede **cast esplicito**
* la conversione tra riferimenti non in relazione tra loro **non è permessa**

## esempio promotion

```java

char a = 'a';
// promotion int è più grande e i valori sono compatibili
int b = a;

System.out.println(a); // a
System.out.println(b); // 97

```

---


## esempi type casting

```java

byte b = (byte) 261;
System.out.println(b); // 5

System.out.println(  Integer.toBynaryString(b)  ); // 101
System.out.println(  Integer.toBynaryString(261)  ); // 100000101

```

```java
int a = (int) 1936.27;

System.out.println(a); // 1936

```

---


## con il tipo boolean non si può fare il typecasting

```java
int a = (int) true; // vietato - ... cannot be converted to ... 
boolean falso = (boolean) 0; // vietato - ... cannot be converted to ...  
```