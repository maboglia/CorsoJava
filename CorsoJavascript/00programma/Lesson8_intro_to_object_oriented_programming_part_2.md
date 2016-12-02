#Lesson8 Object Oriented Programming(OOP) Part 2
## Review 

### 1. Literal Notation (Object)

In the previous lesson, we added methods to objects via **constructor notation**. We also can add methods to objects in **literal notation** :

```javascript
var someObj = {

aProperty: value,
someMethod: function(some, params) { }

};
```

When we call `someObj.someMethod(some, values);`, the code between the curly brackets `{ }` will run.

EG :

```javascript
var james = {
    job: "programmer",
    married: false,
    speak: function(words ) {
        console.log("Hello, I am feeling"+" "+words);
    }
};

james.speak("great");
james.speak("just okay");
```

## Identify Objects 
### 1. Typeof (ID)

Alright! Let's get our hands dirty and start exploring some really cool stuff about objects in JavaScript. But before we can do that, how can we even tell if something is an object (as opposed to, say, a number or string)? It would be great if we could tell what type something is in JavaScript. Good thing there's a handy built-in operator to do this!

Say we have a variable `thing` and we don't know what type `thing` is. We can call `typeof` thing to figure this out. Generally, the most useful types are "number," "string," "function," and of course, "object."

As an example, the following example will print `"object"`:

```javascript
var someObject = {someProperty: someValue};
console.log( typeof someObject );
```

**More Example :**

```javascript
// complete these definitions so that they will have
// the appropriate types
var anObj = { job: "I'm an object!" };
var aNumber = 42;
var aString = "I'm a string!";

console.log(typeof anObj); // should print "object"
console.log(typeof aNumber  ); // should print "number"
console.log(typeof aString  ); // should print "string"
```

###2. Check for Object's Property

You wouldn't know it, but every object in JavaScript comes with some baggage (stay tuned for more on this!). Part of this baggage includes a method called `hasOwnProperty`. This lets us know if an object has a particular property.

We show how to use `hasOwnProperty` in the last two lines. It returns `true` or `false`, based on whether an object has a certain property.

```javascript
var myObj = {
    // finish myObj
    name:"lala"
};

console.log( myObj.hasOwnProperty('name') ); // should print true
console.log( myObj.hasOwnProperty('nickname') ); // should print false
```

**Undefined example :**

```javascript
var suitcase = {
    shirt: "Hawaiian"
};

if(suitcase.hasOwnProperty('shorts')){
 suitcase.shorts="red";   
}else{
 console.log(suitcase["shorts"]); //Undefined
}
```

### 3. Display Placeholder Property

```javascript
var nyc = {
    fullName: "New York City",
    mayor: "Bill de Blasio",
    population: 8000000,
    boroughs: 5
};

for(var property in nyc){
 console.log(property);   
}
```

**Output :**
```
fullName
mayor
population
boroughs
```

### 4. Display all Properties's Value

```javascript
var nyc = {
    fullName: "New York City",
    mayor: "Bill de Blasio",
    population: 8000000,
    boroughs: 5
};

// write a for-in loop to print the value of nyc's properties
for (var property in nyc){
 console.log(nyc[property]);   
}
```

**Output :**
```
New York City
Bill de Blasio
8000000
5
```

## Down to OOP
### 1. How do Classes Help us
Classes are very important in object-oriented programming. This is because a class tells us helpful information about objects, and you can think of an object as a particular instance of a class.

```javascript
function Person(name,age) {
  this.name = name;
  this.age = age;
}
// a function that prints the name of any given person
var printPersonName = function (p) {
  console.log(p.name);
};

var bob = new Person("Bob Smith", 30);
printPersonName(bob);

// make a person called me with your name and age
// then use printPersonName to print your name
var me=new Person("lala",20);
printPersonName(me);
```

For example, look at our `Person` class again in the console. We know that any `Person` will have a name and age, because they are in the constructor. This allows us to create a function like `printPersonName`, which will take a `Person` as an argument and print out their name. We know the function will work on any `Person`, because `name` is a valid property for that class.

### 1. Prototype Methods (Extends)

```javascript
function Dog (breed) {
  this.breed = breed;
};

// here we make buddy and teach him how to bark
var buddy = new Dog("golden Retriever");
Dog.prototype.bark = function() {
  console.log("Woof");
};
buddy.bark(); //Woof

// here we make snoopy
var snoopy = new Dog("Beagle");
/// this time it works!
snoopy.bark(); //Woof
```

