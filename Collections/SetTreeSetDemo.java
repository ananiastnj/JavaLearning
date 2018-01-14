package Collections;

import java.util.TreeSet;

public class SetTreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add("Antman");
		ts.add("Batman");
		ts.add("WonderWoman");
		ts.add("Antman");
		
		for(Object obj:ts)
			System.out.println(obj);
	}

}
