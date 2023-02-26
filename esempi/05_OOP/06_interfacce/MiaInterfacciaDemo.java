package interfacce;

public class MiaInterfacciaDemo {

	public static void main(String[] args) {

		MiaInterfaccia mi = new MiaInterfacciaImpl();
		
		System.out.println(mi.saluta());
		System.out.println(mi.saluta("ciao"));

	}

}
