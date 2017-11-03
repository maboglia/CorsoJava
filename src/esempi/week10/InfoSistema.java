package esempi.week10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class InfoSistema {

		public static void main(String[] args) {
			
			File output = new File("InfoSistema.txt");
			
			FileOutputStream fos;
			
			try{
				fos = new FileOutputStream(output);
				
			}
			catch(IOException e){
				fos = null;
			}
			
			PrintStream ps = new PrintStream(fos);
			System.setOut(ps);
			
			long tempo = System.currentTimeMillis();
			System.out.println("Tempo in millisecondi: " +  tempo);
			
			long tsec = tempo / 1000;
			System.out.println("Tempo in secondi: " +  tsec);
			
			long sec = tsec % 60;
			long t3  = tsec/60;
			long min = t3%60;
			long t4 = t3/60;
			
			System.out.println("Tempo in ore: " + t4 + " m " + min + " sec " + sec );
			System.out.println("tempo trascorso dal 1 gennaio 1970");
			
			
			System.out.println("proprietà del sistema");
			String temp = System.getProperty("java.version");
			System.out.println("Versione di Java " + temp);
			
			temp = System.getProperty("java.vendor");
			System.out.println("vendor " + temp);
			
			temp = System.getProperty("java.home");
			System.out.println("home " + temp);

			temp = System.getProperty("java.vm.version");
			System.out.println("home " + temp);
			
			System.out.println("proprietà del sistema operativo");	
			
			temp = System.getProperty("os.version");
			System.out.println("OS " + temp);			
			
			temp = System.getProperty("os.name");
			System.out.println("name " + temp);			
			
			temp = System.getProperty("os.arch");
			System.out.println("arch " + temp);			
			
			temp = System.getProperty("path.separator");
			System.out.println("separator " + temp);			
			
			temp = System.getProperty("user.name");
			System.out.println("user " + temp);			
			
			temp = System.getProperty("user.dir");
			System.out.println("user dir " + temp);			
			
			
			
		}
	
	
}
