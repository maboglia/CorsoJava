import java.util.Random;
/*
* Bulbasaur Pokemon object class
* Dual-type Grass|Poison implements two type interfaces
* Parent class to Ivysaur
* @author Lisa Miller
* @version 1.0
* @since 9/24/2016
*/
public class Bulbasaur extends Pokemon implements GrassType, PoisonType{

   static final int BASE_ATTACK_POWER = 126;
   static final int BASE_DEFENSE_POWER = 126;
   static final int BASE_STAMINA_POWER = 90;
   
   //booleans for telling which type attack to use for dual type Pokemon
   protected boolean fastIsGrass = true;
   protected boolean specialIsGrass = true;

   
   /* Constructor with no name
   * uses Pokemon superclass constructor
   * attacks must be set after contruction of Pokemon Object
   * because of dependence on type interface
    */
   public Bulbasaur(){
      super("Bulbasaur", "Bulbasaur", 1, GRASS_COLOR, 0.71, 6.9, GRASS_TYPE, POISON_TYPE,BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );   
      //pick Attacks after construct
      chooseFastAttack();
      chooseSpecialAttack();
   }
   /* Constructor with name */
   public Bulbasaur(String name){
      super("Bulbasaur", name, 1, GRASS_COLOR, 0.71, 6.9, GRASS_TYPE, POISON_TYPE, BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );
      //pick Attacks
      chooseFastAttack();
      chooseSpecialAttack();
   }
   /* Constructor with species and name for subclasses
   * This allows subclass specific name, number, height, weight, and basePowers 
   * to pass through to Pokemon superclass constructor
   */
   protected Bulbasaur(String species,String name, int num, double ht, double wt, int baseAttackPwr, int baseDefensePwr, int baseStaminaPwr){
      super(species, name, num, GRASS_COLOR, ht, wt, GRASS_TYPE, POISON_TYPE, baseAttackPwr, baseDefensePwr, baseStaminaPwr);
      //pick Attacks
      //can happen here because all subclasses are same types as Bulbasaur
      chooseFastAttack();
      chooseSpecialAttack();
   }
   
   /*
   * Grass|Poison-type specific fast attack chooser
   * Randomly picks whether attack type is grass or poison
   * Randomly picks an attack from type attack arrays
   */
   protected void chooseFastAttack(){
      //randomly choose to get grass or poison attack
      Random randGen = new Random();
      int index;
      //set attack type boolean
      fastIsGrass = randGen.nextBoolean();
      
      if(fastIsGrass){
         index = randGen.nextInt(GRASS_FAST_ATTACKS.length);
         fastAttack = GRASS_FAST_ATTACKS[index];
         fastAttackPower = GRASS_FAST_ATK_POWER[index];
      }else{//is poison
         index = randGen.nextInt(POISON_FAST_ATTACKS.length);
         fastAttack =POISON_FAST_ATTACKS[index]; 
         fastAttackPower = POISON_FAST_ATK_POWER[index];
         fastIsGrass = false;  
      }
   }
   
  /*
   * Grass|Poison-type specific special attack chooser
   * Randomly picks whether attack type is grass or poison
   * Randomly picks an attack from type interface attack arrays
   */
   protected void chooseSpecialAttack(){
      //randomly choose to get grass or poison attack
      Random randGen = new Random();
      int index;
      //set type choice boolean
      specialIsGrass = randGen.nextBoolean();
      
      if(specialIsGrass){
         index = randGen.nextInt(GRASS_SPECIAL_ATTACKS.length);
         specialAttack = GRASS_SPECIAL_ATTACKS[index];
         specialAttackPower = GRASS_SPECIAL_ATK_POWER[index];
      }else{//is poison
         index = randGen.nextInt(POISON_SPECIAL_ATTACKS.length);
         specialAttack =  POISON_SPECIAL_ATTACKS[index];
         specialAttackPower = POISON_SPECIAL_ATK_POWER[index];  
          
      }
   }
   
   /*
   * Game-play fast attack simulation
   * Creates an output String stating attack details
   * checks for weakness/strength adjustment based on 
   * victim Pokemon's type and attack type(only need to check latter for dual-type)
   * Calls beAttacked method on attacked victim.
   * @param Pokemon the Pokemon being attacked
   * @return String explaining attack and effectiveness
   */
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
      if(fastIsGrass){//if attack is grass-type
         if(vType.equals("Ground") || vType.equals("Rock") || vType.equals("Water")){
            s = s + "\n It was super effective!";
            modifier = modifier * 2.0;          
         }else if(vType.equals("Bug") || vType.equals("Dragon") || vType.equals("Fire")||vType.equals("Dragon")||
               vType.equals("Flying") || vType.equals("Grass") || vType.equals("Poison") || vType.equals("Steel")){ 
            s = s + "\n It was not very effective.";
            modifier = modifier * 0.5;
         }
      }else{//is poison attack
         if(vType.equals("Grass") || vType.equals("Fairy")){
            s = s + "\n It was super effective!";
            modifier = modifier * 2.0;
            
         }else if(vType.equals("Rock") || vType.equals("Ghost") || vType.equals("Ground") || vType.equals("Poison")){ 
            s = s + "\n It was not very effective.";
            modifier = modifier * 0.5;
         }else if(vType.equals("Steel")){ 
            s = s + "\n It had no effect.";
            modifier = 0;
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
   
  /*
   * Game-play special attack simulation
   * Creates an output String stating attack details
   * checks for weakness/strength adjustment based on 
   * victim Pokemon's type and attack type(only need to check latter for dual-type)
   * uses Damage formula from here: http://bulbapedia.bulbagarden.net/wiki/Damage
   * Calls beAttacked method on attacked victim.
   * @param Pokemon the Pokemon being attacked
   * @return String explaining attack and effectiveness
   */
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
      if(specialIsGrass){//if attack is grass-type
         if(vType.equals("Ground") || vType.equals("Rock") || vType.equals("Water")){
            s = s + "\n It was super effective!";
            modifier = modifier * 2.0;          
         }else if(vType.equals("Bug") || vType.equals("Dragon") || vType.equals("Fire")||vType.equals("Dragon")||
               vType.equals("Flying") || vType.equals("Grass") || vType.equals("Poison") || vType.equals("Steel")){ 
            s = s + "\n It was not very effective.";
            modifier = modifier * 0.5;
         }
      }else{//is poison attack
         if(vType.equals("Grass") || vType.equals("Fairy")){
            s = s + "\n It was super effective!";
            modifier = modifier * 2.0;
            
         }else if(vType.equals("Rock") || vType.equals("Ghost") || vType.equals("Ground") || vType.equals("Poison")){ 
            s = s + "\n It was not very effective.";
            modifier = modifier * 0.5;
         }else if(vType.equals("Steel")){ 
            s = s + "\n It had no effect.";
            modifier = 0;//will zero whole calculation
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
   
   /*
   * Reduces Pokemon's HP by damage/defensePower
   * Doesn't allow HP to go less than 0
   * Implementation of "fainting" not done yet
   * @param int hit points to take off HP
   */
   protected void beAttacked(int damage){
      //part of bulbapedia damage formula
      damage = damage/defensePower;
      
      if(hP > damage){
        hP = hP - damage;
      }else{
        hP = 0;//"Pokemon fainted"
      }
   }     

}