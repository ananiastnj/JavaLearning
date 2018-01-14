package Basics;

import java.util.Scanner;

/**
 * 7+77+777+....
 * find their sums 
 * 
 * find the numbers are which is divisible by 5 between 301 to 500
 * 
 * 2.what is math?
 * 3.p.jeya suseethra is wife of j.antony ananias
 * 4.what is program?
 * what 
 * 
 * @author ajesuraj
 *
 */
public class SherilPgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
//		System.out.print("Enter the number : ");
//		int n = s.nextInt();
		int count =0;
		for(int i=301;i<501;i++){
		if(i%5 == 0){
			System.out.println(i + " is divisible by 5");
			count++;
		}
		/*else{
			System.out.println(i + " is not divisible by 8");
		}*/
		}	
		System.out.println(count + " numbers are divisible by 5 between 300 to 500");
	}

}
