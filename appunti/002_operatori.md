# Operatori 



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


* [esempi](https://github.com/maboglia/CorsoJava/tree/master/esempi/01_base/00_Foundations)

