# OOP Java Schema

## Unità formative

| Fondamenti            | Java OOP                     | Java Web & GUI         | Advanced & JavaEE |
| --------------------- | ---------------------------- | ---------------------- | ----------------- |
| Paradigmi e linguaggi | Progettazione classi         | JOptionPane            | Persistenza       |
| Operatori e tipi      | UML Class diagram            |  GUI                   | JDBC & DAO        |
| Strutture controllo   | JCF e Iteratori              |  Gestione Eventi       | Hibernate/MyBatis |
| Classi                | Ereditarietà e polimorfismo  | JavaFX                 | Spring Boot       |
| Oggetti               | Eccezioni - Debug - Testing  | Swing e Window Builder | Servlets          |
| Attributi e Metodi    | Classi astratte e interfacce | JSP Base               | REST              |
| Array                 | Gestione File - I/O          | Design Patterns        | Ajax-JSON-XML     |
| Strutture dati        | Stream - I/O                 | MVC Pattern            | Networking Java   |

---


## Java SE: Programming I

| n.  | titolo                                                             |
| --- | ------------------------------------------------------------------ |
| 1   | Java Course Introduction                                           |
| 2   | Basic Java keywords                                                |
| 4   | Packages, Import Statements, Instance Members, Default Constructor |
| 5   | Access and Non Access Modifiers                                    |
| 6   | Tools – Eclipse, Netbeans, IntelliJIdea, Junit, Maven              |
| 7   | if/else statements and booleans                                    |
| 8   | loops: for, while and do while loop                                |
| 9   | for each loop and arrays                                           |
| 10  | arrays and enums                                                   |
| 11  | enums and switch statement                                         |
| 12  | switch statement                                                   |
| 13  | Java Logging with sl4j and logback                                 |
| 14  | deep dive into public static void main                             |
| 15  | Checked and Unchecked Exceptions in Java                           |
| 16  | Interfaces in Java                                                 |
| 17  | Inheritance in Java                                                |
| 18  | Object finalizer method                                            |
| 19  | Object clone method                                                |
| 20  | Object toString method                                             |
| 21  | Java autoboxing, Static Imports, Number Types and more             |
| 22  | HashCode and Equals                                                |
| 23  | Java Collections Framework Introduction                            |
| 24  | ArrayList                                                          |
| 25  | Linked List Data Structure                                         |
| 26  | LinkedList vs ArrayList                                            |
| 27  | Identity vs Equality in Java                                       |
| 28  | Comparable interface in Java                                       |
| 29  | Shallow vs. Deep Copy in Java                                      |



# Exam Topics (Java SE 11 Programmer I – 1Z0-815)


---

## Understanding Java Technology and environment

* Describe Java Technology and the Java development environment
* Identify key features of the Java language


---

## Creating a Simple Java Program

* Create an executable Java program with     a main class
* Compile and run a Java program from     the command line
* Create and import packagesWorking 



---

## With Java Primitive Data Types and String APIsUsing 

* Declare and initialize variables (including casting  and promoting primitive data types)
* Identify the scope of variable
* Use local variable type inference
* Create and manipulate Strings
* Manipulate data using the StringBuilder class and its methods


---

## Operators and Decision Constructs
* Use Java operators including the use of parenthesis to override operator precedence
* Use Java control statements including if, else, and switch
* Create and use do/while, while, for and for each loops, including nested loops, use break and continue statements


---

## Working with Java Arrays
* Declare, instantiate, initialize and use a one-dimensional array
* Declare, instantiate, initialize and use two-dimensional array
  

---

## Describing and Using Objects and Classes
* Declare and instantiate Java objects, and explain objects’ lifecycles (including creation, dereferencing   by reassignment, and garbage collection)
* Define the structure of a Java class
* Read or write to object fields


---

## Creating and Using Methods

* Create methods and constructors with arguments and return values
* Create and invoke overloaded methods
* Apply the static keyword to methods and fields


---

## Applying Encapsulation
* Apply access modifiers
* Apply encapsulation principles to a class



---

## Reusing Implementations  Through Inheritance

* Create and use subclasses and superclasses
* Create and extend abstract classes
* Enable polymorphism by overriding methods
* Utilize polymorphism to cast and call methods, differentiating object type versus reference type
* Distinguish overloading, overriding, and hiding

