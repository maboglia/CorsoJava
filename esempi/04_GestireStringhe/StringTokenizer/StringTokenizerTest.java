import java.util.*;

//MEGLIO USARE il metodo split() di String

public class StringTokenizerTest {
	public static void main(String[] args){
		String demoString = "Nome=Mario\r\n" +
							"Cognome=Rossi\r\n" +
							"Impiego=Bibliotecario\r\n";
		System.out.println(demoString);
		Properties p = new Properties();
		StringTokenizer st = new StringTokenizer(demoString,"=\r\n");
		while(st.hasMoreTokens()){
			String key = st.nextToken();
			String value = st.nextToken();
			p.put(key,value);
		}
		p.list(System.out);
	}
}