package threadingdemo;

public class RunnableDemo {
	
	public static void main(String[] args) {
		Utils.printmessage("Begin main");
		ImageProcessor ip = new ImageProcessor();
//		ip.run();
		Thread t = new Thread(ip);
		t.start();		
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Utils.printmessage("Do some work..");
			}
		});
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Utils.printmessage("End main");
		
	}

}

class ImageProcessor implements Runnable{

	@Override
	public void run() {
		Utils.printmessage("Processing an image");
	}
	
}
