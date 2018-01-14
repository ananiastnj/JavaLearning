package OOPS;
class Animal7{  
Animal7(){System.out.println("animal is created");}  
}  
class Dog7 extends Animal7{  
Dog7(){  
super();   //Call the constructor
System.out.println("dog is created");  
}  
}  
class TestSuper3{  
public static void main(String args[]){  
Dog7 d=new Dog7();  
}}  