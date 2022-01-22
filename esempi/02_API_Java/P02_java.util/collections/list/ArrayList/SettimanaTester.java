package settimana06;

import java.util.ArrayList;

public class SettimanaTester {

	public static void main(String[] args) {


		int a=1, b=2, c=3;		
		int[] array = {a,b,c};
		
		
		ArrayList<Integer> arraylist = new ArrayList<>();
		arraylist.add(a);
		arraylist.add(b);
		arraylist.add(c);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
 		
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		
		
	}

}
