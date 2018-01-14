package Basics;

public class PositiveNumber {//Starting class
	public static void main(String args[]){ // Starting main
		int n = 10;
		if(n >= 0){ //0>=0 // Starting first if
			if(n == 0){ //Starting second if
				System.out.println("Zero : "+n);
			} //Closing second if
			else{ //Starting first else
				System.out.println("Positive number : " + n);
			} //Closing first else		
		}//Closing first if
		else{ //Starting second else
			System.out.println("Negative number : "+n);
		} //Closing second else
		System.out.println("Thank you");
		
	} //Closing main
} //closing class
