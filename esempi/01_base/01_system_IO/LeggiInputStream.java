package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeggiInputStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		
		System.out.println("Digita il tuo nome: ");
		String nome = reader.readLine();
		
		System.out.println("Il nome digitato è: "+nome);
		
	}

}
