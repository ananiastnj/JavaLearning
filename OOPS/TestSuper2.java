package OOPS;
class Animal6{  
void eat(){System.out.println("eating...");}  
}  
class Dog6 extends Animal6{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  // Calling method
bark();  
}  
}  
class TestSuper2{  
public static void main(String args[]){  
Dog6 d=new Dog6();  
d.work();  
}}  