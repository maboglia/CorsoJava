package main;

public class NumeriPrimi extends Thread {

	public void run() {

		int num1, num2 = 2;

		boolean res;

		for (num2 = 2; num2 <= 100; num2++) {

			res = false;

			for (num1 = 2; num1 < num2; num1++) {

				if (num2 % num1 == 0) {

					res = true;

					break;

				}

			}

			if (res == false) {

				System.out.println(num2 + " è un numero primo");

			}

			try {Thread.sleep(100);} catch (InterruptedException e) {}
		}

	}

	public static void main(String args[]){

		NumeriPrimi numeri = new NumeriPrimi();

		Thread t = new Thread() {
			@Override
			public void run() {
				char c;

				for(c='A'; c<='Z'; c++)

				{

				System.out.println(" " + c);
				try {Thread.sleep(100);} catch (InterruptedException e) {}
				}				
			}
		};
		
		t.start();
		numeri.start();

	}

}
