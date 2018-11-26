package scatole;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UsaScatole {

	public static void main(String[] args) {
		
		Scatola miaScatola = new Scatola();

		miaScatola.altezza = 40.0;
		miaScatola.larghezza = 50.0;
		miaScatola.profondita = 10.0;
		
		System.out.println(miaScatola.volume());
		
		ScatolaPesante miaScatolaPesante = new ScatolaPesante();
		miaScatolaPesante.altezza = 40.0;
		miaScatolaPesante.larghezza = 50.0;
		miaScatolaPesante.profondita = 20.0;
		miaScatolaPesante.colore = "giallo";
		
		miaScatolaPesante.peso = 25.0;

		System.out.println(miaScatolaPesante.volume());
		System.out.println(miaScatolaPesante.pesoSpecifico());
		
		Scatola miaScatolaTarata = new ScatolaTarata(5.0);

		//creo un contenitore di scatole generiche
		ArrayList<Scatola> scatolone = new ArrayList<>();
		//riempio il contenitore
		scatolone.add(miaScatola);
		scatolone.add(miaScatolaPesante);
		scatolone.add(miaScatolaTarata);
		//scorro il contenitore e mi ritornano n scatole generiche
		for (Scatola scatola : scatolone) {
			//riconosco se si tratta di una scatola tarata
			if (scatola instanceof ScatolaTarata) {
				
				System.out.print("sì, questa è una scatola tarata, il peso netto è: ");
				double pn = (    (ScatolaTarata)   scatola  ).pesoNetto();
				System.out.println(pn);
			}
			else {
				System.out.println("no, questa NON è una scatola tarata");
				
			}
			
		}

		
	}

}
