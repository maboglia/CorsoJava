# **Esercitazione Pratica: Fondamenti di Programmazione**

#### **Obiettivo:**
In questa esercitazione, gli studenti impareranno a lavorare con variabili e tipi di dati primitivi, utilizzeranno operatori aritmetici e logici, e gestiranno l’input/output con la classe `Scanner`.

---

### **Esercizio 1: Calcolo della Media di Tre Numeri**

**Istruzioni:**
1. Scrivere un programma che richieda all'utente di inserire tre numeri interi.
2. Calcolare la media dei tre numeri e stamparla a schermo.

**Codice di esempio:**
```java
import java.util.Scanner;

public class MediaNumeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiedere all'utente di inserire tre numeri
        System.out.println("Inserisci il primo numero: ");
        int num1 = input.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        int num2 = input.nextInt();

        System.out.println("Inserisci il terzo numero: ");
        int num3 = input.nextInt();

        // Calcolare la media
        double media = (num1 + num2 + num3) / 3.0;

        // Stampare il risultato
        System.out.println("La media dei tre numeri è: " + media);

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac MediaNumeri.java`
  - Esecuzione: `java MediaNumeri`

---

### **Esercizio 2: Verifica di Numero Pari o Dispari**

**Istruzioni:**
1. Scrivere un programma che richieda all'utente di inserire un numero intero.
2. Utilizzare l'operatore modulo (`%`) per verificare se il numero è pari o dispari.
3. Stampare un messaggio che indica se il numero è pari o dispari.

**Codice di esempio:**
```java
import java.util.Scanner;

public class PariDispari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiedere all'utente di inserire un numero
        System.out.println("Inserisci un numero intero: ");
        int numero = input.nextInt();

        // Verificare se il numero è pari o dispari
        if (numero % 2 == 0) {
            System.out.println("Il numero " + numero + " è pari.");
        } else {
            System.out.println("Il numero " + numero + " è dispari.");
        }

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac PariDispari.java`
  - Esecuzione: `java PariDispari`

---

### **Esercizio 3: Convertitore di Temperatura (Celsius a Fahrenheit)**

**Istruzioni:**
1. Scrivere un programma che prenda come input una temperatura in gradi Celsius dall’utente.
2. Convertire la temperatura in Fahrenheit usando la formula:
   \[
   F = (C \times 9/5) + 32
   \]
3. Stampare il risultato a schermo.

**Codice di esempio:**
```java
import java.util.Scanner;

public class ConvertitoreTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiedere all'utente di inserire una temperatura in gradi Celsius
        System.out.println("Inserisci la temperatura in gradi Celsius: ");
        double celsius = input.nextDouble();

        // Convertire in Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Stampare il risultato
        System.out.println("La temperatura in Fahrenheit è: " + fahrenheit);

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac ConvertitoreTemperatura.java`
  - Esecuzione: `java ConvertitoreTemperatura`

---

### **Esercizio 4: Confronto tra Due Numeri**

**Istruzioni:**
1. Scrivere un programma che richieda all'utente di inserire due numeri interi.
2. Confrontare i due numeri e stampare un messaggio che indichi quale dei due è maggiore o se sono uguali.

**Codice di esempio:**
```java
import java.util.Scanner;

public class ConfrontoNumeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiedere all'utente di inserire due numeri
        System.out.println("Inserisci il primo numero: ");
        int num1 = input.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        int num2 = input.nextInt();

        // Confrontare i numeri
        if (num1 > num2) {
            System.out.println(num1 + " è maggiore di " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " è minore di " + num2);
        } else {
            System.out.println(num1 + " è uguale a " + num2);
        }

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac ConfrontoNumeri.java`
  - Esecuzione: `java ConfrontoNumeri`

---

### **Esercizio 5: Calcolatore Semplice**

**Istruzioni:**
1. Scrivere un programma che prenda due numeri e un'operazione (`+`, `-`, `*`, `/`) come input dall'utente.
2. Effettuare l'operazione corrispondente sui due numeri e stampare il risultato.

**Codice di esempio:**
```java
import java.util.Scanner;

public class Calcolatore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiedere all'utente di inserire due numeri
        System.out.println("Inserisci il primo numero: ");
        double num1 = input.nextDouble();

        System.out.println("Inserisci il secondo numero: ");
        double num2 = input.nextDouble();

        // Chiedere l'operazione
        System.out.println("Scegli un'operazione (+, -, *, /): ");
        char operazione = input.next().charAt(0);

        // Eseguire l'operazione
        double risultato = 0;
        switch (operazione) {
            case '+':
                risultato = num1 + num2;
                break;
            case '-':
                risultato = num1 - num2;
                break;
            case '*':
                risultato = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    risultato = num1 / num2;
                } else {
                    System.out.println("Errore: divisione per zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operazione non valida.");
                return;
        }

        // Stampare il risultato
        System.out.println("Il risultato è: " + risultato);

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac Calcolatore.java`
  - Esecuzione: `java Calcolatore`
