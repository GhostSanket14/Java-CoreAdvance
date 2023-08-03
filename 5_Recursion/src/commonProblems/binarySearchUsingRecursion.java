package commonProblems;

public class binarySearchUsingRecursion {

	
	public static int binaryS(int arr[],int S,int E, int X) {
		if(S<=E) {
			int mid=(S+E)/2;
			
			if(arr[mid]==X) {
				return mid;
			}
			if(arr[mid]>X) {
			return binaryS(arr,S,mid-1,X);
			}
			if(arr[mid]<X) {	
			// Since element was not present in above subarray it will be in below.(basically we can remove this if condition)
			return binaryS(arr,mid+1,E,X);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {2, 3, 4, 5, 6};
		int S=0, E=arr.length-1;
		int X=5;
		System.out.println(binaryS(arr,S,E,X));		
	}
}