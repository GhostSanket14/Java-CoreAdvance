package collectionInterface_Methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class BulkOprationsOnCollections {


	public static void main(String[] args) {

	// [] BULK Operations []
	// These are bulk operations of Collection interface. (we can use them among same of differnet type of collections.)
	// There maybe few collections which may not work together. i will write below as i encounter them. 
	// Keep in mind all of these operations modify the original list/ collection.
	// They also return true/false based of successful/unsuccessful operation.
		
		List<Integer> al1=new ArrayList<>();
//		LinkedList<Integer> al1=new LinkedList<>();
		al1.add(1);
		al1.add(2);
		
		List<Integer> al2=new ArrayList<>();
//		LinkedList<Integer> al2=new LinkedList<>();
		al2.add(1);
		al2.add(3);
		
		HashSet<Integer> x=new HashSet<>();
		x.add(1);
		
		// containsAll(); checks if all methods from list 1 are present in list 2.
		System.out.println(al1.containsAll(al2));
		// containsAll(); checks if all methods from list 1 are present in Set x.
				System.out.println(al1.containsAll(x));
		
		// addAll(); all elements from list1 will be added to list2. (yes duplicate values).
		al1.addAll(al2);
		System.out.println(al1); // [1,2,1,3]
		
		// removeAll(); all elements from list1 which match with list2 elements will be removed.
		al1.removeAll(al2);
		System.out.println(al1); // [2]
		
		// retainAll(); all elements from list1 which match with list2 elements will be Kept. rest will be removed.
		al1.retainAll(al2);
		System.out.println(al1); // [1]
		
		al1.clear(); // Ignore these.
		al2.clear();
		
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al2.add(1);
		al2.add(1);
		al2.add(5);
		
		
		al1.removeIf((n)-> (n%2==0)); // removed based on predicate.
		System.out.println(al1);
		
	}
}