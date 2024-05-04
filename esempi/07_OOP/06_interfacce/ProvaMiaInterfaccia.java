package interfacce;

public class ProvaMiaInterfaccia {

	

	public static void main(String[] args) {
		salutiamoci((s) -> System.out.println(s));
	}

	private static void salutiamoci(MiaInterfaccia m) {
		
		System.out.println("fai qualcosa");
	}

	
	
}
