package All_Java_basics;

public class ReverseNumber {

	public static void main(String[] args) {

		int Num=123211;
		int Temp=Num;
		int Rev=0;
		
		while(Temp>0) {
			int a=Temp%10;
			Temp=Temp/10;
			Rev=Rev*10+a;
		}
		System.out.println(Rev);

		String One=Integer.toString(Num); // One way to convert int to string.
		String Two=Integer.toString(Rev);
		
		for(int i=0;i<One.length();i++) {
			if(One.charAt(i)!=Two.charAt(i)) {
				System.out.println("Not a palindrome");
				break;
			}
		}
		System.out.println("It is a palindrome");
	}

}