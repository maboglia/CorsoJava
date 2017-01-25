package model;

public class Giacca extends Abito {

	@Override
	public String descriviProdotto() {
		System.out.println(this.taglia);
		return "giacca";
	}

	public Giacca() {

	}

	public Giacca(Taglie taglia) {
		this.taglia = taglia;
	}
	
	
	
}
