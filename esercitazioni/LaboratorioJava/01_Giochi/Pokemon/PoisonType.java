/*
* interface for poison type Pokemon
*/
public interface PoisonType{
   //constants
   String POISON_TYPE = new String("Poison");
   String POISON_COLOR = new String("Purple");
   String[] POISON_FAST_ATTACKS = {"Acid", "Poison Jab", "Poison Sting"};
   String[] POISON_SPECIAL_ATTACKS = {"Cross Poison", "Gunk Shot", "Poison Fang","Sludge", "Sludge Bomb",
    "Sludge Wave"};
   int[] POISON_FAST_ATK_POWER = {10,12,6};      
   int[] POISON_SPECIAL_ATK_POWER = {25,65,25,30,55,70};
}