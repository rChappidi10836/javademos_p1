package threadingdemo;

import java.util.Scanner;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		

		Utils.printmessage("Sum of first 'N' numbers");
		Utils.printmessage("enter a value");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		long starttime = System.currentTimeMillis();

		Calculator calc = new Calculator(n);
		calc.start();
		
		calc.join();//main thread waits until calc completes
		
		Utils.printmessage("Sum of first " + n + " numbers = " + calc.getSum());
		scanner.close();
		
		long endtime = System.currentTimeMillis();
		Utils.printmessage("Totatl time of exe in m/s = "+(endtime-starttime)+" milliseconds");
		Utils.printmessage("Totatl time of exe in sec = "+(endtime-starttime)/1000+" seconds");

	}
	

}


class Calculator extends Thread {

	int n;
	int sum;

	Calculator(int n) {
		this.n = n;
	}

	public void run() {
		for (int i = 1; i <= n; i++) {
			this.sum += i;
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}//sleep here is to simulate the long calcucations
		}
	}

	public int getSum() {
		return sum;
	}
}