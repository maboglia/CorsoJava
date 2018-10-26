
##Cicli e istruzioni di controllo

* 01 - IfAnnidati.java
* 02 - Asterischi.java
* 03 - Asterischi2.java
* 04 - Asterischi3.java
* 05 - CodiceInaccessibile.java
* 06 - CodiceInaccessibile2.java

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

## Generazione di un motivo decorativo
```java
class Asterischi{
	public static void main(String args[]){
		int num = 20;
		do{
			for(int j = 0; j <= num; j++) System.out.print("*");
			System.out.println("");
		} while(--num >= 0);
	}
}
```

## Realizzazione di un secondo motivo decorativo
```java
class Asterischi2{
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
class Asterischi3{
	public static void main(String args[]){
		for(int num = 20; num >= 0; num--){
			if((num%3 == 0) ||(num%3 == 1)) continue;
                        for(int j = 0;j <= num; j++)System.out.print(".*");
			System.out.println("");
		}
	}
}

```

## Codice non compilabile
```java
class CodiceInaccessibile{
	public static void main(String args[]){
		System.out.println("Codice accessibile");
		return;
		System.out.println("Codice inaccessibile");
	}
}
```

## Inganno al compilatore
```java
class CodiceInaccessibile2{
	public static void main(String args[]){
		System.out.println("Codice accessibile");
		if(true)return;
		System.out.println("Codice inaccessibile");
	}
}
```