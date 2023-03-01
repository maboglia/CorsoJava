import java.util.Random;
public class Charizard extends Charmeleon implements FlyingType{

   static final int BASE_ATTACK_POWER = 212;
   static final int BASE_DEFENSE_POWER = 182;
   static final int BASE_STAMINA_POWER = 156;
   
   /* Constructor with no name */
   public Charizard(){
      super("Charizard", "Charizard", 6, 1.7, 90.5, BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );
      type2 = FLYING_TYPE;
	  chooseFastAttack();
      chooseSpecialAttack();
   }
   /* Constructor with name */
   public Charizard(String name){
      super("Charizard", name, 6, 1.7, 90.5, BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );
      type2 = FLYING_TYPE;
      chooseFastAttack();
      chooseSpecialAttack();
   }
   protected boolean fastIsFire = true;
   protected boolean specialIsFire = true;
   
   protected void chooseFastAttack(){
      //randomly choose to get fire or flying attack
      Random randGen = new Random();
      int index;
      //set attack type boolean
      fastIsFire = randGen.nextBoolean();
      
      if(fastIsFire){
         index = randGen.nextInt(FIRE_FAST_ATTACKS.length);
         fastAttack = FIRE_FAST_ATTACKS[index];
         fastAttackPower = FIRE_FAST_ATK_POWER[index];
      }else{//is flying
         index = randGen.nextInt(FLYING_FAST_ATTACKS.length);
         fastAttack = FLYING_FAST_ATTACKS[index]; 
         fastAttackPower = FLYING_FAST_ATK_POWER[index];
         fastIsFire = false;  
      }
   }

   protected void chooseSpecialAttack(){
      //randomly choose to get fire or flying attack
      Random randGen = new Random();
      int index;
      //set attack type boolean
      specialIsFire = randGen.nextBoolean();
      
      if(fastIsFire){
         index = randGen.nextInt(FIRE_SPECIAL_ATTACKS.length);
         specialAttack = FIRE_SPECIAL_ATTACKS[index];
         specialAttackPower = FIRE_SPECIAL_ATK_POWER[index];
      }else{//is flying
         index = randGen.nextInt(FLYING_SPECIAL_ATTACKS.length);
         specialAttack = FLYING_SPECIAL_ATTACKS[index]; 
         specialAttackPower = FLYING_SPECIAL_ATK_POWER[index];
         specialIsFire = false;  
      }
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
      //check effectiveness of attack
      if(fastIsFire){//if attack is fire-type
         if(vType.equals("Grass") || vType.equals("Ice") || vType.equals("Bug") || vType.equals("Steel")){
            s = s + "\n It was super effective!";
            modifier = modifier * 2.0;          
         }else if(vType.equals("Fire") || vType.equals("Water")||vType.equals("Rock")|| vType.equals("Dragon")){ 
            s = s + "\n It was not very effective.";
            modifier = modifier * 0.5;
         }
      }else{//is flying attack
         if(vType.equals("Grass") || vType.equals("Fighting") || vType.equals("Bug")){
            s = s + "\n It was super effective!";
            modifier = modifier * 2.0;
            
         }else if(vType.equals("Electric") || vType.equals("Rock") || vType.equals("Steel")){ 
            s = s + "\n It was not very effective.";
            modifier = modifier * 0.5;
         }
      }
      //check for same types for bonus
      if(type1.equals(vType) && type2.equals(victim.getType2())){
         modifier = modifier *  1.5;
      }
      //bulbapedia damage formula:
      damage = (((2*level)+10)/damageDivisor)* attackPower * (specialAttackPower + 2) * modifier;      
      //perform hit on victim pokemon
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
      //check effectiveness of attack
      if(specialIsFire){//if attack is fire-type
         if(vType.equals("Grass") || vType.equals("Ice") || vType.equals("Bug") || vType.equals("Steel")){
            s = s + "\n It was super effective!";
            modifier = modifier * 2.0;          
         }else if(vType.equals("Fire") || vType.equals("Water")||vType.equals("Rock")|| vType.equals("Dragon")){ 
            s = s + "\n It was not very effective.";
            modifier = modifier * 0.5;
         }
      }else{//is flying attack
         if(vType.equals("Grass") || vType.equals("Fighting") || vType.equals("Bug")){
            s = s + "\n It was super effective!";
            modifier = modifier * 2.0;
            
         }else if(vType.equals("Electric") || vType.equals("Rock") || vType.equals("Steel")){ 
            s = s + "\n It was not very effective.";
            modifier = modifier * 0.5;
         }
      }
      //check for same types for bonus
      if(type1.equals(vType) && type2.equals(victim.getType2())){
         modifier = modifier *  1.5;
      }
      //bulbapedia damage formula:
      damage = (((2*level)+10)/damageDivisor)* attackPower * (specialAttackPower + 2) * modifier;      
      //perform hit on victim pokemon
      victim.beAttacked((int)damage);
      return s;
   }     
}
   
