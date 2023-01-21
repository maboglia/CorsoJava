package settimana03;

public class E03_Stringhe1 {

	public static void main(String[] args) {
		
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
		

	}

}
