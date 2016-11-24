package esempi.week6.GUI2D;

import java.util.Random;

/**
 * Created by mauro on 23/06/16.
 */
public class GeometriaTest {

    public static void main(String[] args) {

        Punto p1, p2;
        Segmento s1;
        Rettangolo r1;
        Quadrato q1;

        Random rnd = new Random();

        p1 = new Punto(1,1);
        p2 = new Punto(4,5);

        s1 = new Segmento(p1,p2);

        r1 = new Rettangolo(p1, 25, 22);

        q1 = new Quadrato(p1, 25);

        System.out.println("Coordinate del punto p1: " + p1);
        System.out.println("Coordinate del punto p2: " + p2);
        System.out.println("Ho creato " + Punto.getConteggio() + " punti");

        System.out.println("La lunghezza del segmento s1 è :" + s1.lunghezzaSegmento());

        System.out.println("il perimetro del rettangolo è " + r1.getPerimetro());
        System.out.println("l'area del rettangolo è " + r1.getArea());


        System.out.println("il perimetro del quadrato è " + q1.getPerimetro());
        System.out.println("l'area del quadrato è " + q1.getArea());




    }

}
