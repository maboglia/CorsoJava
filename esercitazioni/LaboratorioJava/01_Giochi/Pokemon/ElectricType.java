/*
* interface for Electric type Pokemon
*/
public interface ElectricType{
   //constants
   String ELECTRIC_TYPE = new String("Electric");
   String ELECTRIC_COLOR = new String("Yellow");
   String[] ELECTRIC_FAST_ATTACKS = {"Spark", "Thunder Shock"};
   String[] ELECTRIC_SPECIAL_ATTACKS = {"Discharge", "Thunder", "Thunder Punch","Thunderbolt"};
   int[] ELECTRIC_FAST_ATK_POWER = {7,5};      
   int[] ELECTRIC_SPECIAL_ATK_POWER = {35,100,40,55};

}