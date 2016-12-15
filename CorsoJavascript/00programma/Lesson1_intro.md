#Lesson1 Introduction To Javascript

##programma
cos'è JavaScript
incontra JS
perché imparare JS
scrivi un'istruzione JS
la struttura di un programma JS
sintassi
commenti
###step 2
    tipi di dati e variabili
convenzioni di naming
crea una nuova varibile usando Math
incrementare e decrementare
+=
-=
stringhe
unire le stringhe
trovare la lunghezza di una stringa
trovare un carattere in una stringa
tagliare le stringhe
modificare le stringhe: tutto maiuscolo/minuscolo
Booleans
    operazioni logiche
    comparazione tra numeri e valori booleani
undefined e null
###step 3
    Arrays
    perché devi saper utilizzare gli array
    creazione di un array
    accesso a i dati di un array
    array non omogenei
    lavorare con gli array
        trova la lunghezza di un array
        aggiungere elementi a un array
        aggiungere array
        trasformare un array in una stringa
    cose utili da fare con un array
        trova la strada di casa
        decision maker
        crea un generatore di frasi random
###step 4
    Objects
    creare un oggetto
        chiavi senza quote
    accedere ai valori di un oggetto
    aggiungere valori ad un oggetto
        aggiungere chiavi con dot notation
    combinare array e oggetti
        un array di amici
    eslporare gli oggetti in console
    cose utili da fare con gli oggetti
        tieni traccia delle spese
        raccogli informazioni sui tuoi film preferiti
###step 6
    condizioni e cicli
    condizioni
        if statement
        if...else
    loop
        ciclo while
        ciclo for

--------------

JS può modificare il contenuto HTML
```javascript
<!DOCTYPE html>
<html>
<body>

<h1>JavaScript Validate Input</h1>

<p>Inserisci un nmero tra 1 e 10:</p>

<input id="numb" type="number">

<button type="button" onclick="myFunction()">Invia</button>

<p id="demo"></p>

<script>
function myFunction() {
    var x, text;

    // Get the value of the input field with id="numb"
    x = document.getElementById("numb").value;

    // If x is Not a Number or less than one or greater than 10
    if (isNaN(x) || x < 1 || x > 10) {
        text = "Input not valid";
    } else {
        text = "Input OK";
    }
    document.getElementById("demo").innerHTML = text;
}
</script>

</body>
</html> 
```
JS può modificare gli attributi HTML
JS può modificare gli stili CSS / HTML
JS può validare i dati
dove scrivere JS
    JS in head o body
    JS in un file esterno: vantaggi
JS mostrare a video i dati
    window.alert()
    document.write()
    innerHTML
    console.log()
JS statements, semicolon
JS Values
JS Literals
JS Variabili
    unique identifiers
        operatori di assignment
    dichiarazione/creazione di variabili
    dichiarazione/creazione su una sola riga
    value undefined
    
JS operatori
    operatori aritmetici
    operatori di assegnamento
    operatori su stringhe
    aggiungere stringhe e numeri
    comparazione e operatori logici
    operatori e operandi
    precedenza degli operatori
JS tipi di dato
    tipi dinamici
    stringhe
    numeri
    booleans
    arrays
    objects
    operatore typeof
    undefined
    empty values
    null
    differenza tra null e undefined
JS funzioni ed eventi
    sintassi
    invocare le funzioni
    return
    perché usare le funzioni
    l'operatore () chiama la funzione
    funzioni usate come variabili
    scope delle variabili, variabili globali (automatiche) e locali
    ciclo vita delle variabili

JS keywords
JS commenti
    //commenti su una riga
    /*
        commenti
        su più righe
    */
JS è case sensitive
JS convenzioni di naming: CamelCase
JS Character Set
JS Statements
JS Objects
    oggetti della vita reale (e classi)
    proprietà e metodi
    definizione di oggetti
    accedere alle proprietà degli oggetti
    accedere ai metodi degli oggetti
    non dichiarare stringhe, numeri e booleans come oggetti
JS events
    HTML eventi
        onchange
        onclick
        onmouseover
        onmouseout
        onkeydown
        onload
        cosa può fare JS utilizzando i gestori di eventi (handlers)
