package OOPS;
class Animal2{  //parent class - 2 child 
void eat(){System.out.println("eating...");}  
}  
class Dog2 extends Animal2{  //child class
void bark(){System.out.println("barking...");}  
}  
class Cat2 extends Animal2{  //child class
void meow(){System.out.println("meowing...");}  
}  
public class HierarchicalInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat2 c=new Cat2();  
		c.meow();  
		c.eat();  
		//c.bark();//C.T.Error  
	}
}
