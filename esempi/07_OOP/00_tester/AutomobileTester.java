package settimana02;

public class AutomobileTester {

	public static void main(String[] args) {
		
		Automobile auto1 = new Automobile("fiat");
		Automobile auto2 = new Automobile("ford", "fiesta");
		Automobile auto3 = new Automobile();
		
		int ruote =auto2.ruoteMotrici;
		auto3.accendi();
		auto3.spegni();
		//auto3.statoMotore=false;
		System.out.println(ruote);
		
		System.out.println(
				auto1.stampaInfo() +
				auto2.stampaInfo() +
				auto3.stampaInfo() 
				);
		
	}
}
