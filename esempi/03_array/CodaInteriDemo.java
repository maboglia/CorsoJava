class CodaInteriDemo {
  public static void main(String[] args) {
    CodaInteri c = new CodaInteri();

    System.out.println(c.vuota());
    System.out.println(c.piena());
    c.aggiungi(0); c.aggiungi(1);
    System.out.println(c.vuota());
    System.out.println(c.primo());
    c.estrai();
    System.out.println(c.primo());
    for (int i = 2; i <= 9; i++)
      c.aggiungi(i);
    System.out.println(c.piena());
    c.aggiungi(10);
    System.out.println(c.piena());
    System.out.println(c.primo());
    c.estrai(); c.estrai();
    System.out.println(c.piena());
    System.out.println(c.primo());
    c.aggiungi(11); c.aggiungi(12);
    System.out.println(c.piena());
    System.out.println(c.primo()); 
    for (int i = 1; i <= 9; i++)
      c.estrai();
    System.out.println(c.primo()); 
  }
}
