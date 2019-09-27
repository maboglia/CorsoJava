package linkedList;

public class List {
  int size;		// attributo

	/**
	 * 
	 * @uml.property name="head"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	Element head; // relazione elementi

  
  public List(){
  	head = null;
  	size = 0;
  }
  
  public void insert(int value){
  	head = new Element(value,head);
  	size++;
  }
  
  public int first(){
  	return head.value;
  }
  
  public void remove(){
  	head = head.next;
  	size--;
  }
  
  public int size(){
  	return size;
  }
}
