package Basics;

import java.util.Scanner;

public class Input_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Integer value : ");
		int i = s.nextInt();
		System.out.print("Enter a String value : ");
		String s1 = s.next();
		System.out.println("I : "+i);
		System.out.println("S : "+s1);
	}

}
