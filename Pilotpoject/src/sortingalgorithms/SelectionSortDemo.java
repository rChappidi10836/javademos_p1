package sortingalgorithms;

import java.util.Arrays;

public class SelectionSortDemo {
	
	public static void main(String[] args) {
		

		int[] a= {23,54,2,1,4,65243,31,12};
		int al=a.length;
		System.out.println("Before sorting :"+Arrays.toString(a));
		long start = System.currentTimeMillis();
		System.out.println("After sorting :"+Arrays.toString(selectionsort(a, al)));
		long end = System.currentTimeMillis();
		System.out.println("Time: "+(end-start));
	}

	 static int[] selectionsort(int[] a, int al) {
		 
		 for(int i=0; i<al;i++) {
			 int indexOfSmallest = i;
			 for (int j=i; j<al;j++) {
				 if(a[j]<a[indexOfSmallest]) {
					 indexOfSmallest =j;
				 }
			 }
			 int temp = a[i];
			 a[i] = a[indexOfSmallest];
			 a[indexOfSmallest]=temp;
		 }
		return a;
	}
	
}
