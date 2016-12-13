#Lesson2 Functions
## Intro to Functions

Programming is similar to baking cakes. Seriously! Imagine you are trying to teach your friend Jane how to bake many different types of cakes.

Each cake takes in different ingredients (ie. inputs). But the 'bake' instructions are always the same. For example:

1. Pre-heat the oven at 300 degrees
2. Mix all the ingredients in a bowl
3. Put contents into oven for 30 mins

And the **output** will be a different cake each time.

It is tedious to have to repeat to Jane the same 'bake' instructions every time. What if we could just say 'bake' and Jane would know to execute those three steps? That is exactly what a function is!


```javascript
// This is what a function looks like:

var divideByThree = function (number) {
    var val = number / 3;
    console.log(val);
};

// On line 12, we call the function by name
// Here, it is called 'dividebythree'
// We tell the computer what the number input is (i.e. 6)
// The computer then runs the code inside the function!
divideByThree(8);
```

## Function Syntax 

A function takes in inputs, does something with them, and produces an output.

Here's an example of a function:


```javascript
var sayHello = function(name) {
    console.log('Hello ' + name);
};
```

1. First we declare a function using `var`, and then give it a name `sayHello`. The name should begin with a lowercase letter and the convention is to use lowerCamelCase where each word (except the first) begins with a capital letter.

2. Then we use the `function` keyword to tell the computer that you are making a function.

3. The code in the parentheses is called a **parameter**. It's a placeholder word that we give a specific value when we call the function.

4. Then write your block of reusable code between `{ }`. Every line of code in this block must end with a `;`.

You can run this code by "calling" the function, like this:

```javascript
sayHello("Emily");
```

Calling this function will print out `Hello Emily`.

## How does Function work ? 
### Complicated ? Break it down

```javascript
var functionName = function( ) {
    // code code code
    // code code code
    // (more lines of code)
};

```

1. The `var` keyword declares a variable named `functionName`.

2. The keyword `function` tells the computer that `functionName` is a function and not something else.

3. Parameters go in the parentheses. The computer will look out for it in the code block.

4. The code block is the reusable code that is between the curly brackets `{ }`. Each line of code inside `{ }` must end with a semi-colon.

5. The entire function ends with a semi-colon.


To use the function, we **call** the function by just typing the function's name, and putting a parameter value inside parentheses after it. The computer will run the reusable code with the specific parameter value substituted into the code.

### Questions on the sytax of Functions 

**1. Do I need to organized our code?** 

The computer might understand your code. But, it will be tidier and easier if we organize our code as everyone is able to understand the code easier especially if you are working in a team. 

**2. Do I need to put a semi-colon right at the end of the each line of the code in the reusable block & at the end of the entire function?** 

YES. At the end of each line of code (within the { }) and after the entire function (after the { }), please put a semi-colon. The semi-colon acts like a period in a sentence. It helps the computer know where there are stopping points in the code.

## Function and Return
### 1. Don't Repeat Yourself (D.R.Y) Principle 
The D.R.Y. principle is really important in programming. No repeating!

Any time you find yourself typing the same thing, but modifying only one small part, you can probably use a function.

The 'small part' that you find yourself modifying will be the parameter. And the part that you keep repeating will be the code in the reusable block - the code inside `{ }`.

### 2. Return Keyword
Nice job! Now, when we call a function, we don't always want to just print stuff. Sometimes, we just want it to return a value. We can then use that value (ie. the output from the function) in other code. Let's learn about the return keyword, then we'll see how to use functions with an if / else statement in the next exercise!

The return keyword simply gives the programmer back the value that comes out of the function. So the function runs, and when the return keyword is used, the function will immediately stop running and `return` the value.

EG.
```javascript
// Parameter is a number, and we do math with that parameter
var timesTwo = function(number) {
    return number * 2;
};

// Call timesTwo here!
var newNumber = timesTwo(5);
console.log(newNumber);
```

### 2. Function & RETURN & IF-ELSE 

When we call a function, its return value is just the result from running the function. That value can then be used just like any other value in JavaScript!

Look at the if statement starting on line `//Here`. The if statement is checking whether the result of calling the function named quarter is divisible by 3.

EG.
```javascript
// Define quarter here.
var quarter=function(number){
  return number / 4;  
};


if (quarter(24) % 3 === 0 ) { //Here
  console.log("The statement is true");
} else {
  console.log("The statement is false");
}
```

## Function and Varibles
### 1. Functions with  2 Parameters 
So far we've only looked at functions with one parameter. But often it is useful to write functions with more than one parameter. For example, we can have the following function:

```javascript
var areaBox = function(length, width) {
    return length * width;
};
```

With more than one parameter, we can create more useful functions

To call a function with more than one parameter, just enter a value for each parameter in the parentheses. For example, `areaBox(3,9)`; would return the area of a box with a length of 3 and a width of 9.

### 2. Global Vs Local Variables 
Let's talk about an important concept: **scope**. Scope can be global or local.

Variables defined **outside** a function are accessible anywhere once they have been declared. They are called **global variables** and their scope is **global**.

For example:

```javascript
var globalVar = "hello";

var foo = function() {
    console.log(globalVar);  // prints "hello"
}
```

The variable `globalVar` can be accessed anywhere, even inside the function `foo`.

Variables defined **inside** a function are **local variables**. They cannot be accessed outside of that function.

For example:

```javascript
var bar = function() {
    var localVar = "howdy";
}

console.log(localVar);  // error
```

The variable `localVar` only exists inside the function `bar`. Trying to print `localVar` outside the function gives a error.

Check out the code in the editor. Until now you've been using the `var` keyword without really understanding why. The `var` keyword creates a new variable **in the current scope**. That means if var is used outside a function, that variable has a global scope. If `var` is used inside a function, that variable has a local scope.

On line 4 we have not used the `var` keyword, so when we log `my_number` to the console outside of the function, it will be 14.

Example : 

For example:

```javascript
var my_number = 7; //this has global scope

var timesTwo = function(number) {
   var my_number = number * 2;  //Line 4
    console.log("Inside the function my_number is: ");
    console.log(my_number);
}; 

timesTwo(7);  //Output: 14

console.log("Outside the function my_number is: ")
console.log(my_number); //Output: 7
```


### 3. Functions Recap
EG. 
```javascript
var nameString = function ( name) {
	return "Hi, I am" + " " + name;
	
};

console.log(nameString("Bla"));
```

```javascript
// Write your function below. 
// Don't forget to call your function!
var sleepCheck=function(numHours){
  
  if(numHours>=8){
   return "You're getting plenty of sleep! Maybe even too much!"; 
  }
  else{
       return "Get some more shut eye!";
  }
};

sleepCheck(10);
sleepCheck(5);
sleepCheck(8);
```

## Add Ons : More 

Rock paper scissors is a classic 2 player game.Each player chooses either rock, paper or scissors. The possible outcomes:

1. Rock destroys scissors.
2. Scissors cut paper.
3. Paper covers rock.

Our code will break the game into 3 phases:

1. User makes a choice.
2. Computer makes a choice.
3. A compare function will determine who wins.

[Sample Code Here](https://github.com/yclim95/CodeAcademy-JavaScript/blob/master/Lesson2_functions/script.js)
