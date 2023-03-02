# Codice errato o incompleto: correggi gli errori

---

## Esercizio 7. 

Il seguente programma contiene un errore. Osservare l’errore segnalato dal compilatore e
correggere di conseguenza il programma.

```java
public class XY {
    public static void main ( String [] args ) {
        x = 10;
        y = 5;
        // calcola la somma di x e y
        System.out.println( x + y );
    }
}
```

---

## Esercizio 8. 

Il seguente programma contiene un errore. Osservare l’errore segnalato dal compilatore e
correggere di conseguenza il programma.

```java
public class Totale1 {
public static void main ( String [] args ) {
int x = 10;
int y = 5;
int z = 8;
// calcola il totale di x , y e z in due passi
int totale = x + y ;
int totale = totale + z ;
System.out.println( totale );
}
}
```

---

## Esercizio 9. 

Il seguente programma contiene un errore. Osservare l’errore segnalato dal compilatore e
correggere di conseguenza il programma.

```java
```java
public class Totale2 {
public static void main ( String [] args ) {
int x ,y , z ;
int somma ;
x =10;
y =5;
somma = x + y ;
int totale ;
totale = somma + z ;
System.out.println( totale );
}
}
```

---

## Completare il seguente programma Scambia 

aggiungendo i comandi mancanti al posto dei puntini in modo che i due numeri inseriti dall’utente vengano stampati in ordine inverso dal programma.

```java
import java . util . Scanner ;
public class Scambia {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
int x , y ;
System.out.println( " Inserisci il primo numero : " );
x = input . nextInt ();
System.out.println( " Inserisci il secondo numero : " );
y = input . nextInt ();
// inserire i comandi mancanti qui
........
System.out.println( " Ecco i numeri inseriti in ordine inverso : " );
System.out.println( x );
System.out.println( y );
}
}
```
