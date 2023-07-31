package All_Java_basics;
import java.util.Scanner;

public class bubbleSort {

	public static void BS(int arr[]) {
		int temp=0;
		int len=arr.length;
		for(int i=0;i<len;i++) {
			
			for(int j=0;j<len-(i+1);j++){ // To avoid index bound exception due to 'j+1' (so we stop the 'j' at one index before end) and also, 
										// as with every loop of BS we put largest element at end. so don't have to traverse to end every time.
										// Hence with every loop, end of the Array gets closer to the start. (Look at code end for clarity)
				if(arr[j]>arr[j+1]) {   // we can also use len-i-1 instead of len-(i+1). [Both are same, brackets change the meaning a bit].
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		}
	}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		bubbleSort o=new bubbleSort();
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		o.BS(arr);
		
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
}

//2
//5
//3
//1
//4
//25314
//23514
//23154
//23145
//23145
//21345
//21345
//12345
//12345
//12345