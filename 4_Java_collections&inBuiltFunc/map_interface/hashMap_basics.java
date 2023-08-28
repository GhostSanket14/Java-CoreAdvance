package map_interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap_basics { // HashMap can store null keys which HashTable cannot.
	// There can be only 1 null key in the hashTable
	public static void main(String[] args) {
		HashMap<String, Integer> carPrice=new HashMap();
		carPrice.put("BMW", 1000);
		carPrice.put("BMW", 2000);
		carPrice.put("Farrari", 2000);
		carPrice.put("Porche", 3000);
		System.out.println(carPrice);
		
		System.out.println(carPrice.get("BMW")); // null if this key dont exist. So use technique i discussed in book with this.
		carPrice.remove("BMW");
		System.out.println(carPrice); // OP- {Porche=3000, Farrari=2000}
		
		System.out.println(carPrice.containsValue(2000)); // This returns true/false
		System.out.println(carPrice.containsKey("Porche")); // This returns true/false

		System.out.println("values are "+carPrice.values()); // gives values
		System.out.println(carPrice.keySet()); // gives keys
		System.out.println(carPrice.entrySet()); // Collection of above two.

		for(String a:carPrice.keySet()) {
			System.out.println("key set "+a);
		}
		for(int b:carPrice.values()) {
			System.out.println("values "+b);
		}		
		Set<String> keySet=carPrice.keySet(); // We can store all keys or values in a set.
		for(String key:keySet) {
			System.out.println(key);
		}
		
		for(Map.Entry me: carPrice.entrySet()) { // Remember this it is IMP.
			int val=(int) me.getValue();
			if(val==2000) {
			System.out.println(me.getKey()); // Using get key to get key. We can similarly use get value.
		}
		}
	}
	
	// Hashing is improvement over direct access table. Its average for insert, update & delete is O(1)
	// HashFunction is a function that maps big number/string to small integer value. To be used as index in hashtable.
	// Eg- F(x)=x mod 7;   here x is our input number. This method causes collision lets handle the collision.
	// 1) Separate Chaining 2) Open Addressing - 1. Liner probing 2. Quadratic probing 3. Double hashing.
	// 1) Separate Chaining -> Make hash table with same hash-vale point to a link list of records.	
	
}