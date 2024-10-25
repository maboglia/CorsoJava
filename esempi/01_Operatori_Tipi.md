# Elementi fondamentali Java: commenti, operatori ed espressioni

---

![operatori](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Language/01_lang_base/01_operatori_tipi_expr/built-in.png)

---

![expressions](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Language/01_lang_base/01_operatori_tipi_expr/comparison-expressions.png)

---

```java
public static void main(String[] args) {
	//commento su una linea
	String mioNome = "mauro";
	
	/*
	* questo commento si estende su più
	* linee
	*/

	/*
	va bene anche così
	senza asterisco, 
	è utile anche per disabilitare blocchi di codice 
	*/
	float numeroSettimana = 11;
	
	/**
	* Questo è un commento JavaDoc, sarà interpretato in modo speciale
	NB: si possono utilizzare dei parametri di configurazione speciali
	*/
	System.out.println(mioNome + " è arrivato alla settimana " + numeroSettimana + " in condizioni ... ");

 }
```

---

## Utilizzo dell'operatore incremento

```java
class PrimoIncremento{
 public static void main(String args[]){
	int a = 1, b;
	System.out.println("a vale " + a);
	a++;
	System.out.println("Dopo a++ a vale " + a);
	b = a++;
	System.out.println("Dopo b = a++ a vale " + a + " e b vale "+ b);
	b = ++a;
	System.out.println("Dopo b = ++a a vale " + a + " e b vale "+ b);
 }
}
```

---

## Semplici operazioni matematiche

```java
class Elementari{
 public static void main(String args[]){
  int i1 = 5, i2 = 10, i3;
  double d1= 5, d2 = 10, d3;
  i3 =- i1;
  System.out.println("-i1 vale " + i3);
  i3 = i1 + i2;
  System.out.println("i1+i2 vale " + i3);
  i3 = i1 - i2;
  System.out.println("i1-i2 vale " + i3);
  i3 = i1 * i2;
  System.out.println("i1*i2 vale " + i3);
  d3 =- d1;
  System.out.println("-d1 vale " + d3);
  d3 = d1 + d2;
  System.out.println("d1+d2 vale " + d3);
  d3 = d1 - d2;
  System.out.println("d1-d2 vale " + d3);
  d3 = d1 * d2;
  System.out.println("d1*d2 vale " + d3);
  System.out.println(d3);
 }
}
```

---

## Divisioni tra variabili intere e variabili decimali

```java
class Divisione{
 public static void main(String args[]){
  int i1 = 6, i2 = 5, i3 = 3, i4;
  float f1 = 6, f2 = 5, f3 = 3, f4;
  i4 = i1 / i2;
  System.out.println(i1 + "/" + i2 + " vale " + i4);
  i4 = i1 / i3;
  System.out.println(i1 + "/" + i3 + " vale " + i4);
  i4 = i2 / i3;
  System.out.println(i2 + "/" + i3 + " vale " + i4);
  f4 = f1 / f2;
  System.out.println(f1 + "/" + f2 + " vale " + f4);
  f4 = f1 / f3;
  System.out.println(f1 + "/" + f3 + " vale " + f4);
  f4 = f2 / f3;
  System.out.println(f2 + "/" + f3 + " vale " + f4);
  System.out.println(f1 / f2);
 }
}

```

---

## Operatore modulo e approssimazione nei calcoli

```java
class Modulo{
 public static void main(String args[]){
  int i1 = 5, i2 = 6, i3;
  double d1 = 1.2, d2 = 6.1,d3;
  i3 = i2 % i1;
  System.out.println(i2 + "%" + i1 + " vale " + i3);
  d3 = d2 % d1;
  System.out.println(d2 + "%" + d1 + " vale " + d3);
 }
}

```

---

## Operatori di confronto

```java
class Confronti{
 public static void main(String args[]){
  boolean b1, b2;
  int i1 = 3, i2 = 6;
  char c1 = 'a', c2 = 'b';
                b1 = i1 >= i2; // e' falso
  System.out.println(i1 + ">=" + i2 + " restituisce " + b1);
                b2 = c1 < c2; // e' vero
  System.out.println(c1 + "<=" + c2 + " restituisce " + b2);
  System.out.print(b1 + "!=" + b2 + " restituisce ");
                // visualizza vero, poiche' b1 e' falso e b2 e' vero
  System.out.println(b1 != b2);
 }
}
```

---

## Operatori logici booleani

```java
class Booleani{
 public static void main(String args[]){
  boolean b1,b2,b3;
  // b1 vale false
  b1 = 3 > 5;
  // b2 vale true
  b2 = 1 < 10;
  b3 = b1 & b2;
                System.out.println("L'affermazione \" 3 > 5 e 1 < 10 \" risulta " + b3);
  b3 = b1 | b2;
  System.out.println("L'affermazione \" 3 > 5 o 1 < 10 \" risulta " + b3);
  b3 = b1 ^ b2;
  System.out.println("L'affermazione \" o 3 > 5 o 1 < 10 \" risulta " + b3);
  b1 = 2 < 10;
  b3 = b1 ^ b2;
  // Attenzione alla sequenza \"
  System.out.println("L'affermazione \" o 2 < 10 o 1 < 10 \" risulta " + b3);
 }
}

```

---

## Generazione di un errore di divisione per zero

```java
class NoCortoCircuito{
 public static void main(String args[]){
                int i = 5, j = 2, k = 0;
  boolean b1;
                // i e' maggiore di j e quindi b1 e' true
  b1 = (i > j) | (i > (j / k));
  System.out.println(b1);
 }
}

```

---

## Tipo char

```java
class Caratteri{
 public static void main(String args[]){
  char c1,c2,c3;
  // Inizializza c1 al carattere 97, vale a dire 'a'
  c1 = 97;
  c2 = 'a';
  c3= 'z';
  System.out.println("c1 vale " + c1);
  System.out.println("c2 vale " + c2);
  System.out.println("c3 vale " + c3);
  /* Restituisce in output il carattere corrispondente
  al codice Unicode di c1 */
  System.out.println(c1);
                /* Incrementa di una unita' il codice
  del carattere Unicode */
  c1 = ++c1;
  System.out.println(c1);
 }
}
```

---

## Cast da int a byte

```java
class CastInteri{
 public static void main(String args[]){
  int i1 = 10, i2 = 257, i3 = 513;
  byte b1,b2,b3;
  b1 = (byte)i1;
  b2 = (byte)i2;
  b3 = (byte)i3;
  System.out.println("Esempi di cast da int a byte");
  System.out.println("Il cast di " + i1 + " vale " + b1);
  System.out.println("Il cast di " + i2 + " vale " + b2);
  System.out.println("Il cast di " + i3 + " vale " + b3);
 }
}

```

---

## Generazione di un errore di perdita di precisione

```java
class PromoErrata{
 public static void main(String args[]){
  byte b1=10, b2;
  // b2 riceve 50, ma genera un errore di compilazione
  b2 = b1 * 5;
  System.out.println(b2);
 }
}
```

---

## Espressione con operandi di tipo diverso

```java
class Promo{
 public static void main(String args[]){
  byte b1=10, b2;
  b2 = (byte)(b1 * 5);
  System.out.println(b2);
 }
}
```

---

## Errore di conversione da int a byte (perdita di dati)

```java
class Interi{
 public static void main(String args[]){
  int a = 1;
  byte b;
  b = a;
 }
}
```
