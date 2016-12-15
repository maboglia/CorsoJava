#Lesson 6 Data Structure

## Review 
### 1. Declare array 

**Just a recap on what is an array**
```javascript
var list=["one","two","three"];
```

### 2. Access array
```javascript
var languages = ["HTML", "CSS", "JavaScript", "Python", "Ruby"];

console.log(languages[2]); //Output: JavaScript
```

### 3. Array Properties 
```javascript
var languages = ["HTML", "CSS", "JavaScript", "Python", "Ruby"];

console.log(languages.length);
```

### 3. Iterating over array 
```javascript
var languages = ["HTML", "CSS", "JavaScript", "Python", "Ruby"];

for(var i=0; i < languages.length; i++){
 console.log(languages[i]);   
}
```

## More on Array 
### 1. Heterogeneous Arrays
Heterogeneous - `Mixture` of Arrays

Examples: 
```javascript
var pronouns = ["I", "you", "we"];
var numbers = [1, 2, 3];
```

### 2. Arrays of Arrays 
You can make a two-dimensional array by nesting arrays one layer deep, like so:

```javascript
var twoDimensional = [[1, 1], [1, 1]];

```

This array is two-dimensional because it has two rows that each contain two items. If you were to put a new line between the two rows, you could log a 2D object—a square—to the console, like so:

| "0"   | "1"   | 
| ----  |:-----:| 
| 1     |   1   |
| 1     |   1   |

### 3. Jagged arrays

Sometimes you want arrays that aren't as nice and even as your 3 x 3 two-dimensional array: you may have three elements in the first row, one element in the second row, and two elements in the third row. JavaScript allows those, and they're called **jagged arrays**.

E.G:

```javascript
var jagged=[[1,1,1,1],[2,2,2],[3,3]];
```

## Review 

1. Reviewed arrays, how to access an array by offset, array properties, and iterating over arrays

2. Learned about **heterogenous arrays**

3. Learned about **multidimensional arrays**

4. Learned about **jagged arrays**


## Intro to Objects
### 1. Nouns & Verbs 
Let's go back to the analogy of computer languages being like regular spoken languages. In English, you have nouns (which you can think of as "things") and verbs (which you can think of as "actions"). Until now, our nouns (data, such as numbers, strings, or variables) and verbs (functions) have been separate.

No longer!

Using **objects**, we can put our information and the functions that use that information in the same place.

You can also think of objects as combinations of key-value pairs (like arrays), only their keys don't have to be numbers like 0, 1, or 2: they can be strings and variables.

```javascript
var phonebookEntry = {};

phonebookEntry.name = 'Oxnard Montalvo';
phonebookEntry.number = '(555) 555-5555';
phonebookEntry.phone = function() {
  console.log('Calling ' + this.name + ' at ' + this.number + '...');
};

phonebookEntry.phone();
```

### 2. Object Syntax

Did you see that? The `phonebookEntry` object handled data (a name and a telephone number) as well as a procedure (the function that printed who it was calling).

In that example, we gave the **key** `name` the **value** `'Oxnard Montalvo'` and the key `number` the value `'(555) 555-5555'`. An object is like an array in this way, except its keys can be variables and strings, not just numbers.

Objects are just collections of information (keys and values) between curly braces, like this:

```javascript
var myObject = {
    key: value,
    key: value,
    key: value
};
```

### 3. Creating new Object
2 ways of creating object 
1. Object Literal Notation (What you did earlier)
2. Object Constructor

**Literal notation** is just creating an object with curly braces, like this:

```javascript
var myObj = {
    type: 'fancy',
    disposition: 'sunny'
};

var emptyObj = {};
```

When you use the **constructor**, the syntax looks like this:

```javascript
var myObj = new Object();

```

This tells JavaScript: "I want you to make me a `new` thing, and I want that thing to be an `Object`.

You can add keys to your object after you've created it in two ways:

```javascript
myObj["name"] = "Charlie";
myObj.name = "Charlie";
```

**2 Literal Syntax**

```javascript
var myObj = {
    key1: value,
    key2: value
};

```
OR

```javascript
var myObj = {};
myObj.key1 = value;
myObj['key2'] = value;

```

**Object Constructor**

```javascript
var myObj = new Object();
myObj.key1 = value;
myObj['key2'] = value;
```

## Recap
### 1. Heterogeneous arrays

```javascript
var me={
  name:"lala1",  
    age:12
};
var myArray=[1,true,"lala",me];
```

### 2. Multi-dimensional Arrays + Jagged

```javascript
var me={
  name:"lala1",  
    age:12
};

newArray=[[1,1,1],[me],[2,2],[3]];
```

### 3. Editing an existing object

```javascript
var myInterest=["Coding","Food","Sleeping"];

var myObject = {
  name: 'Eduardo',
  type: 'Most excellent',
  // Add your code here!
  interests :myInterest
};
```

## Add-Ons
### Build Mini Project
Build a mini contact list using what you have learned earlier on. Try to utilize the **data structure** object you have learned in the current lesson. 

[Sample Code Here](https://github.com/yclim95/CodeAcademy-JavaScript/blob/master/Lesson6_data_structure/script.js)