package networking;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class LeggiSitoWeb {

	public static void main(String[] args) throws IOException {

		URL sitoWeb = new URL("https://www.its-ictpiemonte.it");
		URLConnection conn = sitoWeb.openConnection();
		
		Scanner input = new Scanner(conn.getInputStream(), StandardCharsets.UTF_8);
		
		while(input.hasNext()) {
			System.out.println(input.next());
		}
		
		
		
	}

}
