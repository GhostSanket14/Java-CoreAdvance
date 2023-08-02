package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap_basics {

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
		
		for(Map.Entry me: carPrice.entrySet()) {
			int val=(int) me.getValue();
			if(val==2000) {
			System.out.println(me.getKey()); // Using get key to get key. We can similarly use get value.
		}
		}
	}
}