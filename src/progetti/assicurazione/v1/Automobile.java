package progetti.assicurazione.v1;

public class Automobile {
	 private int targa;
     private Cliente proprietario;
     public Automobile (int _targa, Cliente _cliente)
     {
           targa = _targa;
           proprietario = _cliente;
     }
     public int getTarga()
     {
           return targa;
     }
    public Cliente getProprietario()
    {
          return proprietario;
    }
    
}
