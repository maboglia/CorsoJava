package progetti.automobile.v1;

public class Guidatore {
	private String nome;
	private Automobile auto;
	private boolean inAuto;
	
	public Guidatore(String n, Automobile a) {
		nome = n;
		auto = a;
		inAuto = false;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String n) {
		nome = n;
	}
	
	public Automobile getAutomobile() {
		return auto;
	}
	
	public void acceleraAuto(int kmh) {
		for (int i = 0; i < kmh; i++) {
			auto.accelera();
		}
	}
	
	public void frenaAuto(int kmh) {
		for (int i = 0; i < kmh; i++) {
			auto.frena();
		}
	}
	
	public void sali() {
		inAuto = true;
	}
	
	public void scendi() {
		inAuto = false;
	}
	
	public void accendiAuto() {
		if (inAuto == true) {
			auto.accendi();
		}
	}
	
	public void spegniAuto() {
		if (inAuto == true) {
			auto.spegni();
		}
	}
	
	public boolean isInAuto() {
		return inAuto;
	}
}
