package API;
/*
 * 1. int countTestCases()
 * 2. TestResult createResult()
 * 3. String getName()
 * 4. TestResult run()
 * 5. void run(TestResult result()
 * 6. void setName(String name)
 * 7. void setUp()
 * 8. void tearDown()
 * 9. String toString()
 * 
 * 
 */

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TestJunit2 extends TestCase{
	protected double fvalue1;
	protected double fvalue2;
	
	@Before
	public void setUp(){
		fvalue1 = 2.0;
		fvalue2 = 3.0;
	}
	
	@Test
	public void testAdd(){
		System.out.println("No of test case = "+this.countTestCases());
		String name = this.getName();
		System.out.println("Test case name = "+name);
		this.setName("testNewAdd");
		String newName = this.getName();
		System.out.println("Updated test case name = "+newName);
		
	}
	public void tearDown(){}
}
