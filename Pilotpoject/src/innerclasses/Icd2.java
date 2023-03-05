package innerclasses;

public class Icd2 {
	public static void main(String[] args) {
		Car car= new Car("Blue");
		car.start();
		
		Car.VisualDetectionSys s= car.new VisualDetectionSys(16);
		s.displayfea();
	}
}

class Car{
	
		private static String model = "Tesla S Auto-Drive";
		
		private String colour;
		
		void start() {
			System.out.println("Car with "+colour+" color is started");
		}
		Car(String colour){
			this.colour=colour;
		}
		
	class VisualDetectionSys{
		
		private int noofcams;
		
		VisualDetectionSys(int num){
			this.noofcams=num;
		}
		
		void displayfea() {
			System.out.println("car model : "+Car.model);
			System.out.println("The car colour : "+Car.this.colour);
			System.out.println("Number of Camers : "+this.noofcams);
		}
		
		void monitor() {
			System.out.println("Oberservation started-_-");
			
//			class Visionangels{
//				int degrees;
//				void degree() {
//					System.out.println("Adjusting the camera...");
//				}
//			}
//			Visionangles vision =new Visionangles();
			
		}
	}
}