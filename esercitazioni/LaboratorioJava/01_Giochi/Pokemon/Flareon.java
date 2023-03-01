import java.util.Random;

public class Flareon extends Eevee implements FireType{
	
	static final int BASE_ATTACK_POWER = 238;
	static final int BASE_DEFENSE_POWER = 178;
   static final int BASE_STAMINA_POWER = 130;
	
	public Flareon(){
		super ("Flareon", "Flareon", 136, FIRE_COLOR, 0.9, 25.0, FIRE_TYPE, BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
		chooseFastAttack();
		chooseSpecialAttack();
	}
	
	public Flareon(String name){
		super ("Flareon", name, 136, FIRE_COLOR, 0.9, 25.0, FIRE_TYPE, BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
		chooseFastAttack();
		chooseSpecialAttack();
	}
	
	protected void chooseFastAttack(){
		Random randGen = new Random();
		int index;
		index = randGen.nextInt(FIRE_FAST_ATTACKS.length);
		fastAttack = FIRE_FAST_ATTACKS[index];
		fastAttackPower = FIRE_FAST_ATK_POWER[index];
	}
	
	protected void chooseSpecialAttack(){
		Random randGen = new Random();
		int index;
		index = randGen.nextInt(FIRE_SPECIAL_ATTACKS.length);
		specialAttack = FIRE_SPECIAL_ATTACKS[index];
		specialAttackPower = FIRE_SPECIAL_ATK_POWER[index];
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
	  
	   if(vType.equals("Grass") || vType.equals("Ice") || vType.equals("Bug") || vType.equals("Steel")){
		s = s + "\n It was super effective!";
		modifier = modifier * 2.0;
	   }
      else if (vType.equals("Water") || vType.equals("Fire") || vType.equals("Rock") || vType.equals("Dragon")){
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
      
	   if(vType.equals("Grass") || vType.equals("Ice") || vType.equals("Bug") || vType.equals("Steel")){
		s = s + "\n It was super effective!";
		modifier = modifier * 2.0;
	   }
      else if (vType.equals("Water") || vType.equals("Fire") || vType.equals("Rock") || vType.equals("Dragon")){
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