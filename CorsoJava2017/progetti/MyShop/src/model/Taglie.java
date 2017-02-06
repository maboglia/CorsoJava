package model;

public enum Taglie {
	
	S("small",42), M("medium", 46), L("large", 50), XL("Extra-large", 54);
	
	String descrizione;
	int misura;
	
	Taglie(String descrizione, int misura){
		this.descrizione = descrizione;
		this.misura = misura;
	}

}
