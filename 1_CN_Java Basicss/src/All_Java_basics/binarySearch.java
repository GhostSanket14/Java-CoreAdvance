package All_Java_basics;
import java.util.Scanner;


public class binarySearch {
	public static int BS(int arr[]) {
		Scanner sc=new Scanner(System.in);
		
		int start=0, end=arr.length,mid=0;
		System.out.println("No. to search : ");
		int search=sc.nextInt();
		for(int i=start;i<end;i++) {
			
			mid=(start+end)/2;
			if(arr[mid]<search) { // Moving right
				start=mid+1; 
			}
			if(arr[mid]>search) { // Moving left
				end=mid-1;
			}
			if(arr[mid]==search) {
				return mid; 
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		binarySearch o=new binarySearch();
		System.out.println(o.BS(arr));
	}
}