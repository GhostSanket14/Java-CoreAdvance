package simpleCodesIn_FuncPro;

import java.util.*;

public class printOnlyOdd {
	
	public static void show(int val) {
		System.out.println("The value is : "+val);
	}
	
	public static void main(String[] args) {
		List<Integer> allNums=new ArrayList<>();
		allNums=List.of(1,2,2,3,4,4,5,6,6,7);
		
		// Using Lambda and outer function.
		allNums.stream().filter(eachNum -> eachNum%2==1).forEach(printOnlyOdd::show);
		
		// Using Lambda and println.
		allNums.stream().filter(eachNum -> eachNum%2==1).forEach(System.out::println);
		
	}
}