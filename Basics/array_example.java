package Basics;

import java.util.Arrays;

public class array_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		a[0] = 10;
		a[1] = 15;
		a[2] = 20;
		a[3] = 25;
		a[4] = 30;
		System.out.println("Array : "+ Arrays.toString(a));
		System.out.println("Array : "+ a); //a.length = 5
		for(int i=0;i<a.length;i++){  //5<=5 ... a[i] a[5]
			System.out.println("Array Values "+i+" : "+a[i]);//using index to print the values
		}
		//Iterations -
		for(int i:a){ 
			System.out.println("Array Values : "+i); //i using values, list of values print 0 to nth index
		}
		
		int b[]={10,20,30,40,50};
		for(int j:b){
			System.out.println("B Array : "+j);
		}
	}//Ending of main
}//Ending of class
