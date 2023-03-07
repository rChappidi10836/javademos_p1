package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<=10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		//SHORTCUT WAY
		List<Integer> filtergerList = list.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
		System.out.println(filtergerList);
		
		List<Integer> multipliedby2 = list.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println(multipliedby2);
		 
		//challenge
		//Print an arraylist of lowercase names
		List<String> names = new ArrayList<>();
		names.add("ROGER");
		names.add("REYLIGHT");
		names.add("BONNEY");
		names.add("KUMA");
		System.out.println(names.stream().map(s -> s.toLowerCase()).collect(Collectors.toList()));
	}

//	//tradition way 
//	static void traditionalWay(int[] x) {
//		List<Integer> result = new ArrayList<>();
//		for(int i: x) {
//			if (i%2==0)
//				result.add(i);
//		}
//	}
}
