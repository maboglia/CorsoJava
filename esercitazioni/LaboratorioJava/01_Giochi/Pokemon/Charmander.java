import java.util.Random;

public class Charmander extends Pokemon implements FireType{

   static final int BASE_ATTACK_POWER = 128;
   static final int BASE_DEFENSE_POWER = 108;
   static final int BASE_STAMINA_POWER = 78;
   
   public Charmander(){
      super("Charmander", "Charmander", 4, FIRE_COLOR, 0.6, 8.5, FIRE_TYPE, "",BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );   
      chooseFastAttack();
      chooseSpecialAttack();
   }
   /* Constructor with name */
   public Charmander(String name){
      super("Charmander", name, 4, FIRE_COLOR, 0.6, 8.5, FIRE_TYPE, "", BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );
      chooseFastAttack();
      chooseSpecialAttack();
   }
   /* Constructor with species and name for subclasses
   * This allows subclass specific name, number, height, weight, and basePowers 
   * to pass through to Pokemon superclass constructor
   */
   protected Charmander(String species,String name, int num, double ht, double wt, int baseAttackPwr, int baseDefensePwr, int baseStaminaPwr){
      super(species, name, num, FIRE_COLOR, ht, wt, FIRE_TYPE, "", baseAttackPwr, baseDefensePwr, baseStaminaPwr);
     
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
	  }else if (vType.equals("Water") || vType.equals("Fire") || vType.equals("Rock") || vType.equals("Dragon")){
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
	  }else if (vType.equals("Water") || vType.equals("Fire") || vType.equals("Rock") || vType.equals("Dragon")){
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