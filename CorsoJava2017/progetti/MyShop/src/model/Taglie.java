package model;

public enum Taglie {
	
	S("small"), M("medium"), L("large"), XL("Extra-large");
	
	String descrizione;
	
	Taglie(String descrizione){
		this.descrizione = descrizione;
	}

}
