# Operatori nei linguaggi di programmazione

Negli linguaggi di programmazione, gli operatori sono simboli speciali o parole chiave che eseguono operazioni su uno o più operandi. Gli operandi sono i valori o le variabili su cui l'operatore agisce. Gli operatori sono fondamentali per eseguire operazioni aritmetiche, logiche, di confronto e altre azioni specifiche all'interno di un programma. Ecco una breve definizione di alcuni tipi comuni di operatori:

---

1. **Operatori Aritmetici:**
   - Eseguono operazioni matematiche come l'addizione, la sottrazione, la moltiplicazione e la divisione.
   - Esempi: `+` (addizione), `-` (sottrazione), `*` (moltiplicazione), `/` (divisione).

---

2. **Operatori di Confronto o Relazionali:**
   - Confrontano due valori e restituiscono un valore booleano che indica se la relazione è vera o falsa.
   - Esempi: `==` (uguale a), `!=` (diverso da), `<` (minore di), `>` (maggiore di), `<=` (minore o uguale a), `>=` (maggiore o uguale a).

---

3. **Operatori Logici:**
   - Eseguono operazioni logiche su valori booleani. Solitamente utilizzati in strutture di controllo decisionale.
   - Esempi: `&&` (AND logico), `||` (OR logico), `!` (NOT logico).

---

4. **Operatori di Assegnamento:**
   - Assegnano un valore a una variabile.
   - Esempio: `=` (assegnamento), `+=` (assegnamento con somma), `-=` (assegnamento con sottrazione), `*=` (assegnamento con moltiplicazione), `/=` (assegnamento con divisione).

---

5. **Operatori di Incremento e Decremento:**
   - Modificano il valore di una variabile incrementandolo o decrementandolo di una certa quantità.
   - Esempi: `++` (incremento), `--` (decremento).

---

6. **Operatori Bitwise:**
   - Eseguono operazioni bit a bit su numeri interi.
   - Esempi: `&` (AND bit a bit), `|` (OR bit a bit), `^` (XOR bit a bit), `~` (NOT bit a bit), `<<` (shift a sinistra), `>>` (shift a destra).

---

7. **Operatori Ternari:**
   - Sono operatori condizionali che valutano una condizione e restituiscono un valore in base al risultato della condizione.
   - Esempio: `condizione ? valore_se_vero : valore_se_falso`.

Gli operatori sono essenziali per manipolare dati e controllare il flusso di esecuzione all'interno di un programma, consentendo la creazione di logica complessa e la gestione di variabili e valori.

---

# Operatori in Java

## Operatori aritmetici


* Di assegnazione: = += -= *= /= &= |= ^=
* Di assegnazione/incremento: ++ -- %=

* Operatori Aritmetici:` + - * / %`

| Operatore | Significato    |
| --------- | -------------- |
| `+`         | addizione      |
| `-`        | sottrazione    |
| `*`        | motiplicazione |
| `/`         | divisione      |
| `%`         | resto          |
| `++var`     | preincremento   |
| `--var`    | predecremento   |
| `var++`     | postincremento  |
| `var--`     | postdecremento  |

---

## Operatori di assegnazione 

| Operatore | Significato               |
| --------- | ------------------------- |
| `=`        | assegnazione                |
| `+=`        | addizione assegnazione       |
| `-=`       | sottrazione assegnazione    |
| `*=`       | motiplicazione assegnazione |
| `/=`        | divisione assegnazione       |
| `%=`        | resto assegnazione      |

---


## Operatori relazionali
`== != > < >= <=`

| Operatore | Significato              |
| --------- | ------------------------ |
| `<`         | minore di                |
| `<=`        | minore di o uguale a    |
| `>`        | maggiore di             |
| `>=`       | maggiore di o uguale a |
| `==`       | uguale a                 |
| `!=`        | non uguale / diverso     |


---


### Operatori per Booleani


* Bitwise (interi): `& | ^ << >> ~`

| Operatore | Significato       |
| --------- | ----------------- |
| `&&`        | AND logico |
| `||`      | OR logico  |
| `!`         | NOT               |
| `^`         | exclusive OR      |

#### Attenzione:

