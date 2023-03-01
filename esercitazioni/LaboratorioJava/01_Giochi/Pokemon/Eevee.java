import java.util.Random;

public class Eevee extends Pokemon implements NormalType{

   static final int BASE_ATTACK_POWER = 114;
   static final int BASE_DEFENSE_POWER = 128;
   static final int BASE_STAMINA_POWER = 110;
   
   public Eevee(){
      super("Eevee", "Eevee", 133, NORMAL_COLOR, 0.3, 6.5, NORMAL_TYPE, "",BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );   
      chooseFastAttack();
      chooseSpecialAttack();
   }
   /* Constructor with name */
   public Eevee(String name){
      super("Eevee", name, 133, NORMAL_COLOR, 0.3, 6.5, NORMAL_TYPE, "", BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );
      chooseFastAttack();
      chooseSpecialAttack();
   }
   /* Constructor with species and name for subclasses
   * This allows subclass specific name, number, height, weight, and basePowers 
   * to pass through to Pokemon superclass constructor
   */
   public Eevee(String species,String name, int num, String color, double ht, double wt, String type, int baseAttackPwr, int baseDefensePwr, int baseStaminaPwr){
      super(species, name, num, color, ht, wt, type, "", baseAttackPwr, baseDefensePwr, baseStaminaPwr);
      //pick Attacks
      //can happen here because all subclasses are same types as Bulbasaur
   }
   
   protected void chooseFastAttack(){
      Random randGen = new Random();
	  int index;
	  index = randGen.nextInt(NORMAL_FAST_ATTACKS.length);
	  fastAttack = NORMAL_FAST_ATTACKS[index];
	  fastAttackPower = NORMAL_FAST_ATK_POWER[index];
   }

   protected void chooseSpecialAttack(){
      Random randGen = new Random();
	  int index;
	  index = randGen.nextInt(NORMAL_SPECIAL_ATTACKS.length);
	  specialAttack = NORMAL_SPECIAL_ATTACKS[index];
	  specialAttackPower = NORMAL_SPECIAL_ATK_POWER[index];
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
	  
	  if(vType.equals("Rock") || vType.equals("Steel")){
		 s = s + "\n It was not very effective.";
		 modifier = modifier * 0.5;
	  }else if (vType.equals("Ghost")){
		 s = s + "\n It had no effect.";
		 modifier = modifier * 0.0;
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
      
	  if(vType.equals("Rock") || vType.equals("Steel")){
		 s = s + "\n It was not very effective.";
		 modifier = modifier * 0.5;
	  }else if (vType.equals("Ghost")){
		 s = s + "\n It had no effect.";
		 modifier = modifier * 0.0;
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