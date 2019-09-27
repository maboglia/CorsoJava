package w02.stringhe;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Ciao");
		sb.append("Mondo");
		sb.insert(4, " "); // inserisce lo spazio
		System.out.println(sb);
		// rovescio la stringa e la stampo
		System.out.println(sb.reverse());
		// prendo e stampo una parte
		// prende dalla posizione 2 (inclusa) alla 8 (esclusa)
		System.out.println(sb.substring(2, 8));
		// cancello una parte da 2 (incluso) a 8 (escluso)
		sb.delete(2, 8);
		// stampo la nuova stringa
		System.out.println(sb);
		// converto nella normale String (non posso pi� modificare poi)
		String s = sb.toString();
		System.out.println(s);
	}

}
