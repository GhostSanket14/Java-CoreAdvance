package simpleRecursion;

import java.util.Scanner;

public class factorial {

	public static int printFact(int n) {
		if(n==1) {
			return 1; 
		}
		int smallAns=printFact(n-1);
		return n*smallAns;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		factorial fobj=new factorial();
		System.out.println(fobj.printFact(input));
	}
}