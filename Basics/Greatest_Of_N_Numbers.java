package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Greatest_Of_N_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter a N value : ");
		int n = s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter a "+i+" number : ");
			a[i]=s.nextInt();
		}
		int gre = a[0];
		for(int i=1;i<n;i++){
			if(gre<a[i]){
				gre = a[i];
			}
		}
		System.out.println("Number of values : "+ Arrays.toString(a));
		System.out.println("Greatest of number : "+gre);
	}

}
