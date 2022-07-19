package giochi;

public class RightChoice {

	public static void main(String[] args) {

		String[] scelte = {"Java", "Javascript"};
		
		System.out.println(  (Math.random() < 0.5 ) ? scelte[0] : scelte[1]  );

	}

}
