package API;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestJunit1 {
	@Test
	public void testAdd(){
		int num =5;
		String temp = null;
		String str= "Junit is working fine";
		//Check for equality
		assertEquals("Junit is working fine",str);
		//check for false condition
		assertFalse(num > 6);
		//check for not null value
		assertNotNull(str);
		
	}

}
