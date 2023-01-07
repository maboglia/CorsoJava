## Array monodimensionale

```java
		//dichiarazione inizializzazione
		int[] mioArray = new int[4];
		
		//assegnazione dei valori 0-based
		mioArray[0] = 10;
		mioArray[1] = 20;
		mioArray[2] = 30;
		mioArray[3] = 40;
		
		
		//inizializzazione più compatta, con assegnazione
		int mioArray2[] = new int[]{10, 20, 30, 40, 50};

		//notazione short: posso omettere `new int[]`
		int[] mioArray3 = {10, 20, 30, 40, 50}; 

		//notazione short
		String[] frutti = { "mele", "pere", "banane" };

		//NB: è sempre possibile modificare i valori, mai la lunghezza
```

---

```java
class Sveglia{
	public static void main(String args[]){
		// dichiarazione array
		int ora[];
		//allocazione memoria per l'array
		ora = new int[7];
		//assegnazione di valori all'array
		ora[0] = 10;
		ora[1] = 7;
		ora[2] = 8;
		ora[3] = 7;
		ora[4] = 9;
		ora[5] = 8;
		ora[6] = 10;
		//dichiarazione di una variabile per il ciclo for
		int i;
		for(i = 0; i < 7; i++)
			System.out.println("il giorno " + i + " la sveglia suona alle " + ora[i]);
	}
}
```

---

## Array multidimensionale
```java
class Pitagora{
	public static void main(String args[]){
		int prodotto[][] = new int[4][];
		int i,j;
		for(i = 0; i < 4; i++)
			prodotto[i] = new int[i + 1];
		for(i = 0; i < 4; i++)
			for(j = 0; j <= i; j++)
				prodotto[i][j] = (i + 1) * (j + 1);
		System.out.println(prodotto[0][0]);
		for(i = 0; i < 2; i++) System.out.print(prodotto[1][i] + " ");
		System.out.println();
		for(i = 0; i < 3; i++) System.out.print(prodotto[2][i]+" ");
		System.out.println();
		for(i = 0; i < 4; i++) System.out.print(prodotto[3][i]+" ");
		System.out.println();
	}
}
