package OOPS;
class ConsExample{  
	ConsExample(){
		System.out.println("Construtor called by obj creation");
	} 
	ConsExample(int a){
		System.out.println(a);
	}
	public void fun1(){
		System.out.println("Function1 ");
	}
	public static void main(String args[]){  
		ConsExample b=new ConsExample(5); 
		b.fun1();
	}  
}  
