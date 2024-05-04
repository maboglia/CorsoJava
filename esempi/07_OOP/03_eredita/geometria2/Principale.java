import java.util.Random;


public class Principale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1,p2;
		
		Random rd = new Random();
		
		//sto richiamando il costruttore di Punto
		p1 = new Punto(1,1);
		p2 = new Punto(4,5);/**/

		for (int i =0; i < 50000; i++){
			if (rd.nextInt(10) == 5 )
				new Punto();
		}
		
		System.out.println("Ho trovato " + Punto.getConta() + " estrazioni di punto = 5");
		
		
		Segmento s1 = new Segmento(p1,p2);
		//System.out.println(s1.lunghezza());
		
		Rettangolo r = new Rettangolo(p1,25,50,30,10);
		
		//System.out.println(r.perimetro());
		//System.out.println(r.area());
		
		
		
		Quadrato q = new Quadrato(2,2,50);
		
		System.out.println("il perimetro � " + q.perimetro());
		System.out.println("l'area � " + q.area());
		
		
		
		/*
		System.out.println(p2.getX() );
		System.out.println(p2.getY() );
		
		p2.setX(52);
		System.out.println(p2.getX() );
		
		p1.setX(0);
		p1.setY(0);
		*/
		//System.out.println("Il punto si trova nel quadrante" + p1.trovaPunto());
		
		
/*		
		p1.x = 2;
		p1.y = 2;
		
		System.out.println(p1.x + ", " + p1.y);
		
		p2.x = 3;
		p2.y = 4;
		
		System.out.println(p2.x + ", " + p2.y);
		System.out.println(p1.x + ", " + p1.y);
	*/	
		
	}

}
