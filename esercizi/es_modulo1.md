# **Esercitazione Pratica: Scrivere e compilare semplici programmi**

#### **Obiettivo:**
L’obiettivo di questa esercitazione è quello di far familiarizzare gli studenti con la sintassi base di Java, l'ambiente di sviluppo, e il processo di scrittura, compilazione ed esecuzione di un programma Java.

---

### **Esercizio 1: Il classico "Hello World!"**

**Istruzioni:**
1. Aprire il proprio IDE (Eclipse, IntelliJ IDEA, NetBeans, ecc.) o usare il terminale se si preferisce compilare da linea di comando.
2. Creare un nuovo progetto Java.
3. Scrivere un programma che stampi a video la frase "Hello, World!".
   
**Codice di esempio:**
```java
public class HelloWorld {
    public static void main(String[] args) {
        // Stampa il messaggio sulla console
        System.out.println("Hello, World!");
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i seguenti comandi dal terminale:
  - Compilazione: `javac HelloWorld.java`
  - Esecuzione: `java HelloWorld`

---

### **Esercizio 2: Calcolatrice di base**

**Istruzioni:**
1. Scrivere un programma che prenda due numeri come input dall'utente e che stampi la somma dei due numeri.
2. Utilizzare la classe `Scanner` per ottenere l'input dall'utente.

**Codice di esempio:**
```java
import java.util.Scanner;  // Importa la classe Scanner

public class SimpleCalculator {
    public static void main(String[] args) {
        // Creiamo uno Scanner per l'input dell'utente
        Scanner input = new Scanner(System.in);

        // Chiediamo all'utente di inserire due numeri
        System.out.println("Inserisci il primo numero: ");
        int num1 = input.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        int num2 = input.nextInt();

        // Sommiamo i due numeri
        int somma = num1 + num2;

        // Stampiamo il risultato
        System.out.println("La somma è: " + somma);

        // Chiudiamo lo Scanner
        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i seguenti comandi dal terminale:
  - Compilazione: `javac SimpleCalculator.java`
  - Esecuzione: `java SimpleCalculator`

---

### **Esercizio 3: Scambio di variabili**

**Istruzioni:**
1. Scrivere un programma che scambi i valori di due variabili senza usare una variabile temporanea.
2. Stampare i valori delle variabili prima e dopo lo scambio.

**Codice di esempio:**
```java
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Prima dello scambio: a = " + a + ", b = " + b);

        // Scambio dei valori senza variabile temporanea
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Dopo lo scambio: a = " + a + ", b = " + b);
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i seguenti comandi dal terminale:
  - Compilazione: `javac SwapNumbers.java`
  - Esecuzione: `java SwapNumbers`

---

### **Esercizio 4: Area di un Rettangolo**

**Istruzioni:**
1. Scrivere un programma che calcoli l'area di un rettangolo, prendendo la base e l'altezza come input dall'utente.

**Codice di esempio:**
```java
import java.util.Scanner;

public class AreaRettangolo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiediamo all'utente di inserire base e altezza del rettangolo
        System.out.println("Inserisci la base del rettangolo: ");
        double base = input.nextDouble();

        System.out.println("Inserisci l'altezza del rettangolo: ");
        double altezza = input.nextDouble();

        // Calcoliamo l'area
        double area = base * altezza;

        // Stampiamo il risultato
        System.out.println("L'area del rettangolo è: " + area);

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i seguenti comandi dal terminale:
  - Compilazione: `javac AreaRettangolo.java`
  - Esecuzione: `java AreaRettangolo`
