Exercises: if/else statements
#What number's bigger?

    Write a function named greaterNum that:
        takes 2 arguments, both numbers.
        returns whichever number is the greater (higher) number. 
    Call that function 2 times with different number pairs, and log the output to make sure it works (e.g. "The greater number of 5 and 10 is 10."). 


```javascript
function greaterNum(num1, num2) {
    if (num1 > num2) {
        return num1;
    } else {
        return num2;
    }
}

console.log(greaterNum(5, 10));
```
#The World Translator

    Write a function named helloWorld that:
        takes 1 argument, a language code (e.g. "es", "de", "en")
        returns "Hello, World" for the given language, for atleast 3 languages. It should default to returning English. 
    Call that function for each of the supported languages and log the result to make sure it works. 


```javascript

function helloWorld(lang) {
    if (lang == 'fr') {
        return 'Bonjour tout le monde';
    } else if (lang == 'es') {
        return 'Hola, Mundo';
    } else {
        return 'Hello, World';
    }
}

console.log(helloWorld('en'));
console.log(helloWorld('fr'));
console.log(helloWorld('es'));
```
#The Grade Assigner

    Write a function named assignGrade that:
        takes 1 argument, a number score.
        returns a grade for the score, either "A", "B", "C", "D", or "F". 
    Call that function for a few different scores and log the result to make sure it works. 

```javascript
function assignGrade(score) {
    if (score > 90) {
        return 'A';
    } else if (score > 80) {
        return 'B';
    } else if (score > 70) {
        return 'C';
    } else if (score > 65) {
        return 'D';
    } else {
        return 'F';
    }
}

console.log('You got a ' + assignGrade(95));
console.log('You got a ' + assignGrade(65));
```
#The Pluralizer

    Write a function named pluralize that:
        takes 2 arguments, a noun and a number.
        returns the number and pluralized form, like "5 cats" or "1 dog". 
    Call that function for a few different scores and log the result to make sure it works.
    Bonus: Make it handle a few collective nouns like "sheep" and "geese". 

```javascript
function pluralize(noun, number) {
    if (number != 1 && noun != 'sheep' && noun != 'geese') {
        return number + ' ' + noun + 's';
    } else {
        return number + ' ' + noun;
    }
}
console.log('I have ' + pluralize('cat', 0));
console.log('I have ' + pluralize('cat', 1));
console.log('I have ' + pluralize('cat', 2));
```
