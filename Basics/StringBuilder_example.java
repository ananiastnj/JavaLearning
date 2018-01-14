/**
 * 
 */
package Basics;

/**
 * @author ajesuraj
 *
 */
public class StringBuilder_example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***** STRING BUILDER *****");
		System.out.println("*** 1. APPEND ***");
		StringBuilder sb=new StringBuilder("Welcome");
		System.out.println(sb);
		sb.append(" to StringBuilder class");
		System.out.println(sb);
		System.out.println("*** 2. INSERT ***");
		sb.insert(2,"Java");
		System.out.println(sb);
		System.out.println("*** 3. REPLACE ***");
		sb.replace(2,7," wel");
		System.out.println(sb);
		System.out.println("*** 4. DELETE ***");
		sb.delete(0,3);
		System.out.println(sb);
		System.out.println("*** 5. REVERSE ***");
		sb.reverse();
		System.out.println(sb);
		System.out.println("*** 6-7. Capacity and ensureCapacity***");
		StringBuilder sb_cap = new StringBuilder();
		System.out.println(sb_cap.capacity());//Default capacity 16
		sb_cap.append("Java ");
		System.out.println(sb_cap.capacity());
		sb_cap.append("is my favourite language");
		System.out.println(sb_cap.capacity()); //(oldcapacity*2)+2
		System.out.println(sb_cap);
		sb_cap.ensureCapacity(10);
		System.out.println(sb_cap);
		System.out.println(sb_cap.capacity());
		sb_cap.ensureCapacity(50);
		System.out.println(sb_cap.capacity());
		System.out.println("*** 8. charAt ***");
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		System.out.println(sb);
		System.out.println("*** 9. lengt ***");
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println("*** 10. subtring(int beginIndex) ***");
		System.out.println(sb.substring(25));
		System.out.println(sb);
		System.out.println("*** 11. substring(int beginIndex, int endIndex) ***");
		System.out.println(sb.substring(0,6));
		System.out.println(sb);
		
	}

}
