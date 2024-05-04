package designpatterns;

public class SingolaIstanza {

	private static SingolaIstanza instance;
	private SingolaIstanza() {
		
		instance = new SingolaIstanza();
	}
	
	public static SingolaIstanza getInstance() {
		if (instance == null)
			new SingolaIstanza();
		return instance;
	}
	
}
