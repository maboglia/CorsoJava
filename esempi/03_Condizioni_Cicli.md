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

## if... else if... else

```java

       if (mese >=1 && mese <=3){
           System.out.println("Sei nel 1° trimestre");
       }

       else if (mese >=4 && mese <=6){
           System.out.println("Sei nel 2° trimestre");
       }
       else if (mese >=7 && mese <=9){
           System.out.println("Sei nel 3° trimestre");
       }
       else if (mese >=10 && mese <=12){
           System.out.println("Sei nel 4° trimestre");
       }
       else {
           System.out.println("Questo valore è sconosciuto");
       }
```

---

## switch

```java

       switch (mese){

           case 1:
           case 2:
           case 3:
               //System.out.println("gennaio");
               System.out.println("siamo nel 1 trimestre");
               break;
           case 4:
           case 5:
           case 6:
               System.out.println("siamo nel 2 trimestre");
               break;
           default:
               System.out.println("inserisci un numero tra 1 e 2");
               break;


       }
```

---

## dalla versione 7 possso utilizzare le stringhe negli switch

```java

        switch (input){

            case "Gen":
                System.out.println("gennaio");
                break;
            case "Feb":
                System.out.println("febbraio");
                break;
            case "Mar":
                System.out.println("marzo");
                break;
            case "Apr":
                System.out.println("aprile");
                break;

            //.....

            default:
                System.out.println("inserisci una stringa di 3 lettere");
                break;


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



---

```java

public class RiepilogoCondizioniCicli {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		
		if(x > 4){
			System.out.println("Sono nel caso true dell'if");
		}else{
			System.out.println("Sono nel caso false dell'if (else)");
		}
		
		switch(x){
			case 1:
				System.out.println("sono dentro al case 1");
				break;
			case 2:
				System.out.println("sono dentro al case 2");
				break;
			default:
				break;		
		}
		
		while(x < 10){
			System.out.println("sono dentro al ciclo while");
			x++;
		}
		
		do{
			System.out.println("sono dentro al ciclo do-while");
			x++;
		}while(x < 12);
		
		for(int y = 0; y < 3; y++){
			System.out.println("sono dentro al for");
		}
		
	}

}
```

---

## ALTRIESEMPI

```java

        String[] mesi = {
                "Gennaio",
                "Febbraio",
                "Marzo",
                "Aprile",
                "Maggio",
                "Giugno",
                "Luglio",
                "Agosto",
                "Settembre",
                "Ottobre",
                "Novembre",
                "Dicembre",
        };

        //se conosco a priori il numero di iterazioni
        for (int i = 0; i < mesi.length; i++) {
            System.out.println("mese: " + mesi[i]);
            String risposta= getInput("Ti piace il mese di " + mesi[i]);
            System.out.println(risposta);
        }
```

---

## anche per scorrere l'array al contrario

```java
        for (int i = mesi.length -1; i>=0; i-- ){

            if(i % 2 != 0)
            System.out.println("mese:  "+ mesi[i]+"[" +  i +"]");

        }

```

---

## ciclo for migliorato - improved for (foreach)

```java

        for (String m : mesi ) {
            System.out.println(m);
        }
```

---

```java

        int counter = 0;
        while(counter < mesi.length){
            System.out.println("il valore di contatore è" + counter);
            System.out.println("il valore di mese è" + mesi[counter]);
            counter++;
        }
```

---

## while con sentinella

```java
        boolean sentinella = false;

        while(sentinella == false){

            String s =getInput("Inserisci un numero");
            System.out.println(s);
            if (s.equals("esci"))
                sentinella = true;

        }
```

---

## do while con sentinella

```java


        boolean sentinella = false;


        do{

            String s =getInput("Inserisci un numero");
            System.out.println(s);
        }
        while(sentinella == true);


```

---

```java


        int mese = 3;
        //dichiaro oggetto stringa
        String meseStringa;

        //dichiaro un'oggetto di tipo scanner
        Scanner sc = new Scanner(System.in);

        //messaggio
        System.out.println("Inserisci inserisci una stringa di 3 lettere abbreviazione mese in cui siamo");
/**/        String input = sc.nextLine();
        try {
            mese = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Hai inserito un numero, dovevi inserire");
            //e.printStackTrace();
        }


        //valorizzo stringa con input dell'utente
         meseStringa = sc.nextLine();

        if(meseStringa.equals("esci"))
            System.out.println("programma terminato");

```
