#Lesson7 Object Oriented Programming(OOP) Part 1
## Intro to OOP

We have discussed four data types: numbers, strings, booleans and arrays.

In this lesson, we focus on a fifth data type: **objects**. This data type is a little bit more complex. **Objects** allow us to represent in code real world things and entities (such as a person or bank account). We do this by storing all relevant information in one place—an object.

How do we create an object? 
Like declaring a variable, or defining a function, we use var, followed by the name of the object and an equals sign. Each object then:

1. starts with `{`
2. has information inside
3. ends with `};`

EG:

```javascript
var bob={
    
};
```

## Object Properties

Let's review what we previously covered. Each piece of information we include in an object is known as a **property**. Think of a property like a **category label** that belongs to some object. When creating an object, each property has a name, followed by `:` and then the **value** of that property. For example, if we want Bob's object to show he is 34, we'd type in `age: 34`.

`age` is the property, and `34` is the **value** of this property. When we have more than one property, they are separated by commas. The last property does not end with a **comma**.

E.G :

```javascript
var Spencer = {
  age: 22,
  country: "United States"
};
```

## Accessing Properties 

Notice our example objects `bob` and `susan`. In this case both `bob` and `susan` each have two properties, `name` and `age`.

After creating our objects we have added code to access these properties. Notice that we save `bob`'s name, `"Bob Smith"`, into the global variable `name1`. We do this in line 10.

E.G :

```javascript
var bob = {
  name: "Bob Smith",
  age: 30
};
var susan = {
  name: "Susan Jordan",
  age: 25
};
// here we save Bob's information
var name1 = bob.name; //Line 10
var age1 = bob.age;
// finish this code by saving Susan's information
var name2 =susan.name;
var age2 =susan.age;
```

2 ways of accesing : 

**1. dot notation **
`ObjectName.PropertyName` (e.g, `bob.name`)

**2. bracket notatation**
`ObjectName["PropertyName"]`(e.g, 'bob["name")')


## Creating Objects  
### 1. Literal Notation
Creating a new object with `{ }` and defining properties within the brackets.

EG : 
```javascript
// Here is susan1, in literal notation
var susan1 = {
  name: "Susan Jordan",
  age: 24
};
```

### 2. Constructor Notation 
creating objects without using the curly brackets { } is to use the keyword `new`. 


EG : 
```javascript
// Make a new susan2 object, using a constructor instead
var susan2=new Object();
susan2.name="Susan Jordan";
susan2.age=24;
```

## Method in OOP 
### 1. Function (Review)

In this lesson we are going to focus on methods. Methods are an important part of object oriented programming (OOP). OOP is an important part of programming which we'll dive into later.

Methods are similar to functions. To prepare for methods, let's do a quick refresher on functions.
Functions are defined using the `function` keyword followed by:

1. A pair of parentheses `( )` with optional parameters inside.

2. A pair of curly braces with the function's code inside `{ }`.

3. A semicolon `;`.

And when we call the function, we can put inputs (arguments) for the parameters.

For example, the `square` function on line 2 takes `x` as its parameter and returns that parameter squared.

```javascript
// Accepts a number x as input and returns its square
var square = function (x) {
  return x * x;
};

// Write the function multiply below
// It should take two parameters and return the product
var multiply=function(x,y){
 return x*y;   
}

multiply(2,5);
```

### 2. What is a Method ?

In the last section, we discussed properties. We can think of properties as variables associated with an object. Similarly, a **method** is just like a function associated with an object.

Let's look at `bob`, our same person object from the last lesson. Instead of just having the properties `name` and `age` (line 3 & 4), bob also has a method called `setAge` (line 6). As you can probably guess, this method sets `bob`'s age to whatever argument you give it.

Notice how we define `setAge` kind of like we define a property. The big difference is that we put in a function after the equals sign instead of a string or number.

We call a method like a function, but we use `ObjectName.methodName()`. Look at line 10 where we use the method to change `bob`'s age to `40`. We did this by calling `bob.setAge(40);`.

```javascript
// here is bob again, with his usual properties
var bob = new Object();
bob.name = "Bob Smith"; //Line 3
bob.age = 30; //Line 4
// this time we have added a method, setAge
bob.setAge = function (newAge){ //Line 6
  bob.age = newAge;
};
// here we set bob's age to 40
bob.setAge(40); //Line 10
// bob's feeling old.  Use our method to set bob's age to 20
bob.setAge(20);
```

### 3. Why are methods important ?

Methods serve several important purposes when it comes to objects.

1. They can be used to change object property values. The method `setAge` on line 4 allows us to update `bob.age`.

