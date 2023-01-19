import java.util.Hashtable;

public class HashtableTest {
	public static void main(String[] args){
		Hashtable anniDiNascita = new Hashtable();
		anniDiNascita.put("Romano",1939);
		anniDiNascita.put("Piero",1949);
		anniDiNascita.put("Francesco",1954);
		anniDiNascita.put("Fausto",1940);
		System.out.println("Romano: " + anniDiNascita.get("Romano"));
		System.out.println("Piero: " + anniDiNascita.get("Piero"));
		System.out.println("Francesco: " + anniDiNascita.get("Francesco"));
		System.out.println("Fausto: " + anniDiNascita.get("Fausto"));
	}
}