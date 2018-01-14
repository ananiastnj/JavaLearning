package OOPS;
public class TestMultipleCatchBlock{  
	  public static void main(String args[]){  
	   try{  
	    int a[]=new int[5];  
	    a[4]=30/6;
	    String s=null;
	    System.out.println("Length : "+ s.length());
	   }  
	   catch(ArithmeticException e){System.out.println("task1 is completed");}  
	   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
	   catch(Exception e){System.out.println("common task completed : "+e);}  
	  //int b=30/0; 
	   System.out.println("rest of the code...");  
	 }  
	}  

