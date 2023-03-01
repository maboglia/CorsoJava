import java.util.*;

public class PokemonBattle{
   public static void main(String[] args){
   Scanner userIn = new Scanner (System.in);
   String inString = new String("");
   ArrayList<Pokemon> battleArray = new ArrayList<Pokemon>();
   boolean loop = true;
   while(loop){
	System.out.println("Player One choose a pokemon.");
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
	switch(inString){
		case"1":
			battleArray.add(new Bulbasaur());
			loop = false;
			break;
		case"2":
			battleArray.add(new Ivysaur());
			loop = false;
			break;      
		case"3":
			battleArray.add(new Venusaur());
			loop = false;
			break;      
		case"4":
			battleArray.add(new Charmander());
			loop = false;
			break;            
        case"5":
			battleArray.add(new Charmeleon());
			loop = false;
			break;            
        case"6":
			battleArray.add(new Charizard());
			loop = false;
			break;            
        case"7":
			battleArray.add(new Squirtle());
			loop = false;
			break;        
        case"8":
			battleArray.add(new Wartortle());
			loop = false;
			break;        
        case"9":
			battleArray.add(new Blastoise());
			loop = false;
			break;        
        case"10":
			battleArray.add(new Eevee());
			loop = false;         
			break;        
        case"11":
			battleArray.add(new Vaporeon());
			loop = false;
			break;              
		case"12":
			battleArray.add(new Jolteon());
			loop = false;         
			break;              
		case"13":
			battleArray.add(new Flareon());
			loop = false;
			break;
        default:
			System.out.println("Invalid");   
    }
  }
  loop = true;
  while(loop){   
	System.out.println("Player Two choose a pokemon.");
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
    switch(inString){
		case"1":
			battleArray.add(new Bulbasaur());
			loop = false;
			break;
		case"2":
			battleArray.add(new Ivysaur());
			loop = false;
			break;      
		case"3":
			battleArray.add(new Venusaur());
			loop = false;
			break;      
		case"4":
			battleArray.add(new Charmander());
			loop = false;
			break;            
		case"5":
			battleArray.add(new Charmeleon());
			loop = false;
			break;            
		case"6":
			battleArray.add(new Charizard());
			loop = false;
			break;            
		case"7":
			battleArray.add(new Squirtle());
			loop = false;
			break;        
		case"8":
			battleArray.add(new Wartortle());
			loop = false;
			break;        
		case"9":
			battleArray.add(new Blastoise());
			loop = false;
			break;        
		case"10":
			battleArray.add(new Eevee());
			loop = false;         
			break;        
		case"11":
			battleArray.add(new Vaporeon());
			loop = false;
			break;              
		case"12":
			battleArray.add(new Jolteon());
			loop = false;         
			break;              
		case"13":
			battleArray.add(new Flareon());
			loop = false;
			break;
		default:
			System.out.println("Invalid");   
    }
  }
   int counter = 0;
   int counter2 = 0;
   loop = true;
   boolean loop2 = true;
   boolean loop3 = true;
	while(loop){
		loop2 = true;
		loop3 = true;
		while(loop2){
			if(counter < 3){
				System.out.println("It is Player One's turn.");
				System.out.println("1. Fast Attack");
				System.out.println("0. Pass");
				
				inString = userIn.nextLine();
				inString = inString.trim();
				
				switch(inString){
					case"1":
						System.out.println(battleArray.get(0).performFastAttack(battleArray.get(1)));
						loop2 = false;
						break;
					case"0":
						System.out.println("Player One passes.");
						counter ++;
						loop2 = false;
						break;
					default:
						System.out.println("Invalid");
				}
				if(battleArray.get(1).getHP() == 0){
					System.out.println("Player One wins.");
					loop = false;
					loop2 = false;
					loop3 = false;
				}
			}
			else{
				System.out.println("It is Player One's turn.");
				System.out.println("1. Fast Attack");
				System.out.println("2. Special Attack");
				System.out.println("0. Pass");
				
				inString = userIn.nextLine();
				inString = inString.trim();
				
				switch(inString){
					case "1":
						System.out.println(battleArray.get(0).performFastAttack(battleArray.get(1)));
						loop2 = false;
						break;
					case "2":
						System.out.println(battleArray.get(0).performSpecialAttack(battleArray.get(1)));
						loop2 = false;
						counter = 0;
						break;
					case "0":
						System.out.println("Player One passes.");
						counter ++;
						break;
					default:
						System.out.println("Invalid");
				}
				if(battleArray.get(1).getHP() == 0){
					System.out.println("Player One wins.");
					loop = false;
					loop2 = false;
					loop3 = false;
				}
			}
		}
		while(loop3){
			if(counter2 < 3){
				System.out.println("It is Player Two's turn.");
				System.out.println("1. Fast Attack");
				System.out.println("0. Pass");
				
				inString = userIn.nextLine();
				inString = inString.trim();
				
				switch(inString){
					case"1":
						System.out.println(battleArray.get(1).performFastAttack(battleArray.get(0)));
						loop3 = false;
						break;
					case"0":
						System.out.println("Player Two passes.");
						counter2 ++;
						loop3 = false;
						break;
					default:
						System.out.println("Invalid");
				}
				if(battleArray.get(0).getHP() == 0){
					System.out.println("Player Two wins.");
					loop = false;
					loop2 = false;
					loop3 = false;
				}
			}
			else{
				System.out.println("It is Player Two's turn.");
				System.out.println("1. Fast Attack");
				System.out.println("2. Special Attack");
				System.out.println("0. Pass");
				
				inString = userIn.nextLine();
				inString = inString.trim();
				
				switch(inString){
					case "1":
						System.out.println(battleArray.get(1).performFastAttack(battleArray.get(0)));
						loop3 = false;
						break;
					case "2":
						System.out.println(battleArray.get(1).performSpecialAttack(battleArray.get(0)));
						loop3 = false;
						counter2 = 0;
						break;
					case "0":
						System.out.println("Player Two passes.");
						counter ++;
						break;
					default:
						System.out.println("Invalid");
				}
				if(battleArray.get(0).getHP() == 0){
					System.out.println("Player Two wins.");
					loop = false;
					loop2 = false;
					loop3 = false;
				}
			}
			
		}
	}
   }
}