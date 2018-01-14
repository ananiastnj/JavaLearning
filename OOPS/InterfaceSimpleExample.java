package OOPS;
/**
 * Interface should be used implements keyword to extend
 * which class implements the class, that should be implemented all the methods 
 * 
 * @author ajesuraj
 *
 */
interface Printable12{
	void print();
	void hai();
}
class inter1{
	public void print(){
		System.out.println("I am print method ");
	}
	/*public void hai(){
		System.out.println("I am hai method");
	}*/
}
class inter2 extends inter1 implements Printable12{
	public void hai(){
		System.out.println("I am inter2 hai method");
	}
}

public class InterfaceSimpleExample extends inter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter2 i=new inter2();
		i.print();
		i.hai();
		
	}

}
