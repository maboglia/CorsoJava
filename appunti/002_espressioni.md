# Espressioni

Le espressioni in programmazione sono combinazioni di valori, operatori e chiamate di funzioni che possono essere valutate per produrre un risultato. Le espressioni possono rappresentare calcoli aritmetici, valutazioni booleane, concatenazioni di stringhe e altro ancora. Le espressioni sono fondamentali per la creazione di logica e la manipolazione dei dati all'interno di un programma. Ecco alcuni esempi di espressioni:

---

### Espressioni in Java (2024)

In Java, un'espressione è una combinazione di **operandi** (variabili, valori o oggetti) e **operatori** (simboli che eseguono operazioni su uno o più operandi). Un'espressione calcola un valore e può essere utilizzata in vari contesti, come assegnazioni, condizioni e loop.

---

### **Tipi di espressioni**

1. **Espressioni letterali**  
   Un'espressione letterale è costituita da un valore costante (un numero, un carattere, ecc.).
   - Esempi:
     ```java
     5      // Un intero
     'A'    // Un carattere
     3.14   // Un valore decimale (double)
     true   // Un booleano
     ```

---

2. **Espressioni di variabili**  
   Un'espressione di variabile utilizza una variabile come operando.
   - Esempio:
     ```java
     int x = 10;
     x;  // Variabile che rappresenta il valore 10
     ```

---

3. **Espressioni aritmetiche**  
   Queste espressioni coinvolgono operazioni matematiche su numeri e variabili. Gli operatori principali sono:
   - `+` (somma), `-` (sottrazione), `*` (moltiplicazione), `/` (divisione), `%` (modulo)
   - Esempio:
     ```java
     int somma = 10 + 5;         // 15
     int prodotto = 2 * 3;       // 6
     int modulo = 10 % 3;        // 1 (resto)
     ```

---

4. **Espressioni di assegnazione**  
   Le espressioni di assegnazione memorizzano il risultato di un'espressione in una variabile.
   - Operatore: `=`
   - Esempio:
     ```java
     int x;
     x = 5 + 3;   // Assegna 8 a x
     ```

---

5. **Espressioni boolean**  
   Espressioni che restituiscono `true` o `false`, spesso utilizzate nelle condizioni.
   - Operatori logici:
     - `&&` (and), `||` (or), `!` (not)
   - Operatori di confronto:
     - `==` (uguale), `!=` (diverso), `<`, `>`, `<=`, `>=`
   - Esempio:
     ```java
     boolean isEqual = (5 == 5);  // true
     boolean isGreater = (10 > 3); // true
     ```

---

6. **Espressioni condizionali (ternarie)**  
   L'operatore ternario valuta un'espressione e restituisce un valore in base a una condizione.
   - Sintassi:
     ```java
     condizione ? valoreSeTrue : valoreSeFalse;
     ```
   - Esempio:
     ```java
     int max = (a > b) ? a : b;
     ```

---

### **Operatori in Java**

Gli operatori in Java possono essere classificati in base alla loro funzione:

#### **Operatori aritmetici**  
Utilizzati per eseguire operazioni matematiche.
- `+` (somma)
- `-` (sottrazione)
- `*` (moltiplicazione)
- `/` (divisione)
- `%` (modulo)

---

#### **Operatori di assegnazione**  
Permettono di assegnare il valore di un'espressione a una variabile.
- `=` (assegnazione semplice)
- Operatori di assegnazione combinati:
  - `+=`, `-=`, `*=`, `/=`, `%=`
  - Esempio:
    ```java
    int a = 10;
    a += 5;  // Equivale a: a = a + 5;
    ```

---

#### **Operatori di confronto**  
Questi operatori restituiscono un valore booleano (`true` o `false`).
- `==` (uguale)
- `!=` (diverso)
- `<` (minore)
- `>` (maggiore)
- `<=` (minore o uguale)
- `>=` (maggiore o uguale)

---

#### **Operatori logici**  
Utilizzati nelle espressioni booleane per combinare più condizioni.
- `&&` (and logico)
- `||` (or logico)
- `!` (not logico)

---

#### **Operatori di incremento/decremento**  
Usati per aumentare o diminuire il valore di una variabile di 1.
- `++` (incremento)
- `--` (decremento)
  
  **Pre-incremento e post-incremento**:
  - `++x` (incrementa prima di usare il valore)
  - `x++` (incrementa dopo aver usato il valore)

Esempio:
```java
int a = 5;
int b = ++a; // a viene incrementato prima, quindi b = 6
int c = a--; // a viene usato prima, quindi c = 6 e poi a = 5
```

---

### **Ordine di valutazione: precedenza e associatività degli operatori**

In un'espressione complessa, l'ordine con cui gli operatori vengono valutati dipende dalla loro **precedenza** e **associatività**.

---

- **Precedenza**: gli operatori con precedenza più alta vengono valutati per primi.
  - Ad esempio: `*` e `/` hanno precedenza più alta di `+` e `-`.

---

- **Associatività**: quando due operatori hanno la stessa precedenza, l'**associatività** determina l'ordine di valutazione.
  - Ad esempio, la maggior parte degli operatori aritmetici sono **associativi da sinistra**:
    ```java
    int x = 5 - 3 + 2; // (5 - 3) + 2 = 4
    ```
  - L'operatore di assegnazione `=` è **associativo da destra**:
    ```java
    int x, y;
    x = y = 5; // Assegna 5 a y, poi a x
    ```

---

### **Espressioni con casting**

In alcuni casi, è necessario forzare la conversione di un tipo di dato in un altro. Questo processo è chiamato **casting**.

Esempio:
```java
int x = 10;
double y = (double) x / 3; // Il cast forza la divisione in double
```

---

### **Espressioni di stringhe**

In Java, si possono utilizzare le espressioni per **concatenare** stringhe utilizzando l'operatore `+`.
```java
String nome = "Mario";
String saluto = "Ciao, " + nome;  // Concatenazione di stringhe
```

---

### **Conclusione**

Le espressioni in Java sono fondamentali per eseguire operazioni su dati, effettuare confronti, assegnare valori e controllare il flusso di un programma. La comprensione dei vari tipi di espressioni e degli operatori utilizzati in Java è essenziale per scrivere codice efficiente e corretto.

[esempi](https://github.com/maboglia/CorsoJava/blob/master/esempi/01_Operatori_Tipi.md)

