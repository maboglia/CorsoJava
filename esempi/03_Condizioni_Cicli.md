# Cicli e istruzioni di controllo

## Esempio di if ... else if

```java
 public static void main(String[] args) {


  if ( 1 == 0 && 1 == 1) {
   System.out.println("sono uguali");
  } else if ( 0 == 0){
   System.out.println("sono uguali ma valgono 0");
  } else {
   System.out.println("sono diversi");
   
  }


 }

```

---

## Esempio di if annidati

```java
class IfAnnidati{
	public static void main(String args[]){
		int i = 18;
		if (i%2 == 0){
			System.out.print(i + " e' un multiplo di 2 ");
			if (i%3 == 0)
				System.out.println("e di 3");
			else
				System.out.println("");
		}
	}
}
```

---

## Utilizzo del ciclo for

```java
class ForEsempio{
 public static void main(String args[]){
  int i;
  for(i = 0; i < 5; i++) System.out.println("i vale " + i);
 }
}
```

---

## Utilizzo dell'operatore decremento

```java
class ForDecremento{
 public static void main(String args[]){
  int i;
  for(i = 10; i > 0; i--) System.out.println("i vale ." + i);
 }
```

---

## while

```java
public class EsempiWhile {

 public static void main(String[] args) {
  
  String[] giorni = {
    "lunedì",
    "martedì",
    "mercoledì",
    "giovedì",
    "venerdì",
    "sabato",
    "domenica",
  };
  
  //ciclo while 
  int counter = 0;
  while (counter > giorni.length) {
   if (counter % 2 == 0)
   System.out.println( "giorno n.  " + counter + " è  " + giorni[counter]    );
   counter++;
  }
  
  //ciclo do-while
  do {
   if (counter % 2 == 0)
    System.out.println( "giorno n.  " + counter + " è  " + giorni[counter]    );
   counter++;
  }
  while (counter <0);
  

 }

}

```

---

## do...while

```java
class Stampa {
	public static void main(String args[]){
		int num = 20;
		do{
			for(int j = 0; j <= num; j++) System.out.print("*");
			System.out.println("");
		} while(--num >= 0);
	}
}
```

---

## do...while - uso di if e continue

```java
class Stampa {
	public static void main(String args[]){
		int num = 20;
		do{
			if((num%3 == 0) ||(num%3 == 1)) continue;
			for(int j = 0; j <= num; j++)System.out.print(".*");
			System.out.println("");
		} while(--num >= 0) ;
	}
}

```

---

## Sostituzione di un ciclo do-while con un ciclo for

```java
class Stampa {
	public static void main(String args[]){
		for(int num = 20; num >= 0; num--){
			
			if((num%3 == 0) ||(num%3 == 1)) 
				continue;
			
			for(int j = 0;j <= num; j++)	
				System.out.print(".*");
			
			System.out.println("");
		}
	}
}

```

---

## L'istruzione return termina l'esecuzione del codice

```java
class ProvaReturn {
	public static void main(String args[]){
		System.out.println("Codice accessibile");
		return;
		System.out.println("Codice inaccessibile");
	}
}
```

---

```java
class ProvaReturn {
	public static void main(String args[]){
		System.out.println("Codice accessibile");
		if(true)
			return;
		System.out.println("Codice inaccessibile");
	}
}
```

