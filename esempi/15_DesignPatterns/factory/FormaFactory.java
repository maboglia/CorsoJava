
public class FormaFactory {
	
	   public Forma getForma(String FormaType){
		      if(FormaType == null){
		         return null;
		      }		
		      if(FormaType.equalsIgnoreCase("Cerchio")){
		         return new Cerchio();
		         
		      } else if(FormaType.equalsIgnoreCase("Rettangolo")){
		         return new Rettangolo();
		         
		      } else if(FormaType.equalsIgnoreCase("Quadrato")){
		         return new Quadrato();
		      }
		      
		      return null;
		   }
}
