package Collections;

import java.util.LinkedList;

/**
 * LinkedList class :
 * 
 * uses doubly linked list to store the elements
 * can contain duplicate elements
 * maintains insertion order
 * not synchronized
 * no random access
 * manipulation fast because no shifting needs to be occured
 * 
 * @author Ant
 *
 */
public class ListLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add("Batman");//0
		ll.add("AntMan");//1
		ll.add(1,"Superman");
		ll.add(57);
		
		for(Object obj:ll)
			System.out.println(obj);
		
	}

}