By adding a prototype keyword, we set the method as constants or standard, meaning subclasses that extends this methods, will be able to learn this method immediately. 

In the example above, click run this time, and both `buddy` and `snoopy` can bark just fine! `Snoopy` can bark too even though we haven't added a `bark` method to that object. How is this so? Because we have now changed the `prototype` for the class Dog. This **immediately teaches all `Dogs` the new method**.

In general, if you want to add a method to a class such that all members of the class can use it, we use the following syntax to *extend the prototype*:

```javascript
className.prototype.newMethod =

function() {
statements;
};
```

## Inheritance 
```javascript
// create your Animal class here
function Animal(name,numLegs){
    this.name=name;
    this.numLegs=numLegs;
};


// create the sayName method for Animal
Animal.prototype.sayName=function(){
    console.log(  "Hi my name is"+" "+this.name);
};


// provided code to test above constructor and method
var penguin = new Animal("Captain Cook", 2);
penguin.sayName();
```

### 1. Don't Repeat Yourself (D.R.Y)

Inheritance can help us here! A `Penguin` is an `Animal`, so they should have all the same properties and methods as `Animal`. Whenever this **X is-a Y** relationship exists, there's a good chance that we should be using inheritance.

Remember, inheritance lets us see and use properties and methods from another class. To say that `Penguin` inherits from `Animal`, we need to set `Penguin`'s `prototype` to be `Animal`.

```javascript
// the original Animal class and sayName method
function Animal(name, numLegs) {
    this.name = name;
    this.numLegs = numLegs;
}
Animal.prototype.sayName = function() {
    console.log("Hi my name is " + this.name);
};

// define a Penguin class
function Penguin(name){
    this.name=name;
    this.numLegs=2;
};

// Penguin inherits from Animal
Penguin.prototype=new Animal();

```

### 2. Black Magic ? (Prototype)

We never defined a `sayName` method for `Penguin`, but what happens when we try to call it?

```javascript
// the original Animal class and sayName method
function Animal(name, numLegs) {
    this.name = name;
    this.numLegs = numLegs;
}
Animal.prototype.sayName = function() {
    console.log("Hi my name is " + this.name);
};

// define a Penguin class
function Penguin(name){
    this.name=name;
    this.numLegs=2;
};

// set its prototype to be a new instance of Animal
Penguin.prototype=new Animal();
var penguin=new Penguin("Mushi");
penguin.sayName(); //Hi my name is Mushi
```

**More Example :**

```javascript
function Penguin(name) {
    this.name = name;
    this.numLegs = 2;
}

// create your Emperor class here and make it inherit from Penguin
function Emperor(name){
 this.name=name;   
}

Emperor.prototype=new Penguin();

// create an "emperor" object and print the number of legs it has
var emperor=new Emperor();
console.log(emperor.numLegs); //2
```

### 2. Food Chain Effect (Inheritance)

```javascript
// original classes
function Animal(name, numLegs) {
    this.name = name;
    this.numLegs = numLegs;
    this.isAlive = true;
}
function Penguin(name) {
    this.name = name;
    this.numLegs = 2;
}
function Emperor(name) {
    this.name = name;
    this.saying = "Waddle waddle";
}

// set up the prototype chain
Penguin.prototype = new Animal();
Emperor.prototype = new Penguin();

var myEmperor = new Emperor("Jules");

console.log(myEmperor.saying); // should print "Waddle waddle"
console.log(myEmperor.numLegs); // should print 2
console.log(myEmperor.isAlive); // should print true
```

## Privacy 
### 1. Public Access 

```javascript
function Person(first,last,age) {
   this.firstName = first; //Public 
   this.lastName = last;
   this.age = age;
}

var john = new Person('John','Smith',30);
var myFirst = john.firstName;
var myLast = john.lastName;

//declare variable myAge set to the age of the john object.
var myAge=john.age;
```

### 2. Private Variables 
Private Variables are pieces of information you do not want to publicly share, and they can only be directly accessed from within the class.

```javascript
function Person(first,last,age) {
   this.firstname = first; //Public var
   this.lastname = last;
   this.age = age;
   var bankBalance = 7500; //Private Var
}

// create your Person 
var john=new Person("John","Duke",20);

// try to print his bankBalance
console.log(john.bankBalance);
```

