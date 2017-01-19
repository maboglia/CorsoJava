## Creare un semplice form per gestire i dati

```html
<input id="age"/>
<button onclick="ageInDogYears()">My Age in Dog Years</button>
<h2 id="dogyears"></h2>
```

---

## Creare un semplice form per gestire i dati

```javascript
var ageInDogYears = function(){
    var age = document.getElementById("age").value;
    var ageInDogYears = age * 7;
    document.getElementById("dogyears").innerHTML = "In dog years, you are " + ageInDogYears + " years old";
}
```

---

## Creare un semplice form per gestire i dati

```html
<html>
<head>
    <meta charset="UTF-8">
    <title>My First Web Page</title>
    <script>
    var ageInDogYears = function(){
        var age = document.getElementById("age").value;
        var ageInDogYears = age * 7;
        document.getElementById("dogyears").innerHTML = "In dog years, you are " + ageInDogYears + " years old";
    }
    </script>
</head>
<body>
    <h1>My First Web Page</h1>
    <input id="age"/>
    <button onclick="ageInDogYears()">My Age in Dog Years</button>
    <h2 id="dogyears"></h2>
</body>
</html>
```

