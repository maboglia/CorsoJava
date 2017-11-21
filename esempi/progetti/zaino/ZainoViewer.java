package progetti.zaino;

import java.util.Scanner;

public class ZainoViewer {
	
	public static void main(String[] args) {

	Zaino zaino = new Zaino("New Feel", "Mauro", 5);
	Scanner input = new Scanner(System.in);
	boolean esci = false;
	
	while(!esci){
		System.out.println("Inserisci comando: ");
		String comando = input.next();
		
		if(comando.equals("q")){ esci = true;}
		else if (comando.equals("elenca")){
			zaino.elencaCose();
		}
		else if (comando.equals("metti")){
			
			System.out.println("Scrivi il nome dell'oggetto da inserire: ");
			String nome = input.next();
			System.out.println("Scrivi la descrizione dell'oggetto da inserire: ");
			String desc = input.next();
			Cosa c = new Cosa(nome, desc);
			boolean stato = zaino.inserisciCosa(c);
				if(stato) 
					System.out.println("ho inserito l'oggetto " + c.getNome()+ "  inserito correttamente");
				else
					System.out.println("non ho inserito l'oggetto " + c.getNome()+ " perché lo zaino è già pieno!");
			
			//zaino.inserisciCosa(c);
		}
		else if (comando.equals("prendi")){
			zaino.elencaCose();
			System.out.println("Dammi posizione oggetto da prendere: ");
			int pos = input.nextInt();
			zaino.prendiCosa(pos);
			zaino.elencaCose();
		}
		
		
		
	}


	}

}
