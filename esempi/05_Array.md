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
```

---

## Array monodimensionale - somma dei valori

```java
    public static void main(String[] args) {
        //array di interi, zero-based

        int[] n = {1,2,3,5,5,6,7,8,9};

        int somma = 0;

        //ciclo per scorrere
        for(int i = 0; i < n.length; i++){
            System.out.println("La posizione numero  " + i +" vale : " + n[i]);
            somma = somma + n[i];

        }

            System.out.println("La somma dei valori dell'array è: " + somma);
            System.out.println("La media dei valori dell'array è: " + somma / n.length );

    }

```

---

## Array bidimensionale - scorri

```java

 public static void main(String[] args) {
  
  String[][] colazione = new String[3][2];
  
  colazione[0][0] = "caffé";
  colazione[1][0] = "brioche";
  colazione[2][0] = "succo d'arancia";

  colazione[0][1] = "1.00";
  colazione[1][1] = "1.00";
  colazione[2][1] = "1.50";
  
  
  
  for (int i = 0; i < colazione.length; i++) {
   for (int j = 0; j < 2; j++) {
    System.out.print(colazione[i][j] + "\t");
    
   }
   System.out.println("");
   System.out.println("-----");
  }
  
  System.out.println(colazione);

```

---

## Array bidimensionale

```java
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
```

---

## Array tridimensionale

```java
  int [][][] interi1 = new int[5][5][5];
  int contatore = 1;
  for (int x = 0; x < interi1.length; x++) {
   for (int j = 0; j < interi1[x].length; j++) {
    for (int y = 0; y < interi1[j].length; y++) {
     interi1[x][j][y] = contatore;
     contatore++;
    }
   }
  }
  
  for (int x = 0; x < interi1.length; x++) {
   for (int j = 0; j < interi1[x].length; j++) {
    for (int y = 0; y < interi1[j].length; y++) {
     System.out.print(interi1[x][j][y] + " ");
    }
    System.out.println();
   }
  }  


```

---

## Array  converte una stringa in un array di caratteri

```java
	 String s = "abc";

    char[] A;

    A = s.toCharArray();

    System.out.println( s );
    for ( int i = 0; i < A.length; i++ )
       System.out.println( "A[" + i + "] = " + A[i] );
    System.out.println( "\n" );

```

---

## Array  converti un array di caratteri in una stringa

```java
  String s = "abc";

    char[] A;
    A = new char[4];

    A[0] = '>'; 
	A[1] = '<'; 
	A[2] = '?'; 
	A[3] = 'a';

    s = new String( A );

    for ( int i = 0; i < A.length; i++ )
       System.out.println( "A[" + i + "] = " + A[i] );

    System.out.println( s );
```

---

## Varargs

```java
public class VarArgs {

   public static void main (String[] args) {

    System.out.println(average(2,5,8,78));
   }
   
   public static int average(int...numbers){
    int totale =0;
    
    for (int x: numbers )
     totale+=x;
    return totale / numbers.length;
   }
   
   
 }
```

---

## La classe Arrays - Algoritmi

```java
        System.out.println("Array di primitivi");
        int[] ints = {9, 6, 3};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("Array di stringhe");
        String[] colori = {"Rosso", "Verde", "Bianco"};
        Arrays.sort(colori);
        for (String colore : colori) {
            System.out.println(colore);
        }

        System.out.println("Stabilisco un dimensione iniziale");
        int[] arrayDaCopiare = new int[10];
        for (int i = 0; i < arrayDaCopiare.length; i++) {
            //popolo l'array con valori arbitrari
            arrayDaCopiare[i] = i * 100;
        }
        for (int value : arrayDaCopiare) {
            System.out.println(value);
        }

        System.out.println("Copio l'array");
        int[] arrayCopia = new int[5];
        System.arraycopy(arrayDaCopiare, 5, arrayCopia, 0, 5);
        for (int valore : arrayCopia) {
            System.out.println(valore);
        }

```
