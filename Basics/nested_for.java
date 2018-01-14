package Basics;

public class nested_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0; // Initializing the I value 
		int j=0; // Initializing the J value
		for(i=1;i<=3;i++){			
			for(j=1;j<=3;j++){
				System.out.println("i : "+ i+" J : "+ j);
				/*if(i==2&&j==2){
					break;
				}*/
			}//J Loop ending
			//System.out.println(j);
			//System.out.println("I Loop ending line");
		}//I Loop ending
		System.out.println("Thank you"+i);
	}//main ending
} //class ending
