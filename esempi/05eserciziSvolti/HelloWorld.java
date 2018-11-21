
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] riga1 = {
				"Soave","Sontacchi","Rea","Dulanto","Russo","Amodei"
				}; 
		
		String[] riga2 = {
				"Migliaccio	","Cimino","Spandre	","Scarcia","	Calassi"

				}; 
		
		String[] riga3 = {
				"Terranova	","Kodra","Franze","Ingaramo","Solia"
				}; 
				
		separatore();
		System.out.println("Prima riga");
		for (int i = 0; i < riga1.length; i++) {
			if (i==0)
				System.out.println("\t" + riga1[i].toLowerCase());
			else
				System.out.println("\t" + riga1[i].toUpperCase());
			
		}
		separatore();
		System.out.println("Seconda riga");
		for (int i = 0; i < riga2.length; i++) {
			
			int pos = riga2.length -1;
			if (i == pos)
			System.out.println("\t" + riga2[i].replace("s","c"));
			else
			System.out.println("\t" + riga2[i].toUpperCase());
		}
		separatore();		
		System.out.println("Terza riga");
		for (int i = 0; i < riga3.length; i++) {
		System.out.println("\t" + riga3[i].toUpperCase());
		}

		//se ci sono elementi nell'array passato in argomento
		if(args.length > 0)
		{

			//chiamo il metodo statico
			saluta();
			
			//leggo quanti argmenti ci sono nell'array args
			System.out.println("Numero allievi: \t" + args.length);
			
			for (int i = 0; i < args.length; i++) {
				
				System.out.println("\t" + args[i].toUpperCase());
				
			}
		}
		else
		{
			System.out.println("Non ci sono argomenti");
		}
	}

	private static void separatore() {
		System.out.println("--------------------------------------------------");
		
	}

	private static void saluta() {
		System.out.println("Benvenuti al corso TSS!");

		//codice generato da eclipse per gestire un for loop
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("i vale " + i);
//		}
		
		
		
		
		System.out.println("Elenco allievi:");
		
	}

}
