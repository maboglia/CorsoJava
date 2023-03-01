import java.util.*;
import java.io.*;

public class SkiPlant{

   private Vector lifts = new Vector();
   private HashMap cards = new HashMap();
   
   public SkiPlant(String fileName) throws IOException, FileNotFoundException{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line = null;

        while((line = reader.readLine()) != null){

           int i = line.indexOf(',');
           String liftId = line.substring(0,i);
           String delay = line.substring(++i,line.length());

           lifts.add(Integer.parseInt(liftId), Integer.valueOf(delay));

        }

        reader.close();
   }


   public boolean auth(long cardId, int skiliftId) throws BadSkiliftIdEx{
   
        long currTime = (new Date()).getTime();

        int delay;

        try{
           Integer d = (Integer)lifts.elementAt(skiliftId);
           delay = d.intValue();
        }catch(ArrayIndexOutOfBoundsException ex){
           throw new BadSkiliftIdEx();
        }
   
        Card c = (Card)cards.get(new Long(cardId));
        
        if(c == null){
           cards.put(new Long(cardId), new Card(skiliftId, currTime));
           return true;
        }
        
        if(c.getLastLift()!=skiliftId ||
           currTime - c.getLastTime() > delay*1000){

           c.newPassage(skiliftId, currTime);

           return true;

        }

        return false;
   }

   public static void main(String args[]){

   
      if(args.length != 1){

         System.out.println("Utilizzo: java SkiPlant <nome_file>");
         System.exit(-1);
      }
      
      String filename = args[0];

      SkiPlant sp = null;
      try{
         sp = new SkiPlant(filename);
      }catch(Exception ex){
         System.out.println("Bad file");
         System.exit(2);
      }


      boolean loop = true;
      
      while(loop){
         System.out.println("Scegli: 1)Passaggio 2)Esci");
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

         int choice = 0;
         
         try{
            choice = Integer.parseInt(in.readLine());
         }catch(IOException ioe){
            System.out.println("I/O error");
         }catch(NumberFormatException ioe){
            System.out.println("Formato Errato");
            continue;
         }

         switch(choice){
            case 1:
               try{
                  long cardId = -1;
                  int liftId = -1;
                  System.out.print("Card ID: ");
                  cardId = Integer.parseInt(in.readLine());
                  System.out.print("Lift ID: ");
                  liftId = Integer.parseInt(in.readLine());
                  System.out.println("Result: " + sp.auth(cardId,liftId)); 
                  
               }catch(BadSkiliftIdEx bsie){
                 System.out.println("Lift does not exist");
               }catch(IOException ioe){
                  System.out.println("I/O error");
               }catch(NumberFormatException nfe){
                  System.out.println("Formato Errato");
                  continue;
               }
               
               break;
            case 2:
               loop = false;
            default:
               break;
         }
      }
   }
}
