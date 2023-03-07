package threadingdemo;


public class ThreadingDemo {

	public static void main(String[] args) {
		
		MultiThreaded mt = new MultiThreaded();
		mt.start();
		
		SingleThreaded st = new SingleThreaded();
		st.printNumbers();
	}
}

class SingleThreaded {
	void printNumbers() {
		for (int i = 1; i <= 200; i++) {
			System.out.println(Thread.currentThread().getName() + "-"+i + " ");
			try {
				Thread.sleep(500); //Takes arguments in milliseconds m/s 1000ms=1sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	}
}

class MultiThreaded extends Thread{
	public void run() {
		for (int i = 1; i <= 200; i++) {
			System.out.println(Thread.currentThread().getName() + "-"+i + " ");
			try {
				Thread.sleep(500); //Takes arguments in milliseconds m/s 1000ms=1sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

//Sleep - Thread sleep
//sleep is a STATIC METHOD IN THREAD CLASSS