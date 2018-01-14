package OOPS;
interface InterfaceA{  
	void a();  
	void b();  
	void c();  
	void d();
}  
 interface InterfaceB{
	 void b();
 }
abstract class IntExamB implements InterfaceA,InterfaceB{  
	public void c(){
		System.out.println("I am c");
	}  
}  
  
class M extends IntExamB{  
	public void a(){
		System.out.println("I am a");
	}  
	public void b(){
		System.out.println("I am b");
	}  
	public void d(){
		System.out.println("I am d");
	}  
}  
  
class InterfaceExample {  
	public static void main(String args[]){  
		InterfaceA a=new M();  
		a.a();  
		a.b();  
		a.c();  
		a.d();  
	}
}  
