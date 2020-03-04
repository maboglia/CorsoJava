package esempi.week5.geometria;

public class NuovaGeometria {

	public static void main(String[] args) {
	
		
		//---------PUNTO--------------

		Punto a = new Punto(2, 2);
		Punto b = new Punto(3, 3);
		
		Punto c = new Punto(4, 2);
		Punto d = new Punto(2, 3);
				
		System.out.println(a);
		System.out.println(b);
		
		//---------SEGMENTO--------------
		
		Segmento segmento1 = new Segmento(a, b);
		System.out.println(segmento1.lunghezzaSegmento());
		
		Segmento segmento2 = new Segmento(a, c);
		System.out.println(segmento2.lunghezzaSegmento());

		Segmento segmento2bis = new Segmento(c, a);
		System.out.println(segmento2bis.lunghezzaSegmento());
		
		Segmento segmento3 = new Segmento(c, b);
		System.out.println(segmento3.lunghezzaSegmento());

		
		//---------TRIANGOLO--------------
		
		Triangolo triangolo1 = new Triangolo(a, b, c);
		System.out.println(triangolo1.perimetro());
		System.out.println(triangolo1.area());
		System.out.println(triangolo1.isRettangolo());
		
		//---------RETTANGOLO--------------
		
		Rettangolo rettangolo1 = new Rettangolo(2, 4, 4, 2);
		System.out.println(rettangolo1);
		
		//---------QUADRATO--------------
		
		Quadrato quadrato1 = new Quadrato(a,5);
		System.out.println(quadrato1);
		
		
		
	}

}
