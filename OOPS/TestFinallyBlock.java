package OOPS;
class TestFinallyBlock{  
	  public static void main(String args[]){  
	  try{  
	   int data=25/5;  
	   int a =100;
	   System.out.println(data);
	   System.out.println("a : "+ a);
	  }  
	  catch(Exception e){
		  System.out.println(e);
	  }  
	  finally{
		  System.out.println("finally block is always executed");
	}  
	  System.out.println("rest of the code...");  
  }  
}  