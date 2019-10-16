public class Test{
	
	public static void main(String[] args){
		String test = "Stringa di prova";
		Class classDiTest = test.getClass();
		System.out.println("L'oggetto test e' di tipo: " + classDiTest.getName());
	}
}