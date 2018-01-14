package API;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class TestRunner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result res = JUnitCore.runClasses(TestJunit2.class);
		for(Failure failure : res.getFailures()){
			System.out.println(failure.toString());
		}
		System.out.println(res.wasSuccessful());
	}
}
