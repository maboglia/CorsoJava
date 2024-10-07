# **Esercitazione Pratica: Array e Stringhe**

#### **Obiettivo:**
Questa esercitazione si focalizza sull'uso di array e stringhe in Java. Gli studenti impareranno a creare, manipolare e ordinare array di numeri e stringhe, e a risolvere problemi comuni legati alla gestione di dati strutturati.

---

### **Esercizio 1: Ordinamento di un Array di Numeri Interi**

**Istruzioni:**
1. Scrivere un programma che richieda all'utente di inserire 5 numeri interi e li salvi in un array.
2. Utilizzare l'algoritmo **Bubble Sort** per ordinare l'array in ordine crescente.
3. Stampare l'array ordinato.

**Codice di esempio:**
```java
import java.util.Scanner;

public class OrdinamentoNumeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creare un array di 5 numeri interi
        int[] numeri = new int[5];

        // Chiedere all'utente di inserire i numeri
        System.out.println("Inserisci 5 numeri interi:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri[i] = input.nextInt();
        }

        // Ordinamento con Bubble Sort
        for (int i = 0; i < numeri.length - 1; i++) {
            for (int j = 0; j < numeri.length - 1 - i; j++) {
                if (numeri[j] > numeri[j + 1]) {
                    // Scambiare i numeri
                    int temp = numeri[j];
                    numeri[j] = numeri[j + 1];
                    numeri[j + 1] = temp;
                }
            }
        }

        // Stampare l'array ordinato
        System.out.println("Array ordinato:");
        for (int numero : numeri) {
            System.out.print(numero + " ");
        }

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac OrdinamentoNumeri.java`
  - Esecuzione: `java OrdinamentoNumeri`

---

### **Esercizio 2: Ricerca del Numero Maggiore e Minore in un Array**

**Istruzioni:**
1. Scrivere un programma che prenda 5 numeri interi come input e li salvi in un array.
2. Determinare e stampare il numero maggiore e minore dell'array.

**Codice di esempio:**
```java
import java.util.Scanner;

public class MaggioreMinore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creare un array di 5 numeri interi
        int[] numeri = new int[5];

        // Chiedere all'utente di inserire i numeri
        System.out.println("Inserisci 5 numeri interi:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri[i] = input.nextInt();
        }

        // Inizializzare variabili per il massimo e il minimo
        int massimo = numeri[0];
        int minimo = numeri[0];

        // Trovare il massimo e il minimo
        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }
            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
        }

        // Stampare il numero maggiore e minore
        System.out.println("Il numero maggiore è: " + massimo);
        System.out.println("Il numero minore è: " + minimo);

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac MaggioreMinore.java`
  - Esecuzione: `java MaggioreMinore`

---

### **Esercizio 3: Ordinamento Alfabetico di Parole**

**Istruzioni:**
1. Scrivere un programma che richieda all'utente di inserire 5 parole e le salvi in un array.
2. Utilizzare il metodo `Arrays.sort()` per ordinare le parole in ordine alfabetico.
3. Stampare l'array ordinato.

**Codice di esempio:**
```java
import java.util.Arrays;
import java.util.Scanner;

public class OrdinamentoParole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creare un array di 5 parole
        String[] parole = new String[5];

        // Chiedere all'utente di inserire le parole
        System.out.println("Inserisci 5 parole:");
        for (int i = 0; i < parole.length; i++) {
            System.out.print("Parola " + (i + 1) + ": ");
            parole[i] = input.next();
        }

        // Ordinare l'array di parole in ordine alfabetico
        Arrays.sort(parole);

        // Stampare l'array ordinato
        System.out.println("Parole ordinate alfabeticamente:");
        for (String parola : parole) {
            System.out.print(parola + " ");
        }

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac OrdinamentoParole.java`
  - Esecuzione: `java OrdinamentoParole`

---

### **Esercizio 4: Conta delle Vocali in una Stringa**

**Istruzioni:**
1. Scrivere un programma che chieda all'utente di inserire una frase.
2. Contare il numero di vocali (a, e, i, o, u) presenti nella stringa e stampare il risultato.

**Codice di esempio:**
```java
import java.util.Scanner;

public class ContaVocali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiedere all'utente di inserire una frase
        System.out.println("Inserisci una frase: ");
        String frase = input.nextLine();

        // Inizializzare il contatore delle vocali
        int contaVocali = 0;

        // Contare le vocali
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contaVocali++;
            }
        }

        // Stampare il numero di vocali
        System.out.println("Il numero di vocali nella frase è: " + contaVocali);

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac ContaVocali.java`
  - Esecuzione: `java ContaVocali`

---

### **Esercizio 5: Verifica se una Parola è Palindroma**

**Istruzioni:**
1. Scrivere un programma che prenda una parola come input e verifichi se è palindroma.
2. Una parola è **palindroma** se si legge allo stesso modo da sinistra a destra e da destra a sinistra (ad esempio, "anna" è palindroma).

**Codice di esempio:**
```java
import java.util.Scanner;

public class Palindroma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiedere all'utente di inserire una parola
        System.out.println("Inserisci una parola: ");
        String parola = input.next();

        // Verificare se la parola è palindroma
        boolean èPalindroma = true;
        int lunghezza = parola.length();

        for (int i = 0; i < lunghezza / 2; i++) {
            if (parola.charAt(i) != parola.charAt(lunghezza - i - 1)) {
                èPalindroma = false;
                break;
            }
        }

        // Stampare il risultato
        if (èPalindroma) {
            System.out.println(parola + " è una parola palindroma.");
        } else {
            System.out.println(parola + " non è una parola palindroma.");
        }

        input.close();
    }
}
```

**Compilazione ed Esecuzione:**
- Compila ed esegui il programma dal tuo IDE o usa i comandi:
  - Compilazione: `javac Palindroma.java`
 

 - Esecuzione: `java Palindroma`

