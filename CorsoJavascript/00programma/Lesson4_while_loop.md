#Lesson4 Loop : While
Currently You know what is for loops. Just to remind, here is the syntax for for loop :

```javascript
for (var i = start; i < end; i++) {
  // do something
}
```

But what if you didn't know ahead of time when to stop looping? Say, for example, you wanted to keep choosing playing cards from a deck until you get a spade. You don't know how many cards you'll need to choose, so a `for` loop won't work.

In situations like these where you don't know in advance when to stop looping, we can use a `while` loop.

E.G 

```javascript
var coinFace = Math.floor(Math.random() * 2);

while(coinFace === 0){
	console.log("Heads! Flipping again...");
	var coinFace = Math.floor(Math.random() * 2);
}
console.log("Tails! Done flipping.");
```

## While - Basics

### 1. Syntax
The `while loop` is ideal when you want to use a loop, but you don't know how many times you'll have to execute that loop.

In the example you just saw, the computer was randomly flipping a coin: `while` the coin came up heads (when `coinFace` equalled 0), it would flip again, and it would stop flipping once it got tails (when `coinFace` was 1). Since the flip was random, we didn't know ahead of time how many loops we'd need.

The syntax looks like this:

```javascript
while(condition){
    // Do something!
}
```

As long as the condition evaluates to `true`, the loop will continue to run. As soon as it's `false`, it'll stop. (When you use a number in a condition, as we did earlier, JavaScript understands `1` to mean `true` and `0` to mean `false`.)

### 2. Infinite Loops 

To avoid having infinite looops, you always need a way to ensure the condition between your while parentheses can change.

E.G

```javascript
understand = true;

while(understand){
	console.log("I'm learning while loops!");
	//Change the value of 'understand' here!
	understand=false;
}
```

### 3. Ways of writing While Loops

3 different ways :

```javascript
var bool = true;
while(bool){
    //Do something
}
```
is the same this as 

```javascript
var bool = true;
while(bool === true){
    //Do something
}
```

but the first one is faster to type. Get in the habit of typing exactly as much as you need to, and no more!

If you happen to be using numbers, as we did earlier, you could even do:

```javascript
var bool = true;
while(bool){
    //Do something
}
```

### 4. Write while loops within a Function 

```javascript
//Remember to set your condition outside the loop!
 var count=0
var loop = function(){
   
	while(count<3){
		//Your code goes here!
		console.log("I'm looping!");
		count++;
	}
};

loop();
```

## Review 

Great work so far! You've learned:

1. What while loops are

2. while loop syntax

3. How to avoid infinite loops


## More to While Loop 
### 1. When to "while" & when to "for"

As we mentioned, `for` loops are great for doing the same task over and over when you know ahead of time how many times you'll have to repeat the loop. 

On the other hand, `while` loops are ideal when you have to loop, but you don't know ahead of time how many times you'll need to loop.

```javascript
for(var i=0; i<5; i++){
    console.log("lala");
}

var j=0;
while(j<3){
    console.log("bla");
    j++;
}
```

As you saw, however, you can combine a `while` loop with a counter variable to do the same kind of work a `for` loop does. In these cases, it's often a matter of preference.


### 2. Do-While Loop
Sometimes, you would like to loop *at least 1 time* no matter what. In that case, you would like to modify from `while` loop to `do-while loop`.

This loop says: "Hey! Do this thing one time, then check the condition to see if we should keep looping." After that, it's just like a normal `while`: the loop will continue so long as the condition being evaluated is true.

E.G

```javascript
var loopCondition = false;

do {
	console.log("I'm gonna stop looping 'cause my condition is " + loopCondition + "!");	
} while (loopCondition);
```

```javascript
var getToDaChoppa = function(){
  // Write your do/while loop here!
  
  var condition=false;
  do{
      console.log("bla");
      
  }while(condition);
};

getToDaChoppa();
```

Remember: make sure you give your `while` condition a way to become `false`, or it'll loop forever!


## Recap (For, DO, Do-While)


```javascript
for(var i=0;i<3;i++){
 console.log("lala");   
}

var i=0;
while(i<3){
    console.log("While loop");
    i++;
}

var j=0;
do{
    console.log("DO...WHILE");
    j++;
}while(j>3);
```

## Add-Ons 
### 1. Building mini project using while loop

Now that you know how to use while loops, we'll combine them with some other control flow statements (like if/else) to create a dragon slaying mini game.

In this game, you’ll battle a dragon. It will take 4 hits to slay the dragon, and if you miss even one hit, the dragon will defeat you!

[Sample code here]()