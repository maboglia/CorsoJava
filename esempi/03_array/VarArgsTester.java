package main;

public class VarArgsTester {

	  public static void main (String[] args) {

		  System.out.println(average(2,5,8,78));
	  }
	  
	  public static int average(int...numbers){
		  int totale =0;
		  
		  for (int x: numbers )
			  totale+=x;
		  return totale / numbers.length;
	  }
	  
	  
	}
