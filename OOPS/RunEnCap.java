package OOPS;
public class RunEnCap{
	 public static void main(String args[]){
		 EncapTest encap = new EncapTest();
		 encap.setName("Ant");
		 encap.setAge(27);
		 encap.setIdNum("12343ms");
		 System.out.print("Name : " + encap.getName() + "\nAge : " +	encap.getAge());
	 }
}
/*
 * To achieve encapsulation in Java:
 *  Declare the variables of a class as private.
 *  Provide public setter and getter methods to modify and view the variables values.
 * 
 *Benefits of Encapsulation
 *The fields of a class can be made read-only or write-only.
 *A class can have total control over what is stored in its fields.
 *The users of a class do not know how the class stores its data. A class can change
the data type of a field and users of the class do not need to change any of their
code.
*
*
*/