package All_Java_basics;
import java.util.Scanner;

public class factorialRecursively {
	public static int fact(int N) {
		
		if(N==0) {
			return 1;
		}
		int smallAns=fact(N-1);
		return smallAns*N;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		factorialRecursively o=new factorialRecursively();
		System.out.println(o.fact(N));
	}
}