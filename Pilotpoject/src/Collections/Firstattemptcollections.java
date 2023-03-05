package Collections;

import java.util.ArrayList;

public class Firstattemptcollections {
	public static void main(String[] args) {
		
		demo1();

		ArrayList<Integer> ali = new ArrayList<Integer>();
		//LinkedList<Integer> ali = new LinkedList<Integer>();
		//same methods for LinkedList also
		ali.add(3);
		ali.add(null);
		ali.add(null);
		ali.add(234);
		ali.add(689);
		System.out.println("Before :\n"+ali);
				
		arraylistinteger(ali);
		
		setvalue(ali,2,108);
		
		rmvvalue(ali,234);
		
		srchval(ali,10);
		
		presence(ali,45);

	}
	
	private static void presence(ArrayList<Integer> ali,int val) {
		// Check if value is present in arraylist or not
		if(ali.contains(val))
			System.out.println(val+" is in list");
		else
			System.out.println(val+" is not in list");
		
		
	}

	private static void srchval(ArrayList<Integer> ali, int v) {
		// Search for a value in Arraylist
		System.out.println(v+" is at position "+ali.indexOf(Integer.valueOf(v)));
		
		
	}

	private static void rmvvalue(ArrayList<Integer> ali, int v) {
		// Removing paticular value
		
		ali.remove(Integer.valueOf(234));
		System.out.println("After Removing value "+v+" :\n"+ali);

		
	}

	private static void setvalue(ArrayList<Integer> ali,int p,int v) {
		//placing the paticular value at paticular position
		ali.set(p, v);
		System.out.println("After adding "+v+" at "+p+" :\n"+ali);

	}

	private static void demo1() {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(0,23);
		al.add("hellow");
		System.out.println(al);
		
	}

	private static void arraylistinteger(ArrayList<Integer> ali) {
		
		
		for(int i=10; i<=100; i+=10) 
			ali.add(i);
		
		ali.add(2,69);
		
		System.out.println("After :\n"+ali);
		
		
	}
	
	

}
