## Array monodimensionale

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
