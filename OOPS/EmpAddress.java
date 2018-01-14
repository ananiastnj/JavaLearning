package OOPS;

public class EmpAddress {
	int id;  
	String name;  
	Address address;  
	  
	public EmpAddress(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.print(id+" "+name+" ");  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  
	public static void main(String[] args) {  
	Address address1=new Address("gzb","UP","india");  
	Address address2=new Address("gno","UP","india");  
	  
	EmpAddress e1=new EmpAddress(111,"varun",address1);  
	EmpAddress e2=new EmpAddress(112,"arun",address2);  
	      
	e1.display();  
	e2.display();  
	      
	}  
}
