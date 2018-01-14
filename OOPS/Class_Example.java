package OOPS;

public class Class_Example {

	public void add(){
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("Sum : "+sum);
	}
	public void add(int a, int b){
		System.out.println("Add : "+ (a+b));
	}
	public void name1(String na,int age){
		System.out.println("Name : "+na);
		System.out.println("Age : "+age);
	}
	public int sub(int a, int b){
		int minus = a - b ;
		return minus;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		Class_Example c = new Class_Example();
		//c.name1("Moorthy");
		c.name1("Ant", 26);
		c.add();
		c.add1(20,30);
		c.add1(5,10);
		c.add();
		int sub1 = c.sub(20, 10);
		System.out.println("Minus : "+ sub1);
		
		
		
		System.out.println("Thank you");
		
	}

}
