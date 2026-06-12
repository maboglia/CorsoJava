### Le variabili e le costanti in Java (2024)

In Java, **variabili** e **costanti** sono i fondamenti per la gestione dei dati. Le variabili rappresentano delle aree di memoria destinate a memorizzare informazioni che possono cambiare durante l'esecuzione del programma, mentre le costanti sono utilizzate per memorizzare valori che rimangono invariati. Con le versioni avanzate del linguaggio Java, il concetto di variabili e costanti è rimasto centrale per il funzionamento e l'efficienza dei programmi.

---

### **Variabili: concetti chiave**

- Una **variabile** è **un'area di memoria** identificata da un **nome**.
- Il suo scopo è quello di contenere un valore di un **certo tipo**.
- Le variabili sono usate per **memorizzare dati** durante l'esecuzione del programma.
- Il nome di una variabile è un **identificatore**:
  - Può contenere lettere, numeri e l'underscore `_`.
  - Non deve coincidere con una parola chiave del linguaggio Java (ad es., `int`, `class`).
  - Si consiglia di scegliere un **nome significativo** per migliorare la leggibilità del programma.
 
---
 
![dichiarazione variabile](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Language/01_lang_base/01_operatori_tipi_expr/assignment.png)

---

### Esempio di utilizzo:

```java
public class Triangolo {
    public static void main(String[] args) {
        int base, altezza; // Dichiarazione di variabili locali
        double area;
        
        base = 5;
        altezza = 10;
        area = base * altezza / 2;

        System.out.println(area);
    }
}
```

Questo esempio mostra come l'uso delle variabili renda il programma più **chiaro** e più facile da comprendere.

---

### Dichiarazione di variabili

- In Java, **ogni variabile deve essere dichiarata** prima del suo utilizzo.
- La dichiarazione richiede la specifica del **nome** della variabile e del suo **tipo**.
  
Esempio:
```java
int base, altezza;
double area;
```

---

### **Regole per le variabili:**
- Ogni variabile deve essere dichiarata **una sola volta**.
- Le variabili non possono essere utilizzate finché non sono state **inizializzate**.

---

### Assegnazione:

L'assegnazione permette di **memorizzare un valore** in una variabile. Un'assegnazione può essere effettuata con un letterale o con il risultato di un'espressione.

Esempio:
```java
base = 5;
altezza = 10;
area = base * altezza / 2;
```

---

### Dichiarazione + Assegnazione:

Si può combinare la dichiarazione e l'assegnazione in un'unica linea:
```java
int base = 5;
int altezza = 10;
double area = base * altezza / 2;
```

---

### **Scope: ambito di visibilità delle variabili**

Lo **scope** di una variabile definisce dove essa può essere utilizzata nel programma. Le variabili possono essere **locali** (definite all'interno di un metodo o di un blocco) o **globali** (definite a livello di classe).

Esempio:
```java
class Nascoste {
  static int x, y; // Variabili globali

  static void f() {
    int x;
    x = 1;  // Variabile locale
    y = 1;  // Variabile globale
    System.out.println(x); // Stampa la variabile locale
    System.out.println(y); // Stampa la variabile globale
  }

  public static void main(String[] args) {
    x = 0; // Variabile globale
    y = 0; // Variabile globale
    f();
    System.out.println(x); // Stampa la variabile globale
    System.out.println(y); // Stampa la variabile globale
  }
}
```

---

### Costanti

Le **costanti** sono variabili il cui valore **non può cambiare** dopo essere stato inizializzato. Per dichiarare una costante, si utilizza il modificatore `final`:

```java
final double IVA = 0.22;
```

- Il modificatore **final** impedisce di assegnare un nuovo valore alla variabile dopo la sua inizializzazione.
- L'uso delle costanti può aiutare a **prevenire errori** e consente al compilatore di eseguire **ottimizzazioni**.

---

### **L'attributo `final`:** 

- **Variabile:** la trasforma in una costante.
- **Metodo:** impedisce l'overriding (ridefinizione) in una classe derivata.
- **Classe:** impedisce la derivazione di altre classi (la classe diventa una "foglia" nell'albero di ereditarietà).

---

### **Esempio di costanti:**
```java
final double PI = 3.14159;
final int MAX_VALUE = 100;
```

---

### **Input dell'utente**

Per ottenere valori dall'utente, in Java si può utilizzare la classe `Scanner`, che appartiene al package **`java.util`**:

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = input.nextInt();
        System.out.println("Hai inserito: " + numero);
    }
}
```

---

### **Conclusione:**

Le variabili e le costanti rappresentano due elementi fondamentali nella programmazione in Java. Le prime consentono di **memorizzare dati variabili** nel corso dell'esecuzione di un programma, mentre le seconde garantiscono la sicurezza e la stabilità delle informazioni che non devono cambiare. Utilizzare questi elementi in modo corretto aiuta a scrivere codice più chiaro, efficiente e meno incline agli errori.

---

**Esempi e risorse aggiuntive:**

- [Raccolta di esempi su variabili e costanti](https://github.com/maboglia/CorsoJava/blob/master/esempi/00_variabili_costanti.md)
- [Altri esempi](https://github.com/maboglia/CorsoJava/tree/master/esempi/01_base/02_variabili)