2. They can be used to make calculations based on object properties. Functions can only use parameters as an input, but methods can make calculations with object properties. For example, we can calculate the year `bob` was born based on his `age` with our `getYearOfBirth `method (line 8).

```javascript
var bob = new Object();
bob.age = 17;
// this time we have added a method, setAge
bob.setAge = function (newAge){ //Line 4
  bob.age = newAge;
};

bob.getYearOfBirth = function () { //Line 8
  return 2014 - bob.age;
};
console.log(bob.getYearOfBirth());
```

### 4. This keyword
The keyword `this` acts as a placeholder, and will **refer to whichever object called that method** when the method is actually used.

Let's look at the method `setAge` (line 2) to see how this works. By using the keyword `this`, `setAge` will change the `age` property of any object that calls it. Previously, we had a specific object `bob` instead of the keyword `this`. But that limited the use of the method to just `bob`.

Then when we say `bob.setAge = setAge;` (line 9), it means whenever we type `bob.setAge( )`, `this.age` in the `setAge` method will refer to `bob.age`.

E.G :
```javascript
// here we define our method using "this", before we even introduce bob
var setAge = function (newAge) { //Line 2
  this.age = newAge;
};
// now we make bob
var bob = new Object();
bob.age = 30;
// and down here we just use the method we already made
bob.setAge = setAge; //Line 9
  
// change bob's age to 50 here
bob.setAge(50);
```

```javascript
var square = new Object();
square.sideLength = 6;
square.calcPerimeter = function() {
  return this.sideLength * 4;
};
// help us define an area method here
square.calcArea=function(){
    return this.sideLength*this.sideLength;
};

var p = square.calcPerimeter();
var a = square.calcArea()

```

## Constructor 
### 1. Object Constructor 
We mentioned the term **constructor** back in section one, when we talked about making an object using the keyword `new`. A constructor is a way to create an object.

```javascript
// here we make bob using the Object constructor
var bob = new Object();
bob.name = "Bob Smith";
// add bob's age here and set it equal to 20
bob.age=20;
```
When we write `bob = new Object( );` we are using a built-in constructor called `Object`. This constructor is already defined by the JavaScript language and just makes an object with no properties or methods.

This means we have to add our properties one at a time, just like we've been doing. To review, we've created `bob` using the constructor and defined the `name` property for you.

### 2. Custom Constructor 
Instead of having a dummy constructor, we can make our own constructor. 

This way we can set the properties for an object right when it is created. So instead of using the `Object` constructor which is empty and has no properties, *we can make our own constructors which have properties*.

```javascript
function Person(name,age) { //Line 1
  this.name = name;
  this.age = age;
} // Line 4

// Let's make bob and susan again, using our constructor
var bob = new Person("Bob Smith", 30); //Line 7
var susan = new Person("Susan Jordan", 25); 
// help us make george, whose name is "George Washington" and age is 275
var george=new Person("George Washington",275);
```

To see how this works, look at our `Person`constructor in lines 1–4. This constructor is used to make `Person` objects. Notice it uses the keyword `this` to define the `name` and `age` properties and set them equal to the parameters given.

Now we can use this constructor to make our good friends `bob` and `susan` in only one line each! Look at lines 7–8: once we have the constructor, it's way easier to make people because we can include their `name` and `age` as arguments to their respective constructors.

**More Example** : 

```javascript
function Person(name,age) {
  this.name = name;
  this.age = age;
  this.species = "Homo Sapiens";
}

var sally = new Person("Sally Bowles",39);
var holden = new Person("Holden Caulfield",16);
console.log("sally's species is " + sally.species + " and she is " + sally.age);
console.log("holden's species is " + holden.species + " and he is " + holden.age);
```

### 3. Constructor with Methods 
In addition to setting properties, constructors can also define methods. This way, as soon as the object is created it will have its own methods as well.

```javascript
function Rectangle(height, width) {
  this.height = height;
  this.width = width;
  this.calcArea = function() {
      return this.height * this.width;
  };
  // put our perimeter function here!
  this.calcPerimeter=function(){
    return (2*this.height)+(2*this.width);  
  };
}

var rex = new Rectangle(7,3); //Line 13
var area = rex.calcArea(); //Line 14
var perimeter = rex.calcPerimeter();
```

Here we have a `Rectangle` constructor, which sets the `height` and `width` properties equal to the arguments, just like our `Person` did with `name` and `age`.

Notice we have added a `calcArea` method. This calculates the area of the rectangle in terms of its height and width.

Line 13 creates a new object `rex` which makes use of the constructor. You can see how rex calls the `calcArea` method in line 14 and saves the result in a variable, `area`.

### 4. Review Constructor

