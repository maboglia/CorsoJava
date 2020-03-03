package week3.giorno2;

public class Motocicletta {

	String marca;
	String modello;
	double cilindrata;
	boolean isAcceso = false;
	
	public Motocicletta() {
		marca = "Yamaha";
		modello="TMax";
		cilindrata =650.0;
	}
	public Motocicletta(String _marca) {
		marca=_marca;
		modello="generico";
		cilindrata = 500;
	}
	//metodo costruttore
	public Motocicletta(String _marca, String _modello, double _cilindrata) {
		marca = _marca;
		modello = _modello;
		cilindrata = _cilindrata;
//		System.out.println("ho costruito l'oggetto");
//		System.out.println(stampaInfo());
	}
	
	public void accendi() {
		isAcceso = true;
	}
	
	
	
	public String stampaInfo() {
		return "Libretto moto: " + marca + " " + modello + " " + cilindrata;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "Lbretto moto: ";
		if (marca != null) s += " marca: " + marca; 
		if (modello != null) s += " modello: " + modello; 
		if (cilindrata > 0) s += " cilindrata: " + cilindrata; 
		
		return s;
	}
	
}
