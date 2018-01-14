package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque pq = new ArrayDeque();
		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.add("D");
		pq.add("E");
		
		System.out.println(pq.element());
		System.out.println(pq.remove());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		System.out.println(pq.remove("D"));
		System.out.println("Size : "+ (pq.size()));
		Iterator itr=pq.iterator();
		while(itr.hasNext())
			System.out.println("Iteration : "+itr.next());

	}

}
