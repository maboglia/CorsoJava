package settimana02;

import java.util.Scanner;

public class MiaMatematica3 {

	 double calcola(int valore1, int valore2, String operazione) {
		// TODO Auto-generated method stub
		//casting 
		double t=0.0;
		
		if(  operazione.equals("addizione")   )  {
			t =  valore1 +  valore2;
		}
		if(  operazione.equals("sottrazione")   )  {
			t =  valore1 -  valore2;
		}
		if(  operazione.equals("moltiplicazione")   )  {
			t =  valore1 *  valore2;
		}
		if(  operazione.equals("divisione")   )  {
			t =  (double)   valore1 /  valore2;
		}
		
		return t;
	}

	
	
	

}
