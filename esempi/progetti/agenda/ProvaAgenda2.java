package progetti.agenda;

import java.util.Date;

public class ProvaAgenda2 {

	public static void main(String[] args) {
		
		Agenda2 miaAgenda2 = new Agenda2();
		
		
		miaAgenda2.creaAppuntamento("test 1", new Date(), 1);
		miaAgenda2.creaAppuntamento("test 2", new Date(), 2);
		miaAgenda2.creaAppuntamento("test 3", new Date(), 3);
		miaAgenda2.creaAppuntamento("test 4", new Date(), 4);
		miaAgenda2.creaAppuntamento("test 5", new Date(), 5);

		for (int i = 0; i < miaAgenda2.leggiAgenda().size(); i++) {
			
//if(miaAgenda2.leggiAgenda().get(i) != null)
			System.out.println(  miaAgenda2.leggiAgenda().get(i)     );
			
		}
		System.out.println("------------------------------------");
		miaAgenda2.creaAppuntamento("test 6", new Date(), 6);
		miaAgenda2.creaAppuntamento("test 7", new Date(), 7);
		miaAgenda2.creaAppuntamento("test 8", new Date(), 8);
		miaAgenda2.creaAppuntamento("test 9", new Date(), 9);
		miaAgenda2.creaAppuntamento("test 10", new Date(), 10);

		for (int i = 0; i < miaAgenda2.leggiAgenda().size(); i++) {
			
if(miaAgenda2.leggiAgenda().get(i) != null)
			System.out.println(  miaAgenda2.leggiAgenda().get(i)     );
			
		}
		
		System.out.println("------------------------------------");
		miaAgenda2.creaAppuntamento("test 11", new Date(), 11);
		for (int i = 0; i < miaAgenda2.leggiAgenda().size(); i++) {
			
if(miaAgenda2.leggiAgenda().get(i) != null)
			System.out.println(  miaAgenda2.leggiAgenda().get(i)     );
			
		}
		

	}

}
