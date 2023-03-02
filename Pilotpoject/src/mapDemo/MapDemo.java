package mapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<String, Integer> marks = new HashMap<>();
		marks.put("Bon", 96);
		marks.put("Jon", 49);
		marks.put("Gon", 53);
		marks.put("Ben", 80);
		marks.put("Gwen", 69);
		marks.put("Gon", 55);
		System.out.println(marks);
		
		System.out.println(marks.keySet());
		
		System.out.println(marks.values());
		
		for (String key: marks.keySet()) {
			System.out.println(marks.get(key));
		}
		
		Map<String, Integer> marks2 = new LinkedHashMap<>();
		marks2.put("Bon", 96);
		marks2.put("Jon", 49);
		marks2.put("Gon", 53);
		marks2.put("Ben", 80);
		marks2.put("Gwen", 69);
		marks2.put(null, 55);
		System.out.println(marks2);
	}

}
