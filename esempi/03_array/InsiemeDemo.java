class InsiemeDemo {
  // solo per testare l'implementazione
  public static void main(String[] args) {
    Insieme a = new Insieme(100);

    System.out.println(a.vuoto());
    a.inserisci(13);
    a.inserisci(11);
    System.out.println(a);
    Insieme b = new Insieme(a);
    System.out.println(a.appartiene(13));
    System.out.println(b.appartiene(11));
    System.out.println(a.appartiene(17));
    System.out.println(a.vuoto());
    a.elimina(11);
    System.out.println(a);
    a.elimina(13);
    System.out.println(a);
    System.out.println(b);
    System.out.println(a.appartiene(11));
    System.out.println(a.vuoto());
  }
}