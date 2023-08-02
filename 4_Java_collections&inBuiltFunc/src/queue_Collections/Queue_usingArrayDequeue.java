package queue_Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_usingArrayDequeue {

	public static void main(String[] args) {

		Deque<String> guns=new ArrayDeque<>(); // Functions are same as LinkedList.
		// offer() peek() pop()
		guns.offer("Ak");
		guns.offer("M4");
		guns.offer("SKS");
		guns.offer("SMG");
		
		System.out.println(guns.peek());
		guns.pop();
		System.out.println(guns.peek());
		
		
		
		
	}
}