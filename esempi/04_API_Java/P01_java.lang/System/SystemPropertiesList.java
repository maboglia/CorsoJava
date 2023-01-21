import java.util.*;

public class SystemPropertiesTest {
	public static void main(String[] args){
		Properties p = System.getProperties();
		p.list(System.out);
	}
}