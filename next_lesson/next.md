## Networking Java

```java
package com.example.java;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Main {

    private static final String SITO_WEB =
            "http://www.corriere.it";

    public static void main(String[] args) throws IOException {

        URL url = new URL(SITO_WEB);

        try (
        InputStream stream = url.openStream();
        BufferedInputStream buf = new BufferedInputStream(stream);

        ){
            StringBuilder sb = new StringBuilder();

            while (true) {
                int data = buf.read();

                if (data == -1) {
                    break;
                } else {
                    sb.append((char)data);
                }
            }

            System.out.println(sb);
        }
    }
}

```

## interfacce esempio 2


```java
public interface Animale {
	
	public void faiVerso();
	
	public void dimmiCiboPreferito();
	
}
```
```java
public class Cane implements Animale {
	
	public void faiVerso(){
		System.out.println("Bau!");
	}
	
	public void dimmiCiboPreferito(){
		System.out.println("Carne!");
	}
}
```
```java
public class Gatto implements Animale {
	
	public void faiVerso(){
		System.out.println("Miao!");
	}
	
	public void dimmiCiboPreferito(){
		System.out.println("Pesce!");
	}
}
```
```java
public class Topo implements Animale {
	
	public void faiVerso(){
		System.out.println("Squit!");
	}
	
	public void dimmiCiboPreferito(){
		System.out.println("Formaggio!");
	}
}
```
```java
public class Test{
	public static void main(String[] args) {
		Animale a1 = new Gatto();
		Animale a2 = new Cane();
		Animale a3 = new Topo();
		System.out.println("- Gatto	- - - - - - - -");
		a1.faiVerso();
		a1.dimmiCiboPreferito();
		System.out.println("- Cane	- - - - - - - -");
		a2.faiVerso();
		a2.dimmiCiboPreferito();
		System.out.println("- Topo	- - - - - - - -");
		a3.faiVerso();
		a3.dimmiCiboPreferito();		
	}
}
```

## interfacce esempio 2

```java
public interface CostantiMatematiche {
	
	public double PI = 3.14;
	
	public double E = 2.71;
}
```
```java
public class TestCostanti1 {
	public static void main(String[] args) {
		System.out.println(CostantiMatematiche.PI);
		System.out.println(CostantiMatematiche.E);		
	}
}
```
```java
public class TestCostanti2 implements CostantiMatematiche{
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(E);
	}
}
```
```java

```
```java

```
```java

```
```java

```