package OOPS;
//Final method cannot be override 
//Expected compile time error
class Honda12{  
	  final void run(){
		  System.out.println("running");
	  //void run(int i){System.out.println("I am overloading");}
	  }  
}  
	     
	class FinalMethodExample extends Honda12{  
	   void run(){System.out.println("running safely with 100kmph");}  
	     
	   public static void main(String args[]){  
		   FinalMethodExample honda= new FinalMethodExample();  
	   honda.run();  
	   }  
	}  
