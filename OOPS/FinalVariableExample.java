package OOPS;
class FinalVariableExample {  
final int speedlimit=90;//final variable  
int a=100;
 void run(){  
	 speedlimit=400; 
	 a=500;
  System.out.println(" "+speedlimit+" a : "+a);
 }  
public static void main(String args[]){  
	 FinalVariableExample obj=new  FinalVariableExample();  
	 obj.run();  
}  
}//end of class  

//Expected compile time error - Final variable values should not be change