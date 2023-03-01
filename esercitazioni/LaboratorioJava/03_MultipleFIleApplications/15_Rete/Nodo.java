class Nodo{
 private String IP;
 private String nome;
 private int traffico;
 
 public Nodo(String IP, String nome){
 	this.IP=IP;
 	this.nome=nome;
 	traffico=0;
 	}
 public void print(){
   System.out.println(IP + " " +  nome + " "+ traffico);	
 }
 public void add(int n){ traffico += n;}
 
}