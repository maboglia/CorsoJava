# **Esercitazione Pratica: Condizioni e Cicli**

#### **Obiettivo:**
In questa esercitazione, gli studenti metteranno in pratica le strutture di controllo di flusso (condizioni e cicli) per risolvere problemi comuni. Si familiarizzerà con l'uso di `if-else` e dei cicli `for`, `while` e `do-while`.

---

### **Esercizio 1: Calcolo del Fattoriale di un Numero**

**Istruzioni:**
1. Scrivere un programma che prenda un numero intero positivo come input dall'utente.
2. Utilizzare un ciclo `for` per calcolare e stampare il fattoriale del numero.

**Definizione di fattoriale:**
Il fattoriale di un numero `n` (denotato come `n!`) è il prodotto di tutti i numeri interi positivi minori o uguali a `n`. Ad esempio:
\[
5! = 5 \times 4 \times 3 \times 2 \times 1 = 120
\]

**Codice di esempio:**
```java
import java.util.Scanner;

public class CalcoloFattoriale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiedere all'utente di inserire un numero
        System.out.println("Inserisci un numero intero positivo: ");
        int numero = input.nextInt();

        // Verifica che il numero sia positivo
        if (numero < 0) {
            System.out.println("Il numero deve essere positivo.");
            return;
        }

        // Calcolare il fattoriale con un ciclo for
        long fattoriale = 1;
        for (int i = 1; i <= numero; i++) {
            fattoriale *= i;
        }

        // Stampare il risultato
        System.out.println("Il fattoriale di " + numero + " è: " + fattoriale);

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac CalcoloFattoriale.java`
  - Esecuzione: `java CalcoloFattoriale`

---

### **Esercizio 2: Verifica se un Numero è Primo**

**Istruzioni:**
1. Scrivere un programma che richieda all'utente di inserire un numero intero.
2. Verificare se il numero è un numero primo.
   
**Definizione di numero primo:**
Un numero primo è un numero maggiore di 1 che è divisibile solo per 1 e per sé stesso. Ad esempio, i numeri primi includono 2, 3, 5, 7, 11, 13, ecc.

**Codice di esempio:**
```java
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiedere all'utente di inserire un numero intero
        System.out.println("Inserisci un numero intero: ");
        int numero = input.nextInt();

        // Verificare se il numero è primo
        boolean èPrimo = true;

        if (numero <= 1) {
            èPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    èPrimo = false;
                    break;
                }
            }
        }

        // Stampare il risultato
        if (èPrimo) {
            System.out.println(numero + " è un numero primo.");
        } else {
            System.out.println(numero + " non è un numero primo.");
        }

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac NumeroPrimo.java`
  - Esecuzione: `java NumeroPrimo`

---

### **Esercizio 3: Stampa dei Numeri Pari da 1 a N**

**Istruzioni:**
1. Scrivere un programma che richieda all'utente di inserire un numero intero positivo `N`.
2. Utilizzare un ciclo `for` per stampare tutti i numeri pari compresi tra 1 e `N`.

**Codice di esempio:**
```java
import java.util.Scanner;

public class NumeriPari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiedere all'utente di inserire un numero intero positivo
        System.out.println("Inserisci un numero intero positivo: ");
        int N = input.nextInt();

        // Verificare che il numero sia positivo
        if (N < 1) {
            System.out.println("Il numero deve essere positivo.");
            return;
        }

        // Stampare i numeri pari da 1 a N
        System.out.println("Numeri pari da 1 a " + N + ":");
        for (int i = 2; i <= N; i += 2) {
            System.out.println(i);
        }

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac NumeriPari.java`
  - Esecuzione: `java NumeriPari`

---

### **Esercizio 4: Stampa della Tavola Pitagorica**

**Istruzioni:**
1. Scrivere un programma che stampi la **tavola pitagorica** per i numeri da 1 a 10.
2. Utilizzare un ciclo `for` annidato (cioè un ciclo dentro un altro ciclo) per generare e stampare la tavola.

**Codice di esempio:**
```java
public class TavolaPitagorica {
    public static void main(String[] args) {
        System.out.println("Tavola Pitagorica (da 1 a 10):");

        // Cicli for annidati per generare la tavola
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();  // Passa alla riga successiva
        }
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac TavolaPitagorica.java`
  - Esecuzione: `java TavolaPitagorica`

---

### **Esercizio 5: Somma dei Numeri da 1 a N con Ciclo `while`**

**Istruzioni:**
1. Scrivere un programma che prenda come input un numero intero positivo `N`.
2. Utilizzare un ciclo `while` per calcolare la somma di tutti i numeri interi da 1 a `N`.

**Codice di esempio:**
```java
import java.util.Scanner;

public class SommaNumeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiedere all'utente di inserire un numero intero positivo
        System.out.println("Inserisci un numero intero positivo: ");
        int N = input.nextInt();

        // Verifica che il numero sia positivo
        if (N < 1) {
            System.out.println("Il numero deve essere positivo.");
            return;
        }

        int somma = 0;
        int i = 1;

        // Calcolare la somma con un ciclo while
        while (i <= N) {
            somma += i;
            i++;
        }

        // Stampare il risultato
        System.out.println("La somma dei numeri da 1 a " + N + " è: " + somma);

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac SommaNumeri.java`
  - Esecuzione: `java SommaNumeri`

