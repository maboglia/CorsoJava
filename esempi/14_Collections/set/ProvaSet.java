package collezioni.set;

import java.util.HashSet;
import java.util.TreeSet;

public class ProvaSet {

	public static void main(String[] args) {
		HashSet<String> giorni = new HashSet<String>();
		
		giorni.add("lunedì");
		giorni.add("martedì");
		giorni.add("mercoledì");
		giorni.add("lunedì");

		TreeSet<String> giorni2 = new TreeSet<String>();
		
		giorni2.add("lunedì");
		giorni2.add("martedì");
		giorni2.add("mercoledì");
		giorni2.add("lunedì");		
		
		System.out.println("----------HASHSET---------");
		
		for (String giorno : giorni) {
			System.out.println(giorno);
		}
		
		System.out.println("----------TREESET---------");
		
		for (String giorno : giorni2) {
			System.out.println(giorno);
		}
		
		
	}

}
