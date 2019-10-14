package array;

import java.util.Random;
import java.util.ArrayList;

public class MioArray {
	
	public int[] creaArray (int dimensione)  {
		
		int[] array = new int[dimensione];
		Random generatore = new Random();

		for (int i = 0;  i <  dimensione;  i++) {
			array[i] = generatore.nextInt(1000);
		}

		return array;
		
	}
	
	public ArrayList creaArrayList (int dimensione)  {
		
		ArrayList array = new ArrayList();
		Random generatore = new Random();
		
		for (int i = 0;  i <  dimensione;  i++)  {
			array.add(generatore.nextInt(1000));
		}
		
		return array;
	}

	public void stampaArray (int[] array, String messaggio) {
		
		System.out.println(messaggio);
		for  (int i = 0; i < array.length; i++)  {
			System.out.println(array[i]);
		}
	}

		public void stampaArrayList (ArrayList array, String messaggio) {
			
			System.out.println(messaggio);
			for  (int i = 0; i < array.size();  i++)  {
				System.out.println(array.get(i));
			}
		
	}

	public ArrayList confrontaArrayList (ArrayList primaLista, ArrayList secondaLista)  {
		
		ArrayList resLista = new ArrayList();
		
		for (int i = 0; i < primaLista.size(); i ++) {
			
			if ((Integer)primaLista.get(i) <  (Integer)secondaLista.get(i)) {
				resLista.add(primaLista.get(i));
			} else {
				resLista.add(secondaLista.get(i));
			}
		}

		return resLista;
		
	}

}
