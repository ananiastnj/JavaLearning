package OOPS;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			int a= 50;
			int b = a/0;
			System.out.println("B value : "+b);  
		  }
		catch(Exception e){
			System.out.println("exception handled : " + e);
		}  
		 
		
	}

}
