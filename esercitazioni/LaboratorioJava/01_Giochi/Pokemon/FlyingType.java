/*
* interface for poison type Pokemon
*/
public interface FlyingType{
   //constants
   String FLYING_TYPE = new String("Flying");
   String FLYING_COLOR = new String("Sky blue");
   String[] FLYING_FAST_ATTACKS = {"Peck", "Wing Attack"};
   String[] FLYING_SPECIAL_ATTACKS = {"Aerial Ace", "Air Cutter", "Drill Peck","Hurricane"};
   int[] FLYING_FAST_ATK_POWER = {10,9};      
   int[] FLYING_SPECIAL_ATK_POWER = {30, 30, 40,80};

}