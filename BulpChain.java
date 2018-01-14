import java.util.Scanner;


public class BulpChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter a color sequence of bulb A : ");
		String bulbA = s.next();
		System.out.println(" Enter a color sequence of bulb B : ");
		String bulbB = s.next();
		StringBuffer bulbAChain = new StringBuffer(bulbA);
		StringBuffer bulbBChain = new StringBuffer(bulbB);
		
//		System.out.println("bulbA.Length : "+bulbA.length()+""+bulbB.charAt(0));
//		System.out.println("bulbAChain : "+bulbAChain);
//		System.out.println("bulbBChain : "+bulbBChain);
		int count = 0;
		if(bulbA.length() >= bulbB.length()){
			for(int i=0;i<bulbBChain.length();i++){
				if(bulbAChain.charAt(i) != bulbBChain.charAt(i)){
					bulbBChain.insert(i, bulbAChain.charAt(i));
					count++;
				}
			}
		}
//		System.out.println("bulbAChain : "+bulbAChain);
//		System.out.println("bulbBChain : "+bulbBChain);
		System.out.println("Count : "+count);
		
		

	}

}
