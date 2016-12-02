#Lesson1 Introduction To Javascript
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