---

## Programming Abstractly  Through Interfaces

* Create and implement interfaces
* Distinguish class inheritance from interface inheritance including abstract classes
* Declare and use List and ArrayList instances
* Understanding lambda Expression

---

## Handling Exception

* Describe the advantages of Exception handling and differentiate among checked, unchecked exceptions, and Errors
* Create try-catch blocks and determine how exceptions alter program flow
* Create and invoke a method that throws an exception

---

## Understanding Modules

* Describe the Modular JDK
* Declare modules and enable access between modules
* Describe how a modular project is compiled and run



Exam Topics (Java SE 11 Programmer II – 1Z0-816)

---

## Java Fundamentals
* Create and use final classes
* Create and use inner, nested and     anonymous classes
* Create and use enumerations

---

## Exception Handling and Assertions
* Use try-with-resources construct
* Create and use custom exception classes
* Test invariants by using assertions

---

## Java Interfaces
* Create and use interfaces with default methods
* Create and use interfaces with private methods

---

## Generics and Collections
* Use wrapper classes, auto-boxing     and auto-unboxing
* Create and use generic classes,     methods with diamond notation and wildcards
* Describe Collections Framework     and use key collection interfaces
* Use Comparator and Comparable interfaces
* Create and use convenience methods     for collections 

---

## Functional Interface and Lambda Expressions
* Define and write functional interfaces
* Create and use lambda expressions including    statement lambdas, local-variable for lambda    parameters

---

## Java Stream API
* Describe the Stream interface and pipelines
* Use lambda expressions and method references

---

## Built-in Functional Interfaces
* Use interfaces from java.util.function package
* Use core functional interfaces including     Predicate, Consumer, Function and Supplier
* Use primitive and binary variations of base     interfaces of java.util.function package

---

## Lambda Operations on Stream
* Extract stream data using map, peek     and flatMap methods
* Search stream data using search findFirst,     findAny, anyMatch, allMatch and noneMatch     methods
* Use Optional class
* Perform calculations using count, max, min,     average and sum stream operations
* Sort a collection using lambda expressions
* Use Collectors with stream, including the     groupingBy and partitioningBy operation

---

## Migration to a Modular Application
* Migrate the application developed using a Java     version prior to SE 9 to SE 11 including top-down    and bottom-up migration, splitting a Java SE 8     application into modules for migration
* Run a modulaized application on classpath and     on modulepath
* Use jdeps to determine dependencies and     identify way to address the cyclic dependencies

---

## Services in a Modular Application
* Describe the components of Services     including directives
* Design a service type, load services using     ServiceLoader, check for dependencies of the     services including consumer and provider modules

---

## Concurrency
* Create worker threads using Runnable, Callable     and use an ExecutorService to concurrently     execute tasks
* Use java util concurrent collections and classes     including CyclicBarrier and CopyOnWriteArrayList
* Write thread-safe codae
* Identify threading problems such as deadlocks     and livelocks

---

## Parallel Stream
* Develop the code that use parallel stream
* Implement decomposition and reduction     with stream


---

## I/O (Fundamentals and NIO2)
* Read data from and write console and file data  using I/O stream
* Use I/O Stream to read and write files
* Read and write objects by using serialization
* Use Path interface to operate on file     and directory paths
* Use Files class to check, delete, copy or move a  file or directory
* Use Stream API with Files

---

## Secure Coding in Java SE Application
* Preventing Denial of Service in Java applications
* Securing confidential information in Java application
* Implementing Data integrity guidelines-injections     and inclusion and input validation
* Preventing external attack of the code by limiting     Accessibility and Extensibility, properly handling     input validation, and mutablity
* Securing constructing sensitive objects
* Securing Serialization and Deserialization

---

## Database Applications with JDBC
* Connect to databases using JDBC URLs and     DriverManager
* Use PreparedStatement to perform CRUD operations
* Use PreparedStatement and CallableStatement     APIs to perform database operations

---

## Localization
* Use Locale class
* Use resource bundles
* Format messages, dates, and numbers with Java


---

## Annotations
* Describe the purpose of annotations and typical     usage patterns  
*  Apply annotations to classes and methods  
*  Describe commonly used annotations in the JDK  
*  Declare custom annotations