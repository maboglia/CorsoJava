import java.io.*;

public class FileTest {
	public static void main(String[] args)
	{
		File f = new File("prova.txt");
		System.out.println(f.getAbsolutePath());
		System.out.println("Il file esiste? " + f.exists());
		System.out.println("Il file puo' essere letto? " + f.canRead());
		System.out.println("Il file puo' essere scritto? " + f.canWrite());
		System.out.println("Il file e' nascosto? " + f.isHidden());
		System.out.println("E' una directory? " + f.isDirectory());
		System.out.println("E' proprio un file? " + f.isFile());
		System.out.println("Grandezza del file: " + f.length() + " byte");
		System.out.println("Ultima modifica: " + new java.util.Date(f.lastModified()));
	}
}