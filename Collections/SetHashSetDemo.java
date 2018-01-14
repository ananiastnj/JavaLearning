/**
 * 
 */
package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;
/**
 * @author ajesuraj
 *Just Like maths set
 *Set not allow duplicate values
 *
 *HashSet<String>
 *
 *No order
 *<string> - Generic- Its allow only String type
 */
public class SetHashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("Antman");
		hs.add("Batman");
		hs.add("SuperMan");
		//hs.add(5);
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());		
	}

}
