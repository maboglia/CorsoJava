Il programma Java "CoppiePositive" trova e stampa tutte le coppie di numeri positivi presenti nell'array dato.

Ecco il testo dell'esercizio:

---

**CoppiePositive**

Scrivi un programma Java che trovi e stampi tutte le coppie di numeri positivi presenti nell'array dato.

L'array di numeri è già fornito nel codice e contiene i seguenti valori: {-5, 6, -11, -3, -9, 15, -1, 90, -21, 3}.

Il programma deve scorrere l'array e trovare tutte le coppie di numeri positivi, stampando entrambi i numeri della coppia.

Ecco un esempio di output del programma:

**Output:**
```
6 15
6 90
15 90
```

---

```java
public class CoppiePositive {

	public static void main(String[] args) {

		int[] numeri = {-5, 6, -11, -3, -9, 15, -1, 90, -21, 3};

		for (int i=0; i<9; i++)
			for (int j=i+1; j<10; j++)
				if ((numeri[i]>=0)&&(numeri[j]>=0))
					System.out.println(numeri[i] + " " + numeri[j]);
		
	}

}
```