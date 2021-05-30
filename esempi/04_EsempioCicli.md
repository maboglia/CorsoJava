# Cicli e istruzioni di controllo

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

## Asterischi

```java
class StampaAsterischi {
	public static void main(String args[]){
		int num = 20;
		do{
			for(int j = 0; j <= num; j++) System.out.print("*");
			System.out.println("");
		} while(--num >= 0);
	}
}
```

## Asterischi 2

```java
class StampaAsterischi {
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

## Sostituzione di un ciclo do-while con un ciclo for

```java
class StampaAsterischi {
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