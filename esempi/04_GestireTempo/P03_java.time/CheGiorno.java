import java.util.Scanner;

public class CheGiorno {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int giorno_1gen;
		int gg, mm;
		int giorni;

		System.out.println("Che giorno era l'1 gennaio? [0=Dom...6=Sab]");
		giorno_1gen=input.nextInt();

		System.out.println("Inserisci la data di cui vuoi sapere il giorno");
		gg = input.nextInt();
		mm = input.nextInt();

		// per semplicita' fa tutti controlli ora (poteva anticiparne alcuni)
		if (!dataOk(gg,mm))
			System.out.println("Data richiesta non valida");
		else if (giorno_1gen<0 || giorno_1gen>6)
			System.out.println("Giorno di oggi non valido (0-6)");
		else {

			// calcola il numero di giorni trascorsi dal'1/1 a "data"
			giorni=giorniTrascorsi(gg,mm);
			int giorno_data = (giorno_1gen+(giorni%7))%7;
			stampaGiorno(giorno_data);
			
		}

	}

	// .......
	// inserire i metodi mancanti qui!
	// .......

}
