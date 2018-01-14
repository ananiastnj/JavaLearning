package OOPS;
public class TestTryCatch{  
	  public static void main(String args[]){  
	   try{  
	      int data=50/0;  
	      System.out.print(data);
	   }catch(ArithmeticException e){
		   System.out.println("Division error : ");}  
	   System.out.println("rest of the code...");  
	}  
	}  