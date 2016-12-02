#Lesson5 Control Flow
## If/Else & Else-IF & Loop
Quick Refresher : 

### 1. Else-If

```javascript
if (/* Some condition */) {
    // Do something
} else if (/* Some other condition */) {
    // Do something else
} else {    // Otherwise
    // Do a third thing
}
```

### 2. isNan function 
isNan (Is Not a number)


```javascript
isNaN('berry'); // => true
isNaN(NaN); // => true
isNaN(undefined); // => true
isNaN(42);  // => false
isNaN("42"); //=> false
```

Be careful: if you call `isNaN` on a string that looks like a number, like '42', JavaScript will try to help by automatically converting the string '42' to the number `42` and return `false` (since 42 is a number).

Note that you can't just do

```javascript
isNaN(unicorns);
```

unless you've already defined the variable unicorns. You can, however, do
```javascript
isNaN("unicorns"); // => true
```

EG.

```javascript
var isEven = function(number) {
  // Your code goes here!
  
  if(number%2===0){
   return true;   
  }
  else if (isNaN(number))
  {
    return "Not a number";  
    }
  else{
      return false;
  }
};

isEven(6);

```

### 3. While Loop 

```javascript
var i=0;
while(i<3){
 console.log(i);
 i++;
}
```

### 4. Sneak Peak (Switch statement)
As you might imagine, if you have a lot of choices you want to cover in a program, it might be annoying to type `else if ()` ten times. That's why JavaScript has the `switch` statement!

`switch` allows you to preset a number of options (called `case`s), then check an expression to see if it matches any of them. If there's a match, the program will perform the action for the matching case; if there's no match, it can execute a `default` option.

EG.
```javascript
var lunch = prompt("What do you want for lunch?","Type your lunch choice here");

switch(lunch){
  case 'sandwich':
    console.log("Sure thing! One sandwich, coming up.");
    break;
  case 'soup':
    console.log("Got it! Tomato's my favorite.");
    break; 
  case 'salad':
    console.log("Sounds good! How about a caesar salad?");
    break;
  case 'pie':
    console.log("Pie's not a meal!");
    break; 
  default:
    console.log("Huh! I'm not sure what " + lunch + " is. How does a sandwich sound?");
}
```

**Syntax**
The switch statement is put together like this:

```javascript
switch (/*Some expression*/) {
    case 'option1':
        // Do something
        break;
    case 'option2':
        // Do something else
        break;
    case 'option3':
        // Do a third thing
        break;
    default:
       // Do yet another thing
}
```

JavaScript will try to match the expression between the `switch()` parentheses to each case. It will run the code below each case if it finds a match, and will execute the `default` code if no match is found.


## Review 

Well done! Even though we've been focusing on switch, we've covered a lot so far. You've:

1. Reviewed if/else if/else

2. Reviewed for and while

3. Learned about the switch statement and how to use it instead of multiple if/elses

4. Covered switch syntax

5. Written your own switch!


## Logical Operator
If we need to check 1 or more, we'll need logical operators. JavaScript has three: **and** (`&&``), **or** (`||`), and **not** (`!`).

EG.
```javascript
var iLoveJavaScript =true ;
var iLoveLearning =true ;

if(iLoveJavaScript && iLoveLearning) {
  // if iLoveJavaScript AND iLoveLearning:
  console.log("Awesome! Let's keep learning!");
} else if(!(iLoveJavaScript || iLoveLearning)) {
  // if NOT iLoveJavaScript OR iLoveLearning:
  console.log("Let's see if we can change your mind.");
} else {
  console.log("You only like one but not the other? We'll work on it.");
}
```

### 1. And (&&)
The logical operator and is written in JavaScript like this: `&&`. It evaluates to `true` when both expressions are `true`; if they're not, it evaluates to `false`.


```javascript
true && true;    // => true
true && false;   // => false
false && true;   // => false
false && false;  // => false
```

**Sample (AND)**
```javascript
var hungry=true;
var foodHere=true;

var eat = function() {
  // Add your if/else statement here!
  if(hungry&&foodHere){
   return true;   
  }else{
      return false;
  }
};

eat();
```

### 2. OR (||)
The logical operator or is written in JavaScript like this: `||`. It evaluates to `true` when one or the other or both expressions are `true`; if they're not, it evaluates to `false`.

```javascript
true || true;     // => true
true || false;    // => true
false || true;    // => true
false || false;   // => false
```

**Sample (OR)**
```javascript
var tired=true;
var bored=false;

var nap = function() {
  // Add your if/else statement here!
  if(tired||bored){
      return true;
  }else{
      return false;
  }
};
```

### Not (!)
The logical operator **not** is written in JavaScript like this: `!`. It makes true expressions `false`, and vice-versa.

```javascript
!true;   // => false
!false;  // => true
```

**Sample (Not)
```javascript
var programming=false;

var happy = function() {
  // Add your if/else statement here!
  if(!programming){
   return true;   
  }else{
      return false;
  }
};
```


## Recap
In this lesson you:

1. Reviewed control flow syntax

2. Learned about the switch statement

3. Learned about the logical operators **and** (`&&`), **or** (`||`), and **not** (`!`)


## Add-Ons 
### Building mini adventure game 
Build using whatever you have learned until now. Try to utilize control structure. 

[Sample code here](https://github.com/yclim95/CodeAcademy-JavaScript/blob/master/Lesson5_control_flow/script.js)