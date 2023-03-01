public class Rete{

  public static void main(String args[]){
    

      if(args.length != 2){
         System.out.println("Usage: java Rete <file1> <file2>");
         System.exit(-1);
      }
      
    String filename1 = args[0];
    String filename2 = args[1];

    TabellaNodi t=new TabellaNodi();
    t.loadIPNome(filename1);
    t.loadTraffico(filename2);
    t.print();


  }
}