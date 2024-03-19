Il codice del programma Java "FizBuz" stampa i numeri da 0 a 99 inclusi, sostituendo "FIZ" per i multipli di 3, "BUZZ" per i multipli di 5 e "FIZBUZ" per i multipli di entrambi 3 e 5.

Ecco il testo del programma:

---

```java
public class FizBuz {

 public static void main(String[] args) {
  
  for (int i = 0; i < 100; i++) {
   System.out.println("i vale: " + i);
   
   if (i % 3 == 0 && i % 5 == 0) {
    System.out.println("FIZBUZ");
   } 
   else {
    if (i % 3 == 0) {
     System.out.println("FIZ");
    } 
    else if (i % 5 == 0) {
     System.out.println("BUZZ");
    } 
   }
  }
 }
}
```

---

```java
public class FizBuz {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			System.out.println("i vale: " + i);
			
			if (i % 3 == 0 && i%5 == 0) {
				System.out.println("FIZBUZ");
			} 
			else {
				if (i % 3 == 0) {
					System.out.println("FIZ");
				} 
				else
				if (i % 5 == 0) {
					System.out.println("BUZZ");
				} 
			}
			
		}
		

	}

}

```