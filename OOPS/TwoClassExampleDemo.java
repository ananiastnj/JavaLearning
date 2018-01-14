package OOPS;

class Employee{
	String name;
	int a = 10;
	public void setName(String na){
		int a = 20;
		System.out.println("setName : "+ a);
		name = na;
	}
	public String getName(){
		System.out.println("getname : "+ a);
		return name;
	}
}
public class TwoClassExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setName("Antony");
		System.out.println(e.getName());
		System.out.println(" a "+ e.a);
	}

}
