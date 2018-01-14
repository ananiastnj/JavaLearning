package OOPS;
/**
 * Abstract class can have method definition, constructor, even a main function
 * If there is any abstract method in a class, the class must be abstract
 *  
 * 
 * @author Ant
 *
 */

abstract class Shape{  
	abstract void draw(); 
	//abstract void print()
}  


//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape{  
	void draw(){
		System.out.println("drawing rectangle");
	}  
}  
class Circle1 extends Shape{  
	void draw(){
		System.out.println("drawing circle");
	}  
}  
//In real scenario, method is called by programmer or user  
public class AbstractShapeExample {  
	public static void main(String args[]){  
		Shape c=new Circle1();//In real scenario, object is provided through method e.g. getShape() method  
		c.draw();  
		Shape r=new Rectangle();
		r.draw();
		//Circle1 c =new Circle();
	}  
}  
