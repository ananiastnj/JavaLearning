package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.*;

/**
 * Hash Map :
 * 1. It contains value based on key - Like DB
 * 2. Contains unique elements - No duplication
 * 3. Maintain no order 
 * 4. One null key and many null value
 * 
 * @author Ant
 *
 */
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		//HashMap hm=new HashMap();
		hm.put(101, "Antony, Ant, AJ");
		hm.put(102, "Ananias");
		hm.put(103, "Ant");
		hm.put(104, "Antony");
		hm.put(101, "Victory");
//		hm.put(null, "King");
//		hm.put(null, "Queen");
//		// Getting permission from set.
//		for(Object k:hm.keySet()){
//			System.out.println("Key : "+k);
//		}
//		for(Object val: hm.values()){
//			System.out.println("Value = "+val);
//		}
		Set s = hm.entrySet();
		//Iterator allowed set, not a map
		Iterator i = s.iterator();
		//hasNext method in iterator - Its returns a boolean value
		while(i.hasNext()){
			//System.out.println("Iterator : "+i.next());
			Map.Entry me = (Map.Entry)i.next(); //next function returns the current element(Key and Value)
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
		
		
	}

}
