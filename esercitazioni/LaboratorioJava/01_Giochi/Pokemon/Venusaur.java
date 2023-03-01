/*
*
*/
public class Venusaur extends Ivysaur{

   static final int BASE_ATTACK_POWER = 198;
   static final int BASE_DEFENSE_POWER = 200;
   static final int BASE_STAMINA_POWER = 160;
   
   /* Constructor with no name */
   public Venusaur(){
      super("Venusaur", "Venusaur", 3, 2.0, 100.0,BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );   
   }
   /* Constructor with name */
   public Venusaur(String name){
         super("Venusaur", name, 3, 2.0, 100.0,BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );
   }
}
   
