package iterator_Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>(); // Default size is 10, is incremented by 1.5 times.
		
		names.add("Sanket");
		names.add("Ghost");
		names.add("Varsha");
		names.add("Mansi");
		
		Iterator<String> itr= names.iterator(); // used for iteration in any Collections
		// Here i have linked my array list to iterator object
		
		System.out.println(itr.hasNext()); // checks and returns if there is a value next to current pointer.
		itr.next(); // next moves the pointer to next element.
		System.out.println(itr.hasNext());
		itr.next();
		System.out.println(itr.hasNext());
		itr.next();
		System.out.println(itr.hasNext());
		itr.next();
		System.out.println(itr.hasNext()); // false.

		while(itr.hasNext()) { 
			System.out.println(itr.next()); // Next basically moves a pointer to next element location from current location.
		}				// So no matter where u write it. Each next() will affect each other. 
	}
}