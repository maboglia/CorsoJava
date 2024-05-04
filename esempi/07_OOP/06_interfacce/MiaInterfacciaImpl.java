package interfacce;

public class MiaInterfacciaImpl implements MiaInterfaccia {

	@Override
	public String saluta() {
		// TODO Auto-generated method stub
		return SALUTO;
	}

	@Override
	public String saluta(String s) {
		// TODO Auto-generated method stub
		return SALUTO + " " + s;
	}

}
