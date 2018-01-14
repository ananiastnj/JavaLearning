package OOPS;
interface Showable2{  
	  void show();  
	  interface Message{  
	   void msg();  
	  }  
	}  
	class TestNestedInterface3 implements Showable2,Showable2.Message{  
	 public void msg(){System.out.println("Hello nested interface");}
	 public void show(){System.out.println("Show method");} 
	  
	 public static void main(String args[]){  
	  Showable2.Message message=new TestNestedInterface3();//upcasting here  
	  message.msg();  
	  Showable2 s=new TestNestedInterface3();
	  s.show();
	 }  
	}  