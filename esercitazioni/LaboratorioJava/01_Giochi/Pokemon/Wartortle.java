public class Wartortle extends Squirtle{

   static final int BASE_ATTACK_POWER = 144;
   static final int BASE_DEFENSE_POWER = 176;
   static final int BASE_STAMINA_POWER = 118;
   
   /* Constructor with no name */
   public Wartortle(){
      super("Wartortle", "Wartortle", 8, 1.0, 22.5,BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );   
   }
   /* Constructor with name */
   public Wartortle(String name){
         super("Wartortle", name, 8, 1.0, 22.5,BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );
   }
    /* Constructor with species and name for subclasses */
   protected Wartortle(String species,String name, int num, double ht, double wt, int baseAttackPwr, int baseDefensePwr, int baseStaminaPwr){
      super(species, name, num, ht, wt, baseAttackPwr, baseDefensePwr, baseStaminaPwr);
   }
   

}
