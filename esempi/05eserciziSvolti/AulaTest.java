package week3;

/**
 * Created by mauro on 20/06/16.
 */
public class AulaTest {

    public static void main(String[] args) {



        Allievo allievo1 = new Allievo ("Alloatti",	"Mattia"	);
        Allievo allievo2 = new Allievo ("Boito",	"Monica"	);
        Allievo allievo3 = new Allievo ("Brezza Platania",	"Salvatore"	);
        Allievo allievo4 = new Allievo ("d'elia",	"giorgio"	);
        Allievo allievo5 = new Allievo ("Fischetto",	"Fabrizio"	);
        Allievo allievo6 = new Allievo ("Mennillo",	"Dario"	);
        Allievo allievo7 = new Allievo ("Minozzi",	"Amedeo"	);
        Allievo allievo8 = new Allievo ("Morabito",	"Antonio"	);
        Allievo allievo9 = new Allievo ("Pagliasso",	"Alex"	);
        Allievo allievo10 = new Allievo ("Romanov",	"Dmitry"	);
        Allievo allievo11 = new Allievo ("Rossi",	"Almo"	);
        Allievo allievo12 = new Allievo ("Ruggirello",	"Barbara"	);
        Allievo allievo13 = new Allievo ("Sassi",	"Francesca"	);


        Allievo[] aula = new Allievo[13];

        aula[0] = allievo1;
        aula[1] = allievo2;
        aula[2] = allievo3;
        aula[3] = allievo4;

        for (Allievo a : aula) {
        System.out.println(a.getNomeCognome());
        System.out.println(a.isMaschio());

        }



    }

}
