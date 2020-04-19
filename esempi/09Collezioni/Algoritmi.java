import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algoritmi {

	public static void main(String[] args) {
		

		Character[] lettere = {'A', 'B', 'C'};
		//Arrays: classe che permette di effettuare diverse operazioni sugli array, contiene metodi statici
		List<Character> lista = Arrays.asList(lettere);
		
		System.out.println(lista);

		//Collections classe che permette di effettuare diverse operazioni sulle collezioni, contiene metodi statici
		Collections.reverse(lista);
		System.out.println(lista);
		
		Character[] copiaLettere = new Character[lettere.length];
		List<Character> listaCopia = Arrays.asList(copiaLettere);
		
		Collections.copy(listaCopia, lista);
		System.out.println(listaCopia);
		
		Collections.fill(lista, 'A');
		System.out.println(lista);


		for (Character character : lista) {
			System.out.printf("La mia lettera preferita è la %s, %s? ", character, "sei d'accordo");
		}
		
		
	}

}
