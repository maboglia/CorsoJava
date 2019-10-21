package it.bogliaccino.tss2016;

public class Geometria {
	
	public static void main(String[] args) {
	
//	Punto mioPunto = new Punto();
//	
//	System.out.println("Punto 1");
//	System.out.print(mioPunto.getX() + ", " + mioPunto.getY());
//	
//	System.out.println();
//	mioPunto.setX(7);
//	mioPunto.setY(9);
//	
//	System.out.println("Nuova posizione Punto 1");
//	System.out.print(mioPunto.getX() + ", " + mioPunto.getY());
//	
//	
//	System.out.println();
//	System.out.println("-------------");
//	Punto mioPunto2 = new Punto(4,5);
//	
//	System.out.println("Punto 2");
//	System.out.print(mioPunto2.getX() + ", " + mioPunto2.getY());
//	
//	System.out.println();
//	System.out.println("-------------");
//	
//	Rettangolo mioRettang = new Rettangolo(7, 12);
//	
//	System.out.println("Area del rettangolo");
//	System.out.println(mioRettang.calcolaArea());
//
//	System.out.println("Perimetro del rettangolo");
//	System.out.println(mioRettang.calcolaPerimetro());
//
//	
//	Rettangolo mioRettang2 = new Rettangolo(6, 43);
//	
//	System.out.println("Area del rettangolo");
//	System.out.println(mioRettang2.calcolaArea());
//
//	System.out.println("Perimetro del rettangolo");
//	System.out.println(mioRettang2.calcolaPerimetro());

		Rettangolo r_senza_parametri = new Rettangolo();
		Rettangolo r_con_1parametr0 = new Rettangolo(5);
		Rettangolo r_con_2parametri = new Rettangolo(5, 6);	

		
		System.out.println("Area del rettangolo 1");
		System.out.println(r_senza_parametri.calcolaArea());
		System.out.println("Area del rettangolo 2");
		System.out.println(r_con_1parametr0.calcolaArea());
		System.out.println("Area del rettangolo 3");
		System.out.println(r_con_2parametri.calcolaArea());		
}
	
}
