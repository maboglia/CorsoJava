*****************************************
Tipi di dati semplici
*****************************************
01 - Interi.java
02 - PrimoIncremento.java
03 - ForEsempio.java
04 - ForDecremento.java
05 - Elementari.java
06 - Divisione.java
07 - Modulo.java
08 - Caratteri.java
09 - Confronti.java
10 - Booleani.java
11 - NoCortoCircuito.java
12 - CortoCircuito.java
13 - CastInteri.java
14 - PromoErrata.java
15 - Promo.java
16 - Sveglia.java
17 - Pitagora.java
*****************************************

// Errore di conversione da int a byte (perdita di dati)
class Interi{
	public static void main(String args[]){
		int a = 1;
		byte b;
                b = a;
	}
}
//*********************************************************************//
// Utilizzo dell'operatore incremento
class PrimoIncremento{
	public static void main(String args[]){
		int a = 1, b;
		System.out.println("a vale " + a);
		a++;
		System.out.println("Dopo a++ a vale " + a);
		b = a++;
                System.out.println("Dopo b = a++ a vale " + a + " e b vale "+ b);
                b = ++a;
                System.out.println("Dopo b = ++a a vale " + a + " e b vale "+ b);
	}
}
//*********************************************************************//
// Utilizzo del ciclo for
class ForEsempio{
	public static void main(String args[]){
		int i;
		for(i = 0; i < 5; i++) System.out.println("i vale " + i);
	}
}
//*********************************************************************//
// Utilizzo dell'operatore decremento
class ForDecremento{
	public static void main(String args[]){
		int i;
		for(i = 10; i > 0;i --) System.out.println("i vale ." + i);
	}
}
//*********************************************************************//
// Semplici operazioni matematiche
class Elementari{
	public static void main(String args[]){
		int i1 = 5, i2 = 10, i3;
		double d1= 5, d2 = 10, d3;
		i3 =- i1;
		System.out.println("-i1 vale " + i3);
		i3 = i1 + i2;
		System.out.println("i1+i2 vale " + i3);
		i3 = i1 - i2;
		System.out.println("i1-i2 vale " + i3);
		i3 = i1 * i2;
		System.out.println("i1*i2 vale " + i3);
		d3 =- d1;
		System.out.println("-d1 vale " + d3);
		d3 = d1 + d2;
		System.out.println("d1+d2 vale " + d3);
		d3 = d1 - d2;
		System.out.println("d1-d2 vale " + d3);
		d3 = d1 * d2;
		System.out.println("d1*d2 vale " + d3);
		System.out.println(d3);
	}
}
//*********************************************************************//
// Divisioni tra variabili intere e variabili decimali
class Divisione{
	public static void main(String args[]){
		int i1 = 6, i2 = 5, i3 = 3, i4;
		float f1 = 6, f2 = 5, f3 = 3, f4;
		i4 = i1 / i2;
		System.out.println(i1 + "/" + i2 + " vale " + i4);
		i4 = i1 / i3;
		System.out.println(i1 + "/" + i3 + " vale " + i4);
		i4 = i2 / i3;
		System.out.println(i2 + "/" + i3 + " vale " + i4);
		f4 = f1 / f2;
		System.out.println(f1 + "/" + f2 + " vale " + f4);
		f4 = f1 / f3;
		System.out.println(f1 + "/" + f3 + " vale " + f4);
		f4 = f2 / f3;
		System.out.println(f2 + "/" + f3 + " vale " + f4);
		System.out.println(f1 / f2);
	}
}
//*********************************************************************//
// Operatore modulo e approssimazione nei calcoli
class Modulo{
	public static void main(String args[]){
		int i1 = 5, i2 = 6, i3;
		double d1 = 1.2, d2 = 6.1,d3;
		i3 = i2 % i1;
		System.out.println(i2 + "%" + i1 + " vale " + i3);
		d3 = d2 % d1;
		System.out.println(d2 + "%" + d1 + " vale " + d3);
	}
}


