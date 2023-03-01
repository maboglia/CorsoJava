/*
* interface for grass type Pokemon
*/
public interface GrassType{
   //constants
   String GRASS_TYPE = new String("Grass");
   String GRASS_COLOR = new String("Green");
   String[] GRASS_FAST_ATTACKS = {"Razor Leaf", "Vine Whip"};
   String[] GRASS_SPECIAL_ATTACKS = {"Leaf Blade", "Petal Blizzard", "Power Whip","Seed Bomb", 
      "Solar Beam"};
   int[] GRASS_FAST_ATK_POWER = {15, 7};      
   int[] GRASS_SPECIAL_ATK_POWER = {55,65,70,40,120}; 
}