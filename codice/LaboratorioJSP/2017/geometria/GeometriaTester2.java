package geometria;

import java.util.ArrayList;
import java.util.Random;

public class GeometriaTester2 {

	//costante che rappresenta 
	final static int NUM_RIPETIZIONI = 500;
	final static int NUM_PUNTI = 10;
	static ArrayList<Punto> punti = new ArrayList<>();
	static Random coordinata = new Random();
	
	public static void main(String[] args) {


		Punto p1 = new Punto(2, 2);
		Punto p2 = new Punto(5, 2);
		Punto p3 = new Punto(5, 6);
		
		Segmento s = new Segmento(p1, p2);
		
		System.out.println( "Il segmento s è lungo "  +  s.lunghezza());
		
		Triangolo t = new Triangolo(p1, p2, p3);
		
		System.out.println(t.a.lunghezza());
		System.out.println(t.b.lunghezza());
		System.out.println(t.c.lunghezza());
		
		System.out.println("Il perimetro del triangolo t è: " + t.perimetro());
		System.out.println("L'area del triangolo t è: " + t.area());
		
		Rettangolo r = new Rettangolo(p1, 10, 5);
		System.out.println(  "Il perimetro del rettangolo r è: "+ r.getPerimetro());
		System.out.println(  "L'area del rettangolo r è: "+ r.getArea());
		
		Quadrato q = new Quadrato(p1, 10);
		System.out.println(  "Il perimetro del quadrato q è: "+ q.getPerimetro());
		System.out.println(  "L'area del quadrato q è: "+ q.getArea());
		
		
		
	}
	
}
