package esempi.week5.geometria;

import esempi.week3.stringhe.StringBuilder;

/**
 * Created by mauro on 23/06/16.
 */
public class Punto {
    private int x;
    private int y;
    private static int conteggio = 0;


    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
        this.conteggio++;
    }
    public static int getConteggio(){
        return conteggio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString() {


        String risposta = "(" + this.getX()
                + ", " + this.getY() + ")";

        //return super.toString();
        return risposta;
    }
}







