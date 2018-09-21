### Primitive Variables

![tipi primitivi](img/tipi.png)

Variables that store value.


Java defines few types like int (numbers), float(floating point numbers), char (characters). Variables of these types store the value of the variable directly. These are not objects. These are called primitive variables. 

An example is shown below: Primitive Variables contains bits representing the value of the variable.

```
int value = 5;

```
Different primitive types in java are char, boolean, byte, short, int, long, double, or float. Because of these primitive types, Java is NOT considered to be a pure objected oriented language.

Numeric Data Types
- Types  : byte, short, int, long, float, double
- Number of bits : 8, 16, 32, 64, 32, 64
- Range  : -x to x-1 where x = Power(2, number of bits -1)

char Data Type
- Used to store characters. Size of character is 16 bits.

Examples

```
int i = 15;
long longValue = 1000000000000l;
byte b = (byte)254;

float f = 26.012f;
double d = 123.567;
boolean isDone = true;
boolean isGood = false;
char ch = 'a';
char ch2 = ';';
```

```java

public class Application {

	public static void main(String[] args) {//here we learn about primitive types of variables!
		int myNumber;//initialize variable that is an integer
		myNumber = 100;//assign variable
		System.out.println(myNumber);//print variable's value
		short myShort = 851;//for shorter numbers
		System.out.println(myShort);
		long myLong = 34093;//for longer numbers
		System.out.println(myLong);
		double myDouble = 3.14159732;//for extra precision
		System.out.println(myDouble);
		float myFloat = 324.4f;//point variables
		System.out.println(myFloat);
		char myChar = 'y';//single characters with single quotes unlike strings!
		System.out.println(myChar);
		boolean myBoolean = true;//booleans
		System.out.println(myBoolean);
		byte myByte = 127;//only 8 bits of data
		System.out.println(myByte);
	}

}
```

[Everything you'll ever need to work with Java primitive types!](https://github.com/deletescape/Primitives)