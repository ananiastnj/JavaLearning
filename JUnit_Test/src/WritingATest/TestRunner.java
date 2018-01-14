package WritingATest;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String a[]){
		Result result = JUnitCore.runClasses(TestEmployeeDetails.class);
		for(Failure failure:result.getFailures()){
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
