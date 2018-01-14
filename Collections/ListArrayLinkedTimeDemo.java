package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListArrayLinkedTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sTime = System.currentTimeMillis();
		
		for(int i=0;i<10000;i++){
			ArrayList al=new ArrayList();
			al.add(i);
		}
		long eTime = System.currentTimeMillis();
		System.out.println("Total Arraylist execution time : "+ (eTime-sTime));
		
		long sTime1 = System.currentTimeMillis();
		
		for(int i=0;i<10000;i++){
			LinkedList ll=new LinkedList();
			ll.add(i);
		}
		long eTime1 = System.currentTimeMillis();
		System.out.println("Total LinkedList execution time : "+ (eTime1-sTime1));
		
	}

}
