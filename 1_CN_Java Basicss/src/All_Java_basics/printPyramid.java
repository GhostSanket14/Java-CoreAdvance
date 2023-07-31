package All_Java_basics;
import java.util.Scanner;

public class printPyramid {

	
	public static void Pyra(int N) {
		int i,j,k;
		
		for(i=0;i<N;i++) {

		for(k=0;k<N-i-1;k++) {
			System.out.print(" ");
		}
		
		for(j=0; j<i+1; j++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		printPyramid obj=new printPyramid();
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		obj.Pyra(N);
	}
}