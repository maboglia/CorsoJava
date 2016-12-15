#Lesson1

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


---

*   JS array
    cos'è un array
    ###creare un array
```javascript
var student1 = 'Ethan';
var student2 = 'Jose';
var student3 = 'Cooper';
var student4 = 'Rosa';
var student5 = 'Christina';
var student6 = 'Allan';
var student7 = 'Brad';
```

```javascript
var students = ['Ethan', 'Jose', 'Cooper', 'Rosa', 'Christina', 'Allan', 'Brad'];
```

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


---

## Inserire e Rimuovere Elementi

```javascript
students.push('Mako');
```

---

## Inserire e Rimuovere Elementi

```javascript
students.pop();
```

---

## Lunghezza di un array

```javascript
students.length
```

---

## Indicizzare un array

```javascript
students[0]
```

---

## Indicizzare un array

```javascript
students[1] = 'Simon';
students;
```

---

## Concatenare Arrays

```javascript
var mondayClass = ['Cooper', 'Rosa'];
var tuesdayClass = ['Ethan', 'Jose'];
var bothClasses = mondayClass.concat(tuesdayClass);
```

---

## Trasformare Arrays in Stringhe

```javascript
bothClasses.toString();
bothClasses.join(' and ');
```

---
    