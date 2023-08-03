package simpleRecursion;

import java.util.*;

public class printNto1 {

	public static int printN(int N) {
		if(N==0) {
			return 1;
		}
		System.out.println(N); // This will print N to 1
		int SA=printN(N-1);
		System.out.println(N); // This will print 1 to N
		return SA;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		printNto1 Obj=new printNto1();
		Obj.printN(N);
	}
}