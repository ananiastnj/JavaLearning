package Basics;

public class SwapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("A : "+a+"\nB : "+b);
		a = (a+b)-(b=a);
		System.out.println("A : "+a+"\nB : "+b);
		
	}

}