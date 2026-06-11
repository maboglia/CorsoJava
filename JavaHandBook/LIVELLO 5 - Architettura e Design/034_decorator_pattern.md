# decorator pattern

Il **Decorator Pattern** è un design pattern strutturale che consente di aggiungere comportamenti o responsabilità a oggetti in modo dinamico. Questo pattern è basato sulla composizione di oggetti, consentendo di avvolgere un oggetto di base in uno o più decorator che aggiungono funzionalità senza modificare la struttura di base degli oggetti coinvolti.

### Componenti del Decorator Pattern:

1. **Component (Componente):**
   - Definisce l'interfaccia comune per tutti gli oggetti concreti e i decorator.

    ```java
    public interface Component {
        void operation();
    }
    ```

2. **ConcreteComponent (Componente Concreto):**
   - Implementa l'interfaccia Componente e rappresenta l'oggetto base al quale possono essere aggiunte responsabilità.

    ```java
    public class ConcreteComponent implements Component {
        @Override
        public void operation() {
            System.out.println("Operazione di ConcreteComponent");
        }
    }
    ```

3. **Decorator (Decoratore):**
   - Definisce un'interfaccia comune con il Component, aggiungendo un'interfaccia aggiuntiva per la gestione delle responsabilità.

    ```java
    public abstract class Decorator implements Component {
        protected Component component;

        public Decorator(Component component) {
            this.component = component;
        }

        @Override
        public void operation() {
            component.operation();
        }
    }
    ```

4. **ConcreteDecorator (Decoratore Concreto):**
   - Estende il Decorator e aggiunge la responsabilità aggiuntiva all'oggetto concreto.

    ```java
    public class ConcreteDecoratorA extends Decorator {
        public ConcreteDecoratorA(Component component) {
            super(component);
        }

        @Override
        public void operation() {
            super.operation();
            addedBehavior();
        }

        private void addedBehavior() {
            System.out.println("Operazione aggiuntiva di ConcreteDecoratorA");
        }
    }
    ```

    ```java
    public class ConcreteDecoratorB extends Decorator {
        public ConcreteDecoratorB(Component component) {
            super(component);
        }

        @Override
        public void operation() {
            super.operation();
            addedBehavior();
        }

        private void addedBehavior() {
            System.out.println("Operazione aggiuntiva di ConcreteDecoratorB");
        }
    }
    ```

### Utilizzo del Decorator Pattern:

```java
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decoratedA = new ConcreteDecoratorA(component);
        Component decoratedB = new ConcreteDecoratorB(decoratedA);

        // Operazione base
        component.operation();

        // Operazione con Decoratore A
        decoratedA.operation();

        // Operazione con Decoratore B
        decoratedB.operation();
    }
}
```

In questo esempio, il `Client` crea un oggetto `ConcreteComponent` di base e poi lo decora dinamicamente con i decorator `ConcreteDecoratorA` e `ConcreteDecoratorB`. Ogni decorator aggiunge funzionalità senza modificare la struttura di base dell'oggetto.

### Vantaggi del Decorator Pattern:

1. **Flessibilità e Estensibilità:**
   - Consente di aggiungere responsabilità in modo dinamico senza modificare la struttura degli oggetti coinvolti.

2. **Composizione a Tempo di Esecuzione:**
   - La composizione dei decorator può essere fatta a tempo di esecuzione, fornendo una maggiore flessibilità rispetto all'ereditarietà statica.

3. **Riutilizzo del Codice:**
   - I decorator possono essere riutilizzati in combinazioni diverse per ottenere diverse configurazioni di oggetti.

4. **Mantenimento del Principio OCP:**
   - Rispetta il principio aperto/chiuso, consentendo l'estensione senza modificare il codice esistente.

5. **Chiarezza nell'Architettura:**
   - Rende più chiara l'architettura del codice separando responsabilità specifiche in classi distinte.

Il Decorator Pattern è particolarmente utile quando è necessario estendere dinamicamente le funzionalità di un oggetto senza introdurre una proliferazione di sottoclassi.

---

## Step 1

Create an interface.

Shape.java
```java
public interface Shape {
   void draw();
}
```

---

## Step 2

Create concrete classes implementing the same interface.

Rectangle.java

```java
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }
}
```

Circle.java

```java
public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }
}
```

---

## Step 3

Create abstract decorator class implementing the Shape interface.

ShapeDecorator.java

```java
public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;

   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   public void draw(){
      decoratedShape.draw();
   }	
}
```

---

## Step 4

Create concrete decorator class extending the ShapeDecorator class.

RedShapeDecorator.java

```java
public class RedShapeDecorator extends ShapeDecorator {

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);		
   }

   @Override
   public void draw() {
      decoratedShape.draw();	       
      setRedBorder(decoratedShape);
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
}
```

---

## Step 5

Use the RedShapeDecorator to decorate Shape objects.

DecoratorPatternDemo.java

```java
public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape circle = new Circle();

      Shape redCircle = new RedShapeDecorator(new Circle());

      Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Circle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      redCircle.draw();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();
   }
}
```

---

## Step 6

Verify the output.

```java
Circle with normal border
Shape: Circle

Circle of red border
Shape: Circle
Border Color: Red

Rectangle of red border
Shape: Rectangle
Border Color: Red
```