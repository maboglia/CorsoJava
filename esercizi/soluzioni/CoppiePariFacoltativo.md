Il programma Java "CoppiePariFacoltativo" trova e stampa le prime 10 coppie di numeri pari presenti nell'array dato.

Ecco il testo dell'esercizio:

---

**CoppiePariFacoltativo**

Scrivi un programma Java che trovi e stampi le prime 10 coppie di numeri pari presenti nell'array dato.

L'array di numeri è già fornito nel codice e contiene i seguenti valori: {4, 6, 11, 10, 9, 14, 31, 90, 20, 30}.

Il programma deve scorrere l'array e trovare le prime 10 coppie di numeri pari, stampando entrambi i numeri della coppia.

**Nota:** Questo esercizio è opzionale e ha la stessa logica dell'esercizio "CoppiePari2", ma utilizza un approccio differente utilizzando un ciclo while anziché un ciclo for.

Ecco un esempio di output del programma:

**Output:**
```
4 6
4 10
4 14
4 90
4 20
6 10
6 14
6 90
6 20
10 14
```

---

```java
public class CoppiePariFacoltativo {

	public static void main(String[] args) {

		int[] numeri = {4,6,11,10,9,14,31,90,20,30};
		int cont=0;
		
		int i=0;
		while (i<9 && cont<10) {
			int j=i+1;
			while (j<10 && cont<10) {
				if ((numeri[i]%2==0)&&(numeri[j]%2==0)) {
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