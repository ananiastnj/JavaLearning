package API;

import junit.framework.*;

public class JunitTestSuiteDemo {
	public static void main(String[] a){
		TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestResultDemo.class);
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println("Num of test cases = "+result.runCount());
	}
}
