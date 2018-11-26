package esempi.week16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public static String readFile(String filename)  throws IOException{
		StringBuffer sb = new StringBuffer();
		try(
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
				){
			String s;
			while (   (s=br.readLine()) != null   ) {
				sb.append(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return sb.toString();
	}
}