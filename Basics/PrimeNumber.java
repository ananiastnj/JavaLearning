package Basics;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***** PRIME NUMBERS *****");
		int flag;
		for(int i=500;i<600;i++){
			flag = 0;
			for(int j=2;j<(i);j++){
				if(i%j == 0){
					flag =1;
					break;
				}
			}
			if(flag == 0)
				System.out.println(i + " Prime number");
		}
	}

}
