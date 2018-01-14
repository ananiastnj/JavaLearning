package OOPS;
//Final class cannot be extend
//Expected compile time error
final class Bike90{}  

class FinalClassExample extends Bike90{  
  void run(){System.out.println("running safely with 100kmph");}  
    
  public static void main(String args[]){  
	  FinalClassExample honda= new FinalClassExample();  
  honda.run();  
  }  
}  
