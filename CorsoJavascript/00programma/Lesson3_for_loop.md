#Lesson3 Loop : For
## Why use *for* loops ? 
Instead of writing 5 lines of code.... 

```javascript
console.log(1);
console.log(2);
console.log(3);
console.log(4);
console.log(5);
```

By using the for loop, you are able the lines of code and it is much more efficient. 

```javascript
for (var counter = 1; counter < 6; counter++) {
	console.log(counter);
}
```

## Syntax for loops 
### 1. Starting

```javascript
for (var i = 1; i < 11; i = i + 1) {
    /* your code here */;
}
```

Every `for` loop makes use of a counting variable. Here, our variable is called `i` (but it can have any name). The variable has many roles. The first part of the for loop tells the computer to start with a value of 1 for `i`. It does this by declaring the variable called `i` and giving it a value of `1`.

When the `for` loop executes the code in the code block—the bit between `{ }`—it does so by starting off where `i = 1`. 

### 2. Ending

```javascript
for (var i = 1; i < 11; i = i + 1) {
    /* your code here */;
}
```

Here, this for loop will keep running until `i = 10` ( i.e. while `i < 11`). So when `i = 2`, or `i = 9`, the for loop will run. But once `i`is no longer less than 11, the loop will stop.

### 2. Control the loop
We can now control where the for loop starts and ends. What about controlling what happens in between?

The examples we've looked at have used i = i + 1. This has meant we have incremented (increased) the variable i by 1 each time.

**Rules to learn**

1. A more efficient way to code to increment up by 1 is to write `i++`.

2. We decrement down by 1 by writing `i--`.

3. We can increment up by any value by writing `i += x`, where x is how much we want to increment up by. e.g., `i += 3` counts up by 3s.

4. We can decrement down by any value by writing `i -= x`. (See the Hint for more.)

5. Be very careful with your syntax—if you write a loop that can't properly end, it's called an **infinite loop**. It will crash your browser!


## Array & Loop
### 1. Intro Arrays 

Variables can store numbers or strings. But so far, we've only been able to store ONE number or ONE string. Good thing we have arrays. Arrays:

1. store **lists** of data
2. can store **different data types** at the same time
3. are **ordered** so the position of each piece of data is fixed

E.G
```javascript
var names = ["Mao","Gandhi","Mandela"];

var sizes = [4, 6, 3, 2, 1, 9];

var mixed = [34, "candy", "blue", 11];
```

**Syntax**:
`var arrayName = [data, data, data];`

Any time you see data surrounded by `[ ]`, it is an array.

### 2. Access Arrays
It's nice that we can put a list of data into an array. But now we need to learn how to get access to the data inside the array.

The position of things in arrays is fixed. So we just need to know the array name (here, it is `junkData`), and the position of the data we want, and we're done.

Small complication: the position (or the index) of each bit of data is counted starting from 0, not 1.

First element in the array: `junkData[0]`
Third element in the array: `junkData[2]`
Arrays have 0-based indexing, so we start counting the positions from 0. 

E.G
```javascript
var junkData = ["Eddie Murphy", 49, "peanuts", 31];

console.log(junkData[3]);
```


### 2. Loop & Arrays
```javascript
var cities = ["Malaysia", "Amman", "Helsinki", "NYC"];

for (var i = 0; i < cities.length; i++) {
    console.log("I would like to visit " + cities[i]);
}
```
**How does it works?**

1. Line 3 declares the array. It has 4 elements.
2. We then start the `for` loop on line 5.

3. We see `i` starts off at value 0. 

4. The `for` loop runs until `i < 4` (because `cities.length` equals 4. The array `cities` has 4 elements in it; see the Hint for more.)

5. We will increment `i` by 1 each time we loop over.

6. We print out `cities[0]`, which is `"Melbourne"`.

7. We then start the loop again. Except now `i = 1`. 

8. It will print out `cities[1]`, which is `"Amman"`. 

9. This continues until `i` is no longer less than `cities.length`.

**Aware of :**

1. Put commas( `,` ) between each element in the array.

2. Put semi-colons( `;` ) between each bit of the for loop.

3. Beware of infinite loops!


## Add-Ons 
### Searching text for your name 
In this project, you'll be writing a short program that checks a block of text for your name.

Specifically, it will check the text for the first letter of your name, then push (add) the number of characters equal to your name's length to an array. By inspecting the array, you'll be able to see `if` your name was mentioned!

Try to get a hang of **loops**, **arrays**, and `if` statements.

[Sample Code Here](https://github.com/yclim95/CodeAcademy-JavaScript/blob/master/Lesson3_for_loop/script.js)