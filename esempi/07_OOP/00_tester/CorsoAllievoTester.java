package main;

import java.util.Scanner;

import model.Allievo;
import model.Corso;

public class CorsoAllievoTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Corso corso = new Corso();
		Corso corso1 = new Corso();
		Corso corso2 = new Corso();
		
		corso.setDescrizione("Java");
		corso.setDurataCorso(400);
		corso.creazioneCorso(2);
		
		corso1.setDescrizione("SQL");
		corso1.setDurataCorso(100);
		corso1.creazioneCorso(2);
		
		corso2.setDescrizione("HTML e CSS");
		corso2.setDurataCorso(150);
		corso2.creazioneCorso(2);
		
		Corso [] corsi = new Corso[3];
		corsi[0] = corso;
		corsi[1] = corso1;
		corsi[2] = corso2;
		
		Scanner s = new Scanner(System.in);
		
		int scelta = 0;
		while(scelta < 3){
			System.out.println("Che operazione vuoi fare? \n" +
					"1 - inserisci Allievo \n" +
					"2 - stampa corso con allievi \n" +
					"3 - esci");
			scelta = s.nextInt();
			s.nextLine();
			
			switch(scelta){
				case 1: 
					//inserisci allievo
					System.out.println("Che corso vuoi scegliere?");
					
					for(int x = 0; x < corsi.length; x++){
						System.out.println(x+1 + " - " + corsi[x].getDescrizione());
					}
					System.out.println();
					
					int scelta1 = s.nextInt();
					s.nextLine();
					
					Corso cor = sceltaCorso(corsi, scelta1);
					Corso corsoValorizzato = inserisciAllievo(cor);
					corsi[scelta1-1] = corsoValorizzato;
					
					break;
					
				case 2:
					// stampa corso con allievi
					System.out.println("Che corso vuoi scegliere?");
					
					for(int x = 0; x < corsi.length; x++){
						System.out.println(x+1 + " - " + corsi[x].getDescrizione());
					}
					System.out.println();
					
					int scelta2 = s.nextInt();
					s.nextLine();
					
					cor = sceltaCorso(corsi, scelta2);
					
					stampaCorsoConAllievo(cor);
					
					break;
				default:
					break;
			
			}
			
		}
		
	}
	
	public static Corso inserisciAllievo(Corso corso){
		Scanner _scanner = new Scanner(System.in);
		
		Allievo allievo = new Allievo();
		
		System.out.println("Inserisci nome: ");
		allievo.setNome(_scanner.nextLine());
		
		System.out.println("Inserisci Cognome: ");
		allievo.setCognome(_scanner.nextLine());
		
		System.out.println("Inserisci Età: ");
		allievo.setEta(Integer.parseInt(_scanner.nextLine()));
		
		System.out.println("Inserisci Indirizzo: ");
		allievo.setIndirizzo(_scanner.nextLine());
		
		corso.inserisciAllievo(allievo);
		
		return corso;
	}
	
	public static Corso sceltaCorso(Corso [] corso, int posizione){
		return corso[posizione-1];
	}
	
	public static void stampaCorsoConAllievo(Corso corso){
		
		System.out.println("La descrizione del corso è: " + corso.getDescrizione());
		System.out.println("La durata del corso è: " + corso.getDurataCorso());
		
		Allievo [] numeroAllievo = corso.getAllievo();
		
		for(int x = 0; x < numeroAllievo.length; x++){
			if(numeroAllievo[x] != null){
				System.out.println("il nome è: " + numeroAllievo[x].getNome());
				System.out.println("il cognome è: " + numeroAllievo[x].getCognome());
				System.out.println("L'eta è: " + numeroAllievo[x].getEta());
				System.out.println("L'indirizzo è: " + numeroAllievo[x].getIndirizzo());
			}
		}
	}

}
