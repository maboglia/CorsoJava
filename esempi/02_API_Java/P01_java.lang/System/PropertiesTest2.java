import java.util.*;

public class PropertiesTest{
	public static void main(String[] args){
		Properties telefono = new Properties();
		telefono.setProperty("Mauro ","12345678");
		telefono.setProperty("Paolo ","3334445566");
		telefono.setProperty("Andrea ","334667788");		
		telefono.setProperty("Giovanni ","0113458965");
		telefono.setProperty("Federica ","3358987826");
		telefono.list(System.out);
	}
}
