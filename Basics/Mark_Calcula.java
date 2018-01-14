package Basics;

public class Mark_Calcula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 70; //Pass - First class / Distinction / Second class
		if(mark <50){
			System.out.println("Fail");
		}
		else if(mark >= 50 && mark <60){
			System.out.println("Second class");
		}
		else if(mark >= 60 && mark <75){
			System.out.println("Fisrclass");
		}
		else{
			System.out.println("Distinction");
		}
		

	}

}
/*
 * 
 AND TABLE
T T - T
T F - F
F T - F
F F - F

OR TABLE 
T T - T
T F - T
F T - T
F F - F

*/