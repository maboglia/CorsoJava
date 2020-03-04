import linkedList.List;

public class Prova {

	public static void main(String[] args) {
		
		List list;
		list = new List();
		//List list = null;
		
		list.insert(1);
		
		List laStessaLista = list;
		
		laStessaLista.insert(2);
		
		list = new List();
				
	}
}