* Gli operatori logici agiscono **solo su booleani**
  * Un intero NON viene considerato un booleano
  * Gli operatori relazionali forniscono valori booleani

---


## Operatori su reference

### Per i riferimenti/reference, sono definiti:

* Gli operatori relazionali == e !=
  * test sul riferimento all'oggetto, **NON sull'oggetto**
* Le assegnazioni
* L'operatore "punto"
* NON è prevista l'aritmetica dei puntatori, vengono gestiti dalla JVM 

---


## Operazioni matematiche complesse

 Operazioni matematiche complesse sono permesse dalla **classe Math** (package java.lang)

* `Math.sin (x) calcola sin(x)`
* `Math.sqrt (x) calcola x^(1/2)`
* `Math.PI ritorna pi`
* `Math.abs (x) calcola |x|`
* `Math.exp (x) calcola e^x`
* `Math.pow (x, y) calcola x^y`

### Esempio

* `z = Math.sin (x) – Math.PI / Math.sqrt(y)`

---

## Comparazione del tipo di dato: Type Comparison Operator

* `instanceof` - Verifica se un certo oggetto è istanza di un certo Tipo di dato
* p.es: `if (a instanceof Automobile) //fai qualcosa`

---

## Caratteri speciali

Literal|Represents
---|---
`\n`|New line
`\t`|Horizontal tab
`\b`|Backspace
`\r`|Carriage return
`\f`|Form feed
`\\` |Backslash
`\"`|Double quote
`\ddd`|Octal character
`\xdd`|Hexadecimal character
`\udddd`|Unicode character


* [raccolta esempi](https://github.com/maboglia/CorsoJava/blob/master/esempi/01_Operatori_Tipi.md)
* [altri esempi](https://github.com/maboglia/CorsoJava/tree/master/esempi/01_base/01_Operatori)

---

**Domande:**

1. Considera il seguente frammento di codice.

```java
arrayOfInts[j] > arrayOfInts[j+1]
```

Quali operatori contiene il codice?

- Risposta: Contiene l'operatore di confronto ">", che confronta se l'elemento nell'indice j è maggiore dell'elemento nell'indice j+1 nell'array.

2. Considera il seguente frammento di codice.

```java
int i = 10;
int n = i++%5;
```

- Quali sono i valori di i e n dopo l'esecuzione del codice?
  - Risposta: Dopo l'esecuzione, i è 11 e n è 0.
- Quali sono i valori finali di i e n se, invece di utilizzare l'operatore di incremento postfix (i++), si utilizza la versione prefix (++i))?
  - Risposta: Con l'operatore di incremento prefix, i diventa 11 e n diventa 1.

3. Per invertire il valore di un booleano, quale operatore utilizzeresti?

   - Risposta: L'operatore di negazione logica "!".

4. Quale operatore viene utilizzato per confrontare due valori, = o == ?

   - Risposta: L'operatore di confronto è "==".

5. Spiega il seguente frammento di codice: `result = someCondition ? value1 : value2;`

   - Risposta: Questo è un operatore ternario condizionale. Se someCondition è vera, result verrà assegnato a value1; altrimenti, verrà assegnato a value2.

**Esercizi:**

1. Modifica il programma seguente per utilizzare gli assegnamenti composti:

```java
class ArithmeticDemo {
     public static void main (String[] args){
          int result = 1 + 2; // result è ora 3
          System.out.println(result);

          result = result - 1; // result è ora 2
          System.out.println(result);

          result = result * 2; // result è ora 4
          System.out.println(result);

          result = result / 2; // result è ora 2
          System.out.println(result);

          result = result + 8; // result è ora 10
          result = result % 7; // result è ora 3
          System.out.println(result);
     }
}
```

- Risposta: Modificare gli operatori di assegnamento nelle espressioni con gli operatori composti (+=, -=, *=, /=, %=).

2. Nel programma seguente, spiega perché il valore "6" viene stampato due volte di seguito:

```java
class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;                     
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"
    }
}
```

- Risposta: La linea `System.out.println(i++);` stampa "6" perché utilizza l'incremento postfix, quindi stampa il valore di i prima di incrementarlo. Successivamente, quando viene stampato nuovamente, i è stato incrementato a 7.
