// Ken Kawano
public class PokeNode {
// data fields
   private Pokemon poke;
   private int num;
   private PokeNode left;
   private PokeNode right;
// constructor   
   public PokeNode( Pokemon P, PokeNode lChild, PokeNode rChild){
      poke = P;
      num = 1;
      left = lChild;
      right = rChild;
   }
//This method will return a Pokemon object from inside a given node   
   public Pokemon getPokemon(){
      return poke;
   }

//This method will return the number of the Pokemon object contained in a given node. This is the key for the BST.   
   public int getKey(){
      return poke.getNumber();
   }   
//This method will return the numCaught from inside a given node   
   public int getNumCaught(){
      return num;
   }   
//This method will return the left child of a given node

   public PokeNode getLChild(){
      return left;
   }   
//This method will return the right child of a given node

   public PokeNode getRChild(){
      return right;
   }   

//Set methods
//This method will increment the numCaught from inside a given node
   public void increaseNumCaught(){
      num = num++;
   }   

//This method will decrement numCaught from inside a given node
//Should throw an exception if it becomes < 1
   public void decreaseNumCaught(){
      if(num > 1){
         throw new PokeTreeException("Number caught can't be lower than 1");
      }
      num = num--;
   }   
//Set NumCaught
   public void setNumCaught(int SNum){
      if(SNum > 1){
         throw new PokeTreeException("Number caught can't be lower than 1");
      }      
      num = SNum;
   }   
// Set Pokemon   
   public void setPokemon (Pokemon SPokemon){
      poke = SPokemon;
   }   
//This method will set newLNode as the left child of a node   
   public void setLChild(PokeNode LChild){
      left = LChild;
   }   
//This method will set newRNode as the right child of a node
   public void setRChild(PokeNode RChild){
      right = RChild;
   }   
}