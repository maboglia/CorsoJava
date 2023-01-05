import java.util.*;

public class VectorTest{
	
	public static void main(String[] args){
		Vector v = new Vector();
		v.add("Carlo");
		v.add("Marco");
		v.add("Francesca");
		v.add("Alessandro");
		System.out.println("v ha " + v.size() + " elementi.");
		System.out.println("Il primo e' " + v.firstElement());
		System.out.println("L'ultimo e' " + v.lastElement());
		System.out.println("Ora scorro gli elementi usando get():");
		for(int i=0; i<v.size(); i++){
			String s = (String)v.get(i);
			System.out.println("get(" + i + ") " + s);
		}

		System.out.println("Ora scorro gli elementi con un enumeratore:");
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			String s = (String)e.nextElement();
			System.out.println(s);
		}
	}
}