import org.polito.po.Console;

import agenda.*;



public class ProvaAgenda {

  public static void main(String[] args) {
  	Console con = new Console();
  	Agenda a = new Agenda();
  	
  	a.definisci(12,"Lezione","Aula 6",1);
  	
  	con.println(a.visualizza(12));

	con.println(a.visualizza(10));
  }
}
