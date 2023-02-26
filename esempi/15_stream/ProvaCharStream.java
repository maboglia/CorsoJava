package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProvaCharStream {

	public static void main(String[] args) {

		try(
				/*senza/con buffer*/
				BufferedReader fr = new BufferedReader( new FileReader("files/primipiatti.txt"));
				BufferedWriter fw = new BufferedWriter( new FileWriter("files/primipiatti_cp_bf.txt"));
				
				){
			
			int c;
			
			while ((c = fr.read() ) != -1 ) {
				fw.write(c);
			}
			System.out.println("fatto!");
			
			
			
		} catch (FileNotFoundException e) {
					// TODO: handle exception
				} 
		catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
		
		

	}

}
