package functionalprogramming;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
//		Predicate<Integer> gt20 =  (i) -> (i>20);
//		System.out.println("Is 15 > 20: "+gt20.test(15));
//		
//		Predicate<String> stringLengthGreaterThan5 = (s) ->(s.length() >5);
//		System.out.println("Hello > 5:"+stringLengthGreaterThan5.test("Hello"));
		
//		Predicate<Integer> gt10=(i) -> (i>10);
//		int[] x= {0,23,42,12,3,-23,63};
//		m1(gt10,x);
//		
//		Predicate<Integer> ev = (i) -> ((i&1)==0);
//		System.out.println("\nEven nums ⬇ :");
//		m1(ev,x);
		
		Predicate<Integer> gt5 = (i) -> (i >5);
		Predicate<Integer> evnum= (i) -> ((i&1)==0);
		int y[]= {1,3,4,2,5,6,7,8,9,10};
		m1(gt5.and(evnum),y);       //Combining 2 predicates using .and()
	}
	
	static void m1(Predicate<Integer> p, int[] x) {
		for(int i : x) {
			if(p.test(i))
				System.out.print(i+",");
		}
	}
	
	private boolean check(int a) {
		return a>20;
	}
}
