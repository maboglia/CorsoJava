import java.util.*;

public class HashtableTest {
	public static void main(String[] args){
		Hashtable anniDiNascita = new Hashtable();
		anniDiNascita.put("Romano",new Integer(1939));
		anniDiNascita.put("Piero",new Integer(1949));
		anniDiNascita.put("Francesco",new Integer(1954));
		anniDiNascita.put("Fausto",new Integer(1940));
		System.out.println("Romano: " + anniDiNascita.get("Romano"));
		System.out.println("Piero: " + anniDiNascita.get("Piero"));
		System.out.println("Francesco: " + anniDiNascita.get("Francesco"));
		System.out.println("Fausto: " + anniDiNascita.get("Fausto"));
	}
}