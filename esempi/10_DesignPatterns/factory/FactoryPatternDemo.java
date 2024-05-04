
public class FactoryPatternDemo {
	public static void main(String[] args) {
	      FormaFactory FormaFactory = new FormaFactory();

	      //get an object of Circle and call its draw method.
	      Forma Forma1 = FormaFactory.getForma("Cerchio");

	      //call draw method of Circle
	      Forma1.draw();

	      //get an object of Rectangle and call its draw method.
	      Forma Forma2 = FormaFactory.getForma("Rettangolo");

	      //call draw method of Rectangle
	      Forma2.draw();

	      //get an object of Square and call its draw method.
	      Forma Forma3 = FormaFactory.getForma("Quadrato");

	      //call draw method of circle
	      Forma3.draw();
	   }
}
