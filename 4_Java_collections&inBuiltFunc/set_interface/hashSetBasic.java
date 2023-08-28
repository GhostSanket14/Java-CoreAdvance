package set_interface;
import java.util.*;

public class hashSetBasic {

	public static void main(String[] args) {
		// HashSet does not store duplicate values. (Only one copy)
		// Can store null value, just like HashMap don't follow any order.
		// All the constructors are internally creating HashMap Object. 
		// So value we insert in HashSet acts as a key to the map Object and for its value
		
		// There are other ways to make HS with various constraints. ( Look later if need )
		HashSet<Integer> hs=new HashSet<>();
		hs.add(1); // Add elements
		hs.add(2);
		hs.add(1);
		hs.add(3);
		hs.add(4);
		
		for(int a:hs) {
			System.out.println(a);
		}
		
		System.out.println("contains "+hs.contains(1)); // To see if elements exist.
		System.out.println("isEmpty "+hs.isEmpty()); // To see if set is empty.
		System.out.println("remove "+hs.remove(1)); // To remove element if elements exist. (returns false if it don't exist).
		System.out.println("size "+hs.size()); // No. of elements.
		
		for(int a:hs) {
			System.out.print(a+" ");
		}
		
		List<Integer> hal=new ArrayList<>(hs);
		for(int a:hal) {
			System.out.print(a+" ");
		}
		
		hs.clear(); // remove all elements
	}
}