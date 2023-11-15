package commonCodesSolved;
import java.util.*;

public class findNthLargest {
	
	public static int nthLargest(int[] arr, int n) {
		
		for(int i=0; i<n; i++) { // This will make the inner loop run 'n' times.
			for(int j=0; j<arr.length-1; j++) { // Bubble sort. every iteration. largest element goes to end.
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}			
		}
		
		return arr[(arr.length)-n]; 
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]={5,9,7,8,41,2,36};
		System.out.println("2 5 7 8 9 36 41");
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("Not possible");
			return;
		}
		System.out.println(nthLargest(arr, n));
	}
}