package All_Java_basics;
import java.util.Scanner;

public class Solution 
{
	public static String addBinaryString(String a, String b, int n, int m) 
	{

		// To store the sum of binary strings.
		StringBuilder sum = new StringBuilder();

		int i = 0;

		// To store the carry while adding the bits.
		int carry = 0;

		while (i < Math.max(n, m)) 
		{
			// Initialize the current sum of the bits.
			int curSum = carry;

			if (i < n) 
			{
				// Add the value in the current sum.
				curSum = curSum + (a.charAt(n - 1 - i) - '0');
			}

			if (i < m) 
			{
				// Add the value in the current sum.
				curSum = curSum + (b.charAt(m - 1 - i) - '0');
			}

			// Append the resulting bit at the end of the string.
			sum.append((curSum) % 2 );

			// Update the carry value.
			carry = curSum / 2;

			i++;
		}

		if (carry != 0) 
		{
			sum.append(1);
		}

		// Reverse the binary string to move the least significant bits at the end of the string.
		return sum.reverse().toString();
	}
    //Driver code
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();

		int t=sc.nextInt();
		while(t>0) {
	        System.out.print(addBinaryString(a, b, a.length(), b.length()));
	        t--;
		}    }
}
 
//    //Driver code
//    public static void main(String args[])
//    {
//    	Scanner sc=new Scanner(System.in);
//		String a=sc.nextLine();
//		String b=sc.nextLine();
//		int X=sc.nextInt();
//		while(X>0) {
//        System.out.print(addBinary(a, b));
//		}}
//}
 