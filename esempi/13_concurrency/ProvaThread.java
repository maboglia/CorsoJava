package concurrency;

class Corridore implements Runnable{

	@Override
	public void run() {

		System.out.println("ehi! Sono il thread");
		
	}
	
}

public class ProvaThread {

	public static void main(String[] args) {
		
		
		Runnable r1 = () -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ehi! Sono il thread r1");
			
		};

		Runnable r2 = () -> System.out.println("sono il thread r2");
		
		//r1.run();
		new Thread(r1).start();
		new Thread(r2).start();
		System.out.println("sono il main thread");
		
		MioThread mt = new MioThread();
		mt.start();
		

	}

}
