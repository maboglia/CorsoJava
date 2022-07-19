//per usare la classe Scanner, devi importarla
import java.util.Scanner;

public class ScannerDemo
{
	public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
		System.out.print( "Scrivi il tuo nome: "  );
		String nome = s.nextLine();
		System.out.println( "Benvenuto " + nome + "!" );
	}
}