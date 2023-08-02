package stack_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class stack_usingArrayDequeue {

	public static void main(String[] args) {

		Deque<String> name=new ArrayDeque<>(); 		
		
		System.out.println(name.peek()); // null if no element.
		
		name.push("Sanket");
		name.push("Virsha");
		name.push("Akshay");
				
		System.out.println(name.peek());
		
		name.pop(); // NoSuchElementException if no element.
		System.out.println(name.peek());
		
	}
}