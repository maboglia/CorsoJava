package calcolatrice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Calcolatrice {

	public static void main(String[] args) throws IOException {
		
		try (
				FileReader fr =  new FileReader("operazioni.txt");
				BufferedReader br = new BufferedReader(fr);
				)
		{
			String s;
			while (   (s =  br.readLine() ) != null   ){
				System.out.println(s);
		}

		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		} 
		
		String s1 = InputHelper.getInput("inserisci un numero intero");
		assert controllaInput(s1);
		
		String s2 = InputHelper.getInput("inserisci un altro numero intero");
		assert controllaInput(s2);

		String s3 = InputHelper.getInput("inserisci un operatore aritmetico: + - * /");
		double result =0;

		
		switch (s3) {
		case "+":
			result = MathHelper.addizione(s1, s2);
			break;
		case "-":
			result = MathHelper.sottrazione(s1, s2);
			
			break;
		case "*":
			result = MathHelper.moltiplicazione(s1, s2);
			
			break;
		case "/":
			result = MathHelper.divisione(s1, s2);
			
			break;

		default:
			System.out.println(result);
			break;
		}
		
		System.out.println(result);
		
		
		
		
		
		
	}

	private static boolean controllaInput(String s1) {
		try{
		Integer.parseInt(s1);
		return true;
		} catch (Exception e){
			return false;
		}
		
	
	}
	
	
	
}
