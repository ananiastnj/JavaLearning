package OOPS;
/**
 * 
 * If you are extending any abstract class that have abstract method, you must either provide the implementation of the method or make this class abstract.
 */

abstract class Bike55{
	Bike55(){
		System.out.println("bike is created");
	}  
	abstract void run();  
	void changeGear(){
		System.out.println("gear changed");
	}  
}  
class Honda extends Bike55{  
	 void run(){
		 System.out.println("running safely..");
	 }  
}  
public class AbstractBikeConstructorExample {  
	 public static void main(String args[]){  
		 Bike55 obj = new Honda();  
		 obj.run();  
		 obj.changeGear();  
	 }  
}  
