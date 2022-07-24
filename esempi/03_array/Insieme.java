class Insieme {
  private int maxElementi;
  private boolean[] elementi;

  /** Costruttore */
  public Insieme(int num) {
    maxElementi = num;
    elementi = new boolean[maxElementi];
  }

  /** Costruttore copia: costruisce (e restituisce) un insieme 
   * uguale a quello passato come parametro */
  public Insieme(Insieme x) {
    maxElementi = x.maxElementi;
    elementi = new boolean[maxElementi];
    for (int i = 0; i < maxElementi; i++)
      elementi[i] = x.elementi[i];
  }

  /** Dice se l'insieme x e' vuoto */
  public boolean vuoto() {
    boolean trovato = false;

    for(int i = 0; i < maxElementi; i++)
      if (elementi[i]) {
        trovato = true;
        break;
      }
    return !trovato;
  }

  /** Inserisce l'elemento e */
  public void inserisci(int e) {
    elementi[e] = true;
  }

  /** Elimina l'elemento e */
  public void elimina(int e) {
    elementi[e] = false;
  }

  /** Predicato di appartenenza */
  public boolean appartiene(int e) {
    return elementi[e];
  }

  /** Restituisce una stringa del tipo {...} */
  public String toString() {
    String str = "";
    boolean primo = true;
    str = str + "{";
    for (int i = 0; i < maxElementi; i++) {
      if (elementi[i]) {
        if (primo) 
          primo = false;
        else
          str = str + ",";
        str = str + i;
      }
    }
    str = str + "}";
    return str;
  }
}