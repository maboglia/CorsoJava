package main;

import array.Array;
import java.util.ArrayList;

public class MioArrayTest {

	public static void main(String[] args) {

		MioArray mioArray = new MioArray();
		
		int[] primoArray = mioArray.creaArray(5);
		int[] secondoArray = mioArray.creaArray(5);
		
		mioArray.stampaArray(primoArray, "Il primo array è composto dai seguenti valori:");
		mioArray.stampaArray(secondoArray, "Il secondo array è composto dai seguenti valori:");
		
		/* riscrittura del codice usando l'oggetto ArrayList   */
		ArrayList primoArrayList = mioArray.creaArrayList(5);
		ArrayList secondoArrayList = mioArray.creaArrayList(5);
		
		mioArray.stampaArrayList(primoArrayList, "La prima arrayList è composta dai seguenti valori:");
		mioArray.stampaArrayList(secondoArrayList, "La seconda arrayList è composta dai seguenti valori:");
		
		ArrayList terzoArrayList = mioArray.confrontaArrayList(primoArrayList, secondoArrayList);
		mioArray.stampaArrayList(terzoArrayList, "La lista dei numeri minimi è la seguente:");
		}
}




