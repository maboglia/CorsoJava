
### Operatori aritmetici , relazionali , e di assegnazione 

* Aritmetici: + - * / %
* Relazionali: == != > < >= <=
* Bitwise (interi): & | ^ << >> ~
* Di assegnazione: = += -= *= /= &= |= ^=
* Di assegnazione/incremento: ++ -- %=

### I caratteri sono considerati interi

### Operatori per Booleani

&& (AND) || (OR) ! (NOT)

### Attenzione:
* Fenomeno short-circuit
... f1(x) && f2(y) && f3(z) ...
f2 e f3 possono NON essere valutate
* Gli operatori logici agiscono solo su booleani
  * Un intero NON viene considerato un booleano
  * Gli operatori relazionali forniscono valori booleani

Operatori su reference

### Per i puntatori/reference, sono definiti:
* Gli operatori relazionali == e !=
  * N.B. test sul puntatore NON sull'oggetto
* Le assegnazioni
* L'operatore "punto"
* NON è prevista l'aritmetica dei puntatori 

## Operatori matematici

### Operazioni matematiche complesse sono permesse dalla classe (!) Math (package java.lang):

Math.sin (x) calcola sin(x)
Math.sqrt (x) calcola x^(1/2)
Math.PI ritorna pi
Math.abs (x) calcola |x|
Math.exp (x) calcola e^x
Math.pow (x, y) calcola x^y
...
* Esempio
z = Math.sin (x) – Math.PI / Math.sqrt(y)


