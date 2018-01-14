package Basics;

public class String_Example {
	/** 
	 * Java has two kind of memory
	 * 1. Pool memory
	 * 2. Non-pool memory
	 *
	 *-> java.lang.String - class provides many useful methods
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		char[] ch={'j','a','v','a'}; //String litral
		String s22 = new String(ch); //New keyword
		String s11 = " Example";
		String con_cat = s22 + s11;
		System.out.println(con_cat);
		//STRING CONCAT
		System.out.println("***** STRING CONCAT *****");
		String s = "Welcome";
		System.out.println(s);
		System.out.println(s.concat(" to Java"));
		System.out.println(s);
		s = s.concat(" to Java");
		System.out.println(s);
		//STRING compareTo()
		System.out.println("****** STRING compareTo() *****");
		String str1="Sachin"; 
		String str2="Sachin"; 
		String str3="Ratan";
		System.out.println(str1.compareTo(str2));//0 
		System.out.println(str1.compareTo(str3));//1(because s1>s3) 
		System.out.println(str3.compareTo(str1));//-1(because s3 < s1 )
		
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"
		//String charAt function
		System.out.println("***** String charAt() *****");
		String name="javatpoint";  
		char ch1=name.charAt(4);//returns the char value at the 4th index  
		System.out.println(ch1);
		//concat
		String s1_con="java string";  
		s1_con.concat("is immutable");  
		System.out.println(s1);  
		s1_con=s1_con.concat(" is immutable so assign it explicitly");  
		System.out.println(s1_con);  
		//contains - Returns boolean values
		String name1="what do you know about me";  
		System.out.println(name1.contains("do you know"));  
		System.out.println(name1.contains("about"));  
		System.out.println(name1.contains("hello")); 
		//enddsWith - returns a boolean values
		String s1_ew="java by javatpoint";  
		System.out.println(s1_ew.endsWith("t"));  
		System.out.println(s1_ew.endsWith("point"));
		
		
				
	}

}
