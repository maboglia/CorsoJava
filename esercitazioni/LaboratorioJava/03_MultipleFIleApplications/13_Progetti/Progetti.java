public class Progetti{

  public static void main(String args[]){
    

      if(args.length != 3){
         System.out.println("Usage: java Progetti <file1> <file2> <file3>");
         System.exit(-1);
      }
      
    String filename1 = args[0];
    String filename2 = args[1];
    String filename3 = args[2];

    Elenco e=new Elenco();
    e.loadProgetti(filename1);
    e.loadPersone(filename2);
    e.loadPersProg(filename3);
    e.orePerProgetto("prog1");
    e.orePerProgetto("prog3");
    e.orePerPersona("p1");
    e.orePerPersona("p2");
  }


}