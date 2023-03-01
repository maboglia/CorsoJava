import java.io.*;

public class FileCopier{
	public static void main(String[] args){
		// Controlla gli argomenti forniti
		if(args.length != 2){
			System.out.println();
			System.out.println("Utilizzo scorretto");
			System.out.println();
			System.out.println("Devi rispettare la sintassi:");
			System.out.println();
			System.out.println("java FileCopier sorgente destinazione");
			System.out.println();
			return;
		}
		// Crea i file associati
		File s = new File(args[0]);
		File d = new File(args[1]);
		if(!s.exists()){
			System.out.println();
			System.out.println("Il file sorgente non esiste...");
			System.out.println();
			return;
		}
		if(s.isDirectory()){
			System.out.println();
			System.out.println("Copio solo i file, non le directory...");
			System.out.println();
			return;
		}
		if(!s.canRead()){
			System.out.println();
			System.out.println("Non posso leggere il file sorgente...");
			System.out.println();
			return;
		}
		if(d.exists() && d.isDirectory()){
			System.out.println();
			System.out.println("La destinazione non può essere una directory...");
			System.out.println();
			return;
		}
		if(d.exists()  && !d.canWrite()){
			System.out.println();
			System.out.println("Non posso sovrascrivere il file di destinazione...");
			System.out.println();
			return;
		}
		if(s.equals(d)){
			System.out.println();
			System.out.println("Sorgente e destinazione coincidono...");
			System.out.println();
			return;
		}
		// Inizia la procedura di copia
		FileInputStream in = null;
		FileOutputStream out = null;
		try{
			// Apre gli stream
			in = new FileInputStream(s);
			out = new FileOutputStream(d);
			// Copia un KB alla volta, per questo usa un array di 1024 byte
			byte[] mioBuffer = new byte[1024];
			// Legge e copia tutti i byte letti
			int l;
			while((l = in.read(mioBuffer)) != -1){
				out.write(mioBuffer, 0, l);
			}
			// Messaggio di successo
			System.out.println();
			System.out.println("Operazione eseguita!");
			System.out.println();			
		}catch(IOException e){
			// Problemi!
			System.out.println();
			System.out.println("Copia fallita...");
			System.out.println();
			System.out.println("Messaggio di errore:");
			System.out.println();
			System.out.println(e.getMessage());
			System.out.println();
		}finally{
			// Chiusura degli stream
			if(out != null) try{
				out.close();
			}catch(IOException e){}
			if(in != null) try{
				in.close();
			}catch(IOException e){}
		}
	}
}