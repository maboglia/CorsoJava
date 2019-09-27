package giochi;

import java.util.ArrayList;
import java.util.Scanner;

public class PietraForbiceCarta3 {

	//contenitore giocate
	static ArrayList<Giocata> report = new ArrayList<>();
	static Giocata g;
	public static Giocata getG() {
		return g;
	}

	public static void giocaPFC(int sceltaUtente) {
		g = new Giocata(sceltaUtente);
				report.add(g);


		for (Giocata e : report) {
			System.out.println(e.sceltaUtente+" "+e.sceltaComputer);
		}
		
		for (Giocata e : report) {
			System.out.println(e.sb);
		}
		
	}


	public static ArrayList<Giocata> getReport() {
		return report;
	}


}
