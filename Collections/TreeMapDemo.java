package Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * TREE MAP : 
 * 1. It contains value based on key
 * 2. Contains unique elements
 * 3. Maintain ascending order - desc order possible
 * 4. no null key many null value
 * 
 * @author Ant
 *
 */
import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap hm=new TreeMap();
		hm.put(101, "Antony, Ant, AJ");
		hm.put(102, "Ananias");
		hm.put(103, "Ant");
		hm.put(104, "Antony");
		hm.put(101, "Victory");
		//hm.put(null, "King");
		//hm.put(null, "Queen");
		// Getting permission from set.
		Set s = hm.entrySet();
		//Iterator allowed set, not a map
		Iterator i = s.iterator();
		//hasNext method in iterator - Its returns a boolean value
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next(); //next function returns the current element(Key and Value)
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
	}

}
