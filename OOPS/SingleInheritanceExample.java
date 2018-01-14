package OOPS;

class Animal{ //Parent class
	void eat(){ 
		System.out.println("eating..."); 
	} 
}  
class Dog extends Animal{ //Child class inherit the feature of parent class
	void bark(){
		System.out.println("barking...");
	} 
}  
public class SingleInheritanceExample {
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.bark();  
		d.eat();
		//Animal a=new Animal();
		//a.eat();
	}
}
