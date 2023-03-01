/*
* interface for Fire type Pokemon
*/
public interface FireType{
   //constants
   String FIRE_TYPE = new String("Fire");
   String FIRE_COLOR = new String("Orange");
   String[] FIRE_FAST_ATTACKS = {"Ember", "Fire Fang"};
   String[] FIRE_SPECIAL_ATTACKS = {"Fire Blast", "Fire Punch", "Flame Burst","Flame Charge", 
   "Flame Wheel", "Flame Thrower", "Heat Wave"};
   int[] FIRE_FAST_ATK_POWER = {10,10};      
   int[] FIRE_SPECIAL_ATK_POWER = {100,40,30,25,40,55,80};

}