package Basics;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={20,5,10,11,25,2};
		int n, temp =0;
		n=arr.length;
		for(int i=0;i<n;i++){
			for(int j=1;j<(n-i);j++){
				if(arr[j-1] > arr[j]){
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Bubble sort : "+Arrays.toString(arr));
	}
}
