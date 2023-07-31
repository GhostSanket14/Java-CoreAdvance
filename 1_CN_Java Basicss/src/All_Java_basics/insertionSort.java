package All_Java_basics;
import java.util.Scanner;

public class insertionSort {
	public static void IS(int arr[]) {
	       int n = arr.length;
	        for (int i=1; i<n;i++) {
	            int Key=arr[i];
	            int j=i-1;
	            while (j>=0 && arr[j]>Key) { // If first-element is small than second-element. This loop increment previous elements on-by-one. as we have saved Key. We do have space ahead to increment.
	                arr[j+1]=arr[j];         // This will goon until either we reach front of array.or the spot where we have put the key.
	                j--;
	            }
	            arr[j+1]=Key; // This will put the key at front or at the spot where its value belongs.
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionSort o=new insertionSort();
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		o.IS(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}