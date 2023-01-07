# Costruttori e proprietà della classe String


```java
class CostruttoriStringa{
	public static void main(String args[]){
		/* assegnazione a una variabile String
		di un letterale */
		String s;
		s = "Ciao mondo";
		System.out.println(s);
		// costruzione da un array di char
		char c[] ={'h', 'e', 'l', 'l', 'o'};
		String t = new String(c);
		System.out.println(t);
		/* costruzione da un sottoinsieme di un array di
		char con il costruttore String(char chars[],int
		inizio, int numCaratteri) */
		String u = new String(c,2,3);
		/* Restituisce "llo", perche il primo carattere
		corrisponde alla posizione 0 */
		System.out.println(u);
		/* costruzione da stringa esistente: viene creato un
		oggetto con lo stesso testo contenuto */
		String v = new String(u);
		// Restituisce "llo";
		System.out.println(v);
		// il metodo length() restituisce il numero di caratteri"
			System.out.println("la stringa \"" + u + "\" ha " + u.length() + " caratteri");
		// i letterali stringa sono oggetti e hanno metodi
		System.out.println("il letterale \"" + "llo" + "\" ha " + "llo".length()+" caratteri");
	}
}

```

---

## 

```java
	public static void main(String[] args) {

		String a = new String ("Ciao");
		String b = a;
		String c = " ";
		String ok = "a e b sono uguali";
		String nonOk = "a e b sono diversi";
		String same = "a e b contengono lo stesso testo";
		
		System.out.println( a + c + b );
		
		if (a == b) System.out.println(ok);
		else System.out.println(nonOk);
		
		if (a.equals(b)) System.out.println(same);
		
		System.out.println(ok.length());
		System.out.println(nonOk.length());
		System.out.println(same.length());
		
		char s1 = ok.charAt(ok.length() - 1  );
		System.out.println(s1);

		for (int i = 0; i < same.length(); i++) {
			System.out.println(same.charAt(i));
		}

		char[] stringaArray = same.toCharArray();
		
		System.out.println(stringaArray);
		
		for (int i = 0; i < stringaArray.length; i++) {
			System.out.println(stringaArray[i]);
		}

```

---

## 

```java
    String s1 = "Questa è una stringa!";
        System.out.println(s1);

    String s2 = new String("Ma anche questa è una stringa!!");
        System.out.println(s2);

    String s3 = "Aula: ";
        String s4 = "1B";

    String s5 = s3 + s4;
        System.out.println(s5);

    char[] caratteri = { 'c','i','a','o' };
        String s6 = new String(caratteri);
        System.out.println(s6);

    char[] caratteri2 = s6.toCharArray();
        for(char c : caratteri2){
            System.out.println(c);
        }

```

---

## 

```java
		//sintassi short per la dichiarazione di stringa
		String nome = "Mauro";
		
		//sintassi che invoca il costruttore di stringa
		String cognome = new String("Bogliaccino");
		
		String separatore =  " ";
		
		//concatenare
		String firma = nome + separatore + cognome;
		
		int lunghezzaStringa =  firma.length(); //vale 17
		
		System.out.println(firma.toUpperCase());
		
		
		String test = "Mauro Bogliaccino";
		
		System.out.println(firma);
		System.out.println(test);
		//verifica ==
		if (firma == test) System.out.println("nome e test sono uguali");
		else  System.out.println("nome e test sono diversi");
		
		//verificare uguaglianza tra valori di oggetti stringa
		if (firma.equals(test)) System.out.println("nome e test sono uguali");
		else  System.out.println("nome e test sono diversi");
				
		
		
		
		for (int i = 0; i < lunghezzaStringa; i++) {
			System.out.print(firma.charAt(i)  + "\t"   );
			
		}
		
		System.out.println(     firma.replace('o', 'i')             );
		
		char[] stringa = { 'p', 'a', 'u', 's', 'a'   };
		
		String s = new String(stringa);
		System.out.println(s);

```

---

## ConversioneFormattazione

```java
       int valoreInt = 112;
        String fromInt = Integer.toString(valoreInt);

        System.out.println(fromInt);

        boolean vero = true;
        String fromBool = Boolean.toString(vero);
        System.out.println(fromBool);

        long valoreLong = 10_000_000;
        NumberFormat numFormatt = NumberFormat.getNumberInstance();

        String numeroFormattato = numFormatt.format(valoreLong);

        System.out.println(numeroFormattato);

```

