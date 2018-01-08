import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


class Persona{
	String nome;
	String cognome;
	public Persona ()
	{
		System.out.println("ciao da persona");
	}
}


public class MieListe {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> interi = new ArrayList<>();
		List<Integer> collegati = new LinkedList<>();
		
		Set<Integer> set = new HashSet<>();
		int e =0;
		
		for (int i = 0; i < 1000; i++) {
			if ( i%2 == 0) e = 5;
			else e = i;
			
			interi.add(e);//boxing
			collegati.add(e);
			set.add(e);
		}
		
		
		long start = System.currentTimeMillis();
		
		for (Integer integer : interi) {
			System.out.println(integer);
		}
		System.out.println(interi.size());
		
		long stop = System.currentTimeMillis();
		
		System.out.println("Scorro Arraylist: ho impegato " + (stop-start) );
		
		
		start = System.currentTimeMillis();
		for (Integer integer : collegati) {
			System.out.println(integer);
		}
		System.out.println(collegati.size());
		stop = System.currentTimeMillis();
		
		System.out.println("Scorro LinkedList: ho impegato " + (stop-start) );		
		
		start = System.currentTimeMillis();
		for (Integer integer : set) {
			System.out.println(integer);
		}
		System.out.println(set.size());

		stop = System.currentTimeMillis();
		
		System.out.println("Scorro HashSet: ho impegato " + (stop-start) );		
		
		int[] arInt = new int[interi.size()];
		Arrays.sort(arInt);
		
		
		
		

		
		
		ArrayList<Persona> persone = new ArrayList<>();
		persone.add(new Persona());
		
		
		
		
		
	}

}
