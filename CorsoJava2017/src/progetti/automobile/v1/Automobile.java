package progetti.automobile.v1;

public class Automobile {
	private String marca;
	private String modello;
	private double cilindrata;
	private int anno;
	private double velocita;
	private double velocitaMassima;
	private boolean accesa;
	
	public Automobile(String ma, String mo, double c) {
		marca = ma;
		modello = mo;
		cilindrata = c;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String nuovaMarca) {
		marca = nuovaMarca;
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String m) {
		modello = m;
	}
	
	public double getCilindrata() {
		return cilindrata;
	}
	
	public void setCilindrata(double c) {
		cilindrata = c;
	}
	
	public int getAnno() {
		return anno;
	}
	
	public void setAnno(int a) {
		anno = a;
	}
	
	public double getVelocita() {
		return velocita;
	}
	
	public double getVelocitaMassima() {
		return velocitaMassima;
	}
	
	public void setVelocitaMassima(double vmax) {
		velocitaMassima = vmax;
	}
	
	public boolean isAccesa() {
		return accesa;
	}
	
	public void accendi() {
		accesa = true;
	}
	
	public void spegni() {
		accesa = false;
		velocita = 0;
	}
	
	public boolean frena() {
		if (isAccesa() && velocita > 0) { // controllo che la macchina sia accesa
			velocita = velocita - 1; // abbasso la velocit�
		}
		
		if (velocita > 0) { // se non sono fermo restituisco false. altrimenti true
			return false;
		}
		return true;
	}
	
	public boolean accelera() {
		// verifico che l'auto sia accesa e che possa accelerare
		if (isAccesa() && velocita < velocitaMassima) {
			velocita = velocita + 1;
		}
		
		if (velocita < velocitaMassima) {
			return true;
		}
		return false;
	}
}