//*********************************************************************//
// Tipo char
class Caratteri{
	public static void main(String args[]){
		char c1,c2,c3;
		// Inizializza c1 al carattere 97, vale a dire 'a'
		c1 = 97;
		c2 = 'a';
		c3= 'z';
		System.out.println("c1 vale " + c1);
		System.out.println("c2 vale " + c2);
		System.out.println("c3 vale " + c3);
		/* Restituisce in output il carattere corrispondente
		al codice Unicode di c1 */
		System.out.println(c1);
                /* Incrementa di una unita' il codice
		del carattere Unicode */
		c1 = ++c1;
		System.out.println(c1);
	}
}
//*********************************************************************//
// Operatori di confronto
class Confronti{
	public static void main(String args[]){
		boolean b1, b2;
		int i1 = 3, i2 = 6;
		char c1 = 'a', c2 = 'b';
                b1 = i1 >= i2; // e' falso
		System.out.println(i1 + ">=" + i2 + " restituisce " + b1);
                b2 = c1 < c2; // e' vero
		System.out.println(c1 + "<=" + c2 + " restituisce " + b2);
		System.out.print(b1 + "!=" + b2 + " restituisce ");
                // visualizza vero, poiche' b1 e' falso e b2 e' vero
		System.out.println(b1 != b2);
	}
}


//*********************************************************************//
// Operatori logici booleani
class Booleani{
	public static void main(String args[]){
		boolean b1,b2,b3;
		// b1 vale false
		b1 = 3 > 5;
		// b2 vale true
		b2 = 1 < 10;
		b3 = b1 & b2;
                System.out.println("L'affermazione \" 3 > 5 e 1 < 10 \" risulta " + b3);
		b3 = b1 | b2;
		System.out.println("L'affermazione \" 3 > 5 o 1 < 10 \" risulta " + b3);
		b3 = b1 ^ b2;
		System.out.println("L'affermazione \" o 3 > 5 o 1 < 10 \" risulta " + b3);
		b1 = 2 < 10;
		b3 = b1 ^ b2;
		// Attenzione alla sequenza \"
		System.out.println("L'affermazione \" o 2 < 10 o 1 < 10 \" risulta " + b3);
	}
}
//*********************************************************************//
// Generazione di un errore di divisione per zero
class NoCortoCircuito{
	public static void main(String args[]){
                int i = 5, j = 2, k = 0;
		boolean b1;
                // i e' maggiore di j e quindi b1 e' true
		b1 = (i > j) | (i > (j / k));
		System.out.println(b1);
	}
}
/* Operatori logici di cortocircuito.
   Variante del listato NoCortoCircuito.java */
class CortoCircuito{
	public static void main(String args[]){
                int i = 5, j = 2, k = 0;
		boolean b1;
                // i e' maggiore di j e quindi b1 e' true
		b1 = (i > j) || (i > (j / k));
		System.out.println(b1);
	}
}
//*********************************************************************//
// Cast da int a byte
class CastInteri{
	public static void main(String args[]){
		int i1 = 10, i2 = 257, i3 = 513;
		byte b1,b2,b3;
		b1 = (byte)i1;
		b2 = (byte)i2;
		b3 = (byte)i3;
		System.out.println("Esempi di cast da int a byte");
		System.out.println("Il cast di " + i1 + " vale " + b1);
		System.out.println("Il cast di " + i2 + " vale " + b2);
		System.out.println("Il cast di " + i3 + " vale " + b3);
	}
}
//*********************************************************************//
// Generazione di un errore di perdita di precisione
class PromoErrata{
	public static void main(String args[]){
		byte b1=10, b2;
		// b2 riceve 50, ma genera un errore di compilazione
		b2 = b1 * 5;
		System.out.println(b2);
	}
}

//*********************************************************************//
/* Espressione con operandi di tipo diverso.
   Variante del listato PromoErrata.java */
class Promo{
	public static void main(String args[]){
		byte b1=10, b2;
		// b2 riceve 50, ma genera un errore di compilazione
		b2 = (byte)(b1 * 5);
		System.out.println(b2);
	}
}
//*********************************************************************//
// Array monodimensionale
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
//*********************************************************************//
// Array multidimensionale
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

//****************************************************************************************************
//****************************************************************************************************
