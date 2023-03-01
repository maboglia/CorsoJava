/*
* interface for water type Pokemon
*/
public interface WaterType{
   //constants
   String WATER_TYPE = new String("Water");
   String WATER_COLOR = new String("Blue");
   String[] WATER_FAST_ATTACKS = {"Bubble", "Splash", "Water Gun"};
   String[] WATER_SPECIAL_ATTACKS = {"Aqua Jet", "Aqua Tail", "Brine","Bubble Beam", "Hydro Pump", 
   "Scald", "Water Pulse"};
   int[] WATER_FAST_ATK_POWER = {25,0,6};      
   int[] WATER_SPECIAL_ATK_POWER = {25,45,25,30,90, 55,35};

}