package progetti.assicurazione.v1;

/**
 * Testo:
Un’assicurazione desidera creare un archivio elettronico in grado di 
raccogliere informazioni sulle automobili e sui loro proprietari. 
Si implementi una classe Cliente, avente il nominativo (stringa) come variabile d’istanza; 
una classe Automobile avente come variabili d’istanza 
il numero di targa della vettura (intero) e 
un riferimento al proprietario della classe Cliente. 
Si implementi, infine, la classe Assicurazione.

 * @author mauro
 *
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Assicurazione {
	public static void main(String args[])
	{
		Archivio archivio = new Archivio();
		String scelta,nome,targa;
		int numScelta,numTarga;
		String continua = "s";
		while (continua.equalsIgnoreCase("s"))
		{
			scelta = JOptionPane.showInputDialog(
					"Operazioni eseguibili:\n " +
							"1) Aggiungi Cliente\n " +
							"2) Aggiungi Automobile\n " +
							"3) Ricerca Proprietario\n " +
							"4) Ricerca automobili di un cliente\n " +
							"5) Cliente con più automobili\n " +
							"6) Cancella Cliente\n " +
							"7) Cancella Automobile");
			numScelta = Integer.parseInt(scelta);
			switch(numScelta)
			{
			case 1:	
				nome = JOptionPane.showInputDialog("Inserisci nuovo cliente:");
				archivio.addCliente(nome);
				break;
			case 2:
				targa = JOptionPane.showInputDialog("Inserisci nuova targa:");
				numTarga = Integer.parseInt(targa);
				nome = JOptionPane.showInputDialog("Inserisci nome cliente:");
				archivio.addAutomobile(numTarga, nome);
				break;
			case 3:
				targa = JOptionPane.showInputDialog("Inserisci numero targa:");
				numTarga = Integer.parseInt(targa);
				JOptionPane.showMessageDialog(null,"Targa " + numTarga + 
						" appartiene al cliente: " + archivio.clienteTarga(numTarga));
				break;
			case 4:
				nome = JOptionPane.showInputDialog("Inserisci nome 	cliente:");
				ArrayList<Integer> targhe = new ArrayList();
				targhe = archivio.returnTarga(nome);
				String targheCliente = "";
				for (Integer a : targhe)
					targheCliente = targheCliente + "\n" + a;
				JOptionPane.showMessageDialog(null,targheCliente);
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"Il cliente con più auto è: " + 
						archivio.maxAuto().getNome());
				break;
			case 6:nome = JOptionPane.showInputDialog("Inserisci nome	cliente:");
			archivio.removeCliente(nome);
			break;
			case 7:targa = JOptionPane.showInputDialog("Inserisci numero targa:");
			numTarga = Integer.parseInt(targa);
			archivio.removeAutomobile(numTarga);
			break;
			}
			continua = JOptionPane.showInputDialog("Vuoi effettuare nuove operazioni? (s/n)");
		}
	}
}