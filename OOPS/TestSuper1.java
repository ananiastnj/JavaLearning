package OOPS;
class Animal5{  
String color="white";  
}  
class Dog5 extends Animal5{  
	String color="black";  
	void printColor(){  
			System.out.println(color);//prints color of Dog class  
			System.out.println(super.color);//prints color of Animal class	  //calling variable
}  
}  
class TestSuper1{  
public static void main(String args[]){  
Dog5 d=new Dog5();  
d.printColor();  
}}  