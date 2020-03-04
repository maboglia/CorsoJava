package esempio;

public class FormaTest {

	public static void main(String[] args) {
		Forma c = new Cerchio(10);
		Forma r = new Rettangolo(5, 3);
		
		System.out.println("C: " + c.area() + " " + c.perimetro());
		System.out.println("R: " + r.area() + " " + r.perimetro());
	}

}
