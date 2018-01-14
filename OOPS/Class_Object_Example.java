package OOPS;

public class Class_Object_Example {
	public void fun1(){
		System.out.println("I am fun1 method");
	}
	public void add(){
		int a=10;
		int b=20;
		System.out.println("Addition : "+ (a+b));
	}
	public void sub(int i, int j){
		System.out.println("Subtraction of arguments : "+ (i-j));
	}
	public int mul(int i,int j){
		return i*j;
	}
	public static void main(String[] args) {
		Class_Object_Example coe = new Class_Object_Example(); // instance variable or object
		coe.fun1();
		coe.add();
		coe.sub(5,6);
		int mu = coe.mul(4,5);
		System.out.println("Multiplication : "+mu);
		coe.sub(20,10);
		
	}
}
