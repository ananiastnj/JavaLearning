package TestFramework;
/*
JUnit Classes
JUnit classes are important classes, used in writing and testing JUnits. Some of
the important classes are:
 Assert - Contains a set of assert methods.
 TestCase - Contains a test case that defines the fixture to run multiple
tests.
 TestResult - Contains methods to collect the results of executing a test
case.
*/
import org.junit.runner.*;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestJunit1.class, TestJunit2.class})

public class JunitTestSuite { }


//import org.junit.Test;
//import org.junit.Ignore;
//import static org.junit.Assert.assertEquals;
//
//public class TestJunit1{
//	String message="Robert";
//	MessageUtil messageUtil = new MessageUtil(message);
//	@Test
//	public void testPrintMessage(){
//		System.out.println("Inside testPrintMessage()");
//		assertEquals(message,messageUtil.printMessage());
//	}
//}


//import org.junit.Test;
//import org.junit.Ignore;
//import static org.junit.Assert.assertEquals;
//
//public class TestJunit2{
//	String message = "Robert";
//	MessageUtil messageUtil = new MessageUtil(message);
//	
//	@Test
//	public void testSalutationMessage(){
//		System.out.println("Inside testSalutationMessage()");
//		message = "Hi, "+"Robert";
//		assertEquals(message,messageUtil.salutationMessage());
//		
//	}
//}