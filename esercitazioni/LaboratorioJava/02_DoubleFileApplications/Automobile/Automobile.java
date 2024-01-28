package settimana02;

public class Automobile {

	String marca="opel";
	String modello;
	int cilindrata;
	byte ruoteMotrici = 2;
	private boolean statoMotore=false;
	double consumo;
	
	public Automobile(){}
	
	public Automobile(String marca){
		this.marca=marca;
	}
	
	public Automobile(String marca, String modello){
		this.marca=marca;
		this.modello=modello;
	}
	
	public void accendi(){
		
		this.statoMotore=true;
		
	}
	public void spegni(){
		this.statoMotore=false;

	}
	
	
	public String stampaInfo(){
		
		String s = "Marca " + this.marca + "\n" 
			+	"Modello " + this.modello + "\n" 
			+	"Cilindrata " + this.cilindrata + "\n" 
			+	"Ruote " + this.ruoteMotrici + "\n" 
			+	"Accesa " + this.statoMotore + "\n";
		
		return s;
	}
	
	
	
	
	
	
	

	
	
	
}
