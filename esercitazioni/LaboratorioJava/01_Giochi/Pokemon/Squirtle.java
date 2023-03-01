import java.util.Random;

public class Squirtle extends Pokemon implements WaterType{

   static final int BASE_ATTACK_POWER = 112;
   static final int BASE_DEFENSE_POWER = 142;
   static final int BASE_STAMINA_POWER = 88;
   
   public Squirtle(){
      super("Squirtle", "Squirtle", 7, WATER_COLOR, 0.5, 9.0, WATER_TYPE, "",BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );   
      chooseFastAttack();
      chooseSpecialAttack();
   }
   /* Constructor with name */
   public Squirtle(String name){
      super("Squirtle", name, 7, WATER_COLOR, 0.5, 9.0, WATER_TYPE, "", BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );
      chooseFastAttack();
      chooseSpecialAttack();
   }
   /* Constructor with species and name for subclasses
   * This allows subclass specific name, number, height, weight, and basePowers 
   * to pass through to Pokemon superclass constructor
   */
   protected Squirtle(String species,String name, int num, double ht, double wt, int baseAttackPwr, int baseDefensePwr, int baseStaminaPwr){
      super(species, name, num, WATER_COLOR, ht, wt, WATER_TYPE, "", baseAttackPwr, baseDefensePwr, baseStaminaPwr);
      //pick Attacks
      //can happen here because all subclasses are same types as Bulbasaur
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
	  }else if (vType.equals("Water") || vType.equals("Grass") || vType.equals("Dragon")){
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
	  }else if (vType.equals("Water") || vType.equals("Grass") || vType.equals("Dragon")){
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
   
   protected void beAttacked(int damage){
      damage = damage/defensePower;
      
      if(hP > damage){
        hP = hP - damage;
      }else{
        hP = 0;//"Pokemon fainted"
      }
   }     

}