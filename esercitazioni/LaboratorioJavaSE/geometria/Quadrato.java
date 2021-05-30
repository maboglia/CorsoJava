package esempi.week5.geometria;

/**
 * Created by mauro on 23/06/16.
 */
public class Quadrato extends Rettangolo {

    private int lato;

    public Quadrato(Punto p, int lato){
        super(p.getX(),p.getY(),lato, lato);
        this.lato = lato;
    }

    @Override
    public int getPerimetro() {
        return this.lato * 4;
    }

    @Override
    public int getArea() {
        return this.lato * this.lato;
        //return Math.pow(this.lato, 2);
    }
}
