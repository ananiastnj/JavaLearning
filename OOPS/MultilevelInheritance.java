package OOPS;

class Animal1{  //Parent class
void eat(){System.out.println("eating...");}  
}  
class Dog1 extends Animal1{  //Child class
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog1{  //grand-child class
void weep(){System.out.println("weeping...");}  
}  
public class MultilevelInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  
	}
}
