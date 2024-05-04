import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class mainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    Figure f = new Quadrato(10,40,100);

    
    Figure[] disegno = new Figure[1000];
    
    disegno[0] = new Quadrato(10, 10, 200);
    disegno[1] = new Quadrato(30, 10, 50);
    disegno[2]= new Cerchio(100,100, 70);
    disegno[3] = new Rettangolo(15, 10, 150,89);
    disegno[4] = new Quadrato(30, 10, 50);
    //...
    int numeroFigure = 5;
    double totPerimetri = 0;
       
    for (int i=0; i<numeroFigure;i++ )
      totPerimetri+=disegno[i].perimetro();

    System.out.println(totPerimetri);
	}	

}


/* test ...
 * LinkedList<Class<?>> classList = new LinkedList<Class<?>>();

classList.add(Cerchio.class);
classList.add(Quadrato.class);

try {
	disegno[1] = (Figure) classList.get(0).newInstance();
	System.out.println("CERCHIO:" + disegno[1].perimetro());

} catch (InstantiationException | IllegalAccessException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}


String[] vetTipi = new String[2];
vetTipi[0]="Quadrato"; vetTipi[1]="Quadrato";
try {
	Class<?> classe = Class.forName(vetTipi[0]);
	disegno[0] = (Figure) classe.newInstance();
	System.out.println(disegno[0].perimetro() );

} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
... fine test */

