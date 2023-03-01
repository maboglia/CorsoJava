


package agenda;
public class Agenda {

   private Impegno[] impegni;
   
   public Agenda(){
   	  impegni = new Impegno[10];
   }
   
   /**
    * Definisce un appuntamento ad una certa ora.
    * @param ora varia da 8 a 17 
    * @param argomento dell'impegno
    * @param luogo  dell'impegno
    * @param priorita dell'impegno
    */
   public void definisci(int ora,
   						String argomento,
   						String luogo,
   						int priorita){
   	  int i = ora - 8;
   	  impegni[i] = new Impegno(argomento,luogo,priorita);
   }
   
   /**
    * Visualizza l'impegno fissato per una
    * certa ora (8-17)
    * @param ora
    * @return String contenete una descrizione dell'impegno
    */
   public String visualizza(int ora){
   	  int i = ora - 8;
   	  //return impegni[i].toString();
   	  // equivale a:
   	  Impegno tmp = impegni[i];
   	  if(tmp==null) return "";
   	  return tmp.toString();
   }
}
