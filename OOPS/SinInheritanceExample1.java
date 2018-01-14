package OOPS;

class Class1{
	public void class1Fun(){
		System.out.println("Class1 Function");
	}
}
class Class2 extends Class1{ //Child class
	public void class2Fun(){
		System.out.println("Class2 Function");
	}
}

public class SinInheritanceExample1 {

	public static void main(String[] args) {
		//Class1 c=new Class1();
		//c.class1Fun();
		Class2 c2 = new Class2();
		c2.class2Fun();
		c2.class1Fun();
		
	}

}
