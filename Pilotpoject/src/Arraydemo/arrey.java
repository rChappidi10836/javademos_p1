package Arraydemo;

import java.io.Serializable;

public class arrey {
	public static void main(String[] args) {
		
	int a[]= {2,43,56,34,23,52};
		
	printArray(a);
	
	a[0]=62;
	
	printArray(a);
	
	a[3]= new Integer(78);
	
	printArray(a);
	
	
	
	String s1="hello world";
	
//	sumofArray(a);
//	
//	simplesum(a);
//	
//	sumofeven(a);
//	
//	reverseofString(s1);
//	
//	rosusingchararray(s1);
	
	arrayofObjects();
}

	private static void arrayofObjects() {
		Employee[] employees= new Employee[3];
		Employee emp = new Employee(1, "Markn", 1500, "AA2043");
		Employee emp2 = new Employee(2, "Toney", 3000, "JAR077");
		Employee emp1 = new Employee(3, "Monkey Grap", 10000, "MR200Q");
		employees[0]=emp;
		employees[1]=emp1;
		employees[2]=emp2;
		for(Employee e:employees)
			System.out.println(e);
	}

	private static void rosusingchararray(String s1) {
		//creating the reverse of a string using the ".toCharArray()" method
		String res="";
		for(char x:s1.toCharArray())
			res=x+res;
		System.out.println("Reverse of String "+res+"   using toCharArray()");
		
	}

	private static void reverseofString(String s1) {
		String x="";
		for(int j=s1.length()-1;j>-1;j--) 
			x+=s1.charAt(j);
		System.out.println("Reverse of String "+x); //Printing Reverse of A string

	}

	private static void sumofeven(int[] a) {
		int es=0;
		for(int i:a){
			if((i&1) == 0) //checking even numbers using bitwise AND Operator
				es+=i;
		}
		System.out.println("Even numbers sum ="+es);
	}

	private static void simplesum(int[] a) {
		int sum=0;
		for(int i:a) // directly accessing the elements in the array
			sum+=i;
		System.out.println("SUm = "+sum);
		
	}

	private static void sumofArray(int[] a) {
		int s=0;
		for (int i=0; i<a.length;i++) {
			s+=a[i];
			}
		System.out.println("Total ="+s);
		}
	
	private static void printArray(int[] a) {
		
		for (int i=0; i<a.length;i++) {
//		s+=a[i];
			System.out.print(a[i]+",");
		}
	System.out.println();
	}
}
class Employee implements Serializable {

	int id;
	String name;
	double salary;
	transient String aadhaarno;

	Employee(int id, String name, double salary, String aadhaarno) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.aadhaarno = aadhaarno;
	}

	@Override
	public String toString() {
		return this.id + "|" + this.name + "|" + this.salary + "|" + this.aadhaarno;

	}
}