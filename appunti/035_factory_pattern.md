# factory pattern

Il **Factory Pattern** è un design pattern creazionale che fornisce un'interfaccia per creare istanze di una classe, permettendo alle sottoclassi di alterare il tipo delle istanze che vengono create. In altre parole, il Factory Pattern fornisce un modo per incapsulare la creazione di oggetti e delegare la decisione di quale classe istanziare alle sottoclassi.

### Componenti del Factory Pattern:

1. **Product (Prodotto):**
   - Definisce l'interfaccia per gli oggetti creati dal factory pattern.

    ```java
    public interface Product {
        void operazione();
    }
    ```

2. **ConcreteProduct (Prodotto Concreto):**
   - Implementa l'interfaccia del Product e rappresenta l'oggetto concreto che verrà creato dal factory.

    ```java
    public class ConcreteProduct implements Product {
        @Override
        public void operazione() {
            System.out.println("Operazione eseguita da ConcreteProduct");
        }
    }
    ```

3. **Creator (Creatore):**
   - Dichiara il metodo di fabbrica astratto che le sottoclassi implementeranno per creare un oggetto di tipo Product.

    ```java
    public abstract class Creator {
        public abstract Product factoryMethod();
    }
    ```

4. **ConcreteCreator (Creatore Concreto):**
   - Implementa il metodo di fabbrica astratto per creare un oggetto di tipo Product concreto.

    ```java
    public class ConcreteCreator extends Creator {
        @Override
        public Product factoryMethod() {
            return new ConcreteProduct();
        }
    }
    ```

### Utilizzo del Factory Pattern:

```java
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.operazione();
    }
}
```

In questo esempio, `Client` utilizza un oggetto `ConcreteCreator` per creare un oggetto `ConcreteProduct` attraverso il metodo di fabbrica `factoryMethod`. Il client interagisce solo con l'interfaccia del `Product`, senza conoscere la classe concreta effettiva che viene istanziata.

### Vantaggi del Factory Pattern:

1. **Astrazione della Creazione:**
   - Il client non deve conoscere le classi concrete ma solo l'interfaccia del prodotto, consentendo una maggiore astrazione.

2. **Decoupling delle Classi:**
   - Riduce l'accoppiamento tra il client e le classi concrete, facilitando la sostituzione di implementazioni senza modificare il client.

3. **Promozione della Coerenza:**
   - Assicura che gli oggetti siano creati in modo coerente, centralizzando la logica di creazione in una classe dedicata.

4. **Semplificazione dell'Estensibilità:**
   - Facilita l'aggiunta di nuovi prodotti senza modificare il client, introducendo nuove sottoclassi di Creator e ConcreteProduct.

5. **Configurabilità:**
   - Consente di configurare il sistema con diverse implementazioni di prodotti senza apportare modifiche significative al codice esistente.

Il Factory Pattern è particolarmente utile quando la creazione di un oggetto coinvolge logiche complesse o la decisione sulla classe da istanziare deve essere ritardata o variabile.

---

![factory](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/factory_pattern_uml_diagram.jpeg)

---

## Step 1

Crea un'interfaccia

**Shape.java**
```java
public interface Shape {
   void draw();
}
```

---

## Step 2

Crea una classe concreta che implementi l'interfaccia

**Rectangle.java**

```java
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}
```

**Square.java**

```java
public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}
```

**Circle.java**

```java
public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}
```

---

## Step 3

Crea una Factory per generare oggetti di classi concretebasandoti su un'informazione testuale (Stringa).

**ShapeFactory.java**

```java
public class ShapeFactory {
	
   //use getShape method to get object of type shape 
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
   }
}
```

---

## Step 4

Usa la Factory per ottenere oggetti concreti passando informazioni come tipo


**FactoryPatternDemo.java**

```java
public class FactoryPatternDemo {

   public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();

      //get an object of Circle and call its draw method.
      Shape shape1 = shapeFactory.getShape("CIRCLE");

      //call draw method of Circle
      shape1.draw();

      //get an object of Rectangle and call its draw method.
      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      //call draw method of Rectangle
      shape2.draw();

      //get an object of Square and call its draw method.
      Shape shape3 = shapeFactory.getShape("SQUARE");

      //call draw method of circle
      shape3.draw();
   }
}
```

---

## Step 5

output:

Inside Circle::draw() method.
Inside Rectangle::draw() method.
Inside Square::draw() method.
