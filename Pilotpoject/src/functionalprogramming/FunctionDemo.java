package functionalprogramming;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		
		Function<String, Integer> f1 = s -> s.length();
		System.out.println("Lenght of 'hello' = "+f1.apply("hello"));
		
	}
}
