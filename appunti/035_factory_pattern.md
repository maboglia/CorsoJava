# factory pattern

![factory](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/dao_pattern_uml_diagram.jpeg)

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
