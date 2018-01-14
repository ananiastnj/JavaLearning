package Basics;

public class If_else_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 89;
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(" Addition : "+c);
		if(mark<50){ //89 < 50 - False
			System.out.println(" Fail ");
		}
		else if(mark >= 50 && mark <60){ // 89 >= 50 && 89< 60
			System.out.println("Second grade");
		}
		else if(mark >= 60 && mark < 70){
			System.out.print("First grade");		
		}
		else{
			System.out.println("Pass ");
		}
	}

}
