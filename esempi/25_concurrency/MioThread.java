package concurrency;

public class MioThread extends Thread {

	@Override
	public void run() {

		int volte = 5;
		
		for (int i = 1; i <= volte; i++) {
			System.out.println("Ehi! Sono il thread MioThread " + i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}

	
	
}
