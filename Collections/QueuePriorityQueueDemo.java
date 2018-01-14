package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * 
 * Methods:
 * add(Object)
 * Offer(Object)
 * 
 * remove()
 * poll()
 * 
 * element() - retrives the top most element in the queue
 * peek()
 * 
 * @author ajesuraj
 *
 */
public class QueuePriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq = new PriorityQueue();
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
		
		Iterator itr=pq.iterator();
		while(itr.hasNext())
			System.out.println("Iteration : "+itr.next());

	}

}
