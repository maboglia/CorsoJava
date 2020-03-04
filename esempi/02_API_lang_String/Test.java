public class Test {
	
	public static void main(String[] args){
		// Creo un oggetto di tipo String
		String miaStringa = "Ciao";
		// Richiamo il metodo charAt() per sapere
		// quale carattere apre la stringa.
		char primo = miaStringa.charAt(0);
		System.out.println(primo);
		// Voglio recuperare una sottostringa
		// formata dai primi tre caratteri della
		// stringa contenuta nell'oggetto
		// miaStringa
		String sottoStringa = miaStringa.substring(0,3);
		System.out.println(sottoStringa);
		// Voglio sapere l'indice associato al
		// carattere "i" presente in miaStringa
		int indice = miaStringa.indexOf("i");
		System.out.println(indice);
	}
}