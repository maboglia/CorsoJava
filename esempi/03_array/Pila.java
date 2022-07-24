/**Il TDA pila di interi */
class Pila {
  /** Il numero di elementi massimo */
  private static final int MAXELEMENTI = 10;
  /** Il vettore che contiene gli elementi*/
  private int[] elementi;
  /** Il numero di elementi effettivamente presenti */
  private int numElementi;

  /** Costruttore */
  public Pila() {
    numElementi = 0;
    elementi = new int[MAXELEMENTI];
  }
  
  /** Dice se la pila e' vuota */
  public boolean vuota() {
    return (numElementi == 0);
  }
    
  /** Dice se la pila e' piena */
  public boolean piena() {
    return (numElementi == MAXELEMENTI);
  }
    
  /** push dell'elemento e sulla pila */
  public void push (int e) {
    if (!piena())
      elementi[numElementi++] = e;
  }

  /** Restituisce il top della pila */
  public int top() {
    if (!vuota())
      return elementi[numElementi - 1];
    else return -1;
  }
  
  /** Elimina un elemento dalla cima della pila */
  public void pop() {
    if(!vuota())
      numElementi--;
  }
}