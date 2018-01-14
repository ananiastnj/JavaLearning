package OOPS;
interface Bank1{  
	float rateOfInterest();  
}  
class SBI1 implements Bank1{  
	public float rateOfInterest(){return 9.15f;}  
}  
class PNB1 implements Bank1{  
	public float rateOfInterest(){return 9.7f;}  
}  
public class InterfaceBankExample {  
public static void main(String[] args){  
Bank1 b=new SBI1();  
System.out.println("SBI ROI: "+b.rateOfInterest());  
b= new PNB1();
System.out.println("PNB ROI: "+b.rateOfInterest());
}}  


