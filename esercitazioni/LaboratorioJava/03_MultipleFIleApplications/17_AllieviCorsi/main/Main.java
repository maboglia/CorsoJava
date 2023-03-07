package main;

import java.util.Scanner;

import allievi.Allievi;
import corsi.Corsi;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Corsi corso = new Corsi();
		Corsi corso1 = new Corsi();
		Corsi corso2 = new Corsi();
		
		corso.setDescrizione("Java");
		corso.setDurataCorso(400);
		corso.creazioneCorsi(2);
		
		corso1.setDescrizione("SQL");
		corso1.setDurataCorso(100);
		corso1.creazioneCorsi(2);
		
		corso2.setDescrizione("HTML e CSS");
		corso2.setDurataCorso(150);
		corso2.creazioneCorsi(2);
		
		Corsi [] corsi = new Corsi[3];
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
					
					Corsi cor = sceltaCorso(corsi, scelta1);
					Corsi corsoValorizzato = inserisciAllievo(cor);
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
					
					stampaCorsiConAllievi(cor);
					
					break;
				default:
					break;
			
			}
			
		}
		
	}
	
	public static Corsi inserisciAllievo(Corsi corso){
		Scanner _scanner = new Scanner(System.in);
		
		Allievi allievo = new Allievi();
		
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
	
	public static Corsi sceltaCorso(Corsi [] corso, int posizione){
		return corso[posizione-1];
	}
	
	public static void stampaCorsiConAllievi(Corsi corso){
		
		System.out.println("La descrizione del corso è: " + corso.getDescrizione());
		System.out.println("La durata del corso è: " + corso.getDurataCorso());
		
		Allievi [] numeroAllievi = corso.getAllievi();
		
		for(int x = 0; x < numeroAllievi.length; x++){
			if(numeroAllievi[x] != null){
				System.out.println("il nome è: " + numeroAllievi[x].getNome());
				System.out.println("il cognome è: " + numeroAllievi[x].getCognome());
				System.out.println("L'eta è: " + numeroAllievi[x].getEta());
				System.out.println("L'indirizzo è: " + numeroAllievi[x].getIndirizzo());
			}
		}
	}

}