Constructors are a way to make objects with the keyword `new`. The most basic constructor is the `Object` constructor, which will make an object with no methods or properties.

For more complicated objects we can make our own constructors and put in whatever properties and methods we want.

Check out our example @ below to see objects in action. Our `Rabbit` constructor defines an `adjective` property and a `describeMyself` method

```javascript
function Rabbit(adjective) {
    this.adjective = adjective;
    this.describeMyself = function() {
        console.log("I am a " + this.adjective + " rabbit");
    };
}

// now we can easily make all of our rabbits
var rabbit1=new Rabbit("fluffy");
var rabbit2=new Rabbit("happy");
var rabbit3=new Rabbit("sleepy");

rabbit1.describeMyself();
rabbit2.describeMyself();
rabbit3.describeMyself();
```

## Combinining Object with other Tools
### 1. Arrays of Object

Remember that an object is just another *type*, like a string or number but more complex. This means that just as we can make arrays of numbers and strings, we can also make arrays of objects.

```javascript
// Our person constructor
function Person (name, age) {
    this.name = name;
    this.age = age;
}

// Now we can make an array of people
var family = new Array();
family[0] = new Person("alice", 40);
family[1] = new Person("bob", 42);
family[2] = new Person("michelle", 8);
// add the last family member, "timmy", who is 6 years old
family[3]=new Person("timmy",6);

```

Here we have our `Person` constructor which should look familiar. We can use this constructor to make an array of `Person` objects, similar to how we might make an array of numbers but filling in people instead.

### 2. Loop the Array of Objects

```javascript
// Our Person constructor
function Person(name,age){
 this.name=name;
 this.age=age;
}

// Now we can make an array of people
var alice=new Person("alice",40);
var bob=new Person("bob",42);
var michelle=new Person("michelle",8);
var timmy=new Person("timmy",6);
var family=[alice,bob,michelle,timmy];

// loop through our new array
for(var i=0;i<family.length;i++){
 console.log(family[i].name + "\n" + family[i].age);   
}
```

### 3. Passing Objects into Functions

```javascript
// Our person constructor
function Person (name, age) {
    this.name = name;
    this.age = age;
}

// We can make a function which takes persons as arguments
// This one computes the difference in ages between two people
var ageDifference = function(person1, person2) {
    return person1.age - person2.age;
}

var alice = new Person("Alice", 30);
var billy = new Person("Billy", 25);

// get the difference in age between alice and billy using our function
var diff = ageDifference(alice,billy);
```

### 4. Combined 
```javascript
// Our person constructor
function Person (name, age) {
    this.name = name;
    this.age = age;
}

// We can make a function which takes persons as arguments
// This one computes the difference in ages between two people
var ageDifference = function(person1, person2) {
    return person1.age - person2.age;
};

// Make a new function, olderAge, to return the age of
// the older of two people
var olderAge=function(person1,person2){
  if(person1.age>person2.age){
    return person1.age;  
  }else {
   return person2.age;   
  }
};

// Let's bring back alice and billy to test our new function
var alice = new Person("Alice", 30);
var billy = new Person("Billy", 25);

console.log("The older person is " + olderAge(alice, billy));
```

## Review 
### 1. Custom Constructor

1. In addition to the basic `Object` constructor, we can define our own custom constructors. These are helpful for two reasons:

2. We can assign our objects properties through parameters we pass in when the object is created.

We can give our objects methods automatically.
These both work to save us time and lines of code when we make objects.

```javascript
// 3 lines required to make harry_potter
var harry_potter = new Object();
harry_potter.pages = 350;
harry_potter.author = "J.K. Rowling";

// A custom constructor for book
function Book (pages, author) {
    this.pages = pages;
    this.author = author;
}

// Use our new constructor to make the_hobbit in one line
var the_hobbit=new Book(320,"J.R.R. Tolkien");
```

### 2. Methods

**Methods** are like functions that are associated with a particular object.

They are especially helpful when you want to either:

1. Update the object properties

2. Calculate something based on an object's properties.

```javascript
function Circle (radius) {
    this.radius = radius;
    this.area = function () {
        return Math.PI * this.radius * this.radius;
        
    };
    // define a perimeter method here
    this.perimeter=function(){
        return 2*Math.PI*this.radius;
    };
};
```

Here, we have included a `Circle` object, with a `radius` property representing the circle's radius. We have implemented an area function which calculates the circle's `area`. Notice we have used `Math.PI` to get the π value.


## Add-Ons 
### Building Mini Project 
Utilize what you have learn in this lesson to build an address book. 

[Sample Code Here](https://github.com/yclim95/CodeAcademy-JavaScript/blob/master/Lesson7_intro_to_object_oriented_programming_part_1/script.js)