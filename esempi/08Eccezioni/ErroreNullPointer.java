package esempi.week8;

public class ErroreNullPointer {

	public static void main(String[] args) {
		String s = "mauro";
		String t = "paolo";
		
		s=t;
		
		System.out.println(s.length());
		System.out.println(t.length());

	}

}
