# Design Pattern - Core Java Pattern

---

I design pattern sono soluzioni generiche a problemi comuni che possono emergere durante la progettazione del software. Sono concetti sviluppati e riconosciuti dalla community degli sviluppatori per risolvere determinati problemi ricorrenti, fornendo un modo standardizzato di affrontare situazioni specifiche.

Ecco alcuni design pattern comuni in programmazione:

---

### 1. **Singleton Pattern:**

- **Scopo:** Garantire che una classe abbia una sola istanza e fornire un punto di accesso globale a essa.
- **Implementazione:** Utilizza un costruttore privato e fornisce un metodo statico per ottenere l'istanza unica.

---

### 2. **Factory Method Pattern:**

- **Scopo:** Definire un'interfaccia per la creazione di un oggetto, ma lasciare alle sottoclassi la scelta delle classi da istanziare.
- **Implementazione:** Delega la creazione dell'istanza alle sottoclassi, ritardando la sua istanziazione a una classe specifica.

---

### 3. **Abstract Factory Pattern:**

- **Scopo:** Fornire un'interfaccia per creare famiglie di oggetti correlati o dipendenti senza specificare le classi concrete.
- **Implementazione:** Introduce un'interfaccia di fabbrica astratta che dichiara metodi per la creazione di oggetti correlati.

---

### 4. **Builder Pattern:**

- **Scopo:** Separare la costruzione di un oggetto complesso dalla sua rappresentazione, consentendo la stessa costruzione di diversi tipi di oggetti.
- **Implementazione:** Utilizza un direttore per controllare il processo di costruzione attraverso un'interfaccia comune.

---

### 5. **Prototype Pattern:**

- **Scopo:** Creare nuovi oggetti duplicando oggetti esistenti, senza fare riferimento alle loro classi specifiche.
- **Implementazione:** Introduce un metodo di clonazione che crea una copia dell'oggetto esistente.

---

### 6. **Adapter Pattern:**

- **Scopo:** Consente a un'interfaccia di funzionare con un'altra interfaccia che non sarebbe altrimenti compatibile.
- **Implementazione:** Introduce un adattatore che funge da ponte tra due interfacce incompatibili.

---

### 7. **Decorator Pattern:**

- **Scopo:** Attaccare dinamicamente responsabilità aggiuntive a un oggetto. È una via alternativa all'ereditarietà per estendere funzionalità.
- **Implementazione:** Aggiunge uno o più decorator che contengono oggetti da decorare.

---

### 8. **Observer Pattern:**

- **Scopo:** Definire una dipendenza uno-a-molti tra oggetti in modo che quando uno oggetto cambia stato, tutti i suoi dipendenti vengano notificati e aggiornati automaticamente.
- **Implementazione:** Usa un soggetto che tiene traccia degli osservatori e li notifica quando cambia lo stato.

---

### 9. **Strategy Pattern:**

- **Scopo:** Definire una famiglia di algoritmi, incapsularli e renderli intercambiabili. Consente al cliente di variare l'algoritmo indipendentemente dall'oggetto che lo utilizza.
- **Implementazione:** Usa una strategia, che è una classe che implementa un'interfaccia comune.

---

### 10. **Command Pattern:**

- **Scopo:** Incapsulare una richiesta come un oggetto, consentendo così la parametrizzazione dei client con diverse richieste, code e registrazione delle richieste.
- **Implementazione:** Definisce un'interfaccia di comando con un metodo `execute`, e poi implementa classi concrete per rappresentare diverse richieste.

Questi sono solo alcuni dei design pattern più noti. L'uso appropriato di design pattern può migliorare la manutenibilità, la flessibilità e la comprensibilità del codice. Tuttavia, è importante utilizzare i design pattern con discernimento e adattarli alle esigenze specifiche del problema che si sta risolvendo.

---

## Pattern GOF - Gang of Four

---

## 1) 5 Creational Pattern

Scopo dei design pattern creazionali
- Rendere un sistema indipendente dall’implementazione concreta delle sue componenti
- Si nascondono i tipi concreti delle classi realmente utilizzate
- Si nascondono i dettagli sulla composizione e creazione
- Riduzione accoppiamento e flessibilità
- Ampio uso dell’astrazione / interfacce

- [Factory Method Pattern](https://github.com/maboglia/CorsoJava/blob/master/appunti/035_factory_pattern.md)
- [Abstract Factory Pattern](https://it.wikipedia.org/wiki/Abstract_factory)
- [Singleton Pattern](https://github.com/maboglia/CorsoJava/blob/master/appunti/033_singleton_pattern.md)
- [Prototype Pattern](https://it.wikipedia.org/wiki/Prototype_pattern)
- [Builder Pattern](https://it.wikipedia.org/wiki/Builder)
- Object Pool Pattern

---

## 2) 7 Structural Pattern

Scopo dei design pattern strutturali
- Affrontare problemi che riguardano la composizione
di classi e oggetti
- Consentire il riutilzzo degli oggetti esistenti fornendo
agli utilizzatori un’interfaccia più adatta
- Integrazioni fra librerie / componenti diverse
- Sfruttano l’ereditarietà e l’aggregazione

- [Adapter Pattern](https://it.wikipedia.org/wiki/Adapter_pattern)
- [Bridge Pattern](https://it.wikipedia.org/wiki/Bridge_pattern)
- [Composite Pattern](https://it.wikipedia.org/wiki/Composite)
- [Decorator Pattern](https://github.com/maboglia/CorsoJava/blob/master/appunti/034_decorator_pattern.md)
- [Facade Pattern](https://it.wikipedia.org/wiki/Fa%C3%A7ade_pattern)
- Flyweight Pattern
- Proxy Pattern

---

## 3) 11 Behavioral Pattern

Scopo dei design pattern comportamentali
- In che modo un oggetto svolge la sua funzione?
- In che modo diversi oggetti collaborano tra loro?

- Chain of Responsibility
- [Command Pattern](https://it.wikipedia.org/wiki/Command_pattern)
- [Interpreter Pattern](https://it.wikipedia.org/wiki/Interpreter_pattern)
- [Iterator Pattern](https://it.wikipedia.org/wiki/Iterator_pattern)
- Mediator
- [Memento](https://it.wikipedia.org/wiki/Memento_pattern)
- [Observer](https://it.wikipedia.org/wiki/Observer_pattern)
- State
- [Strategy](https://it.wikipedia.org/wiki/Strategy_pattern)
- [Template method](https://it.wikipedia.org/wiki/Template_method)
- Visitor

---

---

### Altri design patterns

- [MVC - Model View Controller](https://it.wikipedia.org/wiki/Model-view-controller)
- [DAO - Data Access Object](https://github.com/maboglia/CorsoJava/blob/master/appunti/036_dao_pattern.md)
- Container pattern
- Dependency Injection pattern
  - Separa il comportamento di una componente dalla risoluzione delle sue   dipendenze
  - Minimizza il livello di accoppiamento
  - La componente dichiara unicamente le sue dipendenze
  - Un framework DI risolve a runtime le dipendenze dichiarate
  - Utilizzo costruttori e metodi setter dei POJO
  - Perdita dell’incapsulamento
