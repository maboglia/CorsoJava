# Operatori aritmetici, relazionali, di assegnazione 


* Di assegnazione: = += -= *= /= &= |= ^=
* Di assegnazione/incremento: ++ -- %=

* Operatori Aritmetici:` + - * / %`

| Operatore | Significato    |
| --------- | -------------- |
| +         | addizione      |
| \-        | sottrazione    |
| \*        | motiplicazione |
| /         | divisione      |
| %         | resto          |
| ++var     | preincremento   |
| \--var    | predecremento   |
| var++     | postincremento  |
| var--     | postdecremento  |

---

| Operatore | Significato               |
| --------- | ------------------------- |
| \=        | addizione                |
| +=        | addizione assegnazione       |
| \-=       | sottrazione assegnazione    |
| \*=       | motiplicazione assegnazione |
| /=        | divisione assegnazione       |
| %=        | resto assegnazione      |

---


* Relazionali: == != > < >= <=

| Operatore | Significato              |
| --------- | ------------------------ |
| <         | minore di                |
| <=        | minore di o uguale a    |
| \>        | maggiore di             |
| \>=       | maggiore di o uguale a |
| \==       | uguale a                 |
| !=        | non uguale / diverso     |


---


### Operatori per Booleani


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

---


## Operatori su reference

### Per i puntatori/reference, sono definiti:

* Gli operatori relazionali == e !=
  * N.B. test sul puntatore NON sull'oggetto
* Le assegnazioni
* L'operatore "punto"
* NON è prevista l'aritmetica dei puntatori 

---


## Operatori matematici

 Operazioni matematiche complesse sono permesse dalla **classe Math** (package java.lang)

* `Math.sin (x) calcola sin(x)`
* `Math.sqrt (x) calcola x^(1/2)`
* `Math.PI ritorna pi`
* `Math.abs (x) calcola |x|`
* `Math.exp (x) calcola e^x`
* `Math.pow (x, y) calcola x^y`

Esempio

* `z = Math.sin (x) – Math.PI / Math.sqrt(y)`

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
