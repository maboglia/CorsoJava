public class Blastoise extends Wartortle{

   static final int BASE_ATTACK_POWER = 186;
   static final int BASE_DEFENSE_POWER = 222;
   static final int BASE_STAMINA_POWER = 158;
   
   /* Constructor with no name */
   public Blastoise(){
      super("Blastoise", "Blastoise", 9, 1.6, 85.5,BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );   
   }
   /* Constructor with name */
   public Blastoise(String name){
         super("Blastoise", name, 9, 1.6, 85.5,BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER );
   }
}
   
