import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


public class URLExpSimple {

    
    public static void main(String[] args) {
        try {
            URL mySite = new URL("http://www.bogliaccino.it");
            URLConnection yc = mySite.openConnection();
            Scanner in = new Scanner(new InputStreamReader(yc.getInputStream()));
            int count = 0;
            while (in.hasNext()) {
                System.out.println(in.next());
                count++;
            }
            System.out.println("Numero di token: " + count);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
