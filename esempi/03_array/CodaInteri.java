// Gestione di una coda di interi
class CodaInteri {
  private final int MAXELEMENTI = 10;
  /** Numero di elementi attualmente in coda */
  private int numElementi;
  /** Indice del primo elemento in coda (se coda non vuota) */
  private int primo;
  /** Indice dell'ultimo elemento in coda (se coda non vuota)*/
  private int ultimo;
  /** Array di elementi */
  private int[] elementi;

  /** Costruttore */
  public CodaInteri() {
    elementi = new int[MAXELEMENTI];
    numElementi = 0;
    primo = 1;
    ultimo = 0;
  }

  /** test di coda vuota */
  public boolean vuota() {
    return (numElementi == 0);
  }

  /** test di coda piena */
  public boolean piena() {
    return (numElementi == MAXELEMENTI);
  }

  /** Inserisce un elemento */
  public void aggiungi(int e) {
    if (piena())
      System.out.println("ERRORE: Inserimento in coda piena");
    else {
      numElementi++;
      ultimo = (ultimo + 1) % MAXELEMENTI;
      elementi[ultimo] = e;
    }
  }

  /** Estrae un elemento */
  public void estrai() {
    if (vuota())
      System.out.println("ERRORE: Estrazione da coda vuota");
    else {
      numElementi--;
      primo = (primo + 1) % MAXELEMENTI;
    }    
  }

  /** Restituisce il primo della coda */
  public int primo() {
    if (vuota()) {
      System.out.println("ERRORE: Primo elemento di coda vuota");
      return -1;
    }
    else {
      return elementi[primo];
    }
  }
}