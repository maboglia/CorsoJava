package patterns;



public class SingleObject {

	private static SingleObject istanza;
	
	private SingleObject() {
		
		System.out.println("ho costruito il singoletto");
	}
			
	public static SingleObject getIstanza() {
		if(istanza == null)
			istanza = new SingleObject();
		
		return istanza;
	}
	
	public void saluta() {
		System.out.println();
	}
}
