package arrayList_Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayList {

	public static void main(String[] args) {

		// Creating arrayList.
		ArrayList<String> names=new ArrayList<>(); // Default size is 10, is incremented by 1.5 times.
//		LinkedList<String> names=new LinkedList<>(); // LINKED-LIST has same functions as ArrayList.
										// As far as i think we never use LL we just use Stack or queue.
										// Where the queue is implemented using ArrayDeque / Linkedlist. (See code QueueViaLinkedList.java)
										// stack is implemented using ArrayDeque / Stack
		
		// add(val), add(index,val), addAll()
		names.add("Sanket"); // add()- to add element. New element is added at the end.
		names.add("Ghost");
		System.out.println(names);//#OP- [Sanket, Ghost]
		names.add(0,"God"); // We can also add at specific position, using index value. (We insert there, and other elements shift)
		System.out.println(names); //#OP- [God, Sanket, Ghost]
		ArrayList<String> newNames=new ArrayList<>();
		newNames.add("Bhavesh");
		names.addAll(newNames); // We can also concat 2 AL's . 
		System.out.println(names); //#OP- [God, Sanket, Ghost, Bhavesh]
		// set()
		names.set(0,"Garuda"); // This updates the value at specified position. Ie. Overrides.
		System.out.println(names); // OP- [Garuda, Sanket, Ghost, Bhavesh]
		// get(index) size()
		System.out.println(names.get(1)); // we can get a element at a specific index.
		for(int i=0;i<names.size();i++) { // Size gives no. of elements & not size/length of array.
			System.out.println(names.get(i));
		}
		
		// remove(index) & remove(type.valueOf(value))
		names.remove(1); // We can remove/delete a element using its index.
		names.remove(String.valueOf("Ghost")); // We can also remove element based on its 'type' and 'value' (instead of using index like above.)
		System.out.println(names);
		
		// AL.clear()
		newNames.clear(); // It completely empty out's the Array list.
		System.out.println(newNames); //# OP- empty []
		
		// contains()
		System.out.println(names.contains("Garuda")); // It checks if given value is present or not. returns true/false
	}
}