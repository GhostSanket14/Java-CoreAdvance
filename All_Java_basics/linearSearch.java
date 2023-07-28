package All_Java_basics;
import java.util.Scanner;

public class linearSearch {
	
	public static void LS(int arr[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No to be searched : ");
		int N=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==N) {
				System.out.println("Element is found at index: "+i);
			}
		}
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		linearSearch l=new linearSearch();
		Scanner sc=new Scanner(System.in);
		
		int Narr[]=new int[10];
		for(int i=0;i<Narr.length;i++) {
			Narr[i]=sc.nextInt();
		}
		l.LS(Narr);
	}

}
