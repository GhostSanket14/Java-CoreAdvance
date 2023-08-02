package stack_Collections;

import java.util.Stack;

public class stack_usingStackClass 
{
	public static void main(String[] args) {

		Stack<String> Guns=new Stack<>(); // a stack is created.
		
		Guns.push("AK47");  // push() will push in the elements.
		Guns.push("M416");
		Guns.push("Galil");
		Guns.push("Beretta");
		
		System.out.println(Guns.peek()); // To see the element at Top
		System.out.println(Guns);
		
		System.out.println(Guns.pop()); // To pop the elements at Top
		System.out.println(Guns.pop());
		System.out.println(Guns);
		
	}
}