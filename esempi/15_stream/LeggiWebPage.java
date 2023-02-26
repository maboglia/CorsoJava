package stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class LeggiWebPage {

	public static void main(String[] args) {

		try {
			URL sito = new URL("https://randomuser.me/api/");
			
			URLConnection conn = sito.openConnection();
			
			Scanner sc = new Scanner(new InputStreamReader(conn.getInputStream()));
			
			int c = 0;
			
			while(sc.hasNext()) {
				System.out.println(sc.next());
				c++;
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
