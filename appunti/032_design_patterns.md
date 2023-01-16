# Design Pattern - Core Java Pattern

---

## 1) 5 Creational Pattern

Scopo dei design pattern creazionali
* Rendere un sistema indipendente
dall’implementazione concreta delle sue componenti
* Si nascondono i tipi concreti delle classi realmente
utilizzate
* Si nascondono i dettagli sulla composizione e creazione
* Riduzione accoppiamento e flessibilità
* Ampio uso dell’astrazione / interfacce

* [Factory Method Pattern](https://github.com/maboglia/CorsoJava/blob/master/appunti/035_factory_pattern.md)
* [Abstract Factory Pattern](https://it.wikipedia.org/wiki/Abstract_factory)
* [Singleton Pattern](https://github.com/maboglia/CorsoJava/blob/master/appunti/033_singleton_pattern.md)
* [Prototype Pattern](https://it.wikipedia.org/wiki/Prototype_pattern)
* [Builder Pattern](https://it.wikipedia.org/wiki/Builder)
* Object Pool Pattern

---

## 2) 7 Structural Pattern

Scopo dei design pattern strutturali
* Affrontare problemi che riguardano la composizione
di classi e oggetti
* Consentire il riutilzzo degli oggetti esistenti fornendo
agli utilizzatori un’interfaccia più adatta
* Integrazioni fra librerie / componenti diverse
* Sfruttano l’ereditarietà e l’aggregazione

* [Adapter Pattern](https://it.wikipedia.org/wiki/Adapter_pattern)
* [Bridge Pattern](https://it.wikipedia.org/wiki/Bridge_pattern)
* [Composite Pattern](https://it.wikipedia.org/wiki/Composite)
* [Decorator Pattern](https://github.com/maboglia/CorsoJava/blob/master/appunti/034_decorator_pattern.md)
* [Facade Pattern](https://it.wikipedia.org/wiki/Fa%C3%A7ade_pattern)
* Flyweight Pattern
* Proxy Pattern

---

## 3) 11 Behavioral Pattern

Scopo dei design pattern comportamentali
* In che modo un oggetto svolge la sua funzione?
* In che modo diversi oggetti collaborano tra loro?

* Chain of Responsibility
* [Command Pattern](https://it.wikipedia.org/wiki/Command_pattern)
* [Interpreter Pattern](https://it.wikipedia.org/wiki/Interpreter_pattern)
* [Iterator Pattern](https://it.wikipedia.org/wiki/Iterator_pattern)
* Mediator
* [Memento](https://it.wikipedia.org/wiki/Memento_pattern)
* [Observer](https://it.wikipedia.org/wiki/Observer_pattern)
* State
* [Strategy](https://it.wikipedia.org/wiki/Strategy_pattern)
* [Template method](https://it.wikipedia.org/wiki/Template_method)
* Visitor
---

### Altri design patterns

* [MVC - Model View Controller](https://it.wikipedia.org/wiki/Model-view-controller)
* [DAO - Data Access Object](https://github.com/maboglia/CorsoJava/blob/master/appunti/036_dao_pattern.md)
* Container pattern
* Dependency Injection pattern
  * Separa il comportamento di una componente dalla risoluzione delle sue   dipendenze
  * Minimizza il livello di accoppiamento
  * La componente dichiara unicamente le sue dipendenze
  * Un framework DI risolve a runtime le dipendenze dichiarate
  * Utilizzo costruttori e metodi setter dei POJO
  * Perdita dell’incapsulamento
