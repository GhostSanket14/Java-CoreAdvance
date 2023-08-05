package veryBasicStuff;

import java.util.ArrayList;
import java.util.List;

public class printListFunctional_Lambda_4 {

	// Concept of Lambda. 
	private static void printEvenFunctional(List<Integer> nums) {
		nums.stream()
		.filter(num -> num%2==0) // This means for each passed  num from .stream run the ->num%2==0 and return true/false.
		.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<>();
		nums=List.of(1,2,3,4,5,6,7,8,10);	
		printEvenFunctional(nums);
	}
}