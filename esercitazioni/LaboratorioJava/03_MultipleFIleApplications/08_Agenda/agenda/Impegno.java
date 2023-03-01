package agenda;

class Impegno {

  private String argomento;
  private String luogo;
  private int priorita;

  public Impegno(String argomento, String luogo, int priorita) {
    this.argomento = argomento;
    this.luogo = luogo;
    this.priorita = priorita;
  }
  
  /**
   * Rappresentazione String dell'impegno
   */
  public String toString() {
    return argomento + " (" + luogo + ") - " + priorita;
  }
}
