import java.util.*;

public class ArrayListTest {
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add("Prosciutto");
		list.add("Salsiccia");
		list.add("Ravioli");
		list.add("Gnocchetti");
		list.add("Porcetto");
		list.add("Agnello");
		list.add("Patate");
		list.add("Verdura");
		list.add("Formaggio");
		list.add("Frutta");
		list.add("Tiramisu'");
		list.add("Caffe'");
		list.add("Acquavitae");
		list.add("Mirto");
		list.add("Limoncello");
		System.out.println("list ha " + list.size() + " elementi.");
		System.out.println("Ora li sfoglio usando get():");
		for(int i=0; i<list.size(); i++){
			String s = (String)list.get(i);
			System.out.println("Get(" + i + "):" + s);
		}
	}
}