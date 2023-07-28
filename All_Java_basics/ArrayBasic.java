package All_Java_basics;
import java.util.Scanner;
public class ArrayBasic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[5]; // Stored in both Stack(reference) and Heap(elements)
		int arr1[]=null; // Stored in Stack (reference).
		arr1=new int[5]; // Stored in Heap.
		int arrr[]= {1,2,3}; // Hard coded values.
		
		System.out.println(arr); // This will only print address of arr.
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}		
		for(int i=0;i<arr1.length;i++) {
		System.out.println(arr[i]);
		}
		// Enhanced FOR loop.
		int arr3[]=new int[3];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=sc.next().charAt(0);
		}
		for(int var:arr3) { // Enhanced for loop the var is the one updating itself with values of arr3, with every iteration.
			System.out.println(var);
		}
		char arr2[]=new char[3];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.next().charAt(0);
		}
		for(int var1:arr2) {
			System.out.println((char)(var1)); // For printing char we have to use type conversion.
		}
}
}