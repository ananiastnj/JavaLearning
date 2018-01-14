package OOPS;

abstract class Bank55{    
	abstract int getRateOfInterest();    
}    
class SBI extends Bank55{    
	int getRateOfInterest(){
		return 7;
	}    
}    
class PNB extends Bank55{    
	int getRateOfInterest(){
		return 8;
	}    
}    
    
public class AbstractBankExample {    
	public static void main(String args[]){    
		Bank55 b;  
		b=new SBI();  
		System.out.println("SBI Rate of Interest is: "+b.getRateOfInterest()+" %");    
		b=new PNB();  
		System.out.println("PNB Rate of Interest is: "+b.getRateOfInterest()+" %");    
	}
}    
