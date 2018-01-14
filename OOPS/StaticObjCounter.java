package OOPS;
public class StaticObjCounter {  
static int count=0;//without static - will get memory when instance is created 
//with static new memory won't created
  
StaticObjCounter(){  
count++;  
System.out.println(count);  
}  

public static void main(String args[]){  
  
	StaticObjCounter c1=new StaticObjCounter();  
	StaticObjCounter c2=new StaticObjCounter();  
	StaticObjCounter c3=new StaticObjCounter();  
  
 }  
}  
