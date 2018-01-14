package TestFramework;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runners.*;

//import sun.misc.MessageUtils;
import static org.junit.Assert.assertEquals;

public class TestJunit1{
	String message="Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	@Test
	public void testprintMessage(){
		System.out.println("Inside testPrintMessage()");
		assertEquals(message,messageUtil.printMessage());
	}
}
