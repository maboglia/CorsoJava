---

JS può modificare il contenuto HTML
```
*   JS può modificare gli attributi HTML
*   JS può modificare gli stili CSS / HTML
*   JS può validare i dati

###dove scrivere JS
    *   JS in head o body
    *   JS in un file esterno: vantaggi
---

## Aggiungere JavaScript alla tua pagina web

```html
<html>
<head>
    <title>My First Web Page</title>
    <script>
   
    var sayHello = function(){
        alert("Hello there!");
    };

    </script>
</head>
<body>
    <h1>My First Web Page</h1>  
    <button onclick="sayHello()">Click me!</button>
</body>
</html>
```

---



## Chiedere informazioni all'utente

```html
<html>
<head>
    <meta charset="UTF-8">
    <title>My First Web Page</title>
    <script>
   
    var sayHello = function(){
        alert("Hello there!");
    };

    </script>
</head>
<body>
    <h1>My First Web Page</h1>  
    <button onclick="sayHello()">Click me!</button>
</body>
</html>
```

---

## Chiedere informazioni all'utente

```html
<html>
<head>
    <meta charset="UTF-8">
    <title>My First Web Page</title>
    <script>
   
    var sayHello = function(){
        var name = prompt("What is your name?");
        alert("Pleased to meet you, " + name);
    };

    </script>
</head>
<body>
    <h1>My First Web Page</h1>
    <button onclick="sayHello()">Click me!</button>
</body>
</html>
```
