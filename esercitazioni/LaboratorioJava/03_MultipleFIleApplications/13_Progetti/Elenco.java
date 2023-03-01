import java.util.*;
import java.io.*;

class Elenco {
  private HashMap progetti;
  private HashMap persone;
  private Vector persProg;
  public Elenco(){ progetti=new HashMap();
         persone = new HashMap();
         persProg = new Vector();
  }

  public void loadProgetti(String s){
  	try {
  	BufferedReader br= new BufferedReader(new FileReader(s));
  
  	String sc=br.readLine();
  	String nomeProgetto; String descrizione; Progetto n;
  	StringTokenizer st; 
  	while (sc!= null){
  	  	st = new StringTokenizer(sc);
  	  	nomeProgetto = st.nextToken(); descrizione = st.nextToken();
  	  	n= new Progetto(nomeProgetto, descrizione);
  	  	progetti.put(nomeProgetto, n);
  	  	sc=br.readLine();
     	}
     } catch(IOException e) {System.out.println("Bad file, bad file format, loadProgetti");}
   }

  public void loadPersone(String s){
  	try {
  	BufferedReader br= new BufferedReader(new FileReader(s));
  
  	String sc=br.readLine();
  	String id; String nome; String cognome; Persona n;
  	StringTokenizer st; 
  	while (sc!= null){
  	  	st = new StringTokenizer(sc);
  	  	id = st.nextToken(); cognome = st.nextToken(); nome = st.nextToken(); 
  	  	n= new Persona(id, nome, cognome);
  	  	persone.put(id, n);
  	  	sc=br.readLine();
     	}
     } catch(IOException e) {System.out.println("Bad file, bad file format, loadPersone");}
   }

  public void loadPersProg(String s){
  	try {
  	BufferedReader br= new BufferedReader(new FileReader(s));
  
  	String sc=br.readLine();
  	String nomeProgetto; String idPersona; int ore;
  	StringTokenizer st; Relazione n;
  	while (sc!= null){
  	  	st = new StringTokenizer(sc);
  	  	nomeProgetto = st.nextToken(); idPersona = st.nextToken(); 
  	  	                 ore = Integer.parseInt(st.nextToken());
  	  	n= new Relazione(nomeProgetto, idPersona, ore);
  	  	persProg.add(n);
  	  	sc=br.readLine();
     	}
     } catch(IOException e) {System.out.println("Bad file, bad file format, loadProgetti");}
   }
   public void orePerProgetto(String prog){
   	   Iterator i=persProg.iterator();
   	   Relazione r; int totOre=0;
   	   while (i.hasNext()){
   	   	  r= (Relazione) i.next();
   	   	  if (r.idProgetto.equals(prog)) totOre+= r.ore;
   	   	}
   	   	String descriz=null; Progetto p;
   	   	p = (Progetto) progetti.get(prog);
   	    if (p!=null) descriz = p.descrizione;
   	   	System.out.println("Progetto " + prog + " " + descriz +" " + totOre);
   }
   public void orePerPersona(String pers){
   	   Iterator i=persProg.iterator();
   	   Relazione r; int totOre=0;
   	   while (i.hasNext()){
   	   	  r= (Relazione) i.next();
   	   	  if (r.idPersona.equals(pers)) totOre+= r.ore;
   	   	}
   	   	String cognome=null; Persona p;
   	   	p = (Persona) persone.get(pers);
   	    if (p!=null) cognome = p.cognome;
   	   	System.out.println("Persona " + pers + " " + cognome +" " + totOre);
   	 
   	
   }
       
}