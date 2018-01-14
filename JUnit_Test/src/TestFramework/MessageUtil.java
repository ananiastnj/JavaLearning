package TestFramework;

public class MessageUtil {
	String message;
	MessageUtil(String message){
		this.message = message;
	}
	public String printMessage(){
		return message;		
	}
	public String salutationMessage(){
		return "Hi, "+message;
	}
	
}
