
package veryBasicStuff;

import java.util.ArrayList;
import java.util.List;

public class printListFunctional_Filter_3 {

	public static boolean isNumEven(int num){ // This will act as our filter.
		return num%2==0;
	}
	
	// Concept of filter. 
	private static void printEvenFunctional(List<Integer> nums) {
		nums.stream()
		.filter(printListFunctional_Filter_3::isNumEven) // This filter will run .forEach only for true return from isNumEven
		.forEach(System.out::println);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<>();
		nums=List.of(1,2,3,4,5,6,7,8);	
		printEvenFunctional(nums);
	}
}