The `Person` class has been modified to have a private variable called `bankBalance`. Notice that it looks just like a normal variable, but it is defined inside the constructor for `Person` without using `this`, but instead using var. This makes `bankBalance` a private variable.

### 3. How to access Private Variables

```javascript
function Person(first,last,age) {
   this.firstname = first;
   this.lastname = last;
   this.age = age;
   var bankBalance = 7500;
  
   this.getBalance = function() {
      // your code should return the bankBalance
      return bankBalance;
   };
}

var john = new Person('John','Smith',30);
console.log(john.bankBalance);

// create a new variable myBalance that calls getBalance()
var myBalance=john.getBalance();
console.log(myBalance);
```

### 3. How to access Private Methods 

```javascript
function Person(first,last,age) {
   this.firstname = first;
   this.lastname = last;
   this.age = age;
   var bankBalance = 7500;
  
   var returnBalance = function() { //Private Method
      return bankBalance;
   };
       
   // create the new function here
   this.askTeller=function(){
     return returnBalance;  
   };
}

var john = new Person('John','Smith',30);
console.log(john.returnBalance); //Undefined 
var myBalanceMethod = john.askTeller();
var myBalance = myBalanceMethod();
console.log(myBalance); //7500

```

### 4. Passing Arguments into Methods

```javascript
function Person(first,last,age) {
   this.firstname = first;
   this.lastname = last;
   this.age = age;
   var bankBalance = 7500;
  
   this.askTeller = function(pass) {
     if (pass == 1234) return bankBalance;
     else return "Wrong password.";
   };
}

var john = new Person('John','Smith',30);
/* the variable myBalance should access askTeller()
   with a password as an argument  */
var myBalance=john.askTeller(1234);
```

## Recap 
### 1. Using Typeof for displaying 

Remember you can figure out the type of a variable by using typeof `myVariable;`. Types we are concerned with for now are `"object"`, `"string"`, and `"number"`.

Recall the `for-in` loop:

```javascript
for(var x in obj) {
executeSomething();
}
```

EG : 
```javascript
var languages = {
    english: "Hello!",
    french: "Bonjour!",
    notALanguage: 4,
    spanish: "Hola!"
};

// print hello in the 3 different languages
for(var property in languages){
    if(typeof languages[property]==="string"){
        console.log(languages[property]);
    }else{
        
    }
}
```

### 2. Prototype 
```javascript
function Dog (breed) {
    this.breed = breed;
};

// add the sayHello method to the Dog class 
// so all dogs now can say hello
Dog.prototype.sayHello=function(){
  console.log("Hello this is a"+" "+this.breed+" "+"dog");  
};

var yourDog = new Dog("golden retriever");
yourDog.sayHello();

var myDog = new Dog("dachshund");
myDog.sayHello();

```

### 3. Typeof Prototype Object 
If we have just a plain object (i.e., not created from a class constructor), recall that it automatically inherits from `Object.prototype`. Could this be where we get `hasOwnProperty` from? How can we check?

```javascript
// what is this "Object.prototype" anyway...?
var prototypeType = typeof Object.prototype
console.log(prototypeType); //object

// now let's examine it!
var hasOwn =Object.prototype.hasOwnProperty("hasOwnProperty");
console.log(hasOwn); //true

```

### 4. Public & Private 

1. **Public** properties can be accessed from outside the class

2. **Private** properties can only be accessed from within the class

Using **constructor notation**, a property declared as `this.property = "someValue;"` will be **public**, whereas a property declared with `var property = "hiddenValue;"` will be **private**.

E.G :

```javascript
function StudentReport() {
   var grade1 = 4; //Private var
   var grade2 = 2;
   var grade3 = 1;
    this.getGPA = function() { //Public Method
        return (grade1 + grade2 +grade3) / 3;
    };
}

var myStudentReport = new StudentReport();

for(var x in myStudentReport) {
    if(typeof myStudentReport[x] !== "function") {
        console.log("Muahaha! " + myStudentReport[x]);
    }
}
```

## Add-Ons 
### Building Mini Project 
Utilize what you have learn in this lesson to build an cash register. 

[Sample Code Here](https://github.com/yclim95/CodeAcademy-JavaScript/blob/master/Lesson8_intro_to_object_oriented_programming_part_2/script.js)