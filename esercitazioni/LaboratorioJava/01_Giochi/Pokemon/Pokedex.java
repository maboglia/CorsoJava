//Ken Kawano
import java.util.*;

public class Pokedex{
   
   public static void main (String[] args){
// Scanner
      Scanner userIn = new Scanner (System.in);
      String inString = new String("");
//Poke Tree      
      PokeTree tree = new PokeTree();
//Menu Loop      
      boolean menuloop = true;
      while (menuloop){
         System.out.println("1. Catch Pokemon");
         System.out.println("2. Trade Pokemon");
         System.out.println("3. Print Pokemon");
         System.out.println("0. End Program");
         
         inString = userIn.nextLine();
         inString = inString.trim();
         
         switch(inString){
            case"1":
            System.out.println("1. Bulbasaur");
            System.out.println("2. Ivysaur");
            System.out.println("3. Venusaur");
            System.out.println("4. Charmander");
            System.out.println("5. Charmeleon");
            System.out.println("6. Charizard");
            System.out.println("7. Squirtle");
            System.out.println("8. Wartortle");
            System.out.println("9. Blastoise");
            System.out.println("10. Eevee");
            System.out.println("11. Vaporeon");
            System.out.println("12. Jolteon");
            System.out.println("13. Flareon");
            inString = userIn.nextLine();
            inString = inString.trim();
// Adding Pokemon
            switch(inString){
                  case"1":
		            tree.add(new Bulbasaur());
                  System.out.println("You caught a Bulbasaur");
                  break;
                  case"2":
		            tree.add(new Ivysaur());
                  System.out.println("You caught an Ivysaur");
                  break;                  
                  case"3":
		            tree.add(new Venusaur());
                  System.out.println("You caught a Venusaur");
                  break;
                  case"4":
		            tree.add(new Charmander());
                  System.out.println("You caught a Charmander");
                  break;
                  case"5":
		            tree.add(new Charmeleon());
                  System.out.println("You caught a Charmeleon");
                  break;
                  case"6":
		            tree.add(new Charizard());
                  System.out.println("You caught a Charizard");
                  break;  
                  case"7":
		            tree.add(new Squirtle());
                  System.out.println("You caught a Squirtle");
                  break;  
                  case"8":
		            tree.add(new Wartortle());
                  System.out.println("You caught a Wartortle");
                  break;
                  case"9":
		            tree.add(new Blastoise());
                  System.out.println("You caught a Blastoise");
                  break;
                  case"10":
		            tree.add(new Eevee());
                  System.out.println("You caught an Eevee");
                  break;
                  case"11":
		            tree.add(new Vaporeon());
                  System.out.println("You caught a Vaporeon");
                  break;  
                  case"12":
		            tree.add(new Jolteon());
                  System.out.println("You caught a Jolteon");
                  break;
                  case"13":
		            tree.add(new Flareon());
                  System.out.println("You caught a Flareon");
                  break;
                  default:
                  System.out.println("Invalid Input");
            }   

			   break;
			   case"2":
			   System.out.println("1. Bulbasaur");
            System.out.println("2. Ivysaur");
            System.out.println("3. Venusaur");
            System.out.println("4. Charmander");
            System.out.println("5. Charmeleon");
            System.out.println("6. Charizard");
            System.out.println("7. Squirtle");
            System.out.println("8. Wartortle");
            System.out.println("9. Blastoise");
            System.out.println("10. Eevee");
            System.out.println("11. Vaporeon");
            System.out.println("12. Jolteon");
            System.out.println("13. Flareon");
            inString = userIn.nextLine();
            inString = inString.trim();
//removing Pokemon
            switch(inString){
                  case"1":
		            tree.remove(new Bulbasaur());
                  System.out.println("You traded a Bulbasaur");
                  break;
                  case"2":
		            tree.remove(new Ivysaur());
                  System.out.println("You traded an Ivysaur");
                  break;                  
                  case"3":
		            tree.remove(new Venusaur());
                  System.out.println("You traded a Venusaur");
                  break;
                  case"4":
		            tree.add(new Charmander());
                  System.out.println("You traded a Charmander");
                  break;
                  case"5":
		            tree.add(new Charmeleon());
                  System.out.println("You traded a Charmeleon");
                  break;
                  case"6":
		            tree.add(new Charizard());
                  System.out.println("You traded a Charizard");
                  break;  
                  case"7":
		            tree.add(new Squirtle());
                  System.out.println("You traded a Squirtle");
                  break;  
                  case"8":
		            tree.add(new Wartortle());
                  System.out.println("You traded a Wartortle");
                  break;
                  case"9":
		            tree.add(new Blastoise());
                  System.out.println("You traded a Blastoise");
                  break;
                  case"10":
		            tree.add(new Eevee());
                  System.out.println("You traded an Eevee");
                  break;
                  case"11":
		            tree.add(new Vaporeon());
                  System.out.println("You traded a Vaporeon");
                  break;  
                  case"12":
		            tree.add(new Jolteon());
                  System.out.println("You traded a Jolteon");
                  break;
                  case"13":
		            tree.add(new Flareon());
                  System.out.println("You traded a Flareon");
                  break;
                  default:
                  System.out.println("Invalid Input");
            }   
			   break;
//print Pokemon
			   case"3":
			   tree.printBSTree();
			   break;
//End Program
			   case"0":
			   System.out.println("End Program");
			   menuloop = false;
			   break;
// Invalid message
            default:
			      System.out.println("Invalid Input");
         }
      }
   }   
}
   