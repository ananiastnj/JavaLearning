package OOPS;

class Bank{  
int getRateOfInterest(){return 0;}  
}  
  
class SBI5 extends Bank{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 9;}  
}  
  
class TestOverriding1{  
public static void main(String args[]){
	Bank b = new SBI5();
	//System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
SBI5 s=new SBI5();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}  
}  
