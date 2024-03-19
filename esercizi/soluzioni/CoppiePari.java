/*


**CoppiePari**

Scrivi un programma Java che trovi e stampi tutte le coppie di numeri pari presenti nell'array dato.

L'array di numeri è già fornito nel codice e contiene i seguenti valori: {5, 6, 11, 13, 9, 14, 31, 90, 21, 30}.

Il programma deve scorrere l'array e trovare tutte le coppie di numeri pari, stampando entrambi i numeri della coppia.

Ecco un esempio di output del programma:

**Output:**
```
6 14
6 30
14 30
90 30
```

---
*/

public class CoppiePari {

	public static void main(String[] args) {

		int[] numeri = {5,6,11,13,9,14,31,90,21,30};

		for (int i=0; i<9; i++)
			for (int j=i+1; j<10; j++)
				if ((numeri[i]%2==0)&&(numeri[j]%2==0))
					System.out.println(numeri[i] + " " + numeri[j]);
		
	}

}
