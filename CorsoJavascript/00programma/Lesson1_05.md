##Math Object
    Math.min()
    Math.max()
    Math.random()
    Math.round()
    Math.ceil()
    Math.floor()
    Math costanti
    vedi elenco reference completo


---

## Numeri casuali 

```javascript
Math.random();
```

---

## numero casuale  tra 1 e 10
```javascript
Math.random() * 10;
```
--- 

## arrotondare un numero

```javascript
Math.floor(3.141592);
Math.ceil(4.01);
Math.floor(10.99999);
Math.ceil(10.99999);
```
---

## Generare numeri casuali interi compresi tra 0 e 9

```javascript
Math.floor(Math.random() * 10);
```

---

## Selezione casuale di frutti!

```javascript
var fruits = ['Apple', 'Banana', 'Cherry', 'Pineapple', 'Kiwi'];
fruits[Math.floor(Math.random() * 5)]
```

---


```javascript
"Vuoi un frutto a caso " + fruits[Math.ceil(Math.random() * 5)] + "?"
```

---

# Esercizio - Body Parts!

- Crea tre arrays: numeri differenti, differenti aggettivi e un array di differenti parti del corpo. 
- Seleziona un numero, aggettivo e parte del corpo a caso
- Scivi un codice che stampi una frase tipo "Mi piacciono le tue 4 enormi braccia!" oppure "Mi piace il tuo mento peloso!"
