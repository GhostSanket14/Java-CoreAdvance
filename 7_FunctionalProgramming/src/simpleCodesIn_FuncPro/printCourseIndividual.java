package simpleCodesIn_FuncPro;

import java.util.*;

public class printCourseIndividual {
	
	public static void show(String val) {
		System.out.println("The name is : "+val);
	}
	
	// Making a filter for a name containing word ghost.
	public static boolean allowOnly1(String name) {
		return name.contains("ghost");
	}
	
	public static boolean allowOnlyLength4(String name) {
		return name.length()>=4;
	}
	
	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names=List.of("sanket","ghost","cynide","ghost man","ghost boy");
		
		// Using outer function.
		names.stream().forEach(printCourseIndividual::show);
		
		
		// Using println.
		names.stream().forEach(System.out::println);
		
		
		// Only printing 1 name.
		names.stream().filter(printCourseIndividual::allowOnly1).forEach(System.out::println);
		// or use lambda 
		names.stream().filter(name -> name.length()>=4).forEach(System.out::println);
		
		
		// Only names with length 4
		names.stream().filter(printCourseIndividual::allowOnlyLength4).forEach(System.out::println);
	}
}