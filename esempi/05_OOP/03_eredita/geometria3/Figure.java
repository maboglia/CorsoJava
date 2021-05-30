import java.awt.Color;

enum tipiTratto {fine, medio, normale, forte};

public abstract class Figure {
  Color penna = Color.black;
  tipiTratto spessore = tipiTratto.normale;
  
  public Figure() 
  {
	  //potenziali importanti azioni di inizializzazione
	  //...
  }
  
  abstract double perimetro();
  
  public Figure(Color c, tipiTratto tratto)
  {   this();
	  penna = c; spessore=tratto;
  }
  
  //altre caratteristiche in comune a tutte le figure ...
  //......
  
}
