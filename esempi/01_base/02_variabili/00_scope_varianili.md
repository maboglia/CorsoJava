# scope delle variabili

Il concetto di **scope delle variabili** in Java si riferisce alla parte del programma in cui una variabile è accessibile. Le variabili dichiarate all'interno di un blocco di codice ({ ... }) sono visibili solo all'interno di quel blocco e non sono accessibili al di fuori di esso.

---

```java
public static void main(String[] args)      
{
    {
        double r;

        r = 3.14;
    }

    System.out.println(r);
}
```

---

### Analisi dettagliata

1. **Dichiarazione del metodo `main`**:

    ```java
    public static void main(String[] args)
    ```

    Questo è il metodo principale, il punto di ingresso per l'applicazione Java.

2. **Blocco interno di codice**:

    ```java
    {
        double r;
        r = 3.14;
    }
    ```

    - Qui abbiamo un blocco di codice interno definito da `{ ... }`.
    - `double r;` dichiara una variabile `r` di tipo `double`.
    - `r = 3.14;` assegna il valore `3.14` alla variabile `r`.

    La variabile `r` è dichiarata all'interno di questo blocco di codice. Di conseguenza, il suo scope è limitato a questo blocco. Una volta che l'esecuzione esce da questo blocco (quando la chiusura `}` viene raggiunta), la variabile `r` non esiste più e non è accessibile.

3. **Tentativo di accesso a `r` al di fuori del suo scope**:

    ```java
    System.out.println(r);
    ```

    - Qui il programma tenta di stampare il valore di `r`.
    - Tuttavia, `r` è stata dichiarata all'interno del blocco interno e non è visibile al di fuori di quel blocco. Pertanto, il compilatore genererà un errore.

---

### Errore del compilatore

Quando provi a compilare questo codice, otterrai un errore simile a questo:

```
error: cannot find symbol
System.out.println(r);
                        ^
  symbol:   variable r
  location: class YourClassName
```

Questo errore indica che il compilatore non riesce a trovare la variabile `r` perché il suo scope è limitato al blocco interno in cui è stata dichiarata.

---

### Correzione del codice

Per correggere questo errore, devi dichiarare la variabile `r` in un ambito più ampio, visibile all'interno del metodo `main`, ma al di fuori del blocco interno:

```java
public static void main(String[] args)      
{
    double r;  // Dichiarazione della variabile r

    {
        r = 3.14;  // Assegnazione del valore a r
    }

    System.out.println(r);  // Accesso a r al di fuori del blocco interno
}
```

In questo modo, la variabile `r` viene dichiarata all'interno del metodo `main` e il suo scope è l'intero metodo `main`. Quindi, può essere assegnata all'interno del blocco interno e stampata all'esterno di esso senza problemi. Il risultato sarà:

```
3.14
```
