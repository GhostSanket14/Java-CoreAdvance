package All_Java_basics;
import java.util.Scanner;

public class conditions_loops2 {
	
	public static int givSum() {
		int a=10,b=4;
		
		if(a+b==14) {
			return a+b;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(givSum());
		
		for(int i=0;i<10;i++) {
			System.out.print(i);
		}
		System.out.println();
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.print(i);			
		}
		System.out.println();
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i);
		}
		System.out.println();
		
	}
}