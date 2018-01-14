/**
 * 
 */
package OOPS;

/**
 * @author Ant
 * Types of inheritance
 * 1. Single inheritance
 * 2. Multilevel inheritance
 * 3. Multiple inheritance
 * 4. Hierarchical inheritance
 * 5. Hybrid inheritance 
 *
 */
class A{
	int i = 10;
	public void aMethod(){
		System.out.println("I am Methed A from Class A");
	}
}

public class Inheritance_Example extends A{

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance_Example a=new Inheritance_Example();
		a.aMethod();
	}
}
