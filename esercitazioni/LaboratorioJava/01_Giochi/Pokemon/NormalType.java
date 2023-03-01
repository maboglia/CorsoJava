/*
* interface for normal type Pokemon
*/
public interface NormalType{
   //constants
   String NORMAL_TYPE = new String("Normal");
   String NORMAL_COLOR = new String("Brown");
   String[] NORMAL_FAST_ATTACKS = {"Pound", "Quick Attack", "Scratch", "Tackle"};
   String[] NORMAL_SPECIAL_ATTACKS = {"Body Slam", "Horn Attack", "Hyper Beam", "Hyper Fang",
    "Stomp", "Swift", "Vice Grip", "Wrap"};
   int[] NORMAL_FAST_ATK_POWER = {7,10,6,12};      
   int[] NORMAL_SPECIAL_ATK_POWER = {40,25,120,35,30,30,25,25};
}