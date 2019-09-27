package esempio;
public class TestExec {
	
	public static void main(String[] args){
		Runtime r = Runtime.getRuntime();
		try{
				r.exec("sol");
		}catch (Exception e){
				System.out.println("Impossibile eseguire il comando");
		}
	}
}