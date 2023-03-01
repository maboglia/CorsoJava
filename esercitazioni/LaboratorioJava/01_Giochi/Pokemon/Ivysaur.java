/*
*
*/
public class Ivysaur extends Bulbasaur{

   static final int BASE_ATTACK_POWER = 156;
   static final int BASE_DEFENSE_POWER = 158;
   static final int BASE_STAMINA_POWER = 120;
   
   /* Constructor with no name */
   public Ivysaur(){
      super("Ivysaur", "Ivysaur", 2, 1.0, 13.0,BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );   
   }
   /* Constructor with name */
   public Ivysaur(String name){
         super("Ivysaur", name, 2, 1.0, 13.0,BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );
   }
    /* Constructor with species and name for subclasses */
   protected Ivysaur(String species,String name, int num, double ht, double wt, int baseAttackPwr, int baseDefensePwr, int baseStaminaPwr){
      super(species, name, num, ht, wt, baseAttackPwr, baseDefensePwr, baseStaminaPwr);
   }
   

}
   
