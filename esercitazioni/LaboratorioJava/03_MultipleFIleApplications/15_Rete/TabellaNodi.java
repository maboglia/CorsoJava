import java.util.*;
import java.io.*;

class TabellaNodi {
  private HashMap tabella;
  
  public TabellaNodi(){
  	tabella = new HashMap();
  	}

  public void loadIPNome(String s){
  	try {
  	BufferedReader br= new BufferedReader(new FileReader(s));
  
  	String sc=br.readLine();
  	String IPAddress; 
	String nome; 
	Nodo n;
  	StringTokenizer st; 
  	while (sc!= null){
  	  	st = new StringTokenizer(sc); // non ci sono 
  	  	IPAddress = st.nextToken(); 
		nome = st.nextToken();
  	  	n = new Nodo(IPAddress, nome);
  	  	tabella.put(IPAddress, n);
  	  	sc=br.readLine();
     	}
      } catch(IOException e) {System.out.println("Bad file, bad file format, loadIPNome");}
       
  }

  public void print(){
     Iterator i = tabella.values().iterator();
     Nodo n;
     while (i.hasNext()){
       n = (Nodo) i.next();
       n.print();
     }
  }

  public void aggiorna(String ip, int traffico){
  	Nodo n;
  	n=(Nodo) tabella.get(ip);
  	if (n!= null) n.add(traffico);
  	
  	}

  public void loadTraffico(String file){
    try {
  	BufferedReader br= new BufferedReader(new FileReader(file));
    	String sc=br.readLine();
  	String IPAddress; 
	int size;
  	StringTokenizer st; 

  	while (sc!= null){
  	  	st = new StringTokenizer(sc);
  	  	IPAddress = st.nextToken(); 
		size = Integer.parseInt(st.nextToken());
  	  	aggiorna(IPAddress, size);
  	  	sc=br.readLine();
     	}
    } catch(IOException e) {
		System.out.println("Bad file, bad file format, loadIPNome");
	}
  }
}