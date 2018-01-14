package Collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * List Vs Set
 * List :
 * Allowing duplicate elements
 * List is an ordered collection
 * 
 * Set :
 * Doesn't allow any duplicate
 * Set in java doesn't maintain any order
 * 
 *  Array List:
 *  Uses dynamic array for storing - algorithm
 *  can contain duplicate
 *  not synchronized
 *  maintain order
 *  Random access
 *  Manipulation need because lot of shifting needs to be occured
 *  
 * 
 * @author Ant
 *
 */
public class ListArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Ant");
		al.add("Karthick");
		al.add("Suresh");
		//using Iterator to iterate the elements
//		Iterator itr=al.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
//		//Iterating the elements using for each  loop
//		for(Object obj:al)
//			System.out.println(obj);
//		
		ArrayList al1=new ArrayList();
		al1.add("Ant");
		al1.add("Avatar");
		al1.add("Batman");
		//Using addAll function to adding the elements to first list
//		al.addAll(al1);
//		for(Object obj:al)
//			System.out.println(obj);

		// removeAll() - It will remove all the elements from second list also if its common values in the first list, that also removed
//		al.removeAll(al1);
//		for(Object obj:al)
//			System.out.println("After removed : "+obj);
//		//retainAll - add only the common values		
		al.retainAll(al1);
		for(Object obj:al)
			System.out.println("Retain all : "+obj);
		
		
	}
}
