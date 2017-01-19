##Validare Input

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
