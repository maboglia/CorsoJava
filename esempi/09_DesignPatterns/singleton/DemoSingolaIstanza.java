package designpatterns;

public class DemoSingolaIstanza {

	public static void main(String[] args) {
		SingolaIstanza si = SingolaIstanza.getInstance();
		
		SingolaIstanza si2 = SingolaIstanza.getInstance();

	}

}
