//Ken Kawano
public class PokeTree{

   private PokeNode root = null;
   private String display = "";

// Couldn't get this to work properly   
   public PokeTree(){
//Empty BST constructor.
   }
//Adding Pokemon:

//This method should call the private recursive add method with root
   public void add(Pokemon p){
      root = add(root, p);
   }       
            
//Recursive add method
//Should make a new node and put Pokemon p in it with numCaught = 1 if not already in the tree
//Should increment numCaught if Pokemon already is in the tree
   
   private PokeNode add(PokeNode node, Pokemon p){
// If empty tree or leaf node
      if (node == null){
         return new PokeNode(p, null, null);
      }
// If same type of node
// Increments the numcaught by 1
// Didn't work      
      else if (p.getNumber() == node.getKey()){
         node.increaseNumCaught();
         return node;
      }
// Goes to Left Node      
      else if (p.getNumber() < node.getKey()){
         node.setLChild(this.add(node.getLChild(), p));
         return node;
      }
// Goes to RIght Node      
      else {
         node.setRChild(this.add(node.getRChild(), p));
         return node;
      }
   }           

//Removing Pokemon:


//Wrapper method that calls recursive remove method with root
   public void remove(Pokemon p){
      root = this.remove(root, p);
   }   

   private PokeNode remove(PokeNode node, Pokemon p){
// If node can't be found
      if (node == null) {
         throw new PokeTreeException("Pokemon not found!");
      }
// Goes to Left Node
      else if (p.getNumber() < node.getKey()){
         node.setLChild(this.remove(node.getLChild(), p));
         return node;
      }
// Goes to Right Node
      else if (p.getNumber() > node.getKey()){
         node.setRChild(this.remove(node.getRChild(), p));
         return node;
      }
// Found node to remove      
      else {
// If node has more than 1 numcaught, decreases by one and doesn't remove
         if (node.getNumCaught() > 1){
            node.decreaseNumCaught();
         }
// Removes Node         
         else {   
            node = this.remove(node);
         }   
         return node;
      }
   }
   
// Removes Node and rearanges tree if needed
   private PokeNode remove(PokeNode node){
      if (node.getLChild() == null && node.getRChild() == null){
         return null;
      }
      else if (node.getLChild() == null){
         return node.getRChild();
      }
      else if (node.getRChild() == null){
         return node.getLChild();
      }
// Swaps positions with node with highest value to the left      
      else {
         Pokemon largestPokemonInLeftSubtree = this.getPokemonWithLargestSearchKey(node.getLChild());
         int tempNumCaught = this.getTempNumCaught(node.getLChild());
         node.setPokemon(largestPokemonInLeftSubtree);
         node.setNumCaught(tempNumCaught);
         node.setLChild(this.removeNodeWithLargestSearchKey(node.getLChild()));
         return node;
      }
   }
// Finds largest node to left of removed node   
   private Pokemon getPokemonWithLargestSearchKey(PokeNode node){
      if (node.getRChild() == null){
         return node.getPokemon();
      }
      else {
         return this.getPokemonWithLargestSearchKey(node.getRChild());
      }
   }
// Finds numberCaught of replacement node   
   private int getTempNumCaught(PokeNode node){
      if (node.getRChild() == null){
         return node.getNumCaught();
      }
      else {
         return this.getTempNumCaught(node.getRChild());
      }
   }         
// Exchanges the nodes   
   private PokeNode removeNodeWithLargestSearchKey(PokeNode node){
      if (node.getRChild() == null){
         return node.getLChild();
      }
      else {
         node.setRChild(this.removeNodeWithLargestSearchKey(node.getRChild()));
         return node;
      }
   }                  
                               
//Getting Pokemon in Tree by number:

   public Pokemon get(Pokemon searchKey){
      return this.get(root, searchKey);
   }   

//Public wrapper method that calles recursive method with root

   private Pokemon get(PokeNode node, Pokemon searchKey){
// Not in tree
      if(node == null){
         throw new PokeTreeException("Item not found!");
      }
      else {
// found
         if (searchKey.getNumber() == node.getKey()){
            return node.getPokemon();
         }
// Search Left
         else if (searchKey.getNumber() < node.getKey()){
            return this.get(node.getLChild(), searchKey);
         }
// Search RIght
         else {
            return this.get(node.getRChild(),searchKey);
         }
      }
   }                     
// print tree   
   public void printBSTree(){
      this.printPokeTree(root);
   }
   
   private void printPokeTree(PokeNode node){
      if(node != null){
       System.out.println("  " + node.getPokemon( ).toString() + "\nCaught: "+node.getNumCaught( ) );
           printPokeTree(node.getLChild());
           printPokeTree(node.getRChild());
      }
   }
// used in assignment 5 to return String
   public String toString() {
      inOrder(root);
      return display;
   }
   private void inOrder(PokeNode node2) {
      if (node != null) {
         display = display + "\n " + node2.getPokemon().toString() + "\nCaught: "+ node2.getNumCaught()+ "\n ";
         inOrder(node.getLChild());
         inOrder(node.getRChild());
      }

   }
   
      
}
