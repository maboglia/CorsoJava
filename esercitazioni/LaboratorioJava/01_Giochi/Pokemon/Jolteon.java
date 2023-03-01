import java.util.Random;

public class Jolteon extends Eevee implements ElectricType{
	
	static final int BASE_ATTACK_POWER = 192;
	static final int BASE_DEFENSE_POWER = 174;
   static final int BASE_STAMINA_POWER = 130;
	
	public Jolteon(){
		super ("Jolteon", "Jolteon", 135, ELECTRIC_COLOR, 0.8, 24.5, ELECTRIC_TYPE, BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
		chooseFastAttack();
		chooseSpecialAttack();
	}
	
	public Jolteon(String name){
		super ("Jolteon", name, 135, ELECTRIC_COLOR, 0.8, 24.5, ELECTRIC_TYPE, BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
		chooseFastAttack();
		chooseSpecialAttack();
	}
	
	protected void chooseFastAttack(){
		Random randGen = new Random();
		int index;
		index = randGen.nextInt(ELECTRIC_FAST_ATTACKS.length);
		fastAttack = ELECTRIC_FAST_ATTACKS[index];
		fastAttackPower = ELECTRIC_FAST_ATK_POWER[index];
	}
	
	protected void chooseSpecialAttack(){
		Random randGen = new Random();
		int index;
		index = randGen.nextInt(ELECTRIC_SPECIAL_ATTACKS.length);
		specialAttack = ELECTRIC_SPECIAL_ATTACKS[index];
		specialAttackPower = ELECTRIC_SPECIAL_ATK_POWER[index];
   }
   
    public String performFastAttack(Pokemon victim){
      
		Random rand = new Random();
		double damage = 0.0;
		double modifier = 1.0;
		double damageDivisor = 250.0;
      
		String s = "";
		String vType = victim.getType1();
      
		modifier = (double)(rand.nextInt(16) + 85)/100.0; //random modifier .85 - 1.00
		s = name+ " performed " + fastAttack + " on " + victim.getSpecies();
	  
		if(vType.equals("Water") || vType.equals("Flying")){
			s = s + "\n It was super effective!";
			modifier = modifier * 2.0;
	    }
		else if (vType.equals("Grass") || vType.equals("Electric") || vType.equals("Dragon")){
			s = s + "\n It was not very effective.";
			modifier = modifier * 0.5;
		}
      else if(vType.equals("Ground")){ 
            s = s + "\n It had no effect.";
            modifier = 0;
      }	  
		if(type1.equals(vType) && type2.equals(victim.getType2())){
         modifier = modifier *  1.5;
		}
	  
		damage = (((2*level)+10)/damageDivisor)* attackPower * (specialAttackPower + 2) * modifier;      

		victim.beAttacked((int)damage);
		return s;
    }
   
    public String performSpecialAttack(Pokemon victim){
		Random rand = new Random();
		double damage = 0.0;
		double modifier = 1.0;
		double damageDivisor = 250.0;
      
		String s = "";
		String vType = victim.getType1();
      
		modifier = (double)(rand.nextInt(16) + 85)/100.0; //random modifier .85 - 1.00
      
		s = name+ " performed " + specialAttack + " on " + victim.getSpecies();
      
		if(vType.equals("Water") || vType.equals("Flying")){
			s = s + "\n It was super effective!";
			modifier = modifier * 2.0;
	    }
		else if (vType.equals("Grass") || vType.equals("Electric") || vType.equals("Dragon")){
			s = s + "\n It was not very effective.";
			modifier = modifier * 0.5;
		}
      else if(vType.equals("Ground")){ 
            s = s + "\n It had no effect.";
            modifier = 0;
      }	  
      if(type1.equals(vType) && type2.equals(victim.getType2())){
         modifier = modifier *  1.5;
      }
	  
      damage = (((2*level)+10)/damageDivisor)* attackPower * (specialAttackPower + 2) * modifier;
     
      victim.beAttacked((int)damage);
      return s;
   }
}