package TestFramework;

import junit.framework.*;

public class JavaTest extends TestCase{
	protected int value1,value2;
	protected void setUp(){
		value1 = 3;
		value2 = 2;
	}
	public void testAdd(){
		double result= value1+value2;
		assertTrue(result == 5);
	}
}
