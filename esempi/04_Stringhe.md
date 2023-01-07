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

[vedi altri esempi di codice](./02_API_lang_String)