package Basics;
/*
 * Ternary operator : (Conditions)?TrueStatement:FalseStatement 
 * 
 */
public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		int b=20;
		int min1= (a<b)?a:b; //conditions?true_statement:false_statement// 10<20
		System.out.println(min1);
		int max = 0;
		System.out.println(max); 
		if(a<b){ //30 < 20
			max = b;
		}
		else{
			max = a;
		}
		System.out.println("Max : "+max);
	}

}