JS strings
    length
    caratteri speciali
        apici, doppi apici, escape
    spezzare lunghe linee di codice
    proprietà e metodi
        indexOf() cerca una stringa
        search() cerca una stringa nella stringa data
        estrai parti di stringa
            slice(start, end)
            substring(start, end) non accetta indici negativi
            substr(start, length)
        replace() sostituisce stringhe
        toUpperCase(), toLowerCase()
        concat()
        charAt(position)
        charCodeAt(position) ritorna il carattere Unicode
        split(separatore) converte una stringa in un array
JS numbers
    sono SEMPRE float a 64-bit
    il numero massimo di decimali è 17 e la virgola mobile non è sempre accurata
    il prefisso 0x permette di usare i numeri esadecimali
    In JS esiste Infinity e -Infinity
    NaN not a number: operazioni aritmetiche con le stringhe restituiscono NaN
    proprietà e metodi
        Number()
        parseFloat()
        parseInt()
        toString()
        toFixed()
        toPrecision()
        valueOf()

Math Object
    Math.min()
    Math.max()
    Math.random()
    Math.round()
    Math.ceil()
    Math.floor()
    Math costanti
    vedi elenco reference completo

JS Date 
    mostrare le date
    creare l'oggetto Date()
    formati e metodi per le date
    metodi get e metodi set

JS array
    cos'è un array
    creare un array
    accedere agli elementi di un array
    si possono avere oggetti differenti in un array
    gli array sono oggetti
    proprietà e metodi degli array
    la proprietà length
    aggiungere elementi a un array
    scorrere gli elementi di un array
    JS non supporta gli array associativi
    la differenza tra array e oggetti
    valueOf() e toString() convertire array a stringhe
    join() come to string, ma puoi usare un separatore
    push() aggiunge elementi all'array
    pop() rimuove l'ultimo elemento dell'array
    shift() rimuove il primo elemento di un'array
    indice dell'array per accedere / modificare un valore
    delete: lascia buchi undefined, usare pop o splice
    splice() 
    sort()  ordinare un array
    reverse() invertire l'ordine di un array
    concat() unire array
    slice() restituisce una parte di array indicato dagli argomenti start e end
    Boolean() verifica se un'espressione è booleana
Comparazione e Operatori  logici
    if()
    operatore ternario
    




## Getting Started with Programming 

### 1. Length (String)
To discover the length of your name write your name within quotes. Then write a period (full stop) and the word length like this:

```javascript
"yourName".length;
```

### 2. Basic Maths 

**Less Numbers**
```javascript
3+4;
```

**More Numbers**
```javascript
3*5/5;
```

### 3. Comments 
```javascript
// This is a comment that the computer will ignore. 
// It is for your eyes only!
```

The `//` sign is for comments. A comment is a line of text that JavaScript won't try to run as code. It's just for humans to read.

### 4. Confirm 
```javascript
confirm("I feel awesome!");
confirm("I am ready to go.");
```

These boxes can be used on websites to **confirm** things with users. You've probably seen them pop up when you try to delete important things or leave a website with unsaved changes.

### 5. Prompt
```javascript
prompt("What is your name?");
prompt("What is Ubuntu?");
```

The program need some input to start an actions.You can do this by using a **prompt**.

### 6. Console.log 
You may have noticed that the interpreter doesn't print out every single thing it does. So if we want to know what it's thinking, we sometimes have to ask it to speak to us.

`console.log()` will take whatever is inside the parentheses and log it to the console below your code—that's why it's called `console.log()`!

This is commonly called **printing out**.

```javascript
console.log(2*5);
console.log("Hello");
```


## Data Type 
### 1. Numbers 
Are quantities, just like you're used to. You can do math with them.

To make a number in your code, just write a number as numerals without quotes: `42`, `190.12334`.

### 2. Strings
Are sequences of characters, like the letters `a-z`, spaces, and even numbers. These are all strings: `"Ryan"`, `"4"` and `"What is your name?"` Strings are extremely useful as labels, names, and content for your programs.

To write a string, surround words with quotes: `"What is your name?"`

### 3. Boolean
Is either `true` or `false`.

For example, comparing two numbers returns a true or false result:

1) `23 > 10` is `true`
2) `5 < 4` is `false`

## Dive-in a little (Decision Making)
### 1. Comparison Operator 
List of comparison operators :

1. `>` Greater than
2. `<` Less than
3. `<=` Less than or equal to
4. `>=` Greater than or equal to
5. `===` Equal to
6. `!==` Not equal to

```javascript
console.log(15 > 4); // 15 > 4 evaluates to true, so true is printed.
```

