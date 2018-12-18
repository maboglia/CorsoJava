# Operatori

aritmetici, relazionali, di assegnazione 

## Tabelle riassuntive: tipi di dato e operatori 

**Primitive Data Types**

 | type    | bits       |
 | ------- | ---------- |
 | byte    | 8 bits     |
 | short   | 16 bits    |
 | int     | 32 bits    |
 | long    | 64 bits    |
 | float   | 32 bits    |
 | double  | 64 bits    |
 | char    | 16 bits    |
 | boolean | true/false |

**I caratteri sono considerati interi**

**Assignment Operators**
* Di assegnazione: = += -= *= /= &= |= ^=
* Di assegnazione/incremento: ++ -- %=

| Operatore | Significato               |
| --------- | ------------------------- |
| \=        | assignment                |
| +=        | addition assignment       |
| \-=       | subtraction assignment    |
| \*=       | multiplication assignment |
| /=        | division assignment       |
| %=        | remainder assignment      |

**Arithmetic Operators**
* Aritmetici: + - * / %

| Operatore | Significato    |
| --------- | -------------- |
| +         | addition       |
| \-        | subtraction    |
| \*        | multiplication |
| /         | division       |
| %         | remainder      |
| ++var     | preincrement   |
| \--var    | predecrement   |
| var++     | postincrement  |
| var--     | postdecrement  |

**Relational Operators**
* Relazionali: == != > < >= <=

| Operatore | Significato              |
| --------- | ------------------------ |
| <         | less than                |
| <=        | less than or equal to    |
| \>        | greater than             |
| \>=       | greater than or equal to |
| \==       | equal to                 |
| !=        | not equal                |



### Operatori per Booleani


**Logical Operators**
* Bitwise (interi): & | ^ << >> ~

| Operatore | Significato       |
| --------- | ----------------- |
| &&        | short circuit AND |
| \|\|      | short circuit OR  |
| !         | NOT               |
| ^         | exclusive OR      |

#### Attenzione:

* Gli operatori logici agiscono solo su booleani
  * Un intero NON viene considerato un booleano
  * Gli operatori relazionali forniscono valori booleani

## Operatori su reference

### Per i puntatori/reference, sono definiti:

* Gli operatori relazionali == e !=
  * N.B. test sul puntatore NON sull'oggetto
* Le assegnazioni
* L'operatore "punto"
* NON è prevista l'aritmetica dei puntatori 

## Operatori matematici

### Operazioni matematiche complesse sono permesse dalla classe Math (package java.lang)

* `Math.sin (x) calcola sin(x)`
* `Math.sqrt (x) calcola x^(1/2)`
* `Math.PI ritorna pi`
* `Math.abs (x) calcola |x|`
* `Math.exp (x) calcola e^x`
* `Math.pow (x, y) calcola x^y`

Esempio

* `z = Math.sin (x) – Math.PI / Math.sqrt(y)`

## Caratteri speciali

Literal|Represents
---|---
\n|New line
\t|Horizontal tab
\b|Backspace
\r|Carriage return
\f|Form feed
\ \ |Backslash
\\"|Double quote
\ddd|Octal character
\xdd|Hexadecimal character
\udddd|Unicode character
