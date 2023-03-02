package Collections;

import java.util.Arrays;
import java.util.List;

public class Utilsdemo {
	
	public static void main(String[] args) {
		
		ArraysDemo();
	}
	
	private static void ArraysDemo() {
		int[] a= {29,523,42,12};
		for (int i:a) 
			System.out.println(i+",");
		
		System.out.println();
		Arrays.sort(a);
		
		for (int i:a) 
			System.out.println(i+",");
		System.out.println();
		
		String[] s= {"G","R","A","P"};
		List<String> l =Arrays.asList(s);
		System.out.println(l);
	}

}
