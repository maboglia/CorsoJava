Il programma Java "CoppiePositive2" trova e stampa tutte le coppie di numeri positivi presenti nell'array dato.

Ecco il testo dell'esercizio:

---

**CoppiePositive2**

Scrivi un programma Java che trovi e stampi tutte le coppie di numeri positivi presenti nell'array dato.

L'array di numeri è già fornito nel codice e contiene i seguenti valori: {5, 6, -11, -3, 9, 15, -1, 90, -21, 3}.

Il programma deve scorrere l'array e trovare tutte le coppie di numeri positivi, stampando entrambi i numeri della coppia.

Ecco un esempio di output del programma:

**Output:**

```
5 6
5 9
5 15
5 90
6 9
6 15
6 90
9 15
9 90
15 90
```

---

```java
public class CoppiePositive2 {

	public static void main(String[] args) {

		int[] numeri = {5, 6, -11, -3, 9, 15, -1, 90, -21, 3};
		int cont=0;
		
		int i=0;
		while (i<9 && cont<10) {
			int j=i+1;
			while (j<10 && cont<10) {
				if ((numeri[i]>=0)&&(numeri[j]>=0)) {
					System.out.println(numeri[i] + " " + numeri[j]);
					cont++;
				}
				j++;
			}
			i++;
		}		
	}

}
```