### 2. If statement

Say we want to write a program that asks whether your name is longer than 7 letters. If the answer is yes, we can respond with "You have a long name!" We can do this with an `if statement`: 

```javascript
if( "myName".length >= 7 ) {
    console.log("You have a long name!");
}
```

An `if` statement is made up of the `if` keyword, a condition like we've seen before, and a pair of curly braces `{ }`. If the answer to the condition is yes, the code inside the curly braces will run.

### 3. If-Else statement 

In addition to doing something when the condition is true, we can do something else if the condition is `false`. For example, if your name is shorter than 7 letters, we can respond with "You have a short name!" We can do this using an `if / else` statement:

```javascript
if( "myName".length >= 7 ) {
    console.log("You have a long name!");
}
else {
    console.log("You have a short name!");  
}
```
In conventional way, just like how we communicate in : "ENGLISH" langauge. 

```javascript
if(//this is correct){
	console.log("Do the right thing");
}else{
	console.log("Do the wrong thing");
}
```


## Mid-Lesson Breather
Just a recap Here : 

**1. Confirm and prompt**
We can make pop-up boxes appear! 
`confirm("I am ok");`
`prompt("Are you ok?");`

**2. Data types**

a. numbers (e.g. `4.3`, `134`)

b. strings (e.g. `"dogs go woof!"`, `"JavaScript expert"`)

c. booleans (e.g. `false`, `5 > 4`)

**3. Conditionals**
If the first condition is met, execute the first code block. `if` it is not met, execute the code in the `else` block. 

Example of past recaps: 

```javascript
if (12 / 4 === "Ari".length) {
    confirm("Will this run the first block?");
} else {
    confirm("Or the second block?");
}
```

### 1. Maths 
Just like we learn maths in school. The operator has orders:  

Code:

1. `( )`: control order of operations
2. `*` and `/`: multiplication and division
3. `-` and `+`: subtraction and addition

Examples:

1. `100/10` evaluates to 10
2. `"Jane".length + 5` evaluates to 9
3. `5*(3+1)` evaluates to 20

```javascript
 if("Jon".length * 2 / (2+1) === 2)
{
    console.log("The answer makes sense!");
} 
else 
{
    console.log("bla");
}
```
Output:
```
 The answer makes sense!
```

### 1. Modulo (%)
Like in maths, Modulo is the **remainder** of a division.  

Take a look at a examples : 

1. `17 % 5` evaluates to 2

2. `13 % 7` evaluates to 6

You can use % for this occasion like finding even or odds numbers. 

```javascript
if(2%2===0 ) {
    console.log("The first number is even");
} else {
    console.log("The first number is odd");
}
```

### 2. Substrings 
Sometimes you would like not to display the whole strings just for like preview. Example Gmail inbox. 

```javascript
"some word".substring(x, y);
```

where `x` is where you start chopping and `y` is where you finish chopping the original string.

The number part is a little strange. To select for the "he" in "hello", you would write this:

```javascript
"hello". substring(0, 2);
```
Each character in a string is numbered starting from 0, like this:

| "h" | "e" | "l"  | "l"  | "o"  |
| ----|:---:| :---:| :---:|-----:|
| 0   | 1   |  2   |  3   |  4   |

The letter `h`is in position `0`, the letter `e` is in position `1`, and so on.

Therefore if you start at position `0`, and slice right up till position `2`, you are left with just `he`

## Variables 

To do more complex coding, we need a way to 'save' the values from our coding. We do this by defining a variable with a specific, case-sensitive name. Once you create (or **declare**) a variable as having a particular name, you can then call up that value by typing the variable name.

**Code**:

`var varName = data;`

**Example**:

a. `var myName = "Leng";`
b. `var myAge = 30;`
c. `var isOdd = true;`

## Reviews 

### 1. Data types

1. strings (e.g. `"dogs go woof!"`)
2. numbers (e.g. `4`, `10`)
3. booleans (e.g. `false`, `5 > 4`)
4. Variables

We store data values in variables. We can bring back the values of these variables by typing the variable name.

### 2. Manipulating numbers & strings

1. comparisons (e.g. `>`, `<=`)
2. modulo (e.g. `%`)
3. string length (e.g. `"Emily".length;`)
4. substrings (e.g. `"hi".substring(0, 1);`)

### 3. console.log( ) 
Prints into the console whatever we put in the parentheses.
