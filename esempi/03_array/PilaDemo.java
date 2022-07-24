/** Programma per la prova della classe Pila. */
class PilaDemo {

  public static void main (String[] args) {
    Pila p1 = new Pila();

    p1.push(1); p1.push(2); p1.push(3); p1.push(4);
    System.out.println(p1.top());
    p1.pop(); p1.pop();
    System.out.println(p1.top());
    p1.push(5);
    System.out.println(p1.top());
  }
}