---

## indexOf

```java
      String s;

      int i;

      //   0123456789012345678901
      s = "Hello World, Bye World";

      i = s.indexOf( "World" );

      System.out.println( " 0123456789012345678901");
      System.out.println( "\"" + s + "\"" 
		+ ".indexOf( \"World\" ) = "  + i );

      i = s.indexOf( "By" );

      System.out.println( " 0123456789012345678901");
      System.out.println( "\"" + s + "\"" 
		+ ".indexOf( \"By\" ) = "  + i );

      i = s.indexOf( "by" );

      System.out.println( " 0123456789012345678901");
      System.out.println( "\"" + s + "\"" 
		+ ".indexOf( \"by\" ) = "  + i );

```

---

## lastIndexOf

```java
 i = s.lastIndexOf( "World" );

      System.out.println( " 0123456789012345678901");
      System.out.println( "\"" + s + "\"" 
		+ ".lastIndexOf( \"World\" ) = "  + i );

```

---

## 

```java
      System.out.println(" \"abc\".compareTo( \"abc\" ) = " 
					+ "abc".compareTo( "abc" ) );

      System.out.println(" \"abc\".compareTo( \"xyz\" ) = " 
					+ "abc".compareTo( "xyz" ) );

      System.out.println(" \"abc\".compareTo( \"ABC\" ) = " 
					+ "abc".compareTo( "ABC" ) );

```

---

## 

```java
     System.out.println(" \"abc\".compareToIgnoreCase( \"abc\" ) = " 
					+ "abc".compareToIgnoreCase( "abc" ) );

      System.out.println(" \"abc\".compareToIgnoreCase( \"xyz\" ) = " 
					+ "abc".compareToIgnoreCase( "xyz" ) );

      System.out.println(" \"abc\".compareToIgnoreCase( \"ABC\" ) = " 
					+ "abc".compareToIgnoreCase( "ABC" ) );

```

---

## 

```java
      String a, b, c;

      a = "Hello";
      a = a + " World";

      b = a;               // b points to the same string as a

      System.out.println("a = " + a);
      System.out.println("b = " + b);

      if ( a == b )
         System.out.println("a == b");
      else
         System.out.println("a != b");


      c = "Hello World";    // c contains the same string as a
			    // but does not point to the same string

      System.out.println("a = " + a);
      System.out.println("c = " + c);

      if ( a == c )
         System.out.println("a == c");
      else
         System.out.println("a != c");

```

---

## 

```java
      String a, b, c;

      a = "Hello";
      a = a + " World";

      b = a;               // b points to the same string as a

      System.out.println("a = " + a);
      System.out.println("b = " + b);

      if ( a.equals(b) )
         System.out.println("a EQUALS b");
      else
         System.out.println("a NOT EQUALS b");


      c = "Hello World";    // c contains the same string as a
			    // but does not point to the same string

      System.out.println("a = " + a);
      System.out.println("c = " + c);

      if ( a.equals(c) )
         System.out.println("a EQUALS c");
      else
         System.out.println("a NOT EQUALS c");

```

---

## 

```java
      System.out.println( " \"abc\".equals( \"ABC\" ) = " 
					+ "abc".equals( "ABC" ) ) ;
      System.out.println( " \"abc\".equalsIgnoreCase( \"ABC\" ) = " 
					+ "abc".equalsIgnoreCase( "ABC" ) ) ;

```

---

## join

```java
		String nani = String.join(" e ", "Pisolo", "Mammolo", "Gongolo");
		System.out.println(nani);
		
		String[] stati = {"Italia", "Spagna", "Portogallo"};
		String statiUniti = String.join(",", stati);
		System.out.println(statiUniti);

```

---

## parsing

```java
        String s1 = "Benvenuti al corso Java";
        System.out.println("lunghezza della stringa: " + s1.length());

        int pos = s1.indexOf("Java");
        System.out.println("La posizione della parola è: " + pos);

        String sub = s1.substring(13);
        System.out.println(sub);

        String s2="       Benvenuti al corso Java!           ";
        System.out.println("Lunghezza della stringa:"+s2.length());

        String s3 = s2.trim();
        System.out.println(s3);
        System.out.println(s3.length());

```

---

## hash if

```java
		String s1="Ciao";
		String s2="Ci"+"ao";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1.hashCode()==s2.hashCode())
			System.out.println("Le due stringhe sono uguali.");
		else
			System.out.println("Le due stringhe sono diverse.");		

```

---

## hash equals

```java
		String s1="Ciao";
		String s2="Ci"+"ao";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1.equals(s2))
			System.out.println("Le due stringhe sono uguali.");
		else
			System.out.println("Le due stringhe sono diverse.");

```

---

## 

```java
      String s, r;

      s = "Hello World, Bye World";
      r = s.replaceFirst( "World", "Class" );

      System.out.println( "\"" + s + "\"" 
		+ ".replaceFirst( \"World\", \"Class\" ) = "  + 
		"\"" + r + "\"" );
      System.out.println( "Afterwards: s = " + "\"" + s + "\"\n\n" );

      r = s.replaceAll( "World", "Class" );

      System.out.println( "\"" + s + "\"" 
		+ ".replaceAll( \"World\", \"Class\" ) = "  + 
		"\"" + r + "\"" );
      System.out.println( "Afterwards: s = " + "\"" + s + "\"" );

```

---

## 

```java
	String messaggio; // la stringa che conterra' il messaggio.

	// scrivo un messaggio (il codice Unicode \u00e8 corrisponde
	// alla lettera "e con accento grave").
	messaggio = "questo \u00e8 il messaggio da analizzare";

	int lunghezzaMessaggio = messaggio.length();

	char primaLettera = messaggio.charAt(0);

	char ultimaLettera = messaggio.charAt(lunghezzaMessaggio - 1);

	String prime5Lettere = messaggio.substring(0,5);

	System.out.println();
	System.out.println("Il messaggio considerato e': \n" 
			   + messaggio);
	System.out.println();
	System.out.println("esso e' composto da " + lunghezzaMessaggio
			   + " caratteri");
	System.out.println("Il primo carattere e': \"" + primaLettera
			   + "\", l'ultimo carattere e': \"" 
			   + ultimaLettera + "\"");

	System.out.println("La sottostringa dei primi 5 caratteri e': \""
			   + prime5Lettere + "\".");

	System.out.println();
	System.out.println("Il messaggio puo' essere convertito " 
			   + "tutto in lettere maiuscole: ");

	String messaggioMaiuscolo;  // si noti che una nuova variabile 
	                            // puo' essere dichiarata in un qq
	                            // punto del programma.

	messaggioMaiuscolo = messaggio.toUpperCase();

	System.out.println(messaggioMaiuscolo);

```

---

## 

```java
		String s1 = "ciao";
		s1 = s1 +  " mondo";
		
		StringBuilder s2 = new StringBuilder();
		s2.append(s1);
		s2.append(" mondo");
		
		System.out.println(s1);
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("componi dei versi!");
		
		String input;
		
		s2.delete(0, s2.length());
		
		for (int i = 0; i < 4; i++) {
			input = scanner.nextLine();
			s2.append(i + ") ").append(input).append("\n");
		}
		
		System.out.println(s2);

```

---

## StringBuilder

```java
    String s1 = "Hello ";
    String s2 = "World";
    String s3 = s1 + s2 + "!";
        System.out.println(s3);

        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
        sb.append(" ").append("World").append("!");
        System.out.println(sb);

    if (s3.equals(sb))
        System.out.println("uguali");
        else
        System.out.println("diversi");


        Scanner scanner = new Scanner(System.in);
        System.out.println("scrivi qualcosa");
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length()-2);

        for (int i = 0; i < 3; i++){
            System.out.println("..poi");
            input = scanner.nextLine();
            sb.append(input + " ");

        }
        System.out.println(sb);

```

---

## Utilizzo della classe StringBuilder

```java
class BufferStringhe{
	public static void main(String args[]){
		String s;
		int i;
		StringBuilder sb = new StringBuilder("Ciao ");
		// Aggiunge caratteri a sb
		sb.append("mondo!");
		System.out.print("sb vale ");
		System.out.println(sb);
		// converte sb a un tipo String
		s = sb.toString();
		System.out.println(s);
		// lunghezza della stringa
		i = sb.length();
		System.out.println("sb consta di " + i + " caratteri");
		// numero di caratteri per cui e allocata memoria
		i = sb.capacity();
		System.out.println("sb alloca memoria per " + i + " caratteri");
	}
}
```
