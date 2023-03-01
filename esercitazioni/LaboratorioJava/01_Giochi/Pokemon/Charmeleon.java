public class Charmeleon extends Charmander{

   static final int BASE_ATTACK_POWER = 160;
   static final int BASE_DEFENSE_POWER = 140;
   static final int BASE_STAMINA_POWER = 116;
   
   /* Constructor with no name */
   public Charmeleon(){
      super("Charmeleon", "Charmeleon", 5, 1.1, 19.0,BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );
	  chooseFastAttack();
      chooseSpecialAttack();
   }
   /* Constructor with name */
   public Charmeleon(String name){
      super("Charmeleon", name, 5, 1.1, 19.0,BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );
	  chooseFastAttack();
      chooseSpecialAttack();
   }
    /* Constructor with species and name for subclasses */
   protected Charmeleon(String species,String name, int num, double ht, double wt, int baseAttackPwr, int baseDefensePwr, int baseStaminaPwr){
      super(species, name, num, ht, wt, baseAttackPwr, baseDefensePwr, baseStaminaPwr);
   }
   

}
