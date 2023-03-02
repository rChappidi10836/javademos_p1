package Arraydemo;

public class arrey {
	public static void main(String[] args) {
	int a[]= {2,43,56,34,23,52},s=0;//I am getting error here once check
	
	for (int i=0; i<a.length;i++) {
		s+=a[i];
	}
	System.out.println(s);
	
	
	
	String s1="hello world";
	String x="";
	for(int j=s1.length()-1;j>-1;j--) {
		x+=s1.charAt(j);
		System.out.println(x);
	}
	
}
}