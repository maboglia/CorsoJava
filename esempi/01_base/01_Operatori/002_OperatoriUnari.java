### Codice

```java
class OperatoreIncremento {
    public static void main(String args[]) {
        int a = 1, b;
        System.out.println("a vale " + a);

        a++;
        System.out.println("Dopo a++ a vale " + a);

        b = a++;
        System.out.println("Dopo b = a++ a vale " + a + " e b vale " + b);

        b = ++a;
        System.out.println("Dopo b = ++a a vale " + a + " e b vale " + b);
    }
}
```

---

### Spiegazione

1. **`int a = 1, b;`**

   * Inizializza la variabile `a` a **1**.
   * La variabile `b` è dichiarata ma non ancora valorizzata.

---

2. **`System.out.println("a vale " + a);`**

   * Stampa:

     ```
     a vale 1
     ```

---

3. **`a++;`**

   * `a++` è l’**operatore di post-incremento**: incrementa `a` di **1**.
   * Quindi `a = 2`.

   Output:

   ```
   Dopo a++ a vale 2
   ```

---

4. **`b = a++;`**

   * Qui succedono due cose:

     * Prima assegna a `b` il valore attuale di `a` (**2**).
     * Poi incrementa `a` di 1 → `a = 3`.
   * Risultato: `a = 3`, `b = 2`.

   Output:

   ```
   Dopo b = a++ a vale 3 e b vale 2
   ```

---

5. **`b = ++a;`**

   * Qui invece usiamo il **pre-incremento** (`++a`).
   * Prima incrementa `a` → `a = 4`.
   * Poi assegna il nuovo valore di `a` a `b` → `b = 4`.
   * Risultato: `a = 4`, `b = 4`.

   Output:

   ```
   Dopo b = ++a a vale 4 e b vale 4
   ```

---

### Riassunto

| Operazione  | Valore di `a` | Valore di `b` | Spiegazione                                     |
| ----------- | ------------- | ------------- | ----------------------------------------------- |
| `int a = 1` | 1             | -             | inizializzazione                                |
| `a++`       | 2             | -             | incremento di `a`                               |
| `b = a++`   | 3             | 2             | assegna prima il valore vecchio, poi incrementa |
| `b = ++a`   | 4             | 4             | incrementa prima, poi assegna                   |

---

### Concetto chiave

* **Post-incremento (`a++`)**: usa prima il valore corrente, poi incrementa.
* **Pre-incremento (`++a`)**: incrementa subito e poi usa il nuovo valore.

---
