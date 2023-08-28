package map_interface;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap_advance_operation1 {

	public static void main(String[] args) {
		// In this we will learn how we can store. Multiple values for a single key.
		// We can use ArrayList or List
			
		HashMap<Integer,List<String>> hm=new HashMap<>();
		List<String> ls=new ArrayList<>();
		ls.add("A");
		ls.add("B");
		
		hm.put(1,ls); // Since array is universal. Once we put reference. We can add data later like below.
		
		ls.add("C");
		ls.add("D");
		
		List<String> a=hm.get(1);
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}