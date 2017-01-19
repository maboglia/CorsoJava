## Modificare la pagina

```html
<h1 id="name"></h1>
```

---

## Modificare la pagina

```javascript
document.getElementById("name").innerHTML = "Pleased to meet you, " + name;
```

---

## Modificare la pagina

```html
<html>
<head>
    <meta charset="UTF-8">
    <title>My First Web Page</title>
    <script>
   
    var sayHello = function(){
        var name = prompt("What is your name?");
        document.getElementById("name").innerHTML = "Pleased to meet you, " + name;
    };

    </script>
</head>
<body>
    <h1>My First Web Page</h1>
    <button onclick="sayHello()">Click me!</button>
    <h1 id="name"></h1>
</body>
</html>
```

---

## Task: Add the code to change the page when the user enters their name

---

