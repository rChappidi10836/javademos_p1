package searchingalgorithms;

import java.util.Arrays;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int searchItem = 60;
		int[] arr = { 23, 51, 13, 64, 48, 84, 12, 69 };

		System.out.println("Before sort :" + Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.println("After sort :" + Arrays.toString(arr));

		int index = binarysearch(arr, searchItem);

		if (index == -1) {
			System.out.println("Item " + searchItem + " not found");
		} else {
			System.out.println("Item " + searchItem + " found at " + index);
		}
	}

	private static int binarysearch(int[] arr, int searchItem) {

		int firstIndex = 0;
		int lastIndex = arr.length - 1;
		int middleIndex = (firstIndex + lastIndex) / 2;

		for(int i=0;i<10;i++);
		
		while (firstIndex <= lastIndex) {
			if (searchItem > arr[middleIndex]) {
				firstIndex = middleIndex + 1;
			} else if (searchItem == arr[middleIndex]) {
				return middleIndex;
			} else {
				lastIndex = middleIndex - 1;
			}
			middleIndex = (firstIndex + lastIndex) / 2;
		}

		return -1;
	}

}
