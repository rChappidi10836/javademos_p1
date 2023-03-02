package innerclasses;

public class Anocladem {
	
	public static void main(String[] args) {
		
		PrinterConnection con = PrinterDriver.getConnection();
		con.print();
	}

}

class PrinterDriver{
	
	static PrinterConnection getConnection() {
		
//		PrinterConnection con = new PrinterConnection() {
//
//			@Override
//			public void print() {
//				System.out.println("Printing...");
//				
//			}
//			
//		};
		PrinterConnection pc = new MyPrinterConnection();
		
		return pc;
	}
}

interface PrinterConnection{
	void print();
}

class MyPrinterConnection implements PrinterConnection{
	
	@Override
	public void print() {
		System.out.println("MyPRinter Connection");
	}
}