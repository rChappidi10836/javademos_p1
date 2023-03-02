package Collections;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetDemo {
	
	public static void main(String[]args) {
		
		Set<Integer> intset = new TreeSet<Integer>();
		intset.add(3);
		intset.add(234);
		intset.add(69);
		intset.add(155);
		intset.add(115);
		intset.add(0);
		
		System.out.println(intset); 
		
		Set<String> sset= new TreeSet<String>(new StringComparator());
		sset.add("Maz");
		sset.add("Leo");
		sset.add("Rolex");
		sset.add("Dili");
		sset.add("Vembu");
		System.out.println(sset);
		
		Set<String> sset1= new TreeSet<String>();
		sset1.add("Raj");
		sset1.add("Banvar");
		sset1.add("Jali");
		sset1.add("Kati");
		sset1.add("Senu");
		System.out.println(sset1);
		
	}

}


class StringComparator implements Comparator<String>{
	
	@Override
	public int compare(String str1,String str2) {
		int l1=str1.length();
		int l2=str2.length();
		if(l1<l2) {
			return -1;
		}else if(l1>l2) {
			return 1;
		}else {
		return str1.compareTo(str2);
		}
	}
	
	
}

class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	transient String aadhaarno;
	
	Employee (int id, String name, double salary, String aadhaarno){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadhaarno=aadhaarno;
	}
	
	@Override
	public String toString() {
		return this.id+"|"+this.name+"|"+this.salary+"|"+this.aadhaarno;
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.id < o.id ? -1 :this.id > o.id ? 1:0;
	}
}
