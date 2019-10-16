package settimana05;

import java.util.ArrayList;

public class Agenda {

	//Appuntamento[] appuntamenti1 = new Appuntamento[10];
	ArrayList<Appuntamento> appuntamenti2 = new ArrayList<>();
	
	/**
	 * @return the appuntamenti1
	 */
//	public Appuntamento[] getAppuntamenti1() {
//		return appuntamenti1;
//	}

	/**
	 * @param appuntamenti1 the appuntamenti1 to set
	 */
//	public void setAppuntamenti1(Appuntamento[] appuntamenti1) {
//		this.appuntamenti1 = appuntamenti1;
//	}

	/**
	 * @return the appuntamenti2
	 */
	public ArrayList<Appuntamento> getAppuntamenti2() {
		return appuntamenti2;
	}

	/**
	 * @param appuntamenti2 the appuntamenti2 to set
	 */
	public void setAppuntamenti2(ArrayList<Appuntamento> appuntamenti2) {
		this.appuntamenti2 = appuntamenti2;
	}

	public Agenda(){
		System.out.println("agenda costruita");
		
//		appuntamenti1[0]  = new Appuntamento("Pizza", 26, 6, 2017);
//		appuntamenti1[1]  = new Appuntamento("cine", 26, 6, 2017);
		
		appuntamenti2.add(new Appuntamento("Pizza", 26, 6, 2017));
		appuntamenti2.add(new Appuntamento("Cine", 26, 6, 2017));

	}
	
}
