package All_Java_basics;
import java.util.Scanner;


public class selectionSort {
	public static void SS(int narr[]) {
		int temp=0;
		for(int i=0;i<narr.length;i++) {
			for(int j=i+1;j<narr.length;j++) {
				if(narr[i]<narr[j]) { // < for descending order and > ascending order.
					temp=narr[i];
					narr[i]=narr[j];
					narr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectionSort o=new selectionSort();
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		o.SS(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
	}
}