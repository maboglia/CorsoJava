import java.util.Random;

public class Vaporeon extends Eevee implements WaterType{
	
	static final int BASE_ATTACK_POWER = 186;
	static final int BASE_DEFENSE_POWER = 168;
    static final int BASE_STAMINA_POWER = 260;
	
	public Vaporeon(){
		super ("Vaporeon", "Vaporeon", 134, WATER_COLOR, 1.0, 29.0, WATER_TYPE, BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
		chooseFastAttack();
		chooseSpecialAttack();
	}
	
	public Vaporeon(String name){
		super ("Vaporeon", name, 134, WATER_COLOR, 1.0, 29.0, WATER_TYPE, BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
		chooseFastAttack();
		chooseSpecialAttack();
	}
	
	protected void chooseFastAttack(){
		Random randGen = new Random();
		int index;
		index = randGen.nextInt(WATER_FAST_ATTACKS.length);
		fastAttack = WATER_FAST_ATTACKS[index];
		fastAttackPower = WATER_FAST_ATK_POWER[index];
	}
	
	protected void chooseSpecialAttack(){
		Random randGen = new Random();
		int index;
		index = randGen.nextInt(WATER_SPECIAL_ATTACKS.length);
		specialAttack = WATER_SPECIAL_ATTACKS[index];
		specialAttackPower = WATER_SPECIAL_ATK_POWER[index];
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
	  
		if(vType.equals("Fire") || vType.equals("Ground") || vType.equals("Rock")){
			s = s + "\n It was super effective!";
			modifier = modifier * 2.0;
	    }
		else if (vType.equals("Water") || vType.equals("Grass") || vType.equals("Dragon")){
			s = s + "\n It was not very effective.";
			modifier = modifier * 0.5;
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
      
		if(vType.equals("Fire") || vType.equals("Ground") || vType.equals("Rock")){
			s = s + "\n It was super effective!";
			modifier = modifier * 2.0;
	    }
	    else if (vType.equals("Water") || vType.equals("Grass") || vType.equals("Dragon")){
			s = s + "\n It was not very effective.";
			modifier = modifier * 0.5;
	    }

        if(type1.equals(vType) && type2.equals(victim.getType2())){
         modifier = modifier *  1.5;
        }
	  
        damage = (((2*level)+10)/damageDivisor)* attackPower * (specialAttackPower + 2) * modifier;
     
        victim.beAttacked((int)damage);
        return s;
   }
}