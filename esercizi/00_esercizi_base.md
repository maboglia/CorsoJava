# Uso di Espressioni, Variabili, Math e Input dall’utente

---

## Esercizio NomeCognome

Scrivere un programma `NomeCognome` che stampa il nome e il cognome uno sotto l'altro.

```java
public class NomeCognome {
    public static void main(String[] args) {
        System.out.println("Nome: Mario");
        System.out.println("Cognome: Rossi");
    }
}
```

---

## Esercizio RadiceQuadrata

Scrivere un programma `RadiceQuadrata` che chiede all'utente di inserire un numero intero e ne stampa la radice quadrata (numero frazionario). Utilizzare la classe `java.lang.Math`.

```java
import java.util.Scanner;

public class RadiceQuadrata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int numero = input.nextInt();
        double radice = Math.sqrt(numero);
        System.out.println("La radice quadrata di " + numero + " è: " + radice);
    }
}
```

---

## Esercizio PerimetroRettangolo

Scrivere un programma `PerimetroRettangolo` che calcola il perimetro di un rettangolo di base e altezza inserite dall'utente.

```java
import java.util.Scanner;

public class PerimetroRettangolo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la base del rettangolo: ");
        double base = input.nextDouble();
        System.out.print("Inserisci l'altezza del rettangolo: ");
        double altezza = input.nextDouble();
        double perimetro = 2 * (base + altezza);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);
    }
}
```

---

## Esercizio AreaCerchio

Scrivere un programma `AreaCerchio` che chiede all'utente di inserire la lunghezza del raggio di un cerchio e ne calcola l'area. Memorizzare il valore di π (pi-greco) in una costante.

```java
import java.util.Scanner;

public class AreaCerchio {
    public static void main(String[] args) {
        final double PI_GRECO = Math.PI;
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il raggio del cerchio: ");
        double raggio = input.nextDouble();
        double area = PI_GRECO * raggio * raggio;
        System.out.println("L'area del cerchio è: " + area);
    }
}
```

---

## Esercizio Divisione

Scrivere un programma `Divisione` che chiede all'utente due numeri interi e stampa prima il quoziente della loro divisione intera e poi il resto.

```java
import java.util.Scanner;

public class Divisione {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il dividendo: ");
        int dividendo = input.nextInt();
        System.out.print("Inserisci il divisore: ");
        int divisore = input.nextInt();
        int quoziente = dividendo / divisore;
        int resto = dividendo % divisore;
        System.out.println("Quoziente: " + quoziente);
        System.out.println("Resto: " + resto);
    }
}
```

---

## Esercizio SommaProdotto

Scrivere un programma `SommaProdotto` che chiede all'utente di inserire due valori interi e ne calcola la somma e il prodotto.

```java
import java.util.Scanner;

public class SommaProdotto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        int numero1 = input.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int numero2 = input.nextInt();
        int somma = numero1 + numero2;
        int prodotto = numero1 * numero2;
        System.out.println("Somma: " + somma);
        System.out.println("Prodotto: " + prodotto);
    }
}
```

---

## Esercizio SommaDiQuattro

Scrivere un programma `SommaDiQuattro` che chiede all'utente di inserire quattro valori interi e ne stampa la somma.

```java
import java.util.Scanner;

public class SommaDiQuattro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        int num1 = input.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = input.nextInt();
        System.out.print("Inserisci il terzo numero: ");
        int num3 = input.nextInt();
        System.out.print("Inserisci il quarto numero: ");
        int num4 = input.nextInt();
        int somma = num1 + num2 + num3 + num4;
        System.out.println("Somma: " + somma);
    }
}
```

---

## Esercizio SommaApprossimata

Scrivere un programma `SommaApprossimata` che chiede all'utente di inserire due numeri con la virgola, li somma e poi stampa il risultato come numero intero.

```java
import java.util.Scanner;

public class SommaApprossimata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserisci il primo numero con la virgola: ");
        double numero1 = input.nextDouble();
        
        System.out.print("Inserisci il secondo numero con la virgola: ");
        double numero2 = input.nextDouble();
        
        int somma = (int) (numero1 + numero2);
        
        System.out.println("La somma approssimata è: " + somma);
    }
}
```


---

## Esercizio OreInMinuti

Scrivere un programma OreInMinuti che chiede all’utente di inserire un numero frazionario che rappresenta un tempo espresso in ore (ad esempio 3.5 per 3 ore e mezzo) e stampa il corrispondente tempo espresso in minuti (ad esempio 210). 
Il risultato stampato deve essere un numero intero (ossia, NON deve essere 210.0).

---

```java
import java.util.Scanner;

public class OreInMinuti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserisci il tempo in ore (ad esempio, 3.5 per 3 ore e mezza): ");
        double ore = input.nextDouble();
        
        int minuti = (int) (ore * 60);
        
        System.out.println("Il tempo corrispondente in minuti è: " + minuti);
    }
}
```

---

## Esercizio MinutiInOre

Scrivere un programma MinutiInOre che chiede all’utente di inserire un numero intero che rappresenta un tempo espresso in minuti (ad esempio 210) e stampa il corrispondente tempo espresso in ore e minuti (ad esempio 3 ore e 30 minuti). 
Il risultato stampato deve essere un numero intero (ossia, NON deve essere 3.0 ore e 30.0 minuti).

---

---

```java
import java.util.Scanner;

public class MinutiInOre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserisci il tempo in minuti: ");
        int minuti = input.nextInt();
        
        int ore = minuti / 60;
        int restantiMinuti = minuti % 60;
        
        System.out.println("Il tempo corrispondente è: " + ore + " ore e " + restantiMinuti + " minuti");
    }
}
```
