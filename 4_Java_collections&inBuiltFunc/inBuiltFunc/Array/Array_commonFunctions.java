package Array;

import java.util.Arrays;

public class Array_commonFunctions {

	public static void main(String[] args) {
		
		int no[]={1,2,3,4,5,6,7};
		int no1[]={1,2,3,9,5,6,7};
		int kaiPn[]= {5,9,3,1,6,5,7,9,8,4,63,2};
		String name[]= {"Sanket","Ghost","Bro"};
		
		int key=5;
		Arrays.binarySearch(no, key); // To perform a binary search.
		
		System.out.println(no.length); // to get array length.
		
		System.out.println(Arrays.toString(name)); // To convert array to string.
		
//		Arrays.sort(kaiPn); // To sort a array in ascending order.
		Arrays.sort(kaiPn, 3, 11); // To sort in specified index. Just like substring, End index us exclusive. when giving give End index+1.
		System.out.println(Arrays.toString(kaiPn));
		
		System.out.println(Arrays.mismatch(no,no1)); // Finds and returns the index of the first unmatched element between the two specified arrays.
	}
}