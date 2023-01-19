package linkedList;

class Element {
	int value; // attributo

	/**
	 * 
	 * @uml.property name="next"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	Element next; // relazione next

	
	public Element(int value, Element head) {
		this.value = value;
		this.next = head;
	}
}
