
public enum LeMoto {
	//enumerazione
	moto1("Moto Guzzi V35 Imola", "350"),
	moto2("Yamaha XT", "600"),
	moto3("Yamaha XTZ Ténéré", "600"),
	moto4("BMW K100RS", "1000"),
	moto5("BMW R1150GS", "1150"),
	moto6("BMW F800R", "800"),
	moto7("Yamaha MT09", "850");
	//stato interno
	private final String desc;
	private final String cilindrata;
	//costruttore
	LeMoto(String descrizione, String _cilindrata){
		desc = descrizione;
		cilindrata = _cilindrata;
	}
	//metodi getter
	public String getDesc() {
		return desc;
	}

	public String getCilindrata() {
		return cilindrata;
	}

	
	
	
}
