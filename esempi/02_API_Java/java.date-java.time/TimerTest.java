import java.util.*;

public class TimerTest extends TimerTask {
	public void run(){
		System.out.println("Eccomi!");
	}
	
	public static void main(String[] args){
		TimerTest esempio = new TimerTest();
		Timer timer = new Timer();
		timer.schedule(esempio, 0, 3000);
		try{
			Thread.sleep(10000);
			timer.cancel();
		}catch(InterruptedException e){}
	}
}