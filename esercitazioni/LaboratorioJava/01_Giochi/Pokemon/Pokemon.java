import java.util.Random;
import java.text.*; //imports decimal format
/*
* Abstract parent class for Pokemon species
* @author Lisa Miller
* @since 9/23/2013
*/
public abstract class Pokemon{

   /*** instance variables ***/
   protected String species;
   protected String name;
   protected int number;
   protected String color;
   protected double height;
   protected double weight;
   protected String type1;
   protected String type2;
   
   //hidden from user, used to calc HP/CP
   protected int attackPower; 
   protected int defensePower;
   protected int staminaPower;
   protected double level;
   
   //for battling
   protected int hP;
   protected int cP;
   protected String fastAttack;
   protected int fastAttackPower;
   protected String specialAttack;
   protected int specialAttackPower;

   //also hidden converts level to multiplier for CP
   private double[] cpMultiplier = {0.094,  0.16639787,  0.21573247,  0.25572005,  0.29024988,
        0.3210876 ,  0.34921268,  0.37523559,  0.39956728,  0.42250001,
        0.44310755,  0.46279839,  0.48168495,  0.49985844,  0.51739395,
        0.53435433,  0.55079269,  0.56675452,  0.58227891,  0.59740001,
        0.61215729,  0.62656713,  0.64065295,  0.65443563,  0.667934  ,
        0.68116492,  0.69414365,  0.70688421,  0.71939909,  0.7317    ,
        0.73776948,  0.74378943,  0.74976104,  0.75568551,  0.76156384,
        0.76739717,  0.7731865 ,  0.77893275,  0.78463697,  0.79030001};

   
   /*** constructor **/
   public Pokemon(String species, String name, int number, String color, double height, double weight,
    String type1,String type2, int baseAttackPower, int baseDefensePower, int baseStaminaPower)
    throws PokemonException {
      
      //for initial level
      Random randGen = new Random();
      //for calc of CP
      double cpMult;

      //set simple instance variables
      this.species = species;
      this.name = name;
      if (name.trim().equals("")) {
         throw new PokemonException("Must input a name.");
      }   
      
      this.number = number;
      this.color = color;
      this.height = height;
      this.weight = weight;
      this.type1 = type1;
      this.type2 = type2;
      
      //generate initial level
      this.level = (double)randGen.nextInt(30)+1;
  
      //calculate multiplier for stats
      cpMult = cpMultiplier[(int)level-1];
      
      //calculate hidden stats attack. defense, stamina power
      attackPower =(int)((baseAttackPower + randGen.nextInt(16))*cpMult);
      defensePower = (int)((baseDefensePower + randGen.nextInt(16))*cpMult);
      staminaPower = (int)((baseStaminaPower + randGen.nextInt(16))*cpMult);

      //set Pokemon's HP and CP from attack, defense and stamina
      calculateHPAndCP(); 
      
      //attacks null here, have to be set separately in subclasses due to type
      fastAttack = null;
      fastAttackPower = 0;
      specialAttack = null;
      specialAttackPower = 0;
   }
   
   /*private method to calculate or update HP and CP
   * uses formula from here: https://pokemongo.gamepress.gg/pokemon-stats-advanced
   */
   private void calculateHPAndCP(){
      //calculate multiplier for stats
      double cpMult = cpMultiplier[(int)level-1];
      hP = staminaPower;
      cP = (int)((attackPower * Math.pow(defensePower,0.5) * Math.pow(staminaPower, 0.5) * Math.pow(cpMult,2))/10.0);
      if(cP < 10){
         cP = 10;
      }
   }
   
   /*** public class methods ***/
   /*
   * Increases Pokemon's level by 1
   * Adjusts HP and CP accordingly
   */
   public void levelUp(){
      level ++;
      calculateHPAndCP();
   }
   
   /*
   * Returns Pokemon information as a formatted String
   * @return String representing Pokemon object data
   */
   public String toString( ){
      DecimalFormat df = new DecimalFormat("000");
      String s="";
      
      s = "Species: " + species + "\n";
      if(species.compareTo(name) != 0){
         s = s + "Name: " + name + "\n";
      }
      s = s + "Number: " +  df.format(number) + "\n";
      s = s + "Height: " + height + "\n";
      s = s + "Weight: " + weight + "\n";
      s = s + "Type: " + type1;
      if(this.type2.length() > 0){
         s = s + " | " + this.type2;
      }
      s = s+ "\n";
      s = s + "HP: " + hP + "\n";
      s = s + "CP: " + cP + "\n";
      
      return s;
   }
   
  /* sets Pokemon's user-defined name
   * @param String new name
   */
   public void setName(String newName)throws PokemonException {
      name = newName;
      if (name.trim().equals("")){
         throw new PokemonException("Must input a name.");
      }
   }
   
  /*** abstract methods required for sub-classes ***/
   /*
   * Retrieves victim Pokemon's type.
   * Determines if the attack is super effective or not effective
   * Performs beAttacked on victim
   * @param Pokemon victim the Pokemon object being attacked
   * @return String "<species> performed <fastAttack> 
   * + <it <was super, wasn't very, was not> effective>" depending on type
   */
   public abstract String performFastAttack(Pokemon victim);
   
   /*
   * Retrieves victim Pokemon's type.
   * Determines if the attack is super effective or not effective
   * Calculates amount of HP to knock off victim
   * Performs beAttacked on victim
   * @param Pokemon victim the Pokemon object being attacked
   * @return String "<species> performed <specialAttack> 
   * + <it <was super, wasn't very, was not> effective>" depending on type
   */
   public abstract String performSpecialAttack(Pokemon victim);
   
      
   /*** protected abstract methods, for use only within subclasses ***/
   /*
    * Reduces Pokemon's HP due to attack
    * @param int points to reduce HP
    */
   protected abstract void beAttacked(int hit);

   /*
   * Use the type interface lists to set Pokemon
   * Fast and Special Attacks
   */
   protected abstract void chooseFastAttack();
   protected abstract void chooseSpecialAttack();

   
   /** Get Methods **/
   
   /* returns Pokemon species
    * @return String
   */
   public String getSpecies(){
      return species;
   }
   
   /* returns Pokemon userdefined name
    * @return String
   */
   public String getName(){
      return name;
   }
   /* returns Pokemon color
    * @return String
   */
   public String getColor(){
      return color;
   }
   /* returns Pokemon height
   * @return double
   */   
   public double getHeight(){
      return height;
   }
   /* returns weight
    * @return double
   */   
   public double getWeight(){
      return weight;
   }
   /* returns Pokemon number from Pokedex
   * @return int
   */   
   public int getNumber(){
      return number;
   }
   /* returns Pokemon primary type
    * @return String
   */   
   public String getType1(){
      return type1;
   }
   /* returns Pokemon secondary type
    * @return String
    * empty if no secondary type
   */   
   public String getType2(){
      return type2;
   }
   /* returns Pokemon Hit Power
   * @return int
   */   
   public int getHP(){
      return hP;
   }
  /* returns Pokemon Combat Power
   * @return int
   */   
   public int getCP() {
      return cP;        
   }
   /* returns fast/simple attack
    * @return String
   */   
   public String getFastAttack(){
      return fastAttack;
   }   
   /* returns special attack
    * @return String
   */   
   public String getSpecialAttack(){
      return specialAttack;
   }   

}