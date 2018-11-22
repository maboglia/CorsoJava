
```java
public class HelloWorld {
public static void main ( String [] args ) {
// visualizza un messaggio di saluto
System.out.println ( " Hello World ! " );
}
}
```

# Espressioni aritmetiche

Nel programma HelloWorld abbiamo usato il comando
System.out.println() per stampare una stringa

Possiamo in realtà stampare tanti altri tipi di valori
Ad esempio, possiamo stampare il risultato di una espressione

Consideriamo il seguente programma che calcola l'area di un triangolo di base 5 cm e altezza 10 cm

```java
public class AreaTriangolo {
public static void main ( String [] args ) {
System.out.println (5*10/2);
}
}
```

Il programma risolve l'espressione 5*10/2 e stampa il risultato a video


### Espressioni aritmetiche e precedenza

Le espressioni aritmetiche più semplici sono costituite da singoli letterali

* Letterali interi: 3425, 12, -34, 0, -4, 34, -1234, ....
* Letterali frazionari: 3.4, 5.2, -0.1, 0.0, -12.45, 1235.3423, ....

Espressioni più complesse si ottengono utilizzando operatori aritmetici

* moltiplicazione *
* divisione /
* modulo % (resto della divisione tra interi)
* addizione +
* sottrazione -

Le operazioni sono elencate in **ordine decrescente di priorità** ossia 3+2*5 fa 13, non 25

Le parentesi tonde cambiano l'ordine di valutazione degli operatori ossia (3+2)*5 fa 25

Inoltre, tutti gli operatori sono associativi a sinistra ossia 3+2+5 corrisponde a (3+2)+5 quindi 18/6/3 fa 1, non 9

### operazione di divisione

* L'operazione di divisione / si comporta diversamente a seconda che sia applicato a letterali interi o frazionari
* 25/2 = 12 (divisione intera)
* 25%2 = 1 (resto della divisione intera)
* 25.0/2.0 = 12.5 (divisione reale)
* 25.0%2.0 = 1.0 (resto della divisione intera)
* Una operazione tra un letterale intero e un frazionario viene eseguita come tra due frazionari
* 25/2.0 = 12.5
* 1.5 + (25/2) = 13.5 (attenzione all'ordine di esecuzione delle
* operazioni)
* 2 + (25.0/2.0) = 14.5
