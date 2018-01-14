package API;

/*
 * Methods :
 * 1. addError(Test test, Throwable t)
 * 2. addFailure(Test test, AssertionFailedError t)
 * 3. endTest(Test test)
 * 4. int errorCount() - Gets the number of detected errors 
 * 5. Enumeration<TestFailure> errors() - returns enumeration for the errors
 * 6. int failureCount() - Gets the number of detected failures.
 * 7. void run(Testcase test) - runs a testcase
 * 8. int runCount() - gets the number of run tests
 * 9. void startTest(Test test) - Informs the result that a test will be started
 * 10 . void stop() -  Marks that the test run should stop
 */

import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.*;

public class TestResultDemo extends TestResult {
	//add the error
	public synchronized void addError(Test test, Throwable t){
		super.addError((junit.framework.Test) test, t);
	}
	//add the failure
	public synchronized void addFailure(Test test, AssertionFailedError t){
		super.addFailure((junit.framework.Test) test, t);
	}
	@Test
	public void testAdd(){
		//add any test
	}
	
	public synchronized void stop(){
		//stop the test here
	}
	
}
