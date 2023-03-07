package sortingalgorithms;

import java.util.Arrays;

public class BubbleSortDemo {
	
	public static void main(String[] args) {
		
		int[] a= {23,54,2,1,4,65243,31,12};
		int al=a.length;
		System.out.println("Before sorting :"+Arrays.toString(a));
		long start = System.currentTimeMillis();
		System.out.println("After sorting :"+Arrays.toString(bubbleSort(a, al)));
		long end = System.currentTimeMillis();
		System.out.println("Time: "+(end-start));
	}

	 static int[] bubbleSort(int[] a, int al) {
		int temp;
		for(int i=0;i<al;i++) {
			for(int j=0;j<al-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
}



//		EXample to explain the Time complexity
//
//	long start = System.currentTimeMillis();
//
////		String[] myarray = {"TV","Radio", "Computer","radio"};
//		String[] myarray = {"radio"};
//		
//		//O(n) - is the time it takes to find an element
//		mysearchmethod(myarray);
//		
//		long end = System.currentTimeMillis();
//		System.out.println("Took "+(end-start)+" millisecond to compile");
//
//	}
//
//	//O(n) - n number of operations, `cuz array can have "n" elements
//	private static void mysearchmethod(String[] myarray) {
//		for(int i=0; i<myarray.length; i++) {
//			if(myarray[i]=="radio") {
//				System.out.println("Found 'radio'");
//			}
//		}
//		
//		
//	}
//	
//	
//	//O(1) - it doesn't matter what is the size of the array
//	private static void mysearchmethod2(String[] myarray) {
//		System.out.println("Found 'radio'");
//
//	}