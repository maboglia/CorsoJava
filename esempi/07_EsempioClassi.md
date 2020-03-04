# Le classi

## Variabili e metodi static

```java
class Statica{
	public int varIstanza;
	public static int varStatica;
	public Statica(int valIniziale){
		varIstanza = valIniziale;
	}
	public static void metodoStatic(){
		// mostra l'esecuzione del metodo
		System.out.println("varStatica vale " + varStatica);
	}
	static{
		// mostra quando viene eseguito il blocco
		System.out.println("Blocco static");
		// inizializza la variabile static
		varStatica = 5;
	}
}
```


```java
class Principale{
	public static void main(String args[]){
		Statica s, t;
		// non esiste ancora un oggetto Statica
		Statica.metodoStatic();
		System.out.println("varStatica senza istanze vale "+ Statica.varStatica);
		// istanzia un oggetto Statica
		s = new Statica(3);
		System.out.println("s.varIstanza vale " + s.varIstanza);
		System.out.println("s.varStatica vale " + s.varStatica);
		// istanzia un secondo oggetto Statica
		t = new Statica(4);
		System.out.println("t.varIstanza vale " + t.varIstanza);
		System.out.println("t.varStatica vale " + t.varStatica);
		/* assegna un valore alla variabile static tramite
		una istanza di Statica */
		t.varStatica = 10;
		System.out.println("t.varStatica vale " + t.varStatica);
		/* tutte le istanze di Static condividono
		il medesimo valore della variabile static */
		System.out.println("s.varStatica vale " + s.varStatica);
	}
}

```
## esempio

```java
package esempi.week5;

import java.awt.Rectangle;

/**
   This example demonstrates accessors and mutators.
*/
public class AccessorMutatorDemo
{
   public static void main(String[] args)
   {
      Rectangle box = new Rectangle(5, 10, 20, 30);
      System.out.print("box: ");
      System.out.println(box);

      // getWidth is an accessor method

      double width = box.getWidth();
      System.out.print("width: ");
      System.out.println(width);

      // Calling an accessor doesn't change the object

      System.out.print("box: ");
      System.out.println(box);

      // translate is a mutator method

      box.translate(15, 25);

      // Calling a mutator changes the object.
      
      System.out.print("box: ");
      System.out.println(box);
   }
}

```
## esempio
```java
package esempi.week5;


import java.awt.Rectangle;

/**
   This example demonstrates constructors.
*/
public class ConstructorDemo
{
   public static void main(String[] args)
   {
      // Constructs and prints a rectangle
      System.out.println(new Rectangle(5, 10, 20, 30));

      // Constructs a rectangle and saves it in a variable
      Rectangle box = new Rectangle(5, 10, 20, 30);
      System.out.print("box: ");
      System.out.println(box);

      // The constructor with no arguments
      box = new Rectangle();
      System.out.print("box: ");
      System.out.println(box);
   }
}

```
## esempio
```java
public class DemoClass
{
    private int x;

    public DemoClass()
    {
        // assign default value
        x = 0;
    }

    public DemoClass(int x)
    {
        // use this.x to refer to the instance variable x
        // use x to refer to a local variable x (more specifically,
        // method parameter x)
        this.x = x;
    }

    public DemoClass(DemoClass otherDemo)
    {
        // copy the value from the otherDemo
        this.x = otherDemo.x;
    }

    // static method (aka class method)
    public static void s1() {
        return;
    }
    // instance method
    public void i1() {
        return;
    }

    // static calling static OK
    // static calling instance is a compile-time error
    public static void s2() {
//        i1();     // compile-time error
        s1();       // DemoClass.s1
        return;
    }

    // instance calling static OK
    // instance calling instance OK
    public void i2() {
        s1();       // DemoClass.s1();
        i1();       // this.i1();
        return;
    }

    // call various versions of overload() based on their 
    // list of parameters (aka function signatures)
    public void overloadTester() {
        System.out.println("overloadTester:\n");

        overload((byte)1);
        overload((short)1);
        overload(1);
        overload(1L);
        overload(1.0f);
        overload(1.0);
        overload('1');
        overload(true);
    }
    
    public void overload(byte b) {
        System.out.println("byte");
    }    
    public void overload(short s) {
        System.out.println("short");
    }    
    public void overload(int i) {
        System.out.println("int");
    }
    public void overload(long l) {
        System.out.println("long");
    }
    public void overload(float f) {
        System.out.println("float");
    }
    public void overload(double d) {
        System.out.println("double");
    }    
    public void overload(char c) {
        System.out.println("char");
    }    
    public void overload(boolean b) {
        System.out.println("boolean");
    }    

    public static void main(String[] args) {
        DemoClass dc = new DemoClass();
        dc.overloadTester();
    }
}
```
## esempio
```java
package esempi.week11;

public class MiaClasse {

	public int mioNumero;
	Integer mioNum2 = 14;

	//convenzione di naming: si chiama come la classe, perciò inizia con lettera maiuscala, diversamente dagli altri metodi
	//inoltre, non ha tipo di ritorno: la sua funzione è costruire l'oggetto
	
	public MiaClasse(){
		 mioNumero = 1;
	}
	
	public void mioMetodo(){
		System.out.println("ciao");
	}
	
	public void stampaInfo(){
		System.out.println("stampa info ad hoc sull'oggetto");
	}
	


	
	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "esemplare di mia classe: " + getClass().getName();
	}

	public static void main(String[] args) {
		MiaClasse mc = new MiaClasse();
		System.out.println(mc);
		MiaClasse mc2 = mc;
		System.out.println(mc2);
		
		mc = null;
		mc2 = null;
		
		System.out.println(mc);
		System.out.println(mc2);
		
		
	}
	
}

```
