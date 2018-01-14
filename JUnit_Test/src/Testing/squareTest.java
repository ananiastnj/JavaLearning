package Testing;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class squareTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25, output);
				
	}

}
