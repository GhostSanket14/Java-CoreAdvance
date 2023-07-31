package All_Java_basics;
import java.util.Scanner;

public class conditions_loops {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		
		if(a==0) {
			int b=1;
		}
		int b=2;
		System.out.println(a);
		
		
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N-(i+1);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}