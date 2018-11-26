package progetti.agenda;

import java.util.Date;

public class ProvaAgenda {

	public static void main(String[] args) {
		
		Agenda miaAgenda = new Agenda();
		
		
		miaAgenda.creaAppuntamento("test 1", new Date(), 1);
		miaAgenda.creaAppuntamento("test 2", new Date(), 2);
		miaAgenda.creaAppuntamento("test 3", new Date(), 3);
		miaAgenda.creaAppuntamento("test 4", new Date(), 4);
		miaAgenda.creaAppuntamento("test 5", new Date(), 5);

		for (int i = 0; i < miaAgenda.leggiAgenda().length; i++) {
			
if(miaAgenda.leggiAgenda()[i] != null)
			System.out.println(  miaAgenda.leggiAgenda()[i]      );
			
		}
		
		miaAgenda.creaAppuntamento("test 6", new Date(), 6);
		miaAgenda.creaAppuntamento("test 7", new Date(), 7);
		miaAgenda.creaAppuntamento("test 8", new Date(), 8);
		miaAgenda.creaAppuntamento("test 9", new Date(), 9);
		miaAgenda.creaAppuntamento("test 10", new Date(), 10);

		for (int i = 0; i < miaAgenda.leggiAgenda().length; i++) {
			
			System.out.println(  miaAgenda.leggiAgenda()[i]      );
			
		}
		
		miaAgenda.creaAppuntamento("test 11", new Date(), 1);

		

	}

}
