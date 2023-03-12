package functionalprogramming;

public class FunctionalProgrammingDemo {

	public static void main(String[] args) {

//		//traditional way
//		Calculator calc = new Calculator();
//		calc.calculate(3,7);
		
		//Anonymous innner class
		ICalculator multip = new ICalculator(){

			@Override
			public int calculate(int a, int b) {
				int result = a*b;
				System.out.println("Calculate " + a + " * " + b + " = " + result);
				return result;
			}
			
		};
		multip.calculate(24,5);
		
		//Lambda Expressions 
		int x=23;
		int y=6;
		ICalculator divider = (a,b) ->{return a/b;}; //possible only when a interface has one method
		System.out.println("Calculate " + x + " / " + y + " = " + divider.calculate(x, y));
		
		
		sum sum = (a,b) ->{ System.out.println("Sum is "+(a+b));};
		sum.sum(x, y);
		
//		sum sum = (a,b) ->{ return a+b;};
//		System.out.println(sum.sum(20,30));
		
	}
}

interface ICalculator {
	int calculate(int a, int b);
}

class Calculator implements ICalculator {

	@Override
	public int calculate(int a, int b) {
		int res = a + b;
		System.out.println("Calculate " + a + " + " + b + " = " + res);
		return res;
	}

}
interface sum{
	void sum(int x, int y);
}