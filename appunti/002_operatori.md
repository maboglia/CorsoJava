# Operatori nei linguaggi di programmazione

Negli linguaggi di programmazione, gli operatori sono simboli speciali o parole chiave che eseguono operazioni su uno o più operandi. Gli operandi sono i valori o le variabili su cui l'operatore agisce. Gli operatori sono fondamentali per eseguire operazioni aritmetiche, logiche, di confronto e altre azioni specifiche all'interno di un programma. Ecco una breve definizione di alcuni tipi comuni di operatori:

1. **Operatori Aritmetici:**
   - Eseguono operazioni matematiche come l'addizione, la sottrazione, la moltiplicazione e la divisione.
   - Esempi: `+` (addizione), `-` (sottrazione), `*` (moltiplicazione), `/` (divisione).

2. **Operatori di Confronto o Relazionali:**
   - Confrontano due valori e restituiscono un valore booleano che indica se la relazione è vera o falsa.
   - Esempi: `==` (uguale a), `!=` (diverso da), `<` (minore di), `>` (maggiore di), `<=` (minore o uguale a), `>=` (maggiore o uguale a).

3. **Operatori Logici:**
   - Eseguono operazioni logiche su valori booleani. Solitamente utilizzati in strutture di controllo decisionale.
   - Esempi: `&&` (AND logico), `||` (OR logico), `!` (NOT logico).

4. **Operatori di Assegnamento:**
   - Assegnano un valore a una variabile.
   - Esempio: `=` (assegnamento), `+=` (assegnamento con somma), `-=` (assegnamento con sottrazione), `*=` (assegnamento con moltiplicazione), `/=` (assegnamento con divisione).

5. **Operatori di Incremento e Decremento:**
   - Modificano il valore di una variabile incrementandolo o decrementandolo di una certa quantità.
   - Esempi: `++` (incremento), `--` (decremento).

6. **Operatori Bitwise:**
   - Eseguono operazioni bit a bit su numeri interi.
   - Esempi: `&` (AND bit a bit), `|` (OR bit a bit), `^` (XOR bit a bit), `~` (NOT bit a bit), `<<` (shift a sinistra), `>>` (shift a destra